import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Submenu extends JFrame implements ActionListener{

    private JMenuBar menubar;
    private JMenu menu1, menu2, menu3;
    private JMenuItem menuItem1, menuItem2, menuItem3, menuItem4;

    public Submenu(){
        setLayout(null);
        menubar = new JMenuBar();
        setJMenuBar(menubar);

        menu1 = new JMenu("Opciones");
        menubar.add(menu1);

        menu2 = new JMenu("Tamaño de la ventana");
        menu1.add(menu2);

        menu3 = new JMenu("Color de fondo");
        menu1.add(menu3);

        menuItem1 = new JMenuItem("300-200");
        menu2.add(menuItem1);
        menuItem1.addActionListener(this);

        menuItem2 = new JMenuItem("640-480");
        menu2.add(menuItem2);
        menuItem2.addActionListener(this);

        menuItem3 = new JMenuItem("Rojo");
        menu3.add(menuItem3);
        menuItem3.addActionListener(this);

        menuItem4 = new JMenuItem("Verde");
        menu3.add(menuItem4);
        menuItem4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == menuItem1){
            setSize(300,200);
        }
        if (e.getSource() == menuItem2){
            setSize(640,480);
        }
        if (e.getSource() == menuItem3){
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (e.getSource() == menuItem4){
            getContentPane().setBackground(new Color(0,255,0));
        }
    }

    public static void main(String[] args) {
        Submenu submenu = new Submenu();
        submenu.setBounds(0,0,300,200);
        submenu.setVisible(true);
        submenu.setResizable(false);
        submenu.setLocationRelativeTo(null);
    }
}
