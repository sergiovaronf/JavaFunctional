package _08_Chaining;

public class MainChaining {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.sumar(5)
                .resta(4)
                .multiplicacion(8);
    }
}
