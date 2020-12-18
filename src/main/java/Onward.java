import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Onward extends JPanel {
    JButton order = new JButton("Order Ticket");
    JButton back = new JButton("<- Back");



    static String idfilm;
    static JLabel judul1;

    public Onward(){
        //background color
        setOpaque(true);
        setBackground(new Color(5, 199, 150));
        setSize(900, 550);
        setLayout(null);

        ImageIcon poster1 = new ImageIcon(new ImageIcon("images/onward.jpg").getImage().getScaledInstance(300, 410, Image.SCALE_DEFAULT));
        JLabel poster1label = new JLabel(poster1);
        poster1label.setIcon(poster1);
        poster1label.setBounds(60,40,300, 410);
        add(poster1label);

        judul1 = new JLabel("Onward");
        judul1.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 27));
        judul1.setForeground(Color.white);
        judul1.setBounds(395,30,140, 60);
        add(judul1);

        JLabel director1 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Director</span><br>Dan Scanlon</html>");
        director1.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        director1.setForeground(Color.white);
        director1.setBounds(395,90,140, 60);
        add(director1);

        JLabel cast1 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Cast Member</span><br>Tom Holland, Chris Pratt, Octavia Spencer,Julia Louis-Dreyfus</html>");
        cast1.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        cast1.setForeground(Color.white);
        cast1.setBounds(395,145,500, 60);
        add(cast1);

        JLabel duration1 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Duration</span><br>102 mnt</html>");
        duration1.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        duration1.setForeground(Color.white);
        duration1.setBounds(395,200,500, 60);
        add(duration1);

        JLabel rating1= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Rating</span><br>PG</html>");
        rating1.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        rating1.setForeground(Color.white);
        rating1.setBounds(565,205,500, 60);
        add(rating1);

        JLabel genre1= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Genre</span><br>Adventure, Animation, Comedy, Family, Fantasy</html>");
        genre1.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        genre1.setForeground(Color.white);
        genre1.setBounds(395,260,500, 60);
        add(genre1);

        JLabel sinopsis1= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Sinopsis</span><br>In a suburban fantasy world, two teenage elf brothers, Ian and Barley<br> Lightfoot, go on a journey to discover if there is still a little magic left <br>out there in order to spend one last day with their father, who died <br>when they were too young to remember him.</html>");
        sinopsis1.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 13));
        sinopsis1.setForeground(Color.white);
        sinopsis1.setBounds(395,300,500, 150);
        add(sinopsis1);

        //button order
        order.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 12));
        order.setForeground(Color.white);
        order.setBackground(new Color(109, 89, 122));
        order.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(109, 89, 122), 1),
                BorderFactory.createEmptyBorder(2, 10, 2, 10)));
        order.setBounds(775,471,110, 40);
        add(order);
        add(order);
        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Payment.film.setText(judul1.getText());
                idfilm="MID01";
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
