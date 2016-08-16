package javafx_ide;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author <Gabriel Mello de Oliveira
 */

public class FXMLDocumentController implements Initializable
{   
    @FXML private Button Executar;
    
    @FXML private TextArea Codigo_;
    
    @FXML
    private void Executar_Codigo(ActionEvent event)
    {
        Codigo.FXML_CodigoController.Text = Codigo_.getText();
        
        Codigo.FXML_CodigoController Abre_Tela = new Codigo.FXML_CodigoController();
        
        try
        {
            Abre_Tela.start(new Stage());
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }     
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }      
}
