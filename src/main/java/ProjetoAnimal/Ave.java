package ProjetoAnimal;

public class Ave extends Animal{

    //Atributos
    private String corPena;


    //Método
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }


    //Métodos Especiais
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }


    //Métodos Abstratos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }
}
