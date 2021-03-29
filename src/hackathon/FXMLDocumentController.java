package hackathon;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.logging.Logger.global;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.JOptionPane;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button next;

    @FXML
    private Hyperlink customer;
    
    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private TextField email;

    @FXML
    private TextField contact;

    @FXML
    private TextField city;

    @FXML
    private Button Sign_in;

    @FXML
    private Hyperlink login;
    
    @FXML
    private TextField username1;

    @FXML
    private PasswordField password2;

    @FXML
    private Button login_btn;
    
    @FXML
    private Hyperlink menu;
    
    @FXML
    private Hyperlink menu1;
    
    @FXML
    private Button book;
    
    @FXML
    private Hyperlink bookings1;

    @FXML
    private Hyperlink services1;

    @FXML
    private Hyperlink future1;

    @FXML
    private Hyperlink setting1;

    @FXML
    private Hyperlink help1;

    @FXML
    private Hyperlink logout1;

    @FXML
    private JFXButton bookings;

    @FXML
    private JFXButton services;

    @FXML
    private JFXButton future;

    @FXML
    private JFXButton setting;

    @FXML
    private JFXButton help;

    @FXML
    private JFXButton logout;
    
    @FXML
    private Button carpenter;

    @FXML
    private Button painter;
    
    @FXML
    private Button report;

    @FXML
    private Button center;
    
    @FXML
    private Button update;

    @FXML
    private TextField userch;

    @FXML
    private TextField emailch;

    @FXML
    private TextField contactch;
    
    @FXML
    private TextField citych;

    @FXML
    private Button submit;
    
    @FXML
    private Button change;

    @FXML
    private PasswordField current;

    @FXML
    private PasswordField newpass;

    @FXML
    private PasswordField repass;
    
    @FXML
    private Button changepass;

    @FXML
    private Button account;

    @FXML
    private Button logout2;
    
    @FXML
    private Button carpenter1;

    @FXML
    private Button painter1;
    
    @FXML
    private Button virat;
    
    @FXML
    private Button ramesh;
    
    @FXML
    private Button Booknow;
    
    @FXML
    private Button address;
    
    @FXML
    private Button home;
    
    
    Connection con;
    PreparedStatement pst;
    PreparedStatement pst1;
    PreparedStatement pst2;
    ResultSet rs;
    
    public static String uname="";
    public static String pass="";
    public static String eid="";
    public static String number="";
    public static String place="";
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
        

        
        if(event.getSource()==next){
            Stage stage = (Stage) next.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("choice.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==customer){
            Stage stage = (Stage) customer.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==login){ 
            Stage stage = (Stage) login.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==menu){
            Stage stage = (Stage) menu.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("home_1.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==menu1){
            Stage stage = (Stage) menu1.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==bookings){
            Stage stage = (Stage) bookings.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("booking.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==services){
            Stage stage = (Stage) services.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("services.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==future){
            Stage stage = (Stage) future.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("coming soon.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==setting){
            Stage stage = (Stage) setting.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("settings.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==help){
            Stage stage = (Stage) help.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Help and support.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource() == logout) {
            Stage stage = (Stage) logout.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==bookings1){
            Stage stage = (Stage) bookings1.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("booking.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==services1){
            Stage stage = (Stage) services1.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("services.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==future1){
            Stage stage = (Stage) future1.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("coming soon.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==setting1){
            Stage stage = (Stage) setting1.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("settings.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==help1){
            Stage stage = (Stage) help1.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Help and support.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==logout1){
            Stage stage = (Stage) logout1.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==report){
            Stage stage = (Stage) report.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Report a Problem.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==center){
            Stage stage = (Stage) center.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Contact help center.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==changepass){
            Stage stage = (Stage) changepass.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("change password.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==account){
            Stage stage = (Stage) account.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Account.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==logout2){
            Stage stage = (Stage) logout2.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==carpenter){
            Stage stage = (Stage) carpenter.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("carpenters.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==painter){
            Stage stage = (Stage) painter.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("painters.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==carpenter1){
            Stage stage = (Stage) carpenter1.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("carpenters.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==painter1){
            Stage stage = (Stage) painter1.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("painters.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        
        if(event.getSource()==ramesh){
            Stage stage = (Stage) ramesh.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("ramesh.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==virat){
            Stage stage = (Stage) virat.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("virat.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==submit){
            JOptionPane.showMessageDialog(null, "Your problem is being recorded, we'll reach you soon");
            Stage stage = (Stage) submit.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Help and support.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==Booknow){
            JOptionPane.showMessageDialog(null, "Are you sure, you want to make a booking");
            Stage stage = (Stage) Booknow.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("confirmation.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==address){
            Stage stage = (Stage) address.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("success.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
        if(event.getSource()==book){
            Stage stage = (Stage) book.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
                
        if(event.getSource()==home){
            Stage stage = (Stage) home.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
    
    @FXML
    private void SigninAction(ActionEvent event) throws Exception {
        
        uname=username.getText();
        pass=password.getText();
        eid=email.getText().toLowerCase();
        number=contact.getText();
        place=city.getText().toLowerCase();


        if(uname.equals("")&&pass.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the details");  
        }
        else {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/workers","root","");
                
                pst=con.prepareStatement("INSERT INTO customers(username,password,email,contact,city) VALUES(?,?,?,?,?)");
                pst.setString(1, uname);
                pst.setString(2, pass);
                pst.setString(3, eid);
                pst.setString(4, number);
                pst.setString(5, place);
            
                pst.execute();
                Stage stage = (Stage) Sign_in.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            catch (ClassNotFoundException | SQLException ex){
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE,null, ex);
            }
        }     
    }
    
    @FXML
    private void loginAction(ActionEvent event) throws Exception {
        
        String uname1=username1.getText().toLowerCase();
        String pass1=password2.getText().toLowerCase();
        if(uname1.equals("")&&pass1.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the details");
        }
        else{
            try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/workers","root","");
            
            pst=con.prepareStatement("select * from customers where username=? and password=?");
            
            pst.setString(1,uname1);
            pst.setString(2,pass1);
            
            rs=pst.executeQuery();
                if(rs.next()){
                    
                    Stage stage = (Stage) login_btn.getScene().getWindow();
                    Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Wrong Details, Please try again");
                    username1.setText("");
                    password2.setText("");
                    username1.requestFocus();
                }
            } catch (ClassNotFoundException ex){
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE,null, ex);
            }catch (SQLException ex){
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE,null, ex);
            }
        }
    }
    
    @FXML
    private void editAction(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {

        String uname2=userch.getText();
        String eidch=emailch.getText();
        String numch=contactch.getText();
        String placech=citych.getText();
        
        if(uname2.equals("")&&eidch.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the details");
        }
        else {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/workers","root","");
                pst=con.prepareStatement("INSERT INTO customers(username,password,email,contact,city) VALUES(?,?,?,?,?)");
                pst.setString(1, uname2);
                pst.setString(2, pass);
                pst.setString(3, eidch);
                pst.setString(4, numch);
                pst.setString(5, placech);
            
                pst.execute();
                
                pst1=con.prepareStatement("DELETE FROM customers WHERE username=?");
                pst1.setString(1, uname);
                
                pst1.execute();
                if(event.getSource()==update){
                    JOptionPane.showMessageDialog(null, "Details updated successfully");
                    Stage stage = (Stage) update.getScene().getWindow();
                    Parent root = FXMLLoader.load(getClass().getResource("settings.fxml"));
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
            }
            catch (ClassNotFoundException ex){
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE,null, ex);
            }
            catch (SQLException ex){
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE,null, ex);
            }
        } 
    }
    
    @FXML
    private void changeAction(ActionEvent event) throws IOException {
        
        String passold=current.getText();
        String passnew=newpass.getText();
        String passre=repass.getText();
        
        if(passold.equals("")&&passnew.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the details");
        }
        else {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/workers","root","");
                pst=con.prepareStatement("select * from customers where password=?");
            
                pst.setString(1,passold);

                rs=pst.executeQuery();
                if(rs.next()){
                    if(passnew.equals(passre)){
                        pst1=con.prepareStatement("INSERT INTO customers(username,password,email,contact,city) VALUES(?,?,?,?,?)");
                        pst1.setString(1, uname);
                        pst1.setString(2, passnew);
                        pst1.setString(3, eid);
                        pst1.setString(4, number);
                        pst1.setString(5, place);

                        pst1.execute();
                        
                        pst2=con.prepareStatement("DELETE FROM customers WHERE password=?");
                        pst2.setString(1, pass);
                
                        pst2.execute();
                        if(event.getSource()==change){
                            JOptionPane.showMessageDialog(null, "Details updated successfully");
                            Stage stage = (Stage) change.getScene().getWindow();
                            Parent root = FXMLLoader.load(getClass().getResource("settings.fxml"));
                            Scene scene = new Scene(root);
                            stage.setScene(scene);
                            stage.show();
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "New password and re-entered new password doesn't match");
                        current.setText("");
                        newpass.setText("");
                        repass.setText("");
                        current.requestFocus();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Re-enter current password");
                    current.setText("");
                    newpass.setText("");
                    repass.setText("");
                    current.requestFocus();
                }
            }
                
            catch (ClassNotFoundException ex){
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE,null, ex);
            }
            catch (SQLException ex){
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE,null, ex);
            }
        } 
    }
    
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }
}
          /*  try{
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/workers","root","");
                pst=con.prepareStatement("INSERT INTO customers(username,password,email,contact,city) VALUES(?,?,?,?,?)");
                pst.setString(1, uname);
                pst.setString(2, pass);
                pst.setString(3, eid);
                pst.setString(4, number);
                pst.setString(5, place);
            
                pst.executeQuery();
                Stage stage = (Stage) Sign_in.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }*/