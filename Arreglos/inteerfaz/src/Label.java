import javax.swing.*;
import java.text.Normalizer;

public class Label extends JFrame {
    private JLabel label1;
    private JLabel label2;

    //CONSTRUCTOR
    public Label(){
        setLayout(null);
        label1 = new JLabel("Interfaz gráfica. ");
        label1.setBounds(10,20,300,30);
        add(label1);
        label2 = new JLabel("Vdersion 1.0 ");
        label2.setBounds(10,100,100,30);
        add(label2);
    }

    public static void main(String[] args) {
    Label formulario1 = new Label();
    formulario1.setBounds(0,0,300,200);
    formulario1.setResizable(false);
    formulario1.setVisible(true);
    formulario1.setLocationRelativeTo(null);
    }
}
