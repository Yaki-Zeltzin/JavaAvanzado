import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {

    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scrollpane;
    private JTextArea textarea1;

    public Licencia(){
        setLayout(null);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        label1 = new JLabel("TÉRMINOS Y CONDICIONES");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale Mono",1,14));
        label1.setForeground(new Color(0,0,0));
        add(label1);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setFont(new Font("Andale Mono",0,9));
        textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES");
        scrollpane= new JScrollPane(textarea1);
        scrollpane.setBounds(10,40,575,200);
        add(scrollpane);

        check1 = new JCheckBox("Yo Acepto");
        check1.setBounds(10,250,300,30);
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10,290,100,30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("No acepto");
        boton2.setBounds(120,290,100,30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);

        ImageIcon imagen = new ImageIcon("images/coca-cola.png");
        label2 = new JLabel(imagen);
        label2.setBounds(315,135,300,300);
        add(label2);
    }

    public void stateChanged(ChangeEvent e){

    }

    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args) {
        Licencia licencia = new Licencia();
        licencia.setBounds(0,0,600,360);
        licencia.setVisible(true);
        licencia.setResizable(false);
        licencia.setLocationRelativeTo(null);
    }
}
