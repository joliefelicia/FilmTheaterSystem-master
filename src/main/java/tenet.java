import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tenet extends JPanel {
    JButton order = new JButton("Order Ticket");
    JButton back = new JButton("<- Back");
    static String idfilm;
    static JLabel judul3;
    public tenet(){
        //background color
        setOpaque(true);
        setBackground(new Color(17, 138, 178));
        setSize(900, 550);
        setLayout(null);

        ImageIcon poster3 = new ImageIcon(new ImageIcon("images/tenet.jpg").getImage().getScaledInstance(300, 410, Image.SCALE_DEFAULT));
        JLabel poster3label = new JLabel(poster3);
        poster3label.setIcon(poster3);
        poster3label.setBounds(60,40,300, 410);
        add(poster3label);

       judul3 = new JLabel("Tenet");
        judul3.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 27));
        judul3.setForeground(Color.white);
        judul3.setBounds(395,30,600, 70);
        add(judul3);

        JLabel director3 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Director</span><br>Christopher Nolan</html>");
        director3.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        director3.setForeground(Color.white);
        director3.setBounds(395,90,140, 60);
        add(director3);

        JLabel cast3 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Cast Member</span><br>John David Washington, Robert Pattinson, Elizabeth Debicki</html>");
        cast3.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        cast3.setForeground(Color.white);
        cast3.setBounds(395,145,500, 60);
        add(cast3);

        JLabel duration3 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Duration</span><br>150 mnt</html>");
        duration3.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        duration3.setForeground(Color.white);
        duration3.setBounds(395,200,500, 60);
        add(duration3);

        JLabel rating3= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Rating</span><br>PG-13</html>");
        rating3.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        rating3.setForeground(Color.white);
        rating3.setBounds(565,205,500, 60);
        add(rating3);

        JLabel genre3= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Genre</span><br>Action, Sci-Fi</html>");
        genre3.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        genre3.setForeground(Color.white);
        genre3.setBounds(395,260,500, 60);
        add(genre3);

        JLabel sinopsis3= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Sinopsis</span>" +
                "<br>In a twilight world of international espionage, an unnamed " +
                "<br>CIA operative, known as The Protagonist, is recruited by a " +
                "<br>mysterious organization called Tenet to participate in " +
                "<br>global assignment that unfolds beyond real time.</html>");
        sinopsis3.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 13));
        sinopsis3.setForeground(Color.white);
        sinopsis3.setBounds(395,300,500, 150);
        add(sinopsis3);

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
                Payment.film.setText(judul3.getText());
                idfilm="MID05";
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
