import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.httpPost

fun main(args: Array<String>) {
    val URL = ""

    val response = "https://www.casareal.co.jp/".httpGet().response()
    println(String(response.second.data))

    val parameters = ArrayList<Pair<String, Any?>>()
    parameters.add("hoge" to "hoge")
    URL.httpPost(parameters).response()

}