package day01

import kotlin.random.Random

fun main() {
    /*
    官网练习
    创建一个简单的游戏，如果掷两个骰子的结果相同，您就赢了。用于打印骰子是否匹配。ifYou win :)You lose :(
     */
//    val firstResult = Random.nextInt(6)
//    val secondResult = Random.nextInt(6)
//    // Write your code here
//    println("firstResult:$firstResult,secondResult:$secondResult")
//    //第一种
//    if (firstResult == secondResult) {
//        println("you v")
//    }else{
//        println("you d")
//    }
//    //第二种
//    println(if (firstResult==secondResult) "you v" else "you d")

    /*
    官网练习
    使用表达式更新以下程序，以便在您输入游戏控制台按钮的名称时打印相应的操作。when
     */
//    val button = "B1"
//
//    println(
//        // Write your code here
//        when (button) {
//            "A" -> "Yes"
//            "B" -> "No"
//            "X" -> "Menu"
//            "Y" -> "Nothing"
//            else -> "There is no such button"
//        }
//    )
    /*
    官网练习
    您有一个程序，该程序会计算披萨片的数量，直到有一整个披萨有 8 片。以两种方式重构此程序：

使用循环。while

使用循环。do-while
     */
    var pizzaSlices = 0
    // Start refactoring here
    //while写法
    while (pizzaSlices < 8) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

}