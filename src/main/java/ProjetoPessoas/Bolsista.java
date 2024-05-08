package ProjetoPessoas;

public class Bolsista extends Aluno{

    //Atributos
    private float bolsa;


    //Método
    public void RenovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }


    //Métodos Especiais
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilidado");
    }
}
