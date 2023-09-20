package poo.rick;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Livro (String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public static void main(String[] args) {

        Livro l1 = new Livro("Copa do Brasil", "São Paulo", 20.23);
        System.out.println(l1.titulo);
        System.out.println(l1.autor);
        System.out.println(l1.preco);
    }

}
