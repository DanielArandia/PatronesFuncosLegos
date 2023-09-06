package factory;

import java.util.Random;

public class FactoryFuncos implements AbstractFactory {

    Random random = new Random();
    public void crearVillano() {
        
        int valorAleatorio1 = random.nextInt(3);
        int valorAleatorio2 = random.nextInt(3);
        int valorAleatorio3 = random.nextInt(3);

    }

    @Override
    public String crearheroe() {
        int valorAleatorio1 = random.nextInt(3);
        int valorAleatorio2 = random.nextInt(3);
        int valorAleatorio3 = random.nextInt(3);

        if(valorAleatorio1.equals(0)){
            return "linkimagenCabeza1";
        }
        if(valorAleatorio1.equals(1)){
            return "linkimagenCabeza1";
        }
        if(valorAleatorio1.equals(2)){
            return "linkimagenCabeza1";
        }
        else{
            return "linkimagenCAbeza1";
        }
    }
}
