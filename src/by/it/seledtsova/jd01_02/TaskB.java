package by.it.seledtsova.jd01_02;

import java.util.Scanner;

/*
В классе TaskB(пакет by.it.familiya.jd01_02) создайте Scanner и методы:
static void step1()
static void step2(intmonth)
static void step3(double a, double b, double c)
        вызовите их один раз из метода main.Эти методырешают такие задачи:
        1.step1()выводит числа от 1 до 25в виде матрицы N x N слева направо и сверхувниз (т.е. N = 5).
        После каждого числа один пробел.
        2.В main ввести с консоли через объект типа Scanner число от 1 до 12и с ним вызвать метод step2(intmonth),
        который выводит на консоль русское название месяца строчными буквами,соответствующего этому числу через switch.
        Сообщить об ошибке“нет такого месяца”для некорректных чисел во вводе(этодолжна быть default–ветка для switch).
        3.Рассчитайте и выведите корни (или один корень) квадратного уравнения. Если корня нет, то нужно вывести сообщение
        “корней нет”.Параметры (a b c) уравнения нужно вводитьв main через тот же Scanner и затем передавать
        в метод step3(double a, double b, double c). Для извлечения 𝐷 используйте метод Math.sqrt(дискриминант)

 */

public class TaskB {
    public static void main(String[] args) {
        step1 ();
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        step2( month);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
         step3 ( a, b, c);
    }


   private static void step1() {
       for (int i = 0; i <=25 ; i++) {
           System.out.print(i + " ");
           if (i%5==0) System.out.println();
       }
   }


    private static void step2 (int month) {
        switch (month){
            case 1 :System.out.println("январь"); break;
            case 2 :System.out.println("февраль"); break;
            case 3 :System.out.println("март"); break;
            case 4 :System.out.println("апрель"); break;
            case 5 :System.out.println("май"); break;
            case 6 :System.out.println("июнь"); break;
            case 7 :System.out.println("июль"); break;
            case 8 :System.out.println("август"); break;
            case 9 :System.out.println("сентябрь"); break;
            case 10 :System.out.println("октябрь"); break;
            case 11 :System.out.println("ноябрь"); break;
            case 12 :System.out.println("декабрь"); break;
            default:
                System.out.println("нет такого месяца");

        }
    }

    private static void step3(double a, double b, double c) {
        double dis=b*b-4*a*c;
        if (dis<0)
            System.out.println("корней нет");
        else if (dis ==0) {
            double x=-b/(2*a);
            System.out.println(x);
        }
        else {
            double x1 = (-b+Math.sqrt(dis))/(2*a);
            double x2 = (-b-Math.sqrt(dis))/(2*a);
            System.out.println(x1+""+x2);
        }
    }
    }