package ProjetoAnimal;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        PeixeDourado pd = new PeixeDourado();
        Arara ar = new Arara();
        Lobo lob = new Lobo();


        m.setPeso(5.70f);
        m.setIdade(2);
        m.setMembros(4);
        m.setCorPelo("Marrom");
        m.locomover();
        m.alimentar();
        m.emitirSom();

        System.out.println("==============================");

        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();

        System.out.println("==============================");

        c.locomover();
        k.locomover();
        k.emitirSom();
        lob.emitirSom();
        k.reagir("Olá");
        k.reagir(11,45);
        k.reagir(19,0);
    }
}