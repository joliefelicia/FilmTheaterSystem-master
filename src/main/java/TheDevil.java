import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TheDevil extends JPanel {
    JButton order = new JButton("Order Ticket");
    JButton back = new JButton("<- Back");
    static String idfilm;
    static JLabel judul6;
    public TheDevil(){
        //background color
        setOpaque(true);
        setBackground(new Color(235, 30, 58));
        setSize(900, 550);
        setLayout(null);

        ImageIcon poster6 = new ImageIcon(new ImageIcon("images/devil.jpg").getImage().getScaledInstance(300, 410, Image.SCALE_DEFAULT));
        JLabel poster6label = new JLabel(poster6);
        poster6label.setIcon(poster6);
        poster6label.setBounds(60,40,300, 410);
        add(poster6label);

       judul6 = new JLabel("The Devil All the Time");
        judul6.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 27));
        judul6.setForeground(Color.white);
        judul6.setBounds(395,30,600, 70);
        add(judul6);

        JLabel director6 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Director</span><br>Antonio Campos</html>");
        director6.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        director6.setForeground(Color.white);
        director6.setBounds(395,90,180, 60);
        add(director6);

        JLabel cast6 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Cast Member</span><br>Donald Ray Pollock, Bill Skarsgård, Tom Holland, Robert Pattinson</html>");
        cast6.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        cast6.setForeground(Color.white);
        cast6.setBounds(395,145,500, 60);
        add(cast6);

        JLabel duration6 = new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Duration</span><br>129 mnt</html>");
        duration6.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        duration6.setForeground(Color.white);
        duration6.setBounds(395,200,500, 60);
        add(duration6);

        JLabel rating6= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Rating</span><br>R</html>");
        rating6.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        rating6.setForeground(Color.white);
        rating6.setBounds(565,205,500, 60);
        add(rating6);

        JLabel genre6= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Genre</span><br>Crime, Drama, Thriller</html>");
        genre6.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        genre6.setForeground(Color.white);
        genre6.setBounds(395,260,500, 60);
        add(genre6);

        JLabel sinopsis6= new JLabel("<html><span style='font-size:12px','color=#3D3D3D'>Sinopsis</span>" +
                "<br>Sinister characters converge around a young man devoted " +
                "<br>to protecting those he loves in a postwar backwoods town " +
                "<br>teeming with corruption and brutality. The Devil All the  " +
                "<br>Time follows a cast of compelling and bizarre characters  " +
                "<br>from the end of World War II to the 1960s.</html>");
        sinopsis6.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 13));
        sinopsis6.setForeground(Color.white);
        sinopsis6.setBounds(395,310,500, 150);
        add(sinopsis6);

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
                Payment.film.setText(judul6.getText());
                idfilm="MID04";
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
