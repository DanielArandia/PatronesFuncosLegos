package vista;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Vista extends JFrame {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JFrame frame2;

    public Vista(){
        super("mi vista");
        initComponents();
    }

    public void initComponents(){
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        addButtons();
        this.setVisible(true);
        
    }

    public void addButtons(){

        
        button2 = new JButton("Funco Villano");
        button2.setBounds(280,40,110,60);
        this.add(button2);
        button1 = new JButton("Funco Heroe");
        button1.setBounds(60,40,110,60);
        this.add(button1);
        button3 = new JButton("Lego Heroe");
        button3.setBounds(60,300,110,60);
        this.add(button3);
        button4 = new JButton("Lego Villano");
        button4.setBounds(280,300,110,60);
        this.add(button4);


    }

    public void agregarListener(ActionListener listener){
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);
    }

    public void segundoJFrame(String nombre) {
        JFrame j = new JFrame();
        this.dispose();
        j.setTitle(nombre);
        j.setSize(500, 500);
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
        frame2.add(j);


        JLabel label = new JLabel("Este es el Segundo JFrame");
        getContentPane().add(label);
    }
}
