package day01

fun main(){
    /*
官网练习
您有一个 “绿色” 数字列表和一个 “红色” 数字列表。完成代码以打印总共有多少个数字。
 */
//    val greenNumbers = listOf(1, 4, 23)
//    val redNumbers = listOf(17, 2)
//    println("greenNumber:${greenNumbers.toString()}")
//    println("greenNumber总数:${greenNumbers.count()}")
//    println("redNumber:${redNumbers.toString()}")
//    println("redNumber总数:${redNumbers.count()}")
//    //第二种打印方法
//    for (item in greenNumbers) {
//        println("greenNumber:$item")
//    }
//    for (item in redNumbers) {
//        println("redNumbers:$item")
//    }
//    val count = greenNumbers.count() + redNumbers.count()
//    println("总共存有$count")

    /*
    官网练习2
    您的服务器支持一组协议。用户请求使用特定协议。完成程序以检查是否支持请求的协议（ 必须是 Boolean 值）。isSupported
     */
//    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
//    val requested = "smtp"
//    val isSupported: Boolean = requested.uppercase() in SUPPORTED// Write your code here
//        println("Support for $requested: $isSupported")
    /*
    官网练习3
    定义一个映射，将 1 到 3 之间的整数与其对应的拼写相关联。使用此映射来拼写给定的数字。
     */
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")// Write your code here
    val n = 2
    println("$n is spelt as '${number2word[n]}'")

}