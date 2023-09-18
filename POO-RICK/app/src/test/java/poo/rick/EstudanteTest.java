package poo.rick;

import static org.junit.jupiter.api.Assertions.*;

class EstudanteTest {

    @org.junit.jupiter.api.Test
    void testNome() {
        Estudante e = new Estudante("Lucas", "13579");

        // O nome deve ser igual ao atribuído na instanciação
        String nome = e.getNome();
        assertEquals("Lucas", nome);

        // O nome pode ser redefinido
        e.setNome("Maria");
        assertEquals("Maria", e.getNome());
    }

    @org.junit.jupiter.api.Test
    void testMatricula() {
        Estudante e = new Estudante("Antonio", "12345");

        // A matrícula deve ser igual à atribuído na instanciação
        String matricula = e.getMatricula();
        assertEquals("12345", matricula);

        // A matrícula pode ser redefinida
        e.setMatricula("12346");
        assertEquals("12346", e.getMatricula());
    }

    @org.junit.jupiter.api.Test
    void testNotas(){
        Estudante e = new Estudante("Lucas","132465",10,8,9);
        //nota1
        double n1 = e.getN1();
        assertEquals(10, n1);
        e.setN1(6);
        assertEquals(6, e.getN1());

        //nota2
        double n2 = e.getN2();
        assertEquals(8, n2);
        e.setN2(9);
        assertEquals(9, e.getN2());


        //nota3
        double n3 = e.getN3();
        assertEquals(9, n3);
        e.setN3(6);
        assertEquals(6, e.getN3());
    }

    @org.junit.jupiter.api.Test
    void testMedia(){
        Estudante e = new Estudante("Lucas","132465",10,8,9);
        assertEquals(9, e.getMedia());
    }

    @org.junit.jupiter.api.Test
    void testSetNotas(){
        Estudante e = new Estudante("Lucas","132465",10,8,9);
        assertThrows(Exception.class,() -> {
            e.setNotas(-1,-1,-1);
        });
    }

}