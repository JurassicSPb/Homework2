/**
 * Created by Юрий on 18.05.2016.
 */
import java.util.Scanner;
public class Homework2 {

public static void main (String [] args) {


    for (int i=0; i<10; i++)
    {
        for (int j=0; j<10; j++)
        {
            if (i != 0 & i != 9 & j != 0 & j != 9)
            {
                System.out.print(" ");
            }
            else
            {
                System.out.print("*");
            }
        }
        System.out.println();
    }

    Scanner sc = new Scanner(System.in);
    System.out.print ("Введите число a: ");
    double a = sc.nextDouble();
    System.out.print ("Введите число b: ");
    double b = sc.nextDouble();
    System.out.print ("Введите число c: ");
    double c = sc.nextDouble();
    double D = b*b - 4*a*c;
    if (D > 0)
    {
        double x1 = -b - (Math.sqrt(D)) / (2 * a);
        double x2 = -b + (Math.sqrt(D)) / (2 * a);
        System.out.println ("Корни уравнения x1: " + x1 + "x2: " + x2);
    }
    else if (D == 0)
    {
        double x = -b / (2 *a);
    }
    else
    {
        System.out.println ("Уравнение не имеет действительных корней");
    }








}
}
