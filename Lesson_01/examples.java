
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class examples {
    /*
     * Настройка рабочего
     * места Настройка
     * рабочего места Шаг 1:
     * Java JDK https:// www.oracle.com/java/technologies/downloads/
     * Шаг 2:
     * Extension Pack
     * VS Code https://
     * marketplace.visualstudio.com/items?itemName=vscjava.vscode-javapack
     * При желаниии:https:// www.jetbrains.com/ru-ru/idea/
     */
/**
 * Program
 */
public static void main(String[] args)throws Exception{

System.out.println("Goodbye world");


{
short age = 10;
int salary = 123456;
System.out.println(age); // 10
System.out.println(salary); // 123456
}

{
float e = 2.7f;
double pi = 3.1415;
System.out.println(e); // 2.7
System.out.println(pi); // 3.1415
}

{
char ch = '1';
System.out.println(Character.isDigit(ch)); // true
ch = 'a';
System.out.println(Character.isDigit(ch)); // false
}

{
boolean flag1 = 123 <= 234;
System.out.println(flag1); // true
boolean flag2 = 123 >= 234 || flag1;
System.out.println(flag2); // true
boolean flag3 = flag1 ^ flag2;
System.out.println(flag3); // false

}

// Основы: типы данных *Строки не так просты
{
String msg = "Hello world";
System.out.println(msg); // Hello world
}


// Неявная типизация
/* {
var a = 123;
System.out.println(a); // 123
var d = 123.456;
System.out.println(d); // 123.456
}
 */
{
var aa = 123;
System.out.println(aa); // 123
var dd = 123,456;
System.out.println(dd); // 123.456
System.out.println(getType(aa)); // Integer
System.out.println(getType(dd)); // Double
dd = 1022;
System.out.println(dd); // 1022
dd = "mistake";
//error: incompatible types:
//String cannot be converted to double
}



    {
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
    }

    {
        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5

    }
    {
        int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
    }

    {
        int[][] arr = new int[3][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    {
        int i = 123;
        double d = i;
        System.out.println(i); // 123
        System.out.println(d); // 123.0
        d = 3.1415;
        i = (int) d;
        System.out.println(d); // 3.1415
        System.out.println(i); // 3
        d = 3.9415;
        i = (int) d;
        System.out.println(d); // 3.9415
        System.out.println(i); // 3
        byte b = Byte.parseByte("123");
        System.out.println(b); // 123
        b = Byte.parseByte("1234");
        System.out.println(b); // NumberFormatException: Value out of range
    }

    // НО
    {
        int[] a = new int[10];
        double[] d = a; // ИЗУЧАЕМ ковариантность и контравариантность
        //Type mismatch: cannot convert from int[] to double[]
    }

    /*
     * Получение данных из терминала
     * Строки
     */

    {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }

    // Некоторые примитивы

    {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner.close();
    }

    // Проверка на соответствие получаемого типа
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();
    }

    // Форматированный вывод
    {
        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println(res);
    }
    {
        int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d \n", a, b,
                c);
        System.out.printf("%d + %d = %d \n", a, b, c);
        System.out.println(res);
    }

    // Виды спецификаторов
    {   float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00
    }

    /*
     * Виды спецификаторов
     * Область видимости
     * переменных Область
     * видимости переменных
     * У переменных
     * существует понятие«
     * область видимости».
     * Если переменную
     * объявили внутри
     * некоторого блока
     * фигурных скобок{},
     * то снаружи
     * этого блока
     * переменная будет недоступна.
     */
/*     {
        {
            int i = 123;
            System.out.println(i);
        }
       System.out.println(i); // error: cannot find symbol
    } */

    /*
     * Функции и
     * методы Функции
     * и методы
     * Функции и методы—
     * это технически
     * одно и
     * то же.
     * Функции могут
     * не принадлежать классам,
     * а методы
     * принадлежат.В java
     * все функции
     * являются методами.
     * Описание Вызов
     * Возвращаемое значение Рекурсия
     */

    static void sayHi() {
        System.out.println("hi!");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double factor(int n) {
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }

    {

        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
    }

    // условный оператор

    {

        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);
    }

    {
        int a1 = 1;
        int b1 = 2;
        int c1 = 0;
        if (a1 > b1)
            c = a;
        if (b1 > a1)
            c1 = b1;
        System.out.println(c1);
    }

    // тернарный оператор
    {
        int a3 = 1;
        int b3 = 2;
        int min = a3 < b3 ? a3 : b3;
        System.out.println(min);
    }

    // Оператор выбора

{
int mounth =3;
String text = "";
switch (mounth) {
case 1:
text = "Autumn";
break;
case 2: 
text="Aasdasn";
default:
text = "mistake";
break;
}
    /*
     * В java
     * доступны следующие циклы:●цикл while;●цикл do while;●цикл for;
     * и его модификация for
     * in Цикл while
     */
    {
        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
    }

    {
        int value = 321;
        int count = 0;
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);
    }

    /*
     * Операторы для
     * управления циклами—continue и break.
     * Выполнение следующей
     * итерации цикла—continue.
     * Прерывание текущей
     * итерации цикла—break.*
     * ближайшего к
     * оператору Циклы
     * Оператор цикла for
     */
    {
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);
    }

    // Вложенные циклы
    {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // * * * * *
        // * * * * *
    }

    {
        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }

    // for : Работает только для коллекций
    {
        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }

    // Работа c файлами

    {
        try (
                FileWriter fw = new FileWriter("file.txt",
                        false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /*
     * Создание и запись\
     * дозапись Работа
     * с файлами Чтение,
     * Вариант
     * посимвольно
     */

    {
        FileReader fr = new FileReader("file.txt");
        int c3;
        while ((c3 = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
    }

    // Работа с файлами Вариант построчно

    {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }

}