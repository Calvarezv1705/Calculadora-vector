import java.util.Random;

public class CalculadoraVectorOp extends CalculadoraVector {

    private int[] vec2;
    private int[] res;

    public CalculadoraVectorOp(int n, int tipo) {
        super(n, tipo);
        vec1 = new int[n];
        vec2 = new int[n];
        res = new int[n];

        Random r = new Random();
        for (int i = 0; i < n; i++) {
            if (tipo <= 0) {
                vec1[i] = r.nextInt(100);
                vec2[i] = r.nextInt(100);
            } else {
                vec1[i] = tipo * (i + 1);
                vec2[i] = r.nextInt(100);
            }
        }
    }

    public void sumar() {
        for (int i = 0; i < vec2.length; i++) {
            res[i] = vec1[i] + vec2[i];
        }
    }

    public void restar() {
        for (int i = 0; i < vec2.length; i++) {
            res[i] = vec1[i] - vec2[i];
        }
    }

    public void imprimirRes() {
        System.out.print("Res: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }

    public void imprimir() {
        System.out.print("Vec1: ");
        for (int i = 0; i < vec1.length; i++) {
            System.out.print(vec1[i] + " ");
        }
        System.out.println();

        System.out.print("Vec2: ");
        for (int i = 0; i < vec2.length; i++) {
            System.out.print(vec2[i] + " ");
        }
        System.out.println();
    }

    public void setVector(int n, int tipo) {
        vec1 = new int[n];
        vec2 = new int[n];
        res = new int[n];

        Random r = new Random();
        for (int i = 0; i < n; i++) {
            if (tipo <= 0) {
                vec1[i] = r.nextInt(100);
                vec2[i] = r.nextInt(100);
            } else {
                vec1[i] = tipo * (i + 1);
                vec2[i] = r.nextInt(100);
            }
        }
    }
}
