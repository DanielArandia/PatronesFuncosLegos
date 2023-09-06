package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Cliente.Cliente;
import vista.Vista;


public class Controlador implements ActionListener {

    private Vista vista;
    private Cliente cliente;

    public Controlador(Vista vista, Cliente cliente) {
        this.vista = vista;
        this.cliente = cliente;
        this.vista.agregarListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
      
        if("Funco Villano".equals(e.getActionCommand())){
            vista.segundoJFrame("Funco Villano");
        }
        if("Lego Heroe".equals(e.getActionCommand())){
            vista.segundoJFrame("Lego Heroe");
        }
        if("Lego Villano".equals(e.getActionCommand())){
            vista.segundoJFrame("Lego Villano");
        }
        if("Funco Heroe".equals(e.getActionCommand())){
            vista.segundoJFrame("Funco Heroe");
        }
    }

}