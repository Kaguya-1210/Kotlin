package day01

fun main(){
    /*
官网练习
您有一个 “绿色” 数字列表和一个 “红色” 数字列表。完成代码以打印总共有多少个数字。
 */
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    println("greenNumber:${greenNumbers.toString()}")
    println("greenNumber总数:${greenNumbers.count()}")
    //第二种打印方法
    for (item in greenNumbers) {
        println("greenNumber:$item")
    }
}