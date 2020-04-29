package application;
import com.IsteMysql.*;
import java.sql.*;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

	Connection baglanti=null;
	 PreparedStatement sorguIfadesi=null;
	 ResultSet getirilen=null;
	 String sql;
	//merhaba
    @FXML
    private TextField txt_user;

    @FXML
    private TextField txt_pass;

    @FXML
    private Button btn_login;
    Stage appStage;
    Parent root;
    @FXML
  public  void login(ActionEvent event) throws IOException {
    	baglanti=VeritabaniUtil.Baglan();

    	sql="select * from login where kul_ad=? and sifre=?";
    	 try {
    	 sorguIfadesi=baglanti.prepareStatement(sql);
    	 sorguIfadesi.setString(1, txt_user.getText().trim());
    	 sorguIfadesi.setString(2, txt_pass.getText().trim());
    	 ResultSet getirilen=sorguIfadesi.executeQuery();

    	 if(!getirilen.next()) {
    	System.out.println("hatalý gýrýs yaptýnýz sdgsgsdg");
    	 }
    	 else {
    		
    		 if(event.getSource()==btn_login)
    		    {
    			  
    		        appStage=(Stage)btn_login.getScene().getWindow();
    		        root=FXMLLoader.load(getClass().getResource("Sahne22.fxml"));
    		      
    		    }
    		    Scene scene=new Scene(root);
    	        appStage.setScene(scene);
    	        appStage.setTitle("sahne2");
    	        appStage.show();
             
    	 }
    	} catch (Exception e) {// lbl_sonuc.setText(e.getMessage().toString()); }

    	
    	
    	
    	
    	

    }
    }

}
