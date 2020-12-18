import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Trolls extends JPanel {
    JButton order = new JButton("Order Ticket");
    JButton back = new JButton("<- Back");
    static String idfilm;
    JLabel judul7;
    public Trolls(){
        //background color
        setOpaque(true);
        setBackground(new Color(5, 199, 150));
        setSize(900, 550);
        setLayout(null);

        ImageIcon poster7 = new ImageIcon(new ImageIcon("images/ttw.jpg").getImage().getScaledInstance(300, 410, Image.SCALE_DEFAULT));
        JLabel poster7label = new JLabel(poster7);
        poster7label.setIcon(poster7);
        poster7label.setBounds(60,40,300, 410);
        add(poster7label);

         judul7 = new JLabel("Trolls World Tour");
        judul7.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 27));
        judul7.setForeground(Color.white);
        judul7.setBounds(395,30,290, 60);
        add(judul7);

        JLabel director7 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Director</span><br>Walt Dohrn, David P. Smith</html>");
        director7.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        director7.setForeground(Color.white);
        director7.setBounds(395,90,190, 60);
        add(director7);

        JLabel cast7 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Cast Member</span><br>Anna Kendrick, Justin Timberlake, Rachel Bloom</html>");
        cast7.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        cast7.setForeground(Color.white);
        cast7.setBounds(395,145,500, 60);
        add(cast7);

        JLabel duration7 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Duration</span><br>90 mnt</html>");
        duration7.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        duration7.setForeground(Color.white);
        duration7.setBounds(395,200,500, 60);
        add(duration7);

        JLabel rating7= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Rating</span><br>PG</html>");
        rating7.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        rating7.setForeground(Color.white);
        rating7.setBounds(565,205,500, 60);
        add(rating7);

        JLabel genre7= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Genre</span><br>Animation, Adventure, Family, Fantasy, Musical</html>");
        genre7.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        genre7.setForeground(Color.white);
        genre7.setBounds(395,260,500, 60);
        add(genre7);

        JLabel sinopsis7= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Sinopsis</span>" +
                "<br>When the Queen of the Hard Rock Trolls tries to take over " +
                "<br>all the Troll kingdoms, Queen Poppy and her friends try " +
                "<br>different ways to save all the Trolls.  Troll tribes scattered " +
                "<br>over six different lands devoted to six different kinds of " +
                "<br>music: Funk, Country, Techno, Classical, Pop and Rock.</html>");
        sinopsis7.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 13));
        sinopsis7.setForeground(Color.white);
        sinopsis7.setBounds(395,310,500, 150);
        add(sinopsis7);

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
                Payment.film.setText(judul7.getText());
                idfilm="MID08";
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
