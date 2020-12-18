import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.Box;

public class Login extends JPanel {
    JLabel line= new JLabel("-------------------------------");
    JLabel judul= new JLabel("Login Account");
    JLabel user = new JLabel("Username");
    JLabel pass = new JLabel("Password");
    JLabel ket = new JLabel("Doesn't have an account? Sign up here!");
    JLayeredPane loginpanel = new JLayeredPane();
    static JTextField txtuser = new JTextField();
    static JPasswordField txtpw = new JPasswordField();
    JButton login = new JButton("Login");
    JButton signup = new JButton("New Account");
   public Login(){
       Database db=new Database();
       //background color
       setOpaque(true);
       setBackground(new Color(53, 80, 112));
       setSize(900, 550);
       setLayout(null);

       //Logo Images
       ImageIcon logo  = new ImageIcon(new ImageIcon("images/logo2.png").getImage().getScaledInstance(220, 60, Image.SCALE_DEFAULT));
       JLabel logolabel = new JLabel(logo);
       logolabel.setIcon(logo);
       add(logolabel);
       logolabel.setBounds(7,9,220, 60);

       //background Images
       ImageIcon back  = new ImageIcon(new ImageIcon("images/img1.jpg").getImage().getScaledInstance(890, 350, Image.SCALE_DEFAULT));
       JLabel backlabel = new JLabel(back);
       backlabel.setIcon(back);
       add(backlabel);
       backlabel.setBounds(0,71,890, 370);

       /*Insets insets = loginpanel.getInsets();
       Dimension size = loginpanel.getPreferredSize();
       loginpanel.setBounds(520 + insets.left, 75 + insets.top,
               size.width, size.height);*/

       //login panel components
       //label
       judul.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 18));
       judul.setForeground(new Color(53, 80, 112));
       line.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 12));
       line.setForeground(new Color(53, 80, 112));
       user.setFont(new Font("Lucida Sans Unicode",Font.PLAIN, 17));
       user.setForeground(new Color(109, 89, 122));
       pass.setFont(new Font("Lucida Sans Unicode",Font.PLAIN, 17));
       pass.setForeground(new Color(109, 89, 122));
       ket.setFont(new Font("Lucida Sans Unicode",Font.PLAIN, 11));
       ket.setForeground(new Color(109, 89, 122));

       //text field
       txtuser.setBackground(new Color(245, 238, 246));
       txtpw.setBackground(new Color(245, 238, 246));

       //button
       login.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 11));
       login.setForeground(Color.white);
       login.setBackground(new Color(229, 107, 111));
       login.setBorder(BorderFactory.createCompoundBorder(
               BorderFactory.createLineBorder(new Color(246, 84, 100), 1),
               BorderFactory.createEmptyBorder(5, 91, 5, 91)));
       login.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   db.login();
                   Payment.idaccount="i"+txtuser.getText();

               } catch (SQLException throwables) {
                   throwables.printStackTrace();
               }
           }
       });

       signup.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 11));
       signup.setForeground(Color.white);
       signup.setBackground(new Color(229, 107, 111));
       signup.setBorder(BorderFactory.createCompoundBorder(
               BorderFactory.createLineBorder(new Color(246, 84, 100), 1),
               BorderFactory.createEmptyBorder(5, 72, 5, 72)));

       //login panel
       loginpanel.setSize(280,370);
       loginpanel.setOpaque(true);
       loginpanel.setLayout(new BoxLayout(loginpanel, BoxLayout.Y_AXIS));
       loginpanel.setBackground(Color.white);
       loginpanel.setBorder(BorderFactory.createCompoundBorder(
             BorderFactory.createLineBorder(new Color(243, 104, 106), 0),
           new EmptyBorder(30, 35, 30, 35)));

       loginpanel.add(judul);
       loginpanel.add(line);
       loginpanel.add(Box.createRigidArea(new Dimension(0,10)));
       loginpanel.add(user);
       loginpanel.add(Box.createRigidArea(new Dimension(0,10)));
       loginpanel.add(txtuser);
       loginpanel.add(Box.createRigidArea(new Dimension(0,20)));
       loginpanel.add(pass);
       loginpanel.add(Box.createRigidArea(new Dimension(0,10)));
       loginpanel.add(txtpw);
       loginpanel.add(Box.createRigidArea(new Dimension(0,25)));
       loginpanel.add(login);
       loginpanel.add(Box.createRigidArea(new Dimension(0,22)));
       loginpanel.add(ket);
       loginpanel.add(Box.createRigidArea(new Dimension(0,8)));
       loginpanel.add(signup);
       loginpanel.setBounds(530,58,290,400);
       add(loginpanel,1);

       //action listener
       signup.addActionListener(e -> new Signup());
       setVisible(true);
   }
}
