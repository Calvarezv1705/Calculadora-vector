public class Main {
    public static void main(String[] args) {
        CalculadoraVectorOp calculadoraVectorOp = new CalculadoraVectorOp(10, -1);

        calculadoraVectorOp.imprimir();

        calculadoraVectorOp.sumar();

        calculadoraVectorOp.imprimirRes();

        calculadoraVectorOp.restar();

        calculadoraVectorOp.imprimirRes();

        calculadoraVectorOp.setVector(15, 0);

        calculadoraVectorOp.imprimir();

        calculadoraVectorOp.sumar();

        calculadoraVectorOp.imprimirRes();

        calculadoraVectorOp.restar();

        calculadoraVectorOp.imprimirRes();
    }
}
