package day01

fun main() {
    val a: Int = 114514
    //a = 10
    //val是只读变量
    var b: Int = 0
    b = 1919179
    //var是可变变量

    println(a)
    println(b)

    println("你好$a,你是$b")
    println("$a:我不是$b,我现在是${b + 1}")
    //这个字符串的拼接还挺新奇，我记得我以前接触的rust也是这样的，我也忘记了，有时间再去看一眼


    /*
    官网实践
    完成代码以使程序打印为标准输出："Mary is 20 years old"
     */
    val name = "Mary"
    val age = 20
    // Write your code here
    println("$name is $age years old")
}