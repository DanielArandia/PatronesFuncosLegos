import Cliente.Cliente;
import modelo.Controlador;
import vista.Vista;

public class Launcher {

    public static void main(String[] args) {
        Vista v = new Vista();
        Cliente m = new Cliente();
        Controlador controlador = new Controlador(v, m);
    }

}
