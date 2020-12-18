import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rebecca extends JPanel {
    JButton order = new JButton("Order Ticket");
    JButton back = new JButton("<- Back");
    static String idfilm;
    static JLabel judul4;
    public Rebecca(){
        //background color
        setOpaque(true);
        setBackground(new Color(17, 138, 178));
        setSize(900, 550);
        setLayout(null);

        ImageIcon poster4 = new ImageIcon(new ImageIcon("images/rebecca.jpg").getImage().getScaledInstance(300, 410, Image.SCALE_DEFAULT));
        JLabel poster4label = new JLabel(poster4);
        poster4label.setIcon(poster4);
        poster4label.setBounds(60,40,300, 410);
        add(poster4label);

          judul4 = new JLabel("Rebecca");
        judul4.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 27));
        judul4.setForeground(Color.white);
        judul4.setBounds(395,30,600, 70);
        add(judul4);

        JLabel director4 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Director</span><br>Ben Wheatley</html>");
        director4.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        director4.setForeground(Color.white);
        director4.setBounds(395,90,140, 60);
        add(director4);

        JLabel cast4 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Cast Member</span><br>Lily James, Armie Hammer, Kristin Scott Thomas</html>");
        cast4.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        cast4.setForeground(Color.white);
        cast4.setBounds(395,145,500, 60);
        add(cast4);

        JLabel duration4 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Duration</span><br>121 mnt</html>");
        duration4.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        duration4.setForeground(Color.white);
        duration4.setBounds(395,200,500, 60);
        add(duration4);

        JLabel rating4= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Rating</span><br>PG-13</html>");
        rating4.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        rating4.setForeground(Color.white);
        rating4.setBounds(565,205,500, 60);
        add(rating4);

        JLabel genre4= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Genre</span><br>Drama, Mystery, Romance, Thriller</html>");
        genre4.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        genre4.setForeground(Color.white);
        genre4.setBounds(395,260,500, 60);
        add(genre4);

        JLabel sinopsis4= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Sinopsis</span>" +
                "<br>A young newlywed arrives at her husbands imposing family " +
                "<br>estate on a windswept English coast and finds herself " +
                "<br>battling the shadow of his first wife, Rebecca, whose legacy " +
                "<br>lives on in the house long after her death.</html>");
        sinopsis4.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 13));
        sinopsis4.setForeground(Color.white);
        sinopsis4.setBounds(395,300,500, 150);
        add(sinopsis4);

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
                Payment.film.setText(judul4.getText());
                idfilm="MID02";
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
