package corutine

import kotlinx.coroutines.runBlocking

suspend fun main (){
    println(1)
    runBlocking {
        println(2)
    }
    println(3)
}