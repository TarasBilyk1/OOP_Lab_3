public class Ex
{
    public void Task1()
    {
        System.out.print( " Тут через цикл For");

        String a = "Hallo ";

        for (int i = 0; i < 50 ; i ++ )
        {
            System.out.print( a );
        }

        System.out.println( " Тут через цикл While");

        int b = 0;
        while ( b < 50 )
        {
            System.out.println(a);
            b++ ;
        }
    }
    public void Task2()
    {
        int hour = 2 ;
        int minute = 60 ;
        for (int i = 0 ; i < hour ; i++ )
        {
            for (int l = 0 ; l < minute ; l++ )
            {
                System.out.println( "hour " + (i + 1) + " minute " + (l + 1));
            }
        }

    }
    public void Task3()
    {
        int hour = 2 ;
        int minute = 60 ;

        int i = 0 ;
        while (i < hour ) {
            int l = 0;
            while (l < minute) {
                System.out.println("hour " + (i + 1) + " minute " + (l + 1));
                l++;
            }
            i++;
        }
    }
    public void Task4()
    {
        int hour = 2 ;
        int minute = 60 ;
        int second = 60 ;
        for (int i = 0; i < hour; i++)
        {
            for (int l = 0; l < minute; l++)
            {
                for (int p = 0; p < second; p++)
                {
                    System.out.println("hour " + (i + 1) + " minute " + (l + 1) + " second " + ( p + 1 ));
                }
            }
        }
    }

    public static double function (double i)
    {
        return ((Math.sqrt(i)) / (i + 1));
    }
    public static void Task5 (int X,int Y )
    {
        double res = 0;    // Ліильник
        double step = 0.1; // Корк

        for (double i = X; i <= Y; i += step) {
            double result = function(i);
            System.out.print(" f = ");
            System.out.printf("%.3f ", i);
            System.out.print("= ");
            System.out.printf("%.3f \n ", result);
            if (result <= X && result >= Y)
            {
                res++;
            }
        }
            if (res == 0) {
                System.out.println("Немає значень функції у вказаному діапазоні.");
            } else {
                System.out.println("Кількість значень функції у вказаному діапазоні: " + res);
            }

    }
    public static double function1 (double i1)
    {
        return ((Math.sqrt(i1)) / (i1 + 1));
    }
    public static void Task6(int X1,int Y1)
    {
        double res = 0 ;    // Ліильник
        double step = 0.1 ; // Корк

            double i1 = X1 ;
            while ( i1 <= Y1  )
            {
                double result = function1(i1);
                System.out.print ("f = ");
                System.out.printf ("%.3f ",i1 );
                System.out.print ("= ");
                System.out.printf("%.3f \n ",result);
                if ( result <= X1 && result >= Y1 )
                {
                    res++;
                }
                i1 +=step;
            }
            if (res == 0)
            {
                System.out.println("Немає значень функції у вказаному діапазоні.");
            }
            else
            {
                System.out.println("Кількість значень функції у вказаному діапазоні: " + res);
            }
    }
}
