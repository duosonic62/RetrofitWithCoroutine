package retrofit.api

import retrofit.model.Employee
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.Response

interface EmployeeApi  {
    @GET("employees")
    suspend fun getEmployeesWithResponse(): Response<List<Employee>>

    @GET("employees")
    fun getEmployeeWithCall(): Call<List<Employee>>
}