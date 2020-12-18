import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

import static java.awt.SystemColor.menu;

public class Signup  extends JFrame {
    JPanel form = new JPanel();
    JPanel butt = new JPanel();
    JLabel judul = new JLabel("Create New Account");
    JLabel name = new JLabel("Fullname");
    JLabel email = new JLabel("Email");
    JLabel notlp = new JLabel("Phone Number");
    JLabel user = new JLabel("Username");
    JLabel pass = new JLabel("Password");
    JTextField txtname = new JTextField();
    JTextField txtemail = new JTextField();
    JTextField txtnotlp = new JTextField();
    JTextField txtuser = new JTextField();
    JPasswordField txtpass = new JPasswordField();
    static JButton signup = new JButton("Sign Up");
    JButton cancel = new JButton("Cancel");
    static String idaccount;

    public Signup() {
        Database db=new Database();
        setTitle("Sign Up");
        setSize(480, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        //Frame icon
        ImageIcon icon = new ImageIcon("images/icon.png");
        setIconImage(icon.getImage());

        //background color
        getContentPane().setBackground(new Color(53, 80, 112));

        //add components
        judul.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 18));
        judul.setForeground(Color.white);
        judul.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 130));
        add(judul);

        //form components
        name.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 14));
        name.setForeground(Color.white);
        name.setBorder(BorderFactory.createEmptyBorder(0, 12, 0, 12));

        email.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 14));
        email.setForeground(Color.white);
        email.setBorder(BorderFactory.createEmptyBorder(0, 12, 0, 12));

        notlp.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 14));
        notlp.setForeground(Color.white);
        notlp.setBorder(BorderFactory.createEmptyBorder(0, 12, 0, 12));

        user.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 14));
        user.setForeground(Color.white);
        user.setBorder(BorderFactory.createEmptyBorder(0, 12, 0, 12));

        pass.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 14));
        pass.setForeground(Color.white);
        pass.setBorder(BorderFactory.createEmptyBorder(0, 12, 0, 12));

        //form sign up
        form.setSize(160, 170);
        form.setBorder(BorderFactory.createEmptyBorder(20, 15, 20, 15));
        form.setBackground(new Color(109, 89, 122));
        form.setLayout(new GridLayout(5, 2, 15, 16));
        form.add(name);
        form.add(txtname);
        form.add(email);
        form.add(txtemail);
        form.add(notlp);
       form.add(txtnotlp);
        form.add(user);
        form.add(txtuser);
        form.add(pass);
        form.add(txtpass);
        add(form);

        //button panel
        cancel.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 14));
        cancel.setForeground(Color.white);
        cancel.setBackground(new Color(181, 101, 118));
        cancel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(181, 101, 118), 1),
                BorderFactory.createEmptyBorder(4, 20, 4, 20)));

        signup.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 14));
        signup.setForeground(Color.white);
        signup.setBackground(new Color(181, 101, 118));
        signup.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(181, 101, 118), 1),
                BorderFactory.createEmptyBorder(4, 20, 4, 20)));
        signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String x= txtuser.getText();
                     idaccount="i"+ x;
                     Payment.idaccount=idaccount;
                    db.insertaccount(idaccount,txtname.getText(),txtuser.getText(), String.valueOf(txtpass.getPassword()),txtemail.getText(),txtnotlp.getText());

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                dispose();
            }
        });



        butt.setBorder(BorderFactory.createEmptyBorder(30, 8, 0, 8));
        butt.setBackground(new Color(53, 80, 112));
        butt.add(signup);
        butt.add(cancel);
        add(butt);

        //form border
        Border etched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        TitledBorder title = BorderFactory.createTitledBorder(etched, "Data Sign Up");
        title.setTitleFont(title.getTitleFont().deriveFont(Font.BOLD, 13));
        title.setTitleColor(new Color(191, 237, 234));


        form.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(15, 15, 15, 15), title));

        //action listener
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }


}
