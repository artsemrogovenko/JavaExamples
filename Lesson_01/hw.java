
import java.util.Scanner;
public class hw {
/*
 * 1. Задана натуральная степень k. Сформировать случайным
 * образом список коэффициентов (значения от 0 до 100)
 * многочлена многочлен степени k.
 * Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
 * 2. Даны два файла, в каждом из которых находится запись
 * многочлена. Сформировать файл содержащий сумму
 * многочленов.
 */public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.println("список коэффициентов\nВвести степень");
    int k = iScanner.nextInt();
    iScanner.close();
    String polynomial = "";
    int count = k * 1;
    while (count > 0) {
        int generated = (int) (Math.random() * 100);
        if (generated != 0 & generated != 1) {
            polynomial += String.format("%d*x**%d ", generated, count); // "{generated}*x**{count}
            
        } 
        else {
            polynomial += String.format("x**%d ", count);
        }
            if (count >= 1 ) {
                polynomial += "+ ";
            }
            --count;
        }
        polynomial += String.format("%d", (int)(Math.random() * 3));
        System.out.println(polynomial);
}
}
