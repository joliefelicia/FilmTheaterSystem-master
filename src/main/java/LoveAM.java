import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoveAM extends JPanel {
    JButton order = new JButton("Order Ticket");
    JButton back = new JButton("<- Back");
    static String idfilm;
    static  JLabel judul8;
    public LoveAM(){
        //background color

        setOpaque(true);
        setBackground(new Color(17, 138, 178));
        setSize(900, 550);
        setLayout(null);

        ImageIcon poster8 = new ImageIcon(new ImageIcon("images/lam.jpg").getImage().getScaledInstance(300, 410, Image.SCALE_DEFAULT));
        JLabel poster8label = new JLabel(poster8);
        poster8label.setIcon(poster8);
        poster8label.setBounds(60,40,300, 410);
        add(poster8label);

        judul8 = new JLabel("Love and Monsters");
        judul8.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 27));
        judul8.setForeground(Color.white);
        judul8.setBounds(395,30,600, 70);
        add(judul8);

        JLabel director8 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Director</span><br>Michael Matthews</html>");
        director8.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        director8.setForeground(Color.white);
        director8.setBounds(395,90,140, 60);
        add(director8);

        JLabel cast8 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Cast Member</span><br>Dylan OBrien, Jessica Henwick, Michael Rooker</html>");
        cast8.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        cast8.setForeground(Color.white);
        cast8.setBounds(395,145,500, 60);
        add(cast8);

        JLabel duration8 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Duration</span><br>109 mnt</html>");
        duration8.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        duration8.setForeground(Color.white);
        duration8.setBounds(395,200,500, 60);
        add(duration8);

        JLabel rating8= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Rating</span><br>PG-13</html>");
        rating8.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        rating8.setForeground(Color.white);
        rating8.setBounds(565,205,500, 60);
        add(rating8);

        JLabel genre8= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Genre</span><br>Action, Adventure, Comedy</html>");
        genre8.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        genre8.setForeground(Color.white);
        genre8.setBounds(395,266,500, 60);
        add(genre8);

        JLabel sinopsis8= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Sinopsis</span>" +
                "<br>In a monster-infested world, Joel learns his girlfriend is " +
                "<br>just 80 miles away. To make the dangerous journey, Joel " +
                "<br>discovers his inner hero to be with the girl of his dreams.</html>");
        sinopsis8.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 13));
        sinopsis8.setForeground(Color.white);
        sinopsis8.setBounds(395,300,500, 150);
        add(sinopsis8);

        //button order
        order.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 12));
        order.setForeground(Color.white);
        order.setBackground(new Color(109, 89, 122));
        order.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(109, 89, 122), 1),
                BorderFactory.createEmptyBorder(2, 10, 2, 10)));
        order.setBounds(775,471,110, 40);
        add(order);
        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Payment.film.setText(judul8.getText());
                idfilm="MID03";
            }
        });


        //button back
        back.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 12));
        back.setForeground(Color.white);
        back.setBackground(new Color(229, 107, 111));
        back.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(246, 84, 100), 1),
                BorderFactory.createEmptyBorder(0, 5, 0, 7)));
        back.setBounds(0,475,77, 37);
        add(back);

        setVisible(true);
    }
}
