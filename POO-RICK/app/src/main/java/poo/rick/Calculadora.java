package poo.rick;

import java.util.Scanner;

public class Calculadora {

    public double adicao (double n1, double n2){
        return n1+n2;
    }

    public double subtracao (double n1, double n2){
        return n1-n2;
    }

    public double multiplicacao (double n1, double n2){
        return n1*n2;
    }

    public double divisao (double n1, double n2){
        return n1/n2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o primeiro valor:");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo valor:");
        double n2 = sc.nextDouble();

        Calculadora calc = new Calculadora();

        System.out.println(calc.adicao(n1, n2));
        System.out.println(calc.subtracao(n1, n2));
        System.out.println(calc.multiplicacao(n1, n2));
        System.out.println(calc.divisao(n1, n2));
        
        sc.close();
    }
}