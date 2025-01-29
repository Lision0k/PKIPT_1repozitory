import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n = ");
        double n = in.nextDouble();
        System.out.print("Введите x = ");
        double x = in.nextDouble();
        double sum = 0;
        for (double i = 0; i <= n; i++){
            double fact = 1;
            for (double j = 1; j <= n; j++){
                fact *= j;
            }
            sum += (Math.pow(-1,i)*Math.pow(x,i))/fact;
        }
        System.out.printf("e^(-x) = %f", sum);
    }
}