import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double[] B = Vvod(); //R2
        System.out.println("R2 = " + Arrays.toString(B));
        double[] C = Vvod();
        double[] R1 = Vvod();
        System.out.println("R1 = " + Arrays.toString(R1));
        double[] X = Vvod();
        System.out.println("Rx = " + Arrays.toString(X));
        double[] A = Ymn(R1, B);
        double[] A1 = new double[A.length];
        Sum(new double[]{1.0}, A, A1);
        double[] Z1 = new double[A.length*B.length*X.length];
        double[] Z2 = new double[R1.length*R1.length*X.length];
        double[] Z = new double[Z1.length * Z2.length];
        Sum(Ymn(A1, X), B, Z1);
        Sum(Ymn(R1, X), R1, Z2);
        Del(Z1, Z2, Z);
        for (double i : X)
            for (double j : Z)
                if (i == j)
                    System.out.print(i + ", ");
    }

    static double[] Vvod(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите шаг: ");
        double shag = in.nextDouble();
        System.out.print("Введите начало диапазона: ");
        double start = in.nextDouble();
        System.out.print("Введите конец диапазона: ");
        double end = in.nextDouble();
        int sh = 0;
        for (double i = start; i <= end; i += shag)
            sh++;
        double[] A = new double[sh];
        sh = 0;
        for (double i = start; i <= end; i += shag){
            A[sh] = i;
            sh++;
        }
        return A;
    }

    static void Sum(double[] A, double[] B, double[] Z){
        int sh = 0;
        for (double i : A) {
            for (double j : B) {
                Z[sh] = i + j;
                sh++;
            }
        }
    }
    static void Del(double[] A, double[] B, double[] Z){
        int sh = 0;
        for (double i : A) {
            for (double j : B) {
                Z[sh] = i / j;
                sh++;
            }
        }
    }
    static double[] Ymn(double[] A, double[] B){
        double[] Z = new double[A.length*B.length];
        int sh = 0;
        for (double i : A) {
            for (double j : B) {
                Z[sh] = i * j;
                sh++;
            }
        }
        return Z;
    }
}