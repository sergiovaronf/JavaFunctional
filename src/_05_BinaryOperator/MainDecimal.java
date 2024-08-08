package _05_BinaryOperator;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.function.BinaryOperator;

public class MainDecimal {

    public static void main(String[] args) {
        BigDecimal numero1 = new BigDecimal("54.11");
        BigDecimal numero2 = new BigDecimal("31.11");

        BinaryOperator<BigDecimal> operacion = (x, y) -> {
            MathContext mc = new MathContext(10);
            return x.divide(y, mc);
        };

        BigDecimal resultado = operacion.apply(numero1, numero2);

        System.out.println("Resultado de la división: " + resultado);
    }
}
