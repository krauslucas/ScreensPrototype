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
import javafx.scene.control.TableView ;
import javafx.scene.layout.AnchorPane ;
import javafx.stage.Stage ;

public class MyTestsController implements Initializable {

    /** Elemento raiz (background). */
    @FXML
    private AnchorPane background ;
    
    /** Rotulo (Meu Desempenho). */
    @FXML
    private Label tab ;
    
    /** Botao (Informar nota). */
    @FXML
    private Button reportNote ;
    
    /** Botao (Adicionar nova avaliacao). */
    @FXML
    private Button addNewTest ;
    
    /** Botao (Voltar). */
    @FXML
    private Button back ;
    
    /** Tabela (Minhas Avaliacoes). */
    @FXML
    private TableView myTests ;
    
    
    
    /** A classe (Initializable) possui um metodo abstrato (initialize) que deve ser implementado, 
     *  por isso a tag @Override, significando a sobreescrita. */
    @Override
    public void initialize (URL url, ResourceBundle rb) { }
    
    /** Metodo para voltar para a cena (Scene) (Dashboard). */
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
    
    /** Metodo para voltar para a cena (Scene) (Informar Nota). */
    @FXML
    public void reportNote () throws IOException {
        // carregar o elemento raiz (AnchorPane - neste caso) da proxima tela, a que sera aberta
        AnchorPane nextRoot = FXMLLoader.load(getClass().getResource("ReportNote.fxml")) ;
        
        // criar a proxima cena (Scene) , passando para o construtor o elemento raiz que foi criado anteriormente
        Scene nextScene = new Scene (nextRoot) ;
        
        // obter a cena (Scene) atual a partir do elemento raiz da tela que esta aberta
        Scene currentScene = background.getScene() ;
        
        // obter o palco (Stage) da aplicacao a partir da cena atual
        Stage appStage = (Stage) currentScene.getWindow() ;
        
        // atribuir a proxima cena (Scene) ao palco (Stage)
        appStage.setScene(nextScene) ;
    }
    
    /** Metodo para voltar para a cena (Scene) (Informar Nota). */
    @FXML
    public void addNewTest () throws IOException {
        // carregar o elemento raiz (AnchorPane - neste caso) da proxima tela, a que sera aberta
        AnchorPane nextRoot = FXMLLoader.load(getClass().getResource("AddNewTest.fxml")) ;
        
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
