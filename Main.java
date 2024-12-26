import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        task1(scanner);
        task2(scanner);
        task3(scanner);
        task4(scanner);
        task5(scanner);
        homework1(scanner);
        homework2(scanner);
        homework3(scanner);
        fibonachi1(scanner);

        System.out.println("Введите число для расчета числа Фибоначчи (рекурсия):");
        int x = scanner.nextInt();
        int res = fibonachi2(x);
        System.out.println("Число Фибоначи: " + res);
    }

    public static void task1(Scanner scan){
        System.out.println("Задача №1\n Введите 2 числа через Enter");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Сумма двух чисел равна: " + (a+b));
    }

    public static void task2(Scanner scan){
        System.out.println("Задача №2\n Введите число");
        int a = scan.nextInt();
        System.out.println((a % 2 == 0) ? "Число является четным" : "Число является нечетным");

    }

    public static void task3(Scanner scan){
        System.out.println("Задача №3\n Введите число");
        int a = scan.nextInt();
        for (int i = 1; i < a + 1 ; i++){
            System.out.print(i +" ");
        }
    }

    public static void task4(Scanner scan){
        System.out.println("Задача №4\n Введите число");
        int a = scan.nextInt();
        int i = 1;
        int sum = 0;
        while (i < a + 1) {
            sum += i;
            i++;
        }
        System.out.println("Сумма всех чисел: " + sum);
    }

    public static void task5(Scanner scan){
        System.out.println("Задача №5");
        boolean res = true;
        int a = 0;
        do {
            System.out.println("Введите чиcло: ");
            a = scan.nextInt();
            if (a < 0) {
                res = false;
                System.out.println("Вы ввели отрицательное число." + a + " Цикл окончен!");
            } else {
                System.out.println("Вы ввели число " + a);
            }
        } while (res);

    }

    public static void homework1(Scanner scan){
        System.out.println("ДЗ №1\n Введите ширину и длину прямоугольника через Enter");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Периметр прямоугольника равен: " + (2 * a + 2 * b) + "\nПлощадь прямоугольника равна: " + (a * b));
    }

    public static void homework2(Scanner scan){
        System.out.println("ДЗ №2\n Введите баллы");
        int a = scan.nextInt();
        if (a >= 0 && a <= 29) {
            System.out.println("Оценка F");
        } else if (a >= 30 && a <= 49) {
            System.out.println("Оценка D");
        } else if (a >= 50 && a <= 74) {
            System.out.println("Оценка C");
        } else if (a >= 75 && a <= 89) {
            System.out.println("Оценка B");
        } else if (a >= 90 && a <= 100) {
            System.out.println("Оценка A");
        } else System.out.println("Недопустимое значение");

    }

    public static void homework3(Scanner scan){
        System.out.println("ДЗ №3\n Введите число");
        int a = scan.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }

    public static void fibonachi1(Scanner scan) {
        System.out.println("Задача Фибоначи (цикл)\n Введите число");
        int a = scan.nextInt();
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        switch (a){
            case 0,1: {
                System.out.println("Число: 0");
                break;
            }
            case 2: {
                System.out.println("Число: 1");
                break;
            }
            default: {
                for (int i = 2; i < a; i++) {
                    sum = num1 + num2;
                    num1 = num2;
                    num2 = sum;
                }
                System.out.println("Число: " + sum);
            }

        }

    }

    public static int fibonachi2(int number) {
        if (number <= 1){
            return 0;
        } else if (number == 2){
            return 1;
        } else {
            return fibonachi2(number - 1) + fibonachi2( number - 2);
        }
    }

}
