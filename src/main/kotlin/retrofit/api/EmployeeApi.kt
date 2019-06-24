package retrofit.api

import retrofit.model.Employee
import retrofit2.http.GET
import retrofit2.Response

interface EmployeeApi  {
    @GET("employees")
    suspend fun getEmployees(): Response<List<Employee>>
}