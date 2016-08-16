package Codigo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author <Gabriel Mello de Oliveira
 */

public class FXML_CodigoController implements Initializable
{

    @FXML public static String Text;
    
    @FXML private Button OK;
    
    @FXML private Label Texto;
    
    @FXML
    private void Texto_OK(ActionEvent event)
    {
        Texto.setText(Text);
    }
    
    //Cria o Stage da tela de Cadastro e da nome para ele.
    @FXML
    public static Stage Stage_Cadastro;
    
    @FXML
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("FXML_Codigo.fxml"));    
        Scene scene = new Scene(root);
        stage.setTitle("Codigo");
        stage.setScene(scene);
        stage.show();      
        
        //O "Stage_Cadastro" vai receber tudo que tem na stage.
        Stage_Cadastro = stage;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
