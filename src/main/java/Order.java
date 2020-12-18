import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Vector;


public class Order extends JPanel {
    /* Declare */
    JPanel headerPanel, bodyPanel, footerPanel, blokPanel,
            leftTopPanel, centerTopPanel, rightTopPanel,
            leftMiddlePanel, centerMiddlePanel, rightMiddlePanel,
            leftBottomPanel, centerBottomPanel, rightBottomPanel;
    static JButton nett = new JButton("Order");
    JLabel screenLabel;
    static int harga,jumlahtiket;
    static String jamdipilih;
    static String haripilih,tanggal;
    static String idbook;

    JPanel panelDateTime = new JPanel();
    JPanel panelDateTime2 = new JPanel();
    JPanel pricepanel = new JPanel();
    JPanel panelChair = new JPanel();
    JTabbedPane TabbedPane = new JTabbedPane();

    static JRadioButton jam11, jam1, jam3, jam5;
    ButtonGroup group = new ButtonGroup();
   static  JComboBox<String> hari;
    static JSpinner jumlah;

    Vector<Chair> chairs = new Vector<>();

    public void initChair() {
        try {
            Database db = new Database();
            System.out.println("Database is connected: " + db.isConnected());
            chairs = db.selectChair();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public Order(){

        GregorianCalendar date = new GregorianCalendar();
        int haritanggal = date.get(Calendar.DAY_OF_MONTH);
        int bulan = date.get(Calendar.MONTH);
        int tahun = date.get(Calendar.YEAR);
        tanggal=haritanggal+" "+bulan+" "+tahun;

        /*nett.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 11));
        nett.setForeground(Color.white);
        nett.setBackground(new Color(229, 107, 111));
        nett.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(246, 84, 100), 1),
                BorderFactory.createEmptyBorder(0, 5, 0, 7)));
        nett.setBounds(710,375,74, 37);
        add(nett);*/

        initChair();

        /* START Initialize Objects */
        setLayout(new BorderLayout());
        headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bodyPanel = new JPanel(new GridLayout(0, 1));
        blokPanel = new JPanel(new GridLayout(3, 3));
        screenLabel = new JLabel("SCREEN");
        leftTopPanel = new JPanel(new GridLayout(3, 4));
        centerTopPanel = new JPanel(new GridLayout(3, 5));
        rightTopPanel = new JPanel(new GridLayout(3, 4));
        leftMiddlePanel = new JPanel(new GridLayout(3, 4));
        centerMiddlePanel = new JPanel(new GridLayout(3, 5));
        rightMiddlePanel = new JPanel(new GridLayout(3, 4));
        leftBottomPanel = new JPanel(new GridLayout(3, 4));
        centerBottomPanel = new JPanel(new GridLayout(3, 5));
        rightBottomPanel = new JPanel(new GridLayout(3, 4));
        footerPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));


        /* End */

        /* Customize Objects */
        leftTopPanel.setBorder(new EmptyBorder(45, 30, 15, 10));
        centerTopPanel.setBorder(new EmptyBorder(45, 15, 15, 15));
        rightTopPanel.setBorder(new EmptyBorder(45, 10, 15, 30));
        leftMiddlePanel.setBorder(new EmptyBorder(20, 30, 25, 10));
        centerMiddlePanel.setBorder(new EmptyBorder(20, 15, 25, 15));
        rightMiddlePanel.setBorder(new EmptyBorder(20, 15, 25, 30));
        leftBottomPanel.setBorder(new EmptyBorder(15, 30, 40, 15));
        centerBottomPanel.setBorder(new EmptyBorder(15, 15, 40, 15));
        rightBottomPanel.setBorder(new EmptyBorder(15, 15, 40, 30));
        headerPanel.setBackground(Color.darkGray);
        screenLabel.setForeground(Color.white);
        /* End */


        headerPanel.add(screenLabel);

        for (Chair bangku : chairs) {
            String code = bangku.getNoChair();
            String huruf = code.substring(0, 1);
            String angka = code.substring(1, code.length());
            /*End*/

            if ((huruf.equalsIgnoreCase("A") ||
                    huruf.equalsIgnoreCase("B") ||
                    huruf.equalsIgnoreCase("C"))) {
                if (Integer.parseInt(angka) >= 1 && Integer.parseInt(angka) <= 4) leftTopPanel.add(bangku);
                if (Integer.parseInt(angka) >= 5 && Integer.parseInt(angka) <= 9) centerTopPanel.add(bangku);
                if (Integer.parseInt(angka) >= 10 && Integer.parseInt(angka) <= 13) rightTopPanel.add(bangku);
            } else if ((huruf.equalsIgnoreCase("D") ||
                    huruf.equalsIgnoreCase("E") ||
                    huruf.equalsIgnoreCase("F"))) {
                if (Integer.parseInt(angka) >= 1 && Integer.parseInt(angka) <= 4) leftMiddlePanel.add(bangku);
                if (Integer.parseInt(angka) >= 5 && Integer.parseInt(angka) <= 9) centerMiddlePanel.add(bangku);
                if (Integer.parseInt(angka) >= 10 && Integer.parseInt(angka) <= 13) rightMiddlePanel.add(bangku);
            } else if ((huruf.equalsIgnoreCase("G") ||
                    huruf.equalsIgnoreCase("H") ||
                    huruf.equalsIgnoreCase("I"))) {
                if (Integer.parseInt(angka) >= 1 && Integer.parseInt(angka) <= 4) leftBottomPanel.add(bangku);
                if (Integer.parseInt(angka) >= 5 && Integer.parseInt(angka) <= 9) centerBottomPanel.add(bangku);
                if (Integer.parseInt(angka) >= 10 && Integer.parseInt(angka) <= 13) rightBottomPanel.add(bangku);
            }

        }
        blokPanel.add(leftTopPanel);
        blokPanel.add(centerTopPanel);
        blokPanel.add(rightTopPanel);
        blokPanel.add(leftMiddlePanel);
        blokPanel.add(centerMiddlePanel);
        blokPanel.add(rightMiddlePanel);
        blokPanel.add(leftBottomPanel);
        blokPanel.add(centerBottomPanel);
        blokPanel.add(rightBottomPanel);
        blokPanel.setBackground(new Color(53, 80, 112));
        bodyPanel.add(blokPanel);
        footerPanel.add(nett);

        footerPanel.setBackground(new Color(229, 107, 111));
        nett.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 11));
        nett.setForeground(Color.white);
        nett.setBackground(new Color(229, 107, 111));
        nett.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(246, 84, 100), 1),
                BorderFactory.createEmptyBorder(5, 5, 5, 7)));
        nett.setBounds(710,455,80, 40);
        nett.addActionListener(new klik ());


        panelChair.add(headerPanel);
        panelChair.add(bodyPanel);
        panelChair.add(footerPanel);
        /* END */

        //panel time and date
        panelDateTime.setBackground(new Color(53, 80, 112));
        panelDateTime.setOpaque(true);
        panelDateTime.setSize(900, 550);
        panelDateTime.setLayout(null);

        panelDateTime2.setBackground(new Color(234, 134, 137));
        panelDateTime2.setOpaque(true);
        panelDateTime2.setBounds(0,80,890, 340);
        panelDateTime2.setLayout(null);
        panelDateTime.add(panelDateTime2);

        //Logo Images
        ImageIcon logo  = new ImageIcon(new ImageIcon("images/logo2.png").getImage().getScaledInstance(220, 60, Image.SCALE_DEFAULT));
        JLabel logolabel = new JLabel(logo);
        logolabel.setIcon(logo);
        panelDateTime.add(logolabel);
         logolabel.setBounds(7,9,220, 60);

        //paneldatetime component
        JLabel head= new JLabel("ORDER TICKET");
        head.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 28));
        head.setForeground(Color.white);
        head.setBounds(355,20,500,50);
        panelDateTime.add(head);

        JLabel daylabel = new JLabel("Pick Day ");
        daylabel.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 22));
        daylabel.setForeground(Color.white);
        daylabel.setBounds(80,20,500,50);
        panelDateTime2.add(daylabel);
        //combobox
        hari = new JComboBox<String>();
        hari.addItem("Sunday");
        hari.addItem("Monday");
        hari.addItem("Tuesday");
        hari.addItem("Wednesday");
        hari.addItem("Thursday");
        hari.addItem("Friday");
        hari.addItem("Saturday");
        hari.setBackground(Color.white);
        hari.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
        hari.setForeground(new Color(53, 80, 112));
        hari.setBounds(80,70,130,38);
        panelDateTime2.add(hari);

        JLabel timelabel = new JLabel("Pick Show Time ");
        timelabel.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 22));
        timelabel.setForeground(Color.white);
        timelabel.setBounds(80,130,500,50);
        panelDateTime2.add(timelabel);

        jam11 = new JRadioButton("11.00");
        jam11.setBackground(new Color(234, 134, 137));
        jam11.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
        jam11.setForeground(Color.white);
        jam11.setBounds(80,170,80,50);
        group.add(jam11);
        panelDateTime2.add(jam11);

        jam1 = new JRadioButton("13.00");
        jam1.setBackground(new Color(234, 134, 137));
        jam1.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
        jam1.setForeground(Color.white);
        jam1.setBounds(190,170,80,50);
        group.add(jam1);
        panelDateTime2.add(jam1);

        jam3 = new JRadioButton("15.00");
        jam3.setBackground(new Color(234, 134, 137));
        jam3.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
        jam3.setForeground(Color.white);
        jam3.setBounds(300,170,80,50);
        group.add(jam3);
        panelDateTime2.add(jam3);

        jam5 = new JRadioButton("17.00");
        jam5.setBackground(new Color(234, 134, 137));
        jam5.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
        jam5.setForeground(Color.white);
        jam5.setBounds(410,170,80,50);
        group.add(jam5);
        panelDateTime2.add(jam5);

        JLabel jmllabel = new JLabel("How many tickets ? ");
        jmllabel.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 22));
        jmllabel.setForeground(Color.white);
        jmllabel.setBounds(80,225,500,50);
        panelDateTime2.add(jmllabel);

        jumlah = new JSpinner();
        jumlah.setBackground(Color.white);
        jumlah.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 15));
        jumlah.setForeground(new Color(53, 80, 112));
        jumlah.setBounds(80,280,70,38);
        panelDateTime2.add(jumlah);

        //price panel
        pricepanel.setBackground(Color.white);
        pricepanel.setOpaque(true);
        pricepanel.setBounds(510,20,345, 300);
        pricepanel.setLayout(null);
        panelDateTime2.add(pricepanel);

        JLabel judulprice = new JLabel("Ticket Price List");
        judulprice.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 20));
        judulprice.setForeground(new Color(53, 80, 112));
        judulprice.setBounds(90,18,500,50);
        pricepanel.add(judulprice);

        JLabel pricemo = new JLabel("Monday          : Rp 35.000");
        pricemo.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
        pricemo.setForeground(new Color(109, 89, 122));
        pricemo.setBounds(40,60,500,50);
        pricepanel.add(pricemo);

        JLabel pricetu = new JLabel("Tuesday          : Rp 35.000");
        pricetu.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
        pricetu.setForeground(new Color(109, 89, 122));
        pricetu.setBounds(40,90,500,50);
        pricepanel.add(pricetu);

        JLabel pricewe = new JLabel("Wednesday     : Rp 35.000");
        pricewe.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
        pricewe.setForeground(new Color(109, 89, 122));
        pricewe.setBounds(40,120,500,50);
        pricepanel.add(pricewe);

        JLabel pricetr = new JLabel("Thursday        : Rp 35.000");
        pricetr.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
        pricetr.setForeground(new Color(109, 89, 122));
        pricetr.setBounds(40,150,500,50);
        pricepanel.add(pricetr);

        JLabel pricefi = new JLabel("Friday             : Rp 40.000");
        pricefi.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
        pricefi.setForeground(new Color(109, 89, 122));
        pricefi.setBounds(40,180,500,50);
        pricepanel.add(pricefi);

        JLabel pricesa = new JLabel("Saturday         : Rp 45.000");
        pricesa.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
        pricesa.setForeground(new Color(109, 89, 122));
        pricesa.setBounds(40,210,500,50);
        pricepanel.add(pricesa);

        JLabel pricesu = new JLabel("Sunday           : Rp 45.000");
        pricesu.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
        pricesu.setForeground(new Color(109, 89, 122));
        pricesu.setBounds(40,240,500,50);
        pricepanel.add(pricesu);


        /* START Setting Panel */
        setSize(900, 550);
        //background color
        setOpaque(true);
        panelChair.setBackground(new Color(53, 80, 112));


        add(TabbedPane);
        TabbedPane.add("Date & Time ", panelDateTime);
        TabbedPane.add("Book Chair", panelChair);

        setVisible(true);
        /* END */

    }

    public void finalizeChair(){
        for(int i = 0; i < chairs.size() ; i++){
            if(chairs.get(i).getStatus().equalsIgnoreCase("Filled")){
                chairs.get(i).setStatus("Booked");
                chairs.get(i).setBackground(Color.WHITE);

            }
        }
    }

    public static void hitungharga() {
         jumlahtiket = (Integer) jumlah.getValue();
      haripilih = String.valueOf(hari.getSelectedItem());
        if (haripilih == "Monday" || haripilih == "Tuesday" || haripilih == "Wednesday" || haripilih == "Thursday") {
            harga = 35000 * jumlahtiket;

        } else if (haripilih == "Friday") {
            harga = 40000 * jumlahtiket;

        } else if (haripilih == "Saturday" || haripilih == "Sunday") {
            harga = 45000 * jumlahtiket;

        }

    }

    public static void pilihjam(){
        if(jam1.isSelected()){
            jamdipilih="13.00";
        }
        else if(jam3.isSelected()){
            jamdipilih="15.00";
        }
        else if(jam11.isSelected()){
            jamdipilih="11.00";
        }
        else if(jam5.isSelected()){
            jamdipilih="17.00";
        }
    }
    static class klik implements ActionListener{
Database db=new Database();

        Random randomNumbers = new Random();

        int randomValue = randomNumbers.nextInt(30);



        @Override
        public void actionPerformed(ActionEvent e) {
                 hitungharga();
                Payment.price.setText(String.valueOf(harga));
                Payment.hari.setText(haripilih);
                pilihjam();
                Payment.jam.setText(jamdipilih);
                Payment.jml.setText(String.valueOf(jumlahtiket));
                Payment.date.setText(tanggal);
                Payment.kursi.setText(Chair.nokursi);
          try {
              idbook="i"+randomValue+haripilih.substring(0,2);
                if(Payment.film.getText()=="Onward") {
                    db.insertbook(idbook, haripilih, tanggal, jamdipilih, jumlahtiket, Onward.idfilm);
                } else if (Payment.film.getText() == "Wonder Woman 1984") {
                    db.insertbook(idbook, haripilih, tanggal, jamdipilih, jumlahtiket, WonderWoman.idfilm);
                }else if(Payment.film.getText()=="Trolls World Tour"){
                    db.insertbook(idbook, haripilih, tanggal, jamdipilih, jumlahtiket, Trolls.idfilm);
                }else if(Payment.film.getText()=="The Devil All the Time"){
                    db.insertbook(idbook, haripilih, tanggal, jamdipilih, jumlahtiket, TheDevil.idfilm);
                }else if(Payment.film.getText()=="Love and Monsters"){
                    db.insertbook(idbook, haripilih, tanggal, jamdipilih, jumlahtiket, LoveAM.idfilm);
                }else if(Payment.film.getText()=="Tenet"){
                    db.insertbook(idbook,haripilih,tanggal,jamdipilih,jumlahtiket,tenet.idfilm);
                }else if(Payment.film.getText()=="Rebecca"){
                    db.insertbook(idbook,haripilih,tanggal,jamdipilih,jumlahtiket,Rebecca.idfilm);
                }else if(Payment.film.getText()=="Resistance"){
                    db.insertbook(idbook,haripilih,tanggal,jamdipilih,jumlahtiket,Resistance.idfilm);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }


        }

        }
    }



