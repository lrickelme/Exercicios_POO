package poo.rick;

public class Estudante {

    private String nome;
    private String matricula;
    private double n1,n2,n3;

    public Estudante(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }



    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    

    public Estudante(String nome, String matricula, double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public void setNotas (double n1, double n2, double n3) throws Exception{
        if (n1 <
        0 || n2 < 0 || n3 <0){
            throw new Exception("Nota inválida");
        }
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;

        
    }

    double getMedia(){
        return (n1+n2+n3)/3;
    }

    public static void main(String[] args) {

        Estudante aluno = new Estudante("Lucas", "13579", 10, 8, 9);

        System.out.println(aluno.nome);
        System.out.println(aluno.matricula);
        System.out.println(aluno.getMedia());
        System.out.println(aluno.n1);
        System.out.println(aluno.n2);
        System.out.println(aluno.n3);

    }

}