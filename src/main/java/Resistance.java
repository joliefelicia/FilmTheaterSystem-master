import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Resistance extends JPanel {
    JButton order = new JButton("Order Ticket");
    JButton back = new JButton("<- Back");
    static String idfilm;
    static JLabel judul5;
    public Resistance(){
        //background color
        setOpaque(true);
        setBackground(new Color(235, 30, 58));
        setSize(900, 550);
        setLayout(null);

        ImageIcon poster5 = new ImageIcon(new ImageIcon("images/Resistance.jpg").getImage().getScaledInstance(300, 410, Image.SCALE_DEFAULT));
        JLabel poster5label = new JLabel(poster5);
        poster5label.setIcon(poster5);
        poster5label.setBounds(60,40,300, 410);
        add(poster5label);

        judul5 = new JLabel("Resistance");
        judul5.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 27));
        judul5.setForeground(Color.white);
        judul5.setBounds(395,30,600, 70);
        add(judul5);

        JLabel director5 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Director</span><br>Jonathan Jakubowicz</html>");
        director5.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        director5.setForeground(Color.white);
        director5.setBounds(395,90,180, 60);
        add(director5);

        JLabel cast5 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Cast Member</span><br>Jesse Eisenberg, Clémence Poésy, Matthias Schweighöfer</html>");
        cast5.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        cast5.setForeground(Color.white);
        cast5.setBounds(395,145,500, 60);
        add(cast5);

        JLabel duration5 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Duration</span><br>120 mnt</html>");
        duration5.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        duration5.setForeground(Color.white);
        duration5.setBounds(395,200,500, 60);
        add(duration5);

        JLabel rating5= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Rating</span><br>R</html>");
        rating5.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        rating5.setForeground(Color.white);
        rating5.setBounds(565,205,500, 60);
        add(rating5);

        JLabel genre5= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Genre</span><br>Biography, Drama, History, War</html>");
        genre5.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        genre5.setForeground(Color.white);
        genre5.setBounds(395,260,500, 60);
        add(genre5);

        JLabel sinopsis5= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Sinopsis</span>" +
                "<br>The story of mime Marcel Marceau as he works with a  " +
                "<br>group of Jewish boy scouts and the French Resistance to  " +
                "<br>save the lives of ten thousand orphans during World War II.</html>");
        sinopsis5.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 13));
        sinopsis5.setForeground(Color.white);
        sinopsis5.setBounds(395,300,500, 150);
        add(sinopsis5);

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
                Payment.film.setText(judul5.getText());
                idfilm="MID07";
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
