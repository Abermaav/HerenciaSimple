import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmEstudiante extends JFrame implements ActionListener {
    JPanel p1, p2;
    JButton guardar, limpiar;
    JLabel l1, l2, l3, l4, l5, l6 ,l7, l8 ,l9, l10;
    JTextField numeroD, carnet, nombre, peso, apellido, estatura;
    JComboBox tipoD, sangre, sexo;
    JDateChooser nacimiento;



    FrmEstudiante(){
        setTitle("Estudiante");
        setSize(660, 370);
        getContentPane().setBackground(new Color(255, 255, 255));
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        p1= new JPanel();
        p1.setBounds(20, 20, 300, 300);
        p1.setBackground(new Color(175, 202, 220));
        p1.setLayout(null);
        getContentPane().add(p1);

        p2= new JPanel();
        p2.setBounds(340, 20, 300, 300);
        p2.setBackground(new Color(175, 202, 220));
        p2.setLayout(null);
        getContentPane().add(p2);


        l1=new JLabel("Numero Documento");
        l1.setBounds(20, 5, 140, 60);
        l1.setFont(new Font("Arial", Font.BOLD, 10));


        l2=new JLabel("Tipo Documento");
        l2.setBounds(160, 5, 140, 60);
        l2.setFont(new Font("Arial", Font.BOLD, 10));


        l3=new JLabel("Numero Carnet");
        l3.setBounds(20, 55, 140, 60);
        l3.setFont(new Font("Arial", Font.BOLD, 10));


        l4=new JLabel("Fecha Nacimiento");
        l4.setBounds(160, 55, 140, 60);
        l4.setFont(new Font("Arial", Font.BOLD, 10));


        l5=new JLabel("Nombre");
        l5.setBounds(20, 115, 140, 60);
        l5.setFont(new Font("Arial", Font.BOLD, 10));


        l6=new JLabel("Apellido");
        l6.setBounds(160, 115, 140, 60);
        l6.setFont(new Font("Arial", Font.BOLD, 10));


        l7=new JLabel("Genero");
        l7.setBounds(20, 170, 140, 60);
        l7.setFont(new Font("Arial", Font.BOLD, 10));


        l8=new JLabel("Tipo/Sangre");
        l8.setBounds(160, 170, 140, 60);
        l8.setFont(new Font("Arial", Font.BOLD, 10));


        l9=new JLabel("Peso(Kg)");
        l9.setBounds(20, 225, 140, 60);
        l9.setFont(new Font("Arial", Font.BOLD, 10));


        l10=new JLabel("Estatura(mts)");
        l10.setBounds(160, 225, 140, 60);
        l10.setFont(new Font("Arial", Font.BOLD, 10));


        numeroD=new JTextField();
        numeroD.setBounds(16, 40, 110, 30);

        carnet=new JTextField();
        carnet.setBounds(16, 95, 110, 30);

        nombre=new JTextField();
        nombre.setBounds(16, 150, 110, 30);

        sexo=new JComboBox();
        sexo.setBounds(16, 205, 110, 30);
        sexo.addItem("Masculino");
        sexo.addItem("Femenino");

        peso=new JTextField();
        peso.setBounds(16, 260, 110, 30);

        tipoD=new JComboBox();
        tipoD.setBounds(156, 40, 120, 30);
        tipoD.addItem("SIN REGISTRAR");
        tipoD.addItem("REGISTRO CIVIL");
        tipoD.addItem("TARJETA DE IDENTIDAD");
        tipoD.addItem("CEDULA DE CIUDADANIA");
        tipoD.addItem("PASAPORTE");
        tipoD.addItem("CEDULA EXTRANJERA");

        nacimiento= new JDateChooser();
        nacimiento.setBounds(156, 95, 120, 30);

        apellido=new JTextField();
        apellido.setBounds(156, 150, 110, 30);

        sangre=new JComboBox();
        sangre.setBounds(156, 205, 110, 30);
        sangre.addItem("SIN Registro");
        sangre.addItem("A+");
        sangre.addItem("A-");
        sangre.addItem("B+");
        sangre.addItem("B-");
        sangre.addItem("O+");
        sangre.addItem("O-");
        sangre.addItem("AB+");
        sangre.addItem("AB-");

        estatura=new JTextField();
        estatura.setBounds(156, 260, 110, 30);

        guardar=new JButton("Guardar");
        guardar.setBounds(20, 40, 260, 80);

        limpiar=new JButton("Limpiar");
        limpiar.setBounds(20, 140, 260, 80);
        limpiar.addActionListener(this);

        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(l8);
        p1.add(l9);
        p1.add(l10);
        p1.add(numeroD);
        p1.add(tipoD);
        p1.add(carnet);
        p1.add(nacimiento);
        p1.add(nombre);
        p1.add(sexo);
        p1.add(peso);
        p1.add(apellido);
        p1.add(sangre);
        p1.add(estatura);

        p2.add(guardar);
        p2.add(limpiar);

        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1.setVisible(true);
        p2.setVisible(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == limpiar) {

            apellido.setText(" ");
            carnet.setText(" ");
            estatura.setText(" ");
            nacimiento.setDate(null);
            nombre.setText(" ");
            numeroD.setText(" ");
            peso.setText(" ");
            sangre.setSelectedIndex(-1);
            tipoD.setSelectedIndex(-1);
            sexo.setSelectedIndex(-1);
            numeroD.grabFocus();

        }
    }
}

