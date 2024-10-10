package day01

import kotlin.random.Random

fun main() {
    /*
    官网练习
    创建一个简单的游戏，如果掷两个骰子的结果相同，您就赢了。用于打印骰子是否匹配。ifYou win :)You lose :(
     */
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    // Write your code here
    println("firstResult:$firstResult,secondResult:$secondResult")
    //第一种
    if (firstResult == secondResult) {
        println("you v")
    }else{
        println("you d")
    }
    //第二种
    println(if (firstResult==secondResult) "you v" else "you d")

}