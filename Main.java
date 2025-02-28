import static java.lang.System.*;

class Express {
    float x;
    float a;
    float b;

    Express(float x) {
        this.x = x;
    }

    Express(float a, float b) {
        this.a = a;
        this.b = b;
    }

    Express(float x, float a, float b) {
        this.x = x;
        this.a = a;
        this.b = b;
    }

    public float chet1() {
        return 3 * this.x + 5;
    }

    public String chet2() {
        if ((this.a - this.b) != 0) {
            String rez = String.valueOf((this.a + this.b) / (this.a - this.b));
            return rez;
        }
        return "Error";
    }

    public String chet3() {
        if (this.b != 0) {
            String rez = String.valueOf((this.a * this.x) / this.b);
            return rez;
        }
        return "Error";
    }
}

public class Main {
    public static void main(String[] args) {
        Express X = new Express(2.1f);
        out.println(X.chet1());
        Express Y = new Express(2.1f, 1.1f);
        out.println(Y.chet2());
        Express Z = new Express(2.1f, 1.2f, 2.0f);
        out.println(Z.chet3());
    }
}