package retrofit.service

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import retrofit.api.EmployeeApi
import retrofit.model.Employee
import retrofit.settings.RetrofitBuilder
import retrofit2.*

class EmployeeService {
    /**
     * retrofit 2.6
     * using suspend function
     */
    fun getAsyncEmployeeWithSuspendFunc() {
        println("----- start -----")
        runBlocking {
            val job1 = async { service.getEmployeesWithResponse() }
            val job2 = async { service.getEmployeesWithResponse() }
            println("----- send -----")

            val res1 = job1.await()
            val res2 = job2.await()

            println(res1.body()?.forEach { println(it) })
            println(res2.body()?.forEach { println(it) })
        }
        println("-----　 end  ------")
    }

    /**
     * retrofit < 2.6
     * using Call and enqueue
     */
    fun getAsyncEmployeeWithCall() {
        println("----- start -----")
        service.getEmployeeWithCall().enqueue(CustomCallBack())
        service.getEmployeeWithCall().enqueue(CustomCallBack())
        println("-----　 end  ------")
    }

    private class CustomCallBack: Callback<List<Employee>>{
        override fun onResponse(call: Call<List<Employee>>, response: Response<List<Employee>>) {
            response?.let {
                if (it.isSuccessful) {
                    println(it.body()?.forEach { body -> println(body) })
                }
            }
        }

        override fun onFailure(call: Call<List<Employee>>, t: Throwable) {
            // TODO error handling
        }
    }

    /* common service */
    private val service
        get() =
            RetrofitBuilder
                .buildRetrofit()
                .create(EmployeeApi::class.java)
}