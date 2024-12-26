fun main(){
    println("Урок №2. Введите номер задания")
    val num = readln()
    when(num.toInt()){
        1 -> task1()
        2 -> task2()
        3 -> task3()
        4 -> task4()
        5 -> task5()
        6 -> homework1()
        7 -> homework2()
        8 -> homework3()
        else -> println("Ввели неверный номер задания")
    }
}

fun task1(){
    println("Задача №1\n Введите два числа")
    val a = readln().toInt()
    val b = readln().toInt()
    println("Сумма двух чисел равна ${a + b}")
}

fun task2(){
    println("Задача №2\n Введите число")
    val a = readln().toInt()
    val str = if(a % 2==0) "четное" else "нечетное"
    println("Число $str")
}

fun task3(){
    println("Задача №3\n Введите число")
    val a = readln().toInt()
    for (i in 1..a) print("$i ")
}

fun task4(){
    println("Задача №4\n Введите число")
    var a = readln().toInt()
    var sum = 0
    while (a > 0) {
        sum += a
        a--
    }
    println("Сумма всех чисел $sum")
}

fun task5(){
    println("Задача №5\n Введите два числа")
    var res = true
    var a = 0
    do {
        println("Введите чиcло: ")
        a = readln().toInt()
        if (a < 0) {
            res = false
            println("Вы ввели отрицательное число $a Цикл окончен!")
        } else {
            println("Вы ввели число $a")
        }
    } while (res)
}

fun homework1(){

}

fun homework2(){

}

fun homework3(){

}
