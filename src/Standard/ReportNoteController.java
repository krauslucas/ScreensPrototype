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
import javafx.scene.control.TextField ;
import javafx.scene.layout.AnchorPane ;
import javafx.stage.Stage ;

public class ReportNoteController implements Initializable {

    /** Elemento tipo (AnchorPane) referindo-se ao elemento raiz (background). */
    @FXML
    private AnchorPane background ;
    
    /** Elemento tipo (Label) referindo-se ao rotulo (Informar Nota). */
    @FXML
    private Label tab ;
    
    /** Elemento tipo (Label) referindo-se ao rotulo (Nome: Prova Java). */
    @FXML
    private Label name ;
    
    /** Elemento tipo (Label) referindo-se ao rotulo (Disciplina: Programcao Orientada a Objetos). */
    @FXML
    private Label discipline ;
    
    /** Elemento tipo (Label) referindo-se ao rotulo (Media: M1). */
    @FXML
    private Label average ;
    
    /** Elemento tipo (Label) referindo-se ao rotulo (Minha Nota). */
    @FXML
    private Label myNote ;
    
    /** Elemento tipo (TextField) referindo-se ao campo de texto, entrada do usuario. */
    @FXML
    private TextField note ;
    
    /** Elemento tipo (Button) referindo-se ao botao (Voltar). */
    @FXML
    private Button back ;
    
    /** Elemento tipo (Button) referindo-se ao botao (Salvar). */
    @FXML
    private Button save ;
    
    
    
    /** A classe (Initializable) possui um metodo abstrato (initialize) que deve ser implementado, 
     *  por isso a tag @Override, significando a sobreescrita. */
    @Override
    public void initialize (URL url, ResourceBundle rb) { }
    
    /** Metodo para voltar para a cena (Scene) (Dashboard). */
    @FXML 
    public void backScreenMyTests () throws IOException {
        // carregar o elemento raiz (AnchorPane - neste caso) da proxima tela, a que sera aberta
        AnchorPane nextRoot = FXMLLoader.load(getClass().getResource("MyTests.fxml")) ;
        
        // criar a proxima cena (Scene) , passando para o construtor o elemento raiz que foi criado anteriormente
        Scene nextScene = new Scene (nextRoot) ;
        
        // obter a cena (Scene) atual a partir do elemento raiz da tela que esta aberta
        Scene currentScene = background.getScene() ;
        
        // obter o palco (Stage) da aplicacao a partir da cena atual
        Stage appStage = (Stage) currentScene.getWindow() ;
        
        // atribuir a proxima cena (Scene) ao palco (Stage)
        appStage.setScene(nextScene) ;
    }
    
    
    @FXML
    public void saveNote () throws IOException {
        // salvar os dados e em seguida voltar para a tela (Minhas Avaliacoes)
        backScreenMyTests () ;
    }
}
