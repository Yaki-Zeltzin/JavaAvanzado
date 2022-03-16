import javax.swing.*;
import java.awt.event.*;

                        //interfaz          //eventos
public class Input extends JFrame implements ActionListener{
    //componentes
    private JButton boton1;
    private JLabel label1;
    private JTextField textField1;

    //contructor
    public Input() {
        setLayout(null);//permite agregar los componentes atraves de coordenadas(null)espera a que nosotros agreguemos el lugar
        label1 = new JLabel("Usuario: ");
        label1.setBounds(10, 10, 100, 30);
        add(label1);

        textField1 = new JTextField();
        textField1.setBounds(120, 17, 150, 20);
        add(textField1);

        boton1 = new JButton("Aceptar");
        boton1.setBounds(10, 80, 100, 30);
        add(boton1);
        boton1.addActionListener(this);//le agregaremos un evento
    }

    //capturar el evento
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            String texto = textField1.getText();
            setTitle(texto);
        }
    }

    //metodo main e interfaz
    public static void main(String[] args) {
        Input formulario1 = new Input();
        formulario1.setBounds(0,0,300,150);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }


}
