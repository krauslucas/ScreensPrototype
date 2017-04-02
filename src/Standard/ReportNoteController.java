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

    /** Elemento raiz (background). */
    @FXML
    private AnchorPane background ;
    
    /** ERotulo (Informar Nota). */
    @FXML
    private Label tab ;
    
    /** Rotulo (Nome: Prova Java). */
    @FXML
    private Label name ;
    
    /** ERotulo (Disciplina: Programcao Orientada a Objetos). */
    @FXML
    private Label discipline ;
    
    /** Rotulo (Media: M1). */
    @FXML
    private Label average ;
    
    /** Rotulo (Minha Nota). */
    @FXML
    private Label myNote ;
    
    /** Campo de texto (Minha nota), entrada do usuario. */
    @FXML
    private TextField note ;
    
    /** Botao (Voltar). */
    @FXML
    private Button back ;
    
    /** Botao (Salvar). */
    @FXML
    private Button save ;
    
    
    
    /** A classe (Initializable) possui um metodo abstrato (initialize) que deve ser implementado, 
     *  por isso a tag @Override, significando a sobreescrita. */
    @Override
    public void initialize (URL url, ResourceBundle rb) { }
    
    /** Metodo para voltar para a cena (Scene) (Minhas Avaliacoes). */
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
    
    /** Metodo para salvar os dadose em seguida voltar para a cena (Scene) (Minhas Avaliacoes). */
    @FXML
    public void saveNote () throws IOException {
        // salvar os dados e em seguida voltar para a tela (Minhas Avaliacoes)
        backScreenMyTests () ;
    }
}