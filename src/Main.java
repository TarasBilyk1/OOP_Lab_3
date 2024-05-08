import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        do {
            Ex Task = new Ex();
            System.out.print("Введіть номер завдання від 1 до 6 : ");
            int TaskNumber = scan.nextInt();
            /*---------------------- Завдання 1 -------------------------*/
            if (TaskNumber == 1) {
                Task.Task1();
            }
            /*---------------------- Завдання 2 -------------------------*/
            else if (TaskNumber == 2) {
                Task.Task2();
            }
            /*---------------------- Завдання 3 -------------------------*/
            else if (TaskNumber == 3) {
                Task.Task3();
            }
            /*---------------------- Завдання 4 -------------------------*/
            else if (TaskNumber == 4) {
                Task.Task4();
            }
            /*---------------------- Завдання 5 -------------------------*/
            else if (TaskNumber == 5) {

                int X = scan.nextInt();
                int Y = scan.nextInt();
                Ex.Task5(X, Y);
                scan.close();
            }
            /*---------------------- Завдання 6 -------------------------*/
            else if (TaskNumber == 6) {
                int X1 = scan.nextInt();
                int Y1 = scan.nextInt();

                Ex.Task6(X1, Y1);
                scan.close();
            } else {
                System.out.println("Такого завдання не існує ! ");
            }
            System.out.println(" ");
            System.out.println("Якщо хочете завершити програму натисніть (0) , а щоб продовжити виберіть завдання від 1 по 5");

            if (TaskNumber == 0) {
                break;
            }
        }while(true);
    }
}