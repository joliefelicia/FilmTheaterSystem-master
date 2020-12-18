import javax.swing.*;
import java.sql.*;
import java.util.Vector;


public class Database{
    //
    //simpan,tambah(update (statues)),tampil data
    //update, select v

   private static Connection db;//interface
    public Database()  {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            db = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "bioskop", "bioskop");


        }catch(ClassNotFoundException | SQLException e){

            e.printStackTrace();

        }






    }

    public Vector<Chair> selectChair() throws SQLException {
        String qry = "SELECT * FROM CHAIR";
        java.sql.Statement s1 = db.createStatement();
        ResultSet rs = s1.executeQuery(qry);
        Vector<Chair> chairDatas = new Vector<>();
        while (rs.next()) {
            String Chair_No = rs.getString("Chair_No");
            String Status = rs.getString("Status");
            chairDatas.add(new Chair(Chair_No,Status));
        }
        return chairDatas;
    }



    public void insertbook(String idbook, String hari, String tanggal, String jam, int jumlah, String idfilm)throws SQLException{

        String sql="INSERT into book( id_book, hari, tgl, jam, jumlah, id_film) values (?,?,?,?,?,?)";
        PreparedStatement s=db.prepareStatement(sql);
        s.setString(1,idbook);
        s.setString(2,hari);
        s.setString(3,tanggal);
        s.setString(4,jam);
        s.setInt(5,jumlah);
        s.setString(6,idfilm);
        s.execute();
    }


    public void updatechair(String chairno )throws SQLException{
        String sql="update  chair  set status='FULL' where chair_no=?";
        PreparedStatement s=db.prepareStatement(sql);
        s.setString(1,chairno);
        s.execute();
    }

    public void insertaccount(String idaccount, String name, String username, String password, String email,String notlp)throws SQLException{
        String sql="INSERT into account( id_account, name, username, password, email,no_tlp) values (?,?,?,?,?,?)";
        PreparedStatement s=db.prepareStatement(sql);
        s.setString(1,idaccount);
        s.setString(2,name);
        s.setString(3,username);
        s.setString(4,password);
        s.setString(5,email);
        s.setString(6,notlp);
        s.execute();

    }

    public void insertpayment(String idpayment, int total, String metode, String idbook, String idaccount )throws SQLException{
        String sql="INSERT into payment( id_payment,  total,  metode,  id_book,  id_account ) values (?,?,?,?,?)";
        PreparedStatement s=db.prepareStatement(sql);
        s.setString(1,idpayment);
        s.setInt(2,total);
        s.setString(3,metode);
        s.setString(4,idbook);
        s.setString(5,idaccount);
        s.execute();
    }

    public void login()throws SQLException{
        String username =Login.txtuser.getText();
        String password= String.valueOf(Login.txtpw.getPassword());

        PreparedStatement s = db.prepareStatement("select * from account where username=? and password=?");
        s.setString(1,username);
        s.setString(2,password);


        ResultSet rs= s.executeQuery();
        if(rs.next()){
        if((username.equals(rs.getString("username")) && password.equals(rs.getString("password")))){
    JOptionPane.showMessageDialog(null,"login succesfull");


       }

        }
        else{
            JOptionPane.showMessageDialog(null,"Incorrect username or password..Try Again with correct detail!");
            System.exit(0);
        }

    }


    public boolean isConnected(){
        return( db != null);
    }

}