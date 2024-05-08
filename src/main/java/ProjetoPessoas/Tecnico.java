package ProjetoPessoas;

public class Tecnico extends Aluno{

    //Atributos
    private String registroProfissional;


    //Método
    public void praticar(){
        System.out.println("Praticando");
    }


    //Métodos Especiais
    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
