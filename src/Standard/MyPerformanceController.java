package Standard ;

import java.io.IOException ;
import java.net.URL ;
import java.util.ResourceBundle ;
import javafx.fxml.FXML ;
import javafx.fxml.FXMLLoader ;
import javafx.fxml.Initializable ;
import javafx.scene.Scene ;
import javafx.scene.chart.BarChart ;
import javafx.scene.control.Button ;
import javafx.scene.control.Label ;
import javafx.scene.layout.AnchorPane ;
import javafx.stage.Stage ;

public class MyPerformanceController implements Initializable {

    /** Elemento do tipo (AnchorPane) referindo-se ao elemento raiz (background) no FXML. */
    @FXML
    private AnchorPane background ;
    
    /** Elemento do tipo (Label) referindo-se ao campo de texto (Meu Desempenho) no FXML. */
    @FXML
    private Label tab ;
    
    /** Elemento do tipo (BarChart) referindo-se ao grafico (Meu Desempenho em ...) no FXML. */
    @FXML
    private BarChart performance ;
    
    /** Elemento do tipo (Button) referindo-se ao botao (Voltar) no FXML. */
    @FXML
    private Button back ;
    
    
    
    /** A classe (Initializable) possui um metodo abstrato (initialize) que deve ser implementado, 
     *  por isso a tag @Override, significando a sobreescrita. */
    @Override
    public void initialize (URL url, ResourceBundle rb) { }    
    
    /** Metodo para voltar para a cena (Scene) (Dashborard). */
    @FXML 
    public void backScreenDashboard () throws IOException {
        // carregar o elemento raiz (AnchorPane - neste caso) da proxima tela, a que sera aberta
        AnchorPane nextRoot = FXMLLoader.load(getClass().getResource("Dashboard.fxml")) ;
        
        // criar a proxima cena (Scene) , passando para o construtor o elemento raiz que foi criado anteriormente
        Scene nextScene = new Scene (nextRoot) ;
        
        // obter a cena (Scene) atual a partir do elemento raiz da tela que esta aberta
        Scene currentScene = background.getScene() ;
        
        // obter o palco (Stage) da aplicacao a partir da cena atual
        Stage appStage = (Stage) currentScene.getWindow() ;
        
        // atribuir a proxima cena (Scene) ao palco (Stage)
        appStage.setScene(nextScene) ;
    }
}
