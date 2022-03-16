import javax.swing.*;

public class Scroll extends JFrame{
    private JTextField textField1;
    private JScrollPane scrollpanel1;
    private JTextArea textarea1;

    public Scroll(){
        setLayout(null);
        textField1 = new JTextField();
        textField1.setBounds(10,10,200,30);
        add(textField1);

        textarea1 = new JTextArea();
        scrollpanel1 = new JScrollPane(textarea1);

        scrollpanel1.setBounds(10,50,400,300);
        add(scrollpanel1);

    }

    public static void main(String[] args) {
        Scroll formulario1 = new Scroll();
        formulario1.setBounds(0,0,540,400);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}
