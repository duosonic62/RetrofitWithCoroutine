package retrofit

import retrofit.service.EmployeeService

fun main() {
    EmployeeService().getAsyncEmployeeWithSuspendFunc()
    EmployeeService().getAsyncEmployeeWithCall()
}