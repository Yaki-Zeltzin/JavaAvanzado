import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FieldTextarea extends JFrame implements ActionListener{
    private JTextField textField1;
    private JButton boton1;
    private JTextArea textarea1;
    private JScrollPane scrollPane;

    String texto = "";
    public FieldTextarea(){
        setLayout(null);
        textField1 = new JTextField();
        textField1.setBounds(10,10,200,30);
        add(textField1);

        boton1 = new JButton("Agregar");
        boton1.setBounds(250,10,100,30);//50,100,40,30
        add(boton1);
        boton1.addActionListener(this);

        textarea1 = new JTextArea();
        scrollPane = new JScrollPane(textarea1);
        scrollPane.setBounds(10,50,400,300);
        add(scrollPane);
    }

    //accion del evento
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton1){
            texto += textField1.getText() + "\n";
            textarea1.setText(texto);
            textField1.setText("");
        }
    }

    public static void main(String[] args) {
        FieldTextarea fieldTextarea = new FieldTextarea();
        fieldTextarea.setBounds(0,0,540,400);
        fieldTextarea.setVisible(true);//sea visible
        fieldTextarea.setResizable(false);//no se modifiquen las dimensiones
        fieldTextarea.setLocationRelativeTo(null);//se posicione en el centro de la pantalla
    }

}
