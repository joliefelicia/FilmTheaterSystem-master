import javax.swing.*;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Menu extends JPanel {
    JPanel slideshow = new JPanel();
    JPanel film = new JPanel();
    JPanel film2 = new JPanel();
    JButton next,prev;
    private String idfilm, judulfilm;
    public Menu(){
        //background color
        setOpaque(true);
        setBackground(new Color(53, 80, 112));
        setSize(900, 550);
        setLayout(null);

        //slide show pic
        slideshow.setSize(890, 100);
        slideshow.setOpaque(true);
        slideshow.setBackground(Color.white);

        ImageIcon picture = new ImageIcon(new ImageIcon("images/header1.jpg").getImage().getScaledInstance(890, 100, Image.SCALE_DEFAULT));
        JLabel pic = new JLabel(picture);
        pic.setIcon(picture);
        slideshow.add(pic);
        pic.setBounds(0,0,890, 100);

        //slide timer
        final int[] num = {1};
        Timer time = new Timer(3000, e -> {
            // TODO Auto-generated method stub
            if(num[0] == 1)
            {
                pic.setIcon(new ImageIcon(new ImageIcon("images/header3.jpg").getImage().getScaledInstance(890, 100, Image.SCALE_DEFAULT)));
                num[0]++ ;
            }
            else if(num[0] == 2)
            {
                pic.setIcon(new ImageIcon(new ImageIcon("images/header2.jpg").getImage().getScaledInstance(890, 100, Image.SCALE_DEFAULT)));
                num[0]++ ;

            }
            else if(num[0] == 3)
            {
                pic.setIcon(new ImageIcon(new ImageIcon("images/header4.png").getImage().getScaledInstance(890, 100, Image.SCALE_DEFAULT)));
                num[0]++ ;

            }
            else if(num[0] == 4)
            {
                pic.setIcon(new ImageIcon(new ImageIcon("images/header1.jpg").getImage().getScaledInstance(890, 100, Image.SCALE_DEFAULT)));
                num[0]++ ;

            }
        });
        time.start();
        add(slideshow);

        //film poster panel
        film.setSize(890,510);
        film.setOpaque(true);
        film.setBackground(new Color(53, 80, 112));
        film.setLayout(null);

        //poster film onward
        ImageIcon poster1 = new ImageIcon(new ImageIcon("images/onward.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));
        JLabel poster1label = new JLabel(poster1);
        poster1label.setIcon(poster1);
        poster1label.setBounds(30,130,200, 300);
        film.add(poster1label);

        //judul poster onward
        JLabel judulfilm1 = new JLabel("Onward");
        judulfilm1.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
        judulfilm1.setForeground(Color.white);
        judulfilm1.setBounds(100,430,100, 50);
        film.add(judulfilm1);

        //poster film wonder woman
        ImageIcon poster2 = new ImageIcon(new ImageIcon("images/ww.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));
        JLabel poster2label = new JLabel(poster2);
        poster2label.setIcon(poster2);
        poster2label.setBounds(240,130,200, 300);
        film.add(poster2label);

        //judul poster wonder woman
        JLabel judulfilm2 = new JLabel("<html>Wonder Woman<br>1984</html>",SwingConstants.CENTER);
        judulfilm2.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        judulfilm2.setForeground(Color.white);
        judulfilm2.setBounds(280,440,110, 50);
        film.add(judulfilm2);

        //poster film tenet
        ImageIcon poster3 = new ImageIcon(new ImageIcon("images/tenet.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));
        JLabel poster3label = new JLabel(poster3);
        poster3label.setIcon(poster3);
        poster3label.setBounds(450,130,200, 300);
        film.add(poster3label);

        //judul poster tenet
        JLabel judulfilm3 = new JLabel("Tenet");
        judulfilm3.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
        judulfilm3.setForeground(Color.white);
        judulfilm3.setBounds(525,430,100, 50);
        film.add(judulfilm3);

        //poster film rebecca
        ImageIcon poster4 = new ImageIcon(new ImageIcon("images/rebecca.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));
        JLabel poster4label = new JLabel(poster4);
        poster4label.setIcon(poster4);
        poster4label.setBounds(660,130,200, 300);
        film.add(poster4label);

        //judul poster rebecca
        JLabel judulfilm4= new JLabel("Rebecca");
        judulfilm4.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
        judulfilm4.setForeground(Color.white);
        judulfilm4.setBounds(730,430,100, 50);
        film.add(judulfilm4);

        //button next
        next = new JButton("Next ->");
        next.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 11));
        next.setForeground(Color.white);
        next.setBackground(new Color(229, 107, 111));
        next.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(246, 84, 100), 1),
                BorderFactory.createEmptyBorder(0, 5, 0, 7)));
        next.setBounds(810,475,74, 37);
        film.add(next);

        add(film);

        //film poster panel
        film2.setSize(890,510);
        film2.setOpaque(true);
        film2.setBackground(new Color(53, 80, 112));
        film2.setLayout(null);

        //poster film Resistance
        ImageIcon poster5 = new ImageIcon(new ImageIcon("images/Resistance.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));
        JLabel poster5label = new JLabel(poster5);
        poster5label.setIcon(poster5);
        poster5label.setBounds(25,130,200, 300);
        film2.add(poster5label);

        //judul poster Resistance
        JLabel judulfilm5 = new JLabel("Resistance");
        judulfilm5.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
        judulfilm5.setForeground(Color.white);
        judulfilm5.setBounds(80,430,100, 50);
        film2.add(judulfilm5);

        //poster film The Devil
        ImageIcon poster6 = new ImageIcon(new ImageIcon("images/devil.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));
        JLabel poster6label = new JLabel(poster6);
        poster6label.setIcon(poster6);
        poster6label.setBounds(237,130,200, 300);
        film2.add(poster6label);

        //judul poster The Devil
        JLabel judulfilm6 = new JLabel("<html>The Devil<br>All the Time</html>",SwingConstants.CENTER);
        judulfilm6.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        judulfilm6.setForeground(Color.white);
        judulfilm6.setBounds(277,440,110, 50);
        film2.add(judulfilm6);

        //poster film Trolls World Tour
        ImageIcon poster7 = new ImageIcon(new ImageIcon("images/ttw.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));
        JLabel poster7label = new JLabel(poster7);
        poster7label.setIcon(poster7);
        poster7label.setBounds(447,130,200, 300);
        film2.add(poster7label);

        //judul poster Trolls World Tour
        JLabel judulfilm7 = new JLabel("Trolls World Tour");
        judulfilm7.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        judulfilm7.setForeground(Color.white);
        judulfilm7.setBounds(490,430,130, 50);
        film2.add(judulfilm7);

        //poster film Love and Monsters
        ImageIcon poster8 = new ImageIcon(new ImageIcon("images/lam.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));
        JLabel poster8label = new JLabel(poster8);
        poster8label.setIcon(poster8);
        poster8label.setBounds(660,130,200, 300);
        film2.add(poster8label);

        //judul poster Love and Monsters
        JLabel judulfilm8= new JLabel("Love and Monsters");
        judulfilm8.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
        judulfilm8.setForeground(Color.white);
        judulfilm8.setBounds(698,430,140, 50);
        film2.add(judulfilm8);

        //button Previous
        prev = new JButton("<- Prev");
        prev.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 11));
        prev.setForeground(Color.white);
        prev.setBackground(new Color(229, 107, 111));
        prev.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(246, 84, 100), 1),
                BorderFactory.createEmptyBorder(0, 5, 0, 7)));
        prev.setBounds(0,475,77, 37);
        film2.add(prev);

        add(film2);

        //object panel
        Onward onwardclass = new Onward();
        add(onwardclass);
        WonderWoman wwomanclass = new WonderWoman();
        add(wwomanclass);
        tenet tenetclass = new tenet();
        add(tenetclass);
        Rebecca rebeccaclass = new Rebecca();
        add(rebeccaclass);
        Resistance resistanceclass = new Resistance();
        add(resistanceclass);
        TheDevil devilclass = new TheDevil();
        add(devilclass);
        Trolls trollsclass = new Trolls();
        add(trollsclass);
        LoveAM loveamclass = new LoveAM();
        add(loveamclass);
        Order orderclass = new Order();
        add(orderclass);

        onwardclass.setVisible(false);
        wwomanclass.setVisible(false);
        tenetclass.setVisible(false);
        rebeccaclass.setVisible(false);
        resistanceclass.setVisible(false);
        devilclass.setVisible(false);
        trollsclass.setVisible(false);
        loveamclass.setVisible(false);
        film2.setVisible(false);
        orderclass.setVisible(false);

        Payment paymentclass = new Payment();
        add(paymentclass);
        paymentclass.setVisible(false);

        //actionlistener button next
        next.addActionListener(e -> {
            film.setVisible(false);
            film2.setVisible(true);
        });
        //actionlistener button previous
        prev.addActionListener(e -> {
            film2.setVisible(false);
            film.setVisible(true);
        });
        orderclass.nett.addActionListener(e -> {
            orderclass.setVisible(false);
            paymentclass.setVisible(true);
            slideshow.setVisible(false);
            film.setVisible(false);
            film2.setVisible(false);
            onwardclass.setVisible(false);
            wwomanclass.setVisible(false);
            tenetclass.setVisible(false);
            rebeccaclass.setVisible(false);
            resistanceclass.setVisible(false);
            devilclass.setVisible(false);
            trollsclass.setVisible(false);
            loveamclass.setVisible(false);
        });

        //onward mouselistener
        poster1label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                slideshow.setVisible(false);
                film.setVisible(false);
                film2.setVisible(false);
                onwardclass.setVisible(true);
                wwomanclass.setVisible(false);
                tenetclass.setVisible(false);
                rebeccaclass.setVisible(false);
                resistanceclass.setVisible(false);
                devilclass.setVisible(false);
                trollsclass.setVisible(false);
                loveamclass.setVisible(false);
            }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        onwardclass.back.addActionListener(e -> {
            slideshow.setVisible(true);
            film.setVisible(true);
            film2.setVisible(false);
            onwardclass.setVisible(false);
            wwomanclass.setVisible(false);
            tenetclass.setVisible(false);
            rebeccaclass.setVisible(false);
            resistanceclass.setVisible(false);
            devilclass.setVisible(false);
            trollsclass.setVisible(false);
            loveamclass.setVisible(false);
        });

        onwardclass.order.addActionListener(e -> {
            slideshow.setVisible(false);
            film.setVisible(false);
            film2.setVisible(false);
            onwardclass.setVisible(false);
            wwomanclass.setVisible(false);
            tenetclass.setVisible(false);
            rebeccaclass.setVisible(false);
            resistanceclass.setVisible(false);
            devilclass.setVisible(false);
            trollsclass.setVisible(false);
            loveamclass.setVisible(false);
            orderclass.setVisible(true);
            idfilm = "MID01";
            judulfilm = "Onward";
        });

        //wonderwoman mouselistener
        poster2label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                slideshow.setVisible(false);
                film.setVisible(false);
                film2.setVisible(false);
                onwardclass.setVisible(false);
                wwomanclass.setVisible(true);
                tenetclass.setVisible(false);
                rebeccaclass.setVisible(false);
                resistanceclass.setVisible(false);
                devilclass.setVisible(false);
                trollsclass.setVisible(false);
                loveamclass.setVisible(false);
            }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        wwomanclass.back.addActionListener(e -> {
            slideshow.setVisible(true);
            film.setVisible(true);
            film2.setVisible(false);
            onwardclass.setVisible(false);
            wwomanclass.setVisible(false);
            tenetclass.setVisible(false);
            rebeccaclass.setVisible(false);
            resistanceclass.setVisible(false);
            devilclass.setVisible(false);
            trollsclass.setVisible(false);
            loveamclass.setVisible(false);
        });

        wwomanclass.order.addActionListener(e -> {
            slideshow.setVisible(false);
            film.setVisible(false);
            film2.setVisible(false);
            onwardclass.setVisible(false);
            wwomanclass.setVisible(false);
            tenetclass.setVisible(false);
            rebeccaclass.setVisible(false);
            resistanceclass.setVisible(false);
            devilclass.setVisible(false);
            trollsclass.setVisible(false);
            loveamclass.setVisible(false);
            orderclass.setVisible(true);
            idfilm = "MID06";
            judulfilm = "Wonder Woman 1984";
        });

        //tenet mouselistener
        poster3label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                slideshow.setVisible(false);
                film.setVisible(false);
                film2.setVisible(false);
                onwardclass.setVisible(false);
                wwomanclass.setVisible(false);
                tenetclass.setVisible(true);
                rebeccaclass.setVisible(false);
                resistanceclass.setVisible(false);
                devilclass.setVisible(false);
                trollsclass.setVisible(false);
                loveamclass.setVisible(false);
            }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        tenetclass.back.addActionListener(e -> {
            slideshow.setVisible(true);
            film.setVisible(true);
            film2.setVisible(false);
            onwardclass.setVisible(false);
            wwomanclass.setVisible(false);
            tenetclass.setVisible(false);
            rebeccaclass.setVisible(false);
            resistanceclass.setVisible(false);
            devilclass.setVisible(false);
            trollsclass.setVisible(false);
            loveamclass.setVisible(false);
        });

        tenetclass.order.addActionListener(e -> {
            slideshow.setVisible(false);
            film.setVisible(false);
            film2.setVisible(false);
            onwardclass.setVisible(false);
            wwomanclass.setVisible(false);
            tenetclass.setVisible(false);
            rebeccaclass.setVisible(false);
            resistanceclass.setVisible(false);
            devilclass.setVisible(false);
            trollsclass.setVisible(false);
            loveamclass.setVisible(false);
            orderclass.setVisible(true);
            idfilm = "MID05";
            judulfilm = "Tenet";
        });

        //Rebecca mouselistener
        poster4label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                slideshow.setVisible(false);
                film.setVisible(false);
                film2.setVisible(false);
                onwardclass.setVisible(false);
                wwomanclass.setVisible(false);
                tenetclass.setVisible(false);
                rebeccaclass.setVisible(true);
                resistanceclass.setVisible(false);
                devilclass.setVisible(false);
                trollsclass.setVisible(false);
                loveamclass.setVisible(false);
            }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        rebeccaclass.back.addActionListener(e -> {
            slideshow.setVisible(true);
            film.setVisible(true);
            film2.setVisible(false);
            onwardclass.setVisible(false);
            wwomanclass.setVisible(false);
            tenetclass.setVisible(false);
            rebeccaclass.setVisible(false);
            resistanceclass.setVisible(false);
            devilclass.setVisible(false);
            trollsclass.setVisible(false);
            loveamclass.setVisible(false);
        });

        rebeccaclass.order.addActionListener(e -> {
            slideshow.setVisible(false);
            film.setVisible(false);
            film2.setVisible(false);
            onwardclass.setVisible(false);
            wwomanclass.setVisible(false);
            tenetclass.setVisible(false);
            rebeccaclass.setVisible(false);
            resistanceclass.setVisible(false);
            devilclass.setVisible(false);
            trollsclass.setVisible(false);
            loveamclass.setVisible(false);
            orderclass.setVisible(true);
            idfilm = "MID02";
            judulfilm = "Rebecca";
        });

        //Resistance mouselistener
        poster5label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                slideshow.setVisible(false);
                film.setVisible(false);
                film2.setVisible(false);
                onwardclass.setVisible(false);
                wwomanclass.setVisible(false);
                tenetclass.setVisible(false);
                rebeccaclass.setVisible(false);
                resistanceclass.setVisible(true);
                devilclass.setVisible(false);
                trollsclass.setVisible(false);
                loveamclass.setVisible(false);
            }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        resistanceclass.back.addActionListener(e -> {
            slideshow.setVisible(true);
            film.setVisible(false);
            film2.setVisible(true);
            onwardclass.setVisible(false);
            wwomanclass.setVisible(false);
            tenetclass.setVisible(false);
            rebeccaclass.setVisible(false);
            resistanceclass.setVisible(false);
            devilclass.setVisible(false);
            trollsclass.setVisible(false);
            loveamclass.setVisible(false);
        });

        resistanceclass.order.addActionListener(e -> {
            slideshow.setVisible(false);
            film.setVisible(false);
            film2.setVisible(false);
            onwardclass.setVisible(false);
            wwomanclass.setVisible(false);
            tenetclass.setVisible(false);
            rebeccaclass.setVisible(false);
            resistanceclass.setVisible(false);
            devilclass.setVisible(false);
            trollsclass.setVisible(false);
            loveamclass.setVisible(false);
            orderclass.setVisible(true);
            idfilm = "MID07";
            judulfilm = "Resistance";
        });

        //The Devil All The Time mouselistener
        poster6label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                slideshow.setVisible(false);
                film.setVisible(false);
                film2.setVisible(false);
                onwardclass.setVisible(false);
                wwomanclass.setVisible(false);
                tenetclass.setVisible(false);
                rebeccaclass.setVisible(false);
                resistanceclass.setVisible(false);
                devilclass.setVisible(true);
                trollsclass.setVisible(false);
                loveamclass.setVisible(false);
            }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        devilclass.back.addActionListener(e -> {
            slideshow.setVisible(true);
            film.setVisible(false);
            film2.setVisible(true);
            onwardclass.setVisible(false);
            wwomanclass.setVisible(false);
            tenetclass.setVisible(false);
            rebeccaclass.setVisible(false);
            resistanceclass.setVisible(false);
            devilclass.setVisible(false);
            trollsclass.setVisible(false);
            loveamclass.setVisible(false);
        });

        devilclass.order.addActionListener(e -> {
            slideshow.setVisible(false);
            film.setVisible(false);
            film2.setVisible(false);
            onwardclass.setVisible(false);
            wwomanclass.setVisible(false);
            tenetclass.setVisible(false);
            rebeccaclass.setVisible(false);
            resistanceclass.setVisible(false);
            devilclass.setVisible(false);
            trollsclass.setVisible(false);
            loveamclass.setVisible(false);
            orderclass.setVisible(true);
            idfilm = "MID04";
            judulfilm = "The Devil All The Time";
        });

        //trolls world tour mouselistener
        poster7label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                slideshow.setVisible(false);
                film.setVisible(false);
                film2.setVisible(false);
                onwardclass.setVisible(false);
                wwomanclass.setVisible(false);
                tenetclass.setVisible(false);
                rebeccaclass.setVisible(false);
                resistanceclass.setVisible(false);
                devilclass.setVisible(false);
                trollsclass.setVisible(true);
                loveamclass.setVisible(false);
            }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });
        trollsclass.back.addActionListener(e -> {
            slideshow.setVisible(true);
            film.setVisible(false);
            film2.setVisible(true);
            onwardclass.setVisible(false);
            wwomanclass.setVisible(false);
            tenetclass.setVisible(false);
            rebeccaclass.setVisible(false);
            resistanceclass.setVisible(false);
            devilclass.setVisible(false);
            trollsclass.setVisible(false);
            loveamclass.setVisible(false);
        });

        trollsclass.order.addActionListener(e -> {
            slideshow.setVisible(false);
            film.setVisible(false);
            film2.setVisible(false);
            onwardclass.setVisible(false);
            wwomanclass.setVisible(false);
            tenetclass.setVisible(false);
            rebeccaclass.setVisible(false);
            resistanceclass.setVisible(false);
            devilclass.setVisible(false);
            trollsclass.setVisible(false);
            loveamclass.setVisible(false);
            orderclass.setVisible(true);
            idfilm = "MID08";
            judulfilm = "Trolls World Tour";
        });

        //Love and monsters mouselistener
        poster8label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                slideshow.setVisible(false);
                film.setVisible(false);
                film2.setVisible(false);
                onwardclass.setVisible(false);
                wwomanclass.setVisible(false);
                tenetclass.setVisible(false);
                rebeccaclass.setVisible(false);
                resistanceclass.setVisible(false);
                devilclass.setVisible(false);
                trollsclass.setVisible(false);
                loveamclass.setVisible(true);
            }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        loveamclass.back.addActionListener(e -> {
            slideshow.setVisible(true);
            film.setVisible(false);
            film2.setVisible(true);
            onwardclass.setVisible(false);
            wwomanclass.setVisible(false);
            tenetclass.setVisible(false);
            rebeccaclass.setVisible(false);
            resistanceclass.setVisible(false);
            devilclass.setVisible(false);
            trollsclass.setVisible(false);
            loveamclass.setVisible(false);
        });

        loveamclass.order.addActionListener(e -> {
            slideshow.setVisible(false);
            film.setVisible(false);
            film2.setVisible(false);
            onwardclass.setVisible(false);
            wwomanclass.setVisible(false);
            tenetclass.setVisible(false);
            rebeccaclass.setVisible(false);
            resistanceclass.setVisible(false);
            devilclass.setVisible(false);
            trollsclass.setVisible(false);
            loveamclass.setVisible(false);
            orderclass.setVisible(true);
            idfilm ="MID03";
            judulfilm = "Love and Monsters";
        });

        setVisible(true);
    }
}
