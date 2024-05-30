import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    JButton estudiante, trabajador, salir;
    JPanel panel;


    Menu(){
        setTitle("Menu");
        setSize(340, 340);
        getContentPane().setBackground(new Color(255, 255, 255));
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        panel= new JPanel();
        panel.setBounds(20, 20, 300, 270);
        panel.setBackground(new Color(175, 202, 220));
        panel.setLayout(null);
        getContentPane().add(panel);

        estudiante=new JButton("Estudiante");
        estudiante.setBounds(20, 20, 260, 60);
        estudiante.addActionListener(this);
        add(estudiante);

        trabajador=new JButton("trabajador");
        trabajador.setBounds(20, 100, 260, 60);
        add(trabajador);

        salir=new JButton("salir");
        salir.setBounds(20, 180, 260, 60);
        salir.addActionListener(this);
        add(salir);

//se acaban los botones
        panel.add(estudiante);
        panel.add(salir);
        panel.add(trabajador);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setVisible(true);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == estudiante) {new FrmEstudiante();}
        if (evento.getSource() == trabajador){}
        if (evento.getSource() == salir){System.exit(0);}
    }

}
