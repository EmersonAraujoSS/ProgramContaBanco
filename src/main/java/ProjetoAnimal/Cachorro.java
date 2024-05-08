package ProjetoAnimal;

public class Cachorro extends Lobo{

    //Métodos
    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }

    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }


    //Métodos abstratos por sobrecarga
    public void reagir(String frase){
        if (frase.equals("Toma comida") || frase.equals("Olá")){
            System.out.println("Abanar e latir");
        }else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int horas, int minutos){
        if (horas < 12){
            System.out.println("Abanar");
        }else if (horas < 18) {
            System.out.println("Ignorar");
        }else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanar");
        }else {
            System.out.println("Rosnar e latir");
        }
    }

    public void reagir(int idade, float peso){
        if (idade < 5){
            if(peso < 10){
                System.out.println("Abanar");
            }else{
                System.out.println("Latir");
            }
        }else if (idade < 10){
            System.out.println("Rosnar");
        }else {
            System.out.println("Ignorar");
        }
    }


    //Métodos abstratos
    @Override
    public void emitirSom(){
        System.out.println("Au! au! au!");
    }
}
