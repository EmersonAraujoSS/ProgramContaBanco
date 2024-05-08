package ProjetoAnimal;

public class Canguru extends Mamifero{

    //Métodos
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }


    //Métodos Abstratos
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
}
