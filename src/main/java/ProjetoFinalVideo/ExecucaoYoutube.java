package ProjetoFinalVideo;

import java.util.Arrays;

public class ExecucaoYoutube {

    public static void main(String[] args) {

        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 13 de Java");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Emerson", 21, "M", "admin");
        g[1] = new Gafanhoto("Lore", 22, "F", "admin");

        Visualizacao[] visu = new Visualizacao[5];
        visu[0] = new Visualizacao(g[0], v[2]);
        visu[0].avaliar();
        System.out.println(visu[0].toString());

        visu[0] = new Visualizacao(g[0], v[1]);
        visu[0].avaliar(90.0f);
        System.out.println(visu[0].toString());


        /* System.out.println("Videos\n--------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGafanhotos\n--------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString()); */


    }
}
