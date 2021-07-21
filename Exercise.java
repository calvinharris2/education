import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Exercise {
    public static void main(String[] args) {
        //Необходимо вывести на экран числа от 1 до 5. На экране должно быть: 1 2 3 4 5
        System.out.println("Задание 1 - Необходимо вывести на экран числа от 1 до 5. На экране должно быть: 1 2 3 4 5");
        exercise1();
        //Необходимо вывести на экран числа от 1 до 80, вывести толко четные
        System.out.println("Задание 2 - Необходимо вывести на экран числа от 1 до 80, вывести толко четные");
        exercise2();
        //Необходимо вывести на экран числа от 5 до 1. На экране должно быть: 5 4 3 2 1
        System.out.println("Задание 3 - Необходимо вывести на экран числа от 5 до 1. На экране должно быть: 5 4 3 2 1");
        exercise3();
        //Необходимо вывести на экран таблицу умножения на 10
        System.out.println("Задание 4 - Необходимо вывести на экран таблицу умножения на 10");
        exercise4();
        //Напишите программу, где пользователь вводит любое целое положительное число. Cумма от 1 до этого числа
        System.out.println("Задание 5 - Напишите программу, где пользователь вводит любое целое положительное число. Cумма от 1 до этого числа");
        exercise5();
        //Как сделать так, чтобы этот код печатал числа не от 0 до 99, а от 70 до 201?
        System.out.println("Задание 6 - Как сделать так, чтобы этот код печатал числа не от 0 до 99, а от 70 до 201?");
        exercise6();
        //Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
        System.out.println("Задание 7 - Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….");
        exercise7();
        System.out.println("Задание 8 - Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр");
        exercise8();
        System.out.println("Задание 9 - Выведите на экран первые 11 членов последовательности Фибоначчи.");
        exercise9();
        System.out.println("Задание 10 - Используя цикл for написать фрагмент кода, который находит сумму для заданного n");
        exercise10();
        System.out.println("Задание 11 - Рандомное число четное/нечетное");
        exercise11();
    }

    static void exercise1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    static void exercise2() {
        for (int i = 1; i <= 80; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    static void exercise3() {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }

    static void exercise4() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("10 * %d = %d", i, 10 * i));
        }
    }

    static void exercise5() {
        System.out.println("Введите любое целое положительное число:");
        int number = input();
        int sum = 0;
        for (int i = 1; i < number + 1; i++) {
            sum += i;
        }
        System.out.println(String.format("Сумма чисел до %d равна - %d", number, sum));
    }

    static void exercise6() {
        // Заведем переменную i целого типа и равную нулю
        int i = 70;
        // знак цикла while означает
        // «повторяй блок кода { … } пока верно условие внутри скобок», то есть (i < 100)
        while (i <= 201) {
            System.out.println(i); // распечатать текущее значение i
            i++; // увеличить i на 1
        }
    }

    static void exercise7() {
        int count = 1;
        for (int j = 1; count <= 55; j = j + 2) {  // for(int count=1, j=1;count<=55;count++,j=j+2){
            System.out.println(j);
            count++;
        }
    }

    static void exercise8() {
        System.out.println("Введите любое натуральное число:");
        int number = input();
        int numb = number;
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("1 Сумма чисел: " + sum);

        System.out.println("2 Сумма чисел: " + getSum(numb));
    }

    static void exercise9() {
        int num1 = 0;
        int num2 = 1;
        int counter = 0;
        while (counter <= 11) {
            if (num1 != 0) System.out.println(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }

    static void exercise10() {
        System.out.println("Введите число n:");
        int n = input();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 5 * i;
        }
        System.out.println("Сумма: " + sum);
    }

    static void exercise11() {
        for (int i = 1; i <= 3; i++) {
            int n = ThreadLocalRandom.current().nextInt();
            System.out.println(String.format("%d. Число %d - %s", i, n, n % 2 == 0 ? "четное" : "нечетное"));
        }
    }

    static int getSum(int numb) {
        return numb != 0 ? numb % 10 + getSum(numb / 10) : 0;
    }

    static int input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}