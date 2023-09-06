package builder;

import java.util.ArrayList;

import components.Cabeza;
import components.Piernas;
import components.Torso;
import legos.LegoVillano;

public class BuilderLegoVillanos implements Builder {

    Cabeza cabeza;
    Torso torso;
    Piernas piernas;

    public LegoVillano getResult(){
        return new LegoVillano(cabeza, torso, piernas);
    }

    public void setImagenCabeza(ArrayList<String> imagenCabeza){
        cabeza.setImagenCabeza(imagenCabeza);
    }

    @Override
    public void setPiernasX(int coordenadaX) {
        piernas.setX(coordenadaX);
    }
     public void setPiernasY(int coordenadaY) {
        piernas.setY(coordenadaY);
    }

    public void setCabezaX(int coordenadaX) {
        piernas.setX(coordenadaX);
    }
     public void setCabezaY(int coordenadaY) {
        piernas.setY(coordenadaY);
    }

    public void setTorsoX(int coordenadaX) {
        piernas.setX(coordenadaX);
    }
     public void setTorsoY(int coordenadaY) {
        piernas.setY(coordenadaY);
    }

    public void setimagenTorso(ArrayList<String> imagenTorso) {
        torso.setImagenTorso(imagenTorso);
    }

    @Override
    public void setImagenPiernas(ArrayList<String> imagenPiernas) {
        piernas.setImagenPiernas(imagenPiernas);
    }


}

