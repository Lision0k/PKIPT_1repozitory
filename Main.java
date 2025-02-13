import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double[] A = Vvod();
        System.out.println("A = " + Arrays.toString(A));
        double[] B = Vvod();
        System.out.println("B = " + Arrays.toString(B));
        double[] C = Vvod();
        System.out.println("C = " + Arrays.toString(C));
        double[] D = Vvod();
        System.out.println("D = " + Arrays.toString(D));
        double[] X = Vvod();
        System.out.println("X = " + Arrays.toString(X));
        double[] Z1 = new double[A.length*B.length*X.length];
        double[] Z2 = new double[C.length*D.length*X.length];
        double[] Z = new double[Z1.length * Z2.length];
        Sum(Ymn(A, X), B, Z1);
        Sum(Ymn(C, X), D, Z2);
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