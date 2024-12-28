fun main() {
    println("Урок №2. Введите номер задания")
    val num = readln()
    when(num.toInt()) {
        1 -> task1()
        2 -> task2()
        3 -> task3()
        4 -> task4()
        5 -> task5()
        6 -> homework1()
        7 -> homework2()
        8 -> homework3()
        9->fibonachi1()
        10-> {
            println("Введите число для расчета числа Фибоначчи (рекурсия): ")
            val x = readln().toInt()
            val res = fibonachi2(x)
            println("Число Фибоначи: $res")
        }
        else -> println("Ввели неверный номер задания")
    }
}

fun task1() {
    println("Задача №1\n Введите два числа")
    val a = readln().toInt()
    val b = readln().toInt()
    println("Сумма двух чисел равна ${a + b}")
}

fun task2() {
    println("Задача №2\n Введите число")
    val a = readln().toInt()
    val str = if(a % 2==0) "четное" else "нечетное"
    println("Число $str")
}

fun task3() {
    println("Задача №3\n Введите число")
    val a = readln().toInt()
    for (i in 1..a) print("$i ")
}

fun task4() {
    println("Задача №4\n Введите число")
    var a = readln().toInt()
    var sum = 0
    while (a > 0) {
        sum += a
        a--
    }
    println("Сумма всех чисел $sum")
}

fun task5() {
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

fun homework1() {
    println("ДЗ №1\n Введите ширину и длину прямоугольника через Enter")
    val a = readln().toInt()
    val b = readln().toInt()
    println("Периметр прямоугольника равен: ${2 * a + 2 * b}\nПлощадь прямоугольника равна: ${a * b}")
}


fun homework2() {
    println("ДЗ №2\n Введите баллы")
    val a = readln().toInt()
    when (a) {
        in 0..29 -> println("Оценка F")
        in 30..49 -> println("Оценка D")
        in 50..74 -> println("Оценка C")
        in 75..89 -> println("Оценка B")
        in 90..100 -> println("Оценка A")
        else -> "Вы ввели неверное значение"
    }
}

fun homework3(){
    println("ДЗ №3\n Введите число")
    val a = readln().toInt()
    for (i in 1..9) {
        println("$a * $i = ${a * i}")
    }
}

fun fibonachi1() {
    println("Задача Фибоначи (цикл)\n Введите число")
    val a = readln().toInt()
    var num1 = 0
    var num2 = 1
    var sum = 0
    when (a) {
        0, 1 -> println("Число: 0")
        2 -> println("Число: 1")
        else -> {
            //var i = 2
            for (i in 3..a) {
                sum = num1 + num2;
                num1 = num2;
                num2 = sum;
            }
            println("Число: $sum")

        }
    }
}

fun fibonachi2(number: Int) : Int {
    return if (number <= 1) {
        0
    } else if (number == 2) {
        1
    } else {
        Main.fibonachi2(number - 1) + Main.fibonachi2(number - 2)
    }
}




