import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class Payment extends JPanel {
    JPanel qrpanel, danapanel, gopaypanel,ovopanel;
    JPanel details = new JPanel();
    static JLabel film, hari, jam, jml, kursi, date;
    static JLabel price;
    static JRadioButton dana;
    static JRadioButton gopay;
    static JRadioButton ovo;
    static String idaccount;
    JButton complete = new JButton("Complete");
    ButtonGroup group = new ButtonGroup();
    static String metode;
     public Payment(){
         Database db=new Database();
         //background color
         setOpaque(true);
         setBackground(new Color(53, 80, 112));
         setSize(900, 550);
         setLayout(null);

         //Logo Images
         ImageIcon logo  = new ImageIcon(new ImageIcon("images/logo2.png").getImage().getScaledInstance(220, 60, Image.SCALE_DEFAULT));
         JLabel logolabel = new JLabel(logo);
         logolabel.setIcon(logo);
         add(logolabel);
         logolabel.setBounds(7,9,220, 60);

         details.setSize(380,376);
         details.setOpaque(true);
         details.setLayout(null);
         details.setBackground(Color.white);
         /*details.setBorder(BorderFactory.createCompoundBorder(
                 BorderFactory.createLineBorder(new Color(243, 104, 106), 0),
                 new EmptyBorder(0, 0, 0, 0)));*/

         details.setBounds(75,85,380,376);
         add(details,1);

         //details component
         JLabel judul= new JLabel("Order Details");
         judul.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 21));
         judul.setForeground(new Color(115, 94, 130));
         judul.setBounds(120,15,700,50);
         details.add(judul);

         JLabel line= new JLabel("-----------------------------------");
         line.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 15));
         line.setForeground(new Color(115, 94, 130));
         line.setBounds(35,40,800,50);
         details.add(line);

         JLabel filmjudul = new JLabel("FILM TITLE");
         filmjudul.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 15));
         filmjudul.setForeground(new Color(115, 94, 130));
         filmjudul.setBounds(35,70,100,50);
         details.add(filmjudul);

         film = new JLabel("isi judul film yang dipilih");
         film.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
         film.setForeground(new Color(175, 90, 108));
         film.setBounds(35,90,400,70);
         details.add(film);

         JLabel daytitle = new JLabel("DAY");
         daytitle.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 15));
         daytitle.setForeground(new Color(115, 94, 130));
         daytitle.setBounds(35,140,100,50);
         details.add(daytitle);

         hari = new JLabel("hari yang dipilih");
         hari.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
         hari.setForeground(new Color(175, 90, 108));
         hari.setBounds(35,160,400,70);
         details.add(hari);

         JLabel timetitle = new JLabel("TIME");
         timetitle.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 15));
         timetitle.setForeground(new Color(115, 94, 130));
         timetitle.setBounds(230,140,100,50);
         details.add(timetitle);

         jam = new JLabel("jam yang dipilih");
         jam.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
         jam.setForeground(new Color(175, 90, 108));
         jam.setBounds(230,160,400,70);
         details.add(jam);

         JLabel tickettitle = new JLabel("TICKET");
         tickettitle.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 15));
         tickettitle.setForeground(new Color(115, 94, 130));
         tickettitle.setBounds(35,210,100,50);
         details.add(tickettitle);

         jml = new JLabel("jumlah yang dibeli");
         jml.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
         jml.setForeground(new Color(175, 90, 108));
         jml.setBounds(35,230,400,70);
         details.add(jml);

         JLabel datetitle = new JLabel("DATE");
         datetitle.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 15));
         datetitle.setForeground(new Color(115, 94, 130));
         datetitle.setBounds(230,210,100,50);
         details.add(datetitle);

         date = new JLabel("Tanggal realtime");
         date.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
         date.setForeground(new Color(175, 90, 108));
         date.setBounds(230,230,400,70);
         details.add(date);

         JLabel chairtitle = new JLabel("CHAIR NUMBER");
         chairtitle.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 15));
         chairtitle.setForeground(new Color(115, 94, 130));
         chairtitle.setBounds(35,280,500,50);
         details.add(chairtitle);

         kursi = new JLabel("nomor kursi yg dipilih");
         kursi.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 14));
         kursi.setForeground(new Color(175, 90, 108));
         kursi.setBounds(35,300,400,70);
         details.add(kursi);


         //payment panel side
         JLabel pricetitle = new JLabel("TOTAL PRICE : ");
         pricetitle.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 19));
         pricetitle.setForeground(Color.white);
         pricetitle.setBounds(495,80,500,50);
         add(pricetitle);

         price = new JLabel("total harga untuk dibayar");
         price.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
         price.setForeground(Color.white);
         price.setBounds(495,100,400,70);
         add(price);

         JLabel line2= new JLabel("***************************************");
         line2.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 19));
         line2.setForeground(new Color(224, 82, 86));
         line2.setBounds(495,135,400,70);
         add(line2);

         JLabel paymethodstitle = new JLabel("Pick E-Payment Methods");
         paymethodstitle.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 17));
         paymethodstitle.setForeground(Color.white);
         paymethodstitle.setBounds(495,175,500,50);
         add(paymethodstitle);

         dana = new JRadioButton("Dana");
         dana.setBackground(new Color(53, 80, 112));
         dana.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
         dana.setForeground(Color.white);
         dana.setBounds(495,215,80,50);
         group.add(dana);
         add(dana);

         gopay = new JRadioButton("Gopay");
         gopay.setBackground(new Color(53, 80, 112));
         gopay.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
         gopay.setForeground(Color.white);
         gopay.setBounds(610,215,80,50);
         group.add(gopay);
         add(gopay);

         ovo = new JRadioButton("OVO");
         ovo.setBackground(new Color(53, 80, 112));
         ovo.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 16));
         ovo.setForeground(Color.white);
         ovo.setBounds(725,215,80,50);
         group.add(ovo);
         add(ovo);



         //qr Images
         qrpanel = new JPanel();
         qrpanel.setSize(175,175);
         qrpanel.setBackground(new Color(53, 80, 112));
         qrpanel.setBounds(565,290,170, 170);
         ImageIcon qrcode = new ImageIcon(new ImageIcon("images/qr.jpg").getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT));
         JLabel qrlabel = new JLabel(qrcode);
         qrlabel.setIcon(qrcode);
         qrlabel.setBounds(0,0,175, 175);
         qrpanel.add(qrlabel);
         add(qrpanel);

         //danapanel
         danapanel = new JPanel();
         danapanel.setSize(175,175);
         danapanel.setBackground(new Color(53, 80, 112));
         danapanel.setBounds(565,290,175, 175);
         ImageIcon danapic = new ImageIcon(new ImageIcon("images/dana.jpg").getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT));
         JLabel danalabel = new JLabel(danapic );
         danalabel.setIcon(danapic);
         danalabel.setBounds(0,0,170, 170);
         danapanel.add(danalabel);
         add(danapanel);

         //ovopanel
         ovopanel = new JPanel();
         ovopanel.setSize(175,175);
         ovopanel.setBackground(new Color(53, 80, 112));
         ovopanel.setBounds(565,290,175, 175);
         ImageIcon ovopic = new ImageIcon(new ImageIcon("images/ovo.jpg").getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT));
         JLabel ovolabel = new JLabel(ovopic);
         ovolabel.setIcon(ovopic);
         ovolabel.setBounds(0,0,170, 170);
         ovopanel.add(ovolabel);
         add(ovopanel);

         //gopaypanel
         gopaypanel = new JPanel();
         gopaypanel.setSize(175,175);
         gopaypanel.setBackground(new Color(53, 80, 112));
         gopaypanel.setBounds(565,290,175, 175);
         ImageIcon gopaypic = new ImageIcon(new ImageIcon("images/gopay.jpg").getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT));
         JLabel gopaylabel = new JLabel(gopaypic);
         gopaylabel.setIcon(gopaypic);
         gopaylabel.setBounds(0,0,170, 170);
         gopaypanel.add(gopaylabel);
         add(gopaypanel);

         qrpanel.setVisible(true);
         danapanel.setVisible(false);
         ovopanel.setVisible(false);
         gopaylabel.setVisible(false);

         //action listener
         dana.addActionListener(e -> {
             if (dana.isSelected()){
                 qrpanel.setVisible(false);
                 danapanel.setVisible(true);
                 ovopanel.setVisible(false);
                 gopaylabel.setVisible(false);}
         });

         gopay.addActionListener(e -> {
             if (gopay.isSelected()){
                 qrpanel.setVisible(false);
                 danapanel.setVisible(false);
                 ovopanel.setVisible(false);
                 gopaylabel.setVisible(true);
             }
         });

         ovo.addActionListener(e -> {
             if (ovo.isSelected()){
                 qrpanel.setVisible(false);
                 danapanel.setVisible(false);
                 ovopanel.setVisible(true);
                 gopaylabel.setVisible(false);
             }
         });

         //complete button
         complete.setFont(new Font("Lucida Sans Unicode",Font.BOLD, 12));
         complete.setForeground(Color.white);
         complete.setBackground(new Color(246, 84, 100));
         complete.setBorder(BorderFactory.createCompoundBorder(
                 BorderFactory.createLineBorder(new Color(246, 84, 100), 1),
                 BorderFactory.createEmptyBorder(2, 10, 2, 10)));
         complete.setBounds(775,471,110, 40);
         add(complete);

         complete.addActionListener(e -> {
             //dialogbox
             JOptionPane.showMessageDialog(null, "Order Successful!");

             try {
                 namametode();
                 String idpayment=Order.idbook+idaccount;
                 db.insertpayment(idpayment,Order.harga,metode,Order.idbook,idaccount);
             } catch (SQLException throwables) {
                 throwables.printStackTrace();
             }
         });

         setVisible(true);
     }
    public static void namametode(){
      if(dana.isSelected()){
          metode="Dana";
      }
      else if(ovo.isSelected()){
          metode="Ovo";
      }
      else if(gopay.isSelected()){
          metode="Gopay";
      }
    }

}
