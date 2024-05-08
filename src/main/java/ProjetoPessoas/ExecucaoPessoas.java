package ProjetoPessoas;

public class ExecucaoPessoas {

    public static void main(String[] args) {

        Visitante v1 = new Visitante();
        v1.setNome("Victor");
        v1.setIdade(21);
        v1.setSexo("M");
        System.out.println(v1.toString());

        System.out.println("=========================================");

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setIdade(22);
        a1.setSexo("M");
        a1.setCurso("Software Development");
        a1.setMatricula(1111);
        a1.pagarMensalidade();

        System.out.println("=========================================");

        Bolsista b1 = new Bolsista();
        b1.setNome("Pedro");
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();

        System.out.println("=========================================");

        Professor prof1 = new Professor();
        prof1.setNome("José");
        prof1.setIdade(23);
        prof1.setSexo("M");
        prof1.setEspecialidade("Engenheiro");
        prof1.setSalario(5000f);
        prof1.receberAumento(1000f);
        System.out.println(prof1.toString());

        System.out.println("=========================================");

        Tecnico t1 = new Tecnico();
        t1.setNome("Lucas");
        t1.setIdade(23);
        t1.setSexo("M");
        t1.praticar();
        System.out.println(t1.toString());
    }
}
