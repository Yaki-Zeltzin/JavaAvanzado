import javax.swing.*;
import java.awt.event.*;

public class ComboBox extends JFrame implements ItemListener{
    private JComboBox combol;

    public ComboBox(){
        setLayout(null);
        combol = new JComboBox();
        combol.setBounds(10,10,80,20);
        add(combol);

        //opciones del combol
        combol.addItem("rojo");
        combol.addItem("verde");
        combol.addItem("azul");
        combol.addItem("amarillo");
        combol.addItem("negro");
        combol.addItemListener(this);//crear evento
    }

    //lugar donde crear el evento
    public void itemStateChanged(ItemEvent e){
    if(e.getSource() == combol){
        String seleccion = combol.getSelectedItem().toString();
        setTitle(seleccion);
    }
    }

    public static void main(String[] args) {
        ComboBox combobox = new ComboBox();
        combobox.setBounds(0,0,250,150);
        combobox.setVisible(true);
        combobox.setResizable(false);
        combobox.setLocationRelativeTo(null);
    }
}
