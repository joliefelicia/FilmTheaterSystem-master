import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WonderWoman extends JPanel {
    JButton order = new JButton("Order Ticket");
    JButton back = new JButton("<- Back");
    static String idfilm;
    static JLabel judul2;

    public WonderWoman(){
        //background color
        setOpaque(true);
        setBackground(new Color(17, 138, 178));
        setSize(900, 550);
        setLayout(null);

        ImageIcon poster2 = new ImageIcon(new ImageIcon("images/ww.jpg").getImage().getScaledInstance(300, 410, Image.SCALE_DEFAULT));
        JLabel poster2label = new JLabel(poster2);
        poster2label.setIcon(poster2);
        poster2label.setBounds(60,40,300, 410);
        add(poster2label);

        judul2 = new JLabel("Wonder Woman 1984");
        judul2.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 27));
        judul2.setForeground(Color.white);
        judul2.setBounds(395,30,600, 70);
        add(judul2);

        JLabel director2 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Director</span><br>Patty Jenkins</html>");
        director2.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        director2.setForeground(Color.white);
        director2.setBounds(395,90,140, 60);
        add(director2);

        JLabel cast2 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Cast Member</span><br>Pedro Pascal, Connie Nielsen, Chris Pine, Gal Gadot</html>");
        cast2.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        cast2.setForeground(Color.white);
        cast2.setBounds(395,145,500, 60);
        add(cast2);

        JLabel duration2 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Duration</span><br>151 mnt</html>");
        duration2.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        duration2.setForeground(Color.white);
        duration2.setBounds(395,200,500, 60);
        add(duration2);

        JLabel rating2= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Rating</span><br>PG-13</html>");
        rating2.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        rating2.setForeground(Color.white);
        rating2.setBounds(565,205,500, 60);
        add(rating2);

        JLabel genre2= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Genre</span><br>Action, Adventure, Fantasy</html>");
        genre2.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        genre2.setForeground(Color.white);
        genre2.setBounds(395,260,500, 60);
        add(genre2);

        JLabel sinopsis2= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Sinopsis</span>" +
                "<br>In 1984, during the Cold War, Diana Prince comes into conflict with" +
                "<br>two formidable foes—media businessman Maxwell Lord" +
                "<br>and friend-turned-enemy Barbara Ann Minerva while reuniting with " +
                "<br> her love interest Steve Trevor.</html>");
        sinopsis2.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 13));
        sinopsis2.setForeground(Color.white);
        sinopsis2.setBounds(395,300,500, 150);
        add(sinopsis2);

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
                Payment.film.setText(judul2.getText());
                idfilm="MID06";
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
