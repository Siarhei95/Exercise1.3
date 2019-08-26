package Exercise1;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y, a;
        System.out.print("x: ");
        x = scanner.nextDouble();
        System.out.print("y: ");
        y = scanner.nextDouble();
        a = ((Math.sin(x) + Math.cos(y))/(Math.cos(x) + Math.sin(y)))*Math.tan(x*y);
        System.out.println(a);



    }
}
