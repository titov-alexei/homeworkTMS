import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //task1(scanner);
        //task2(scanner);
        //task3(scanner);
        task4(scanner);
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

    }

    public static void task5(){

    }

}
