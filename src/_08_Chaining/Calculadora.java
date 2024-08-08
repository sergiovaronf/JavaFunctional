package _08_Chaining;

public class Calculadora {

    private int acum;

    Calculadora sumar( Integer numero){
        this.acum+=numero;
        System.out.println("El acumulado despues de la operacion suma es:" + this.acum);
        return this;
    }

    Calculadora resta( Integer numero){
        this.acum-=numero;
        System.out.println("El acumulado despues de la operacion resta es:" + this.acum);
        return this;
    }

    Calculadora multiplicacion( Integer numero){
        this.acum*=numero;
        System.out.println("El acumulado despues de la operacion multiplicacion es:" + this.acum);
        return this;
    }
}
