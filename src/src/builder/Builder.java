package builder;

import java.util.ArrayList;

import legos.LegoVillano;

public interface Builder {
    public void setCabezaX(int x);
    public void setCabezaY(int y);
    public void setTorsoX(int x);
    public void setTorsoY(int y);
    public void setPiernasX(int x);
    public void setPiernasY(int y);
    public void setImagenCabeza(ArrayList<String> imagenCabeza);
    public void setimagenTorso(ArrayList<String> imagenTorso);
    public void setImagenPiernas(ArrayList<String> imagenPiernas);
    public LegoVillano getResult();

}
