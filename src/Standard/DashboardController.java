package Standard ;

import java.io.IOException ;
import java.net.URL ;
import java.util.ResourceBundle ;
import javafx.fxml.FXML ;
import javafx.fxml.FXMLLoader ;
import javafx.fxml.Initializable ;
import javafx.scene.Scene ;
import javafx.scene.control.Button ;
import javafx.scene.control.Label ;
import javafx.scene.layout.AnchorPane ;
import javafx.stage.Stage ;

public class DashboardController implements Initializable {

    /** Elemento tipo (AnchorPane) referindo-se ao elemento raiz (root). */
    @FXML
    private AnchorPane root ;
    
    /** Elemento tipo (Label) referindo-se ao campo de texto (Dashboard). */
    @FXML
    private Label tabLabel ;
    
    /** Elemento tipo (Button) referindo-se ao botao (Minhas Avaliacoes). */
    @FXML
    private Button myTests ;
    
    /** Elemento tipo (Button) referindo-se ao botao (Meu Desempenho). */
    @FXML
    private Button myPerformance ;
    
    /** A classe (Initializable) possui um metodo abstrato (initialize) que deve ser implementado, 
     *  por isso a tag @Override, significando a sobreescrita. */
    @Override
    public void initialize (URL url, ResourceBundle rb) { }
    
    /** Metodo para trocar para a cena (Scene) de (Minhas Avaliações). */
    @FXML 
    public void nextScreenMyTests () throws IOException {
        // carregar o elemento raiz (AnchorPane - neste caso) da proxima tela, a que sera aberta
        AnchorPane nextRoot = FXMLLoader.load(getClass().getResource("MyTests.fxml")) ;
        
        // criar a proxima cena (Scene) , passando para o construtor o elemento raiz que foi criado anteriormente
        Scene nextScene = new Scene (nextRoot) ;
        
        // obter a cena (Scene) atual a partir do elemento raiz da tela que esta aberta
        Scene currentScene = root.getScene() ;
        
        // obter o palco (Stage) da aplicacao a partir da cena atual
        Stage appStage = (Stage) currentScene.getWindow() ;
        
        // atribuir a proxima cena (Scene) ao palco (Stage)
        appStage.setScene(nextScene) ;
    }
    
    /** Metodo para trocar para a cena (Scene) de (Meu Desempenho). */
    @FXML 
    public void nextScreenMyPerformance () throws IOException {
        // carregar o elemento raiz (AnchorPane - neste caso) da proxima tela, a que sera aberta
        AnchorPane nextRoot = FXMLLoader.load(getClass().getResource("MyPerformance.fxml")) ;
        
        // criar a proxima cena (Scene) , passando para o construtor o elemento raiz que foi criado anteriormente
        Scene nextScene = new Scene (nextRoot) ;
        
        // obter a cena (Scene) atual a partir do elemento raiz da tela que esta aberta
        Scene currentScene = root.getScene() ;
        
        // obter o palco (Stage) da aplicacao a partir da cena atual
        Stage appStage = (Stage) currentScene.getWindow() ;
        
        // atribuir a proxima cena (Scene) ao palco (Stage)
        appStage.setScene(nextScene) ;
    }
    
}
