package retrofit.service

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import retrofit.api.EmployeeApi
import retrofit.settings.RetrofitBuilder
import retrofit2.await
import retrofit2.awaitResponse

class EmployeeService {
    fun getAsyncEmployee() {
        val service = RetrofitBuilder
            .buildRetrofit()
            .create(EmployeeApi::class.java)

        println("start")
        runBlocking {
            val job1 = async { service.getEmployees() }
            val job2 = async { service.getEmployees() }
            println("send")

            val res1 = job1.await()
            val res2 = job2.await()

            println(res1)
            println(res2)
        }
        println("over")
    }
}