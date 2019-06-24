# Retrofit 2.6 with Coroutine
Retrofit 2.6で追加されたcoroutineを使用したリクエストの送り方のサンプル
非同期でリクエストを送る方法の違いを2.6と2.6以前で比較する

## usage
1. ```$ ./gradlew build```
1. ```$ ./gradlew run```

## Using "return Call<entity>" and "enqueue"
retrofit < 2.6での非同期にリクエストを送信する方法
callbackを用意しておき、enqueueにリクエストを入れて、レスポンスが帰ってきたらcallbackを実行する

```kotlin
service.getEmployeeWithCall().enqueue(CustomCallBack())

```

## Using "async function"
retrofit 2.6でのretrofit < 2.6での非同期にリクエストを送信する方法
apiのインターフェースのメソッドを```suspend fun```にすることが可能になった
ただし、戻り値は```Response<entity>```となる

```kotlin
 @GET("employees")
    suspend fun getEmployeesWithResponse(): Response<List<Employee>>

```

リクエストを送信する際は、kotlin coroutineを使用できる。
例えば```async```を使用して以下のようにかける

```kotlin
runBlocking {
            val job1 = async { service.getEmployeesWithResponse() }
            val job2 = async { service.getEmployeesWithResponse() }

            val res1 = job1.await()
            val res2 = job2.await()

            println(res1.body()?.forEach { println(it) })
            println(res2.body()?.forEach { println(it) })
        }
```

上の例ではjob1、job2を非同期リクエスト開始、await()で到着を待って最後にボディの中身(entity)を出力するようになる。
