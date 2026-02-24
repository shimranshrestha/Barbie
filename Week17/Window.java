package Week17;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Window extends JFrame
{
    public Window()
    {
       
        setTitle("CS4001NII Progrramming");
        setSize(400,500);
        
        
        JPanel panel=new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("User Info"));
        //panel.setBackground(Color.CYAN);
        
        
        JLabel label= new JLabel("Username: ");
        label.setBounds(50, 50, 100, 30);
        
        JTextField txtField= new JTextField();
        txtField.setBounds(155, 50, 100, 30);
        
        JButton btn= new JButton("Submit");
        btn.setBounds(50, 90, 100, 30);
        btn.setBackground(new Color(255,200,0));
        btn.setForeground(Color.RED);
        
        
        panel.add(btn);
        panel.add(txtField);
        panel.add(label);
        panel.setLayout(null);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
         
    }
    public static void main(String[] args)
    {
        Window wd= new Window();
        wd.setVisible(true);
        
        }
}