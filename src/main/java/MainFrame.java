import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class MainFrame extends JFrame {
   public MainFrame(){
       setTitle("Cinema21");
       setSize(900, 550);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       //Frame icon
       ImageIcon icon = new ImageIcon("images/icon.png") ;
       setIconImage(icon.getImage());

       //add class jpanel
       Login  loginclass = new Login();
       add(loginclass);
       Menu menuclass = new Menu();
       add(menuclass);
       /*//object panel
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
       add(loveamclass);*/

       menuclass.slideshow.setVisible(false);

       //actionlistener button login
       loginclass.login.addActionListener(e -> {
          menuclass.setVisible(true);
           menuclass.slideshow.setVisible(true);
           loginclass.setVisible(false);
           /* onwardclass.setVisible(false);
           wwomanclass.setVisible(false);
           tenetclass.setVisible(false);
           rebeccaclass.setVisible(false);
           resistanceclass.setVisible(false);
           devilclass.setVisible(false);
           trollsclass.setVisible(false);
           loveamclass.setVisible(false);*/
       });



       //mouselistener


       Signup.signup.addActionListener(e -> {
           menuclass.setVisible(true);
           menuclass.slideshow.setVisible(true);
      //     new Signup().setVisible(false);
           loginclass.setVisible(false);
       });


       setVisible(true);
   }
    public static void main(String[] args) {
        new MainFrame();
    }
}

