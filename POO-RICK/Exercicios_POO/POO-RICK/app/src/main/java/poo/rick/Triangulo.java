package poo.rick;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public double getLado1() {
        return lado1;
    }


    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }


    public double getLado2() {
        return lado2;
    }


    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }


    public double getLado3() {
        return lado3;
    }


    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void tipoDeTriangulo(){
        if (this.lado1 != this.lado2 && this.lado1 != this.lado3 && this.lado2 != this.lado3){
        System.out.println("Triângulo Escaleno");
        }else if (this.lado1 == this.lado2 && this.lado1 == this.lado3){
            System.out.println("Triângulo equilátero");
        }else{
            System.out.println("Triângulo Isósceles");
        }
    }

    public static void main(String[] args) {
        Triangulo x = new Triangulo(10, 5, 7);
        x.tipoDeTriangulo();

        Triangulo t = new Triangulo(10, 10, 8);
        t.tipoDeTriangulo();

        Triangulo l = new Triangulo(13, 13, 13);
        l.tipoDeTriangulo();
    }

    
    
}
