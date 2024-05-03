package ExerciocioPratico;

public class ExecucaoLivro {

    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa(" Pedro", 21, " M");
        p[1] = new Pessoa(" Maria", 25, " F");

        l[0] = new Livro(" Apredendo Java", " Emerson Araujo", 300, p[0]);
        l[1] = new Livro(" POO para iniciantes", " Pedro Paulo", 400, p[1]);
        l[2] = new Livro(" Java Avançado", " Maria Paulo", 500, p[0]);

        System.out.println(l[0].toString());
        System.out.println("================================");
        System.out.println(l[1].toString());

    }
}
