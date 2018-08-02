import java.util.Scanner;

    public class Main {
        public static void main(String args[]) throws java.io.IOException {
            double x1, x2, y1, y2, area;
            // вводим координаты прямоугольника с консоли
            Scanner scan = new Scanner(System.in);

            System.out.print("Input rectangle x1");
            x1 = scan.nextDouble();
            System.out.print("Input rectangle y1");
            y1 = scan.nextDouble();
            System.out.print("Input rectangle x2");
            x2 = scan.nextDouble();
            System.out.print("Input rectangle y2");
            y2 = scan.nextDouble();

           //System.out.println (""+x1+x2+y1+y2);

            Rectangle rect = new Rectangle (x1, y1, x2, y2);
            System.out.println ("Rectangle area = " + rect.getArea());

        }


}
