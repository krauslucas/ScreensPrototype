package Standard ;

import java.io.IOException;
import java.net.URL ;
import java.util.ResourceBundle ;
import javafx.fxml.FXML ;
import javafx.fxml.FXMLLoader ;
import javafx.scene.Scene ;
import javafx.scene.control.Button ;
import javafx.scene.control.Label ;
import javafx.scene.control.SplitMenuButton ;
import javafx.scene.control.TextField ;
import javafx.scene.layout.AnchorPane ;
import javafx.stage.Stage ;

public class AddNewTestController extends UserInterface {

    /** Elemento raiz (background). */
    @FXML
    private AnchorPane background ;
    
    /** Rotulo (Adicionar nova avaliacao). */
    @FXML
    private Label tab ;
    
    /** Rotulo (Nome). */
    @FXML
    private Label name ;
    
    /** Campo de texto (Nome), entrada do usuario. */
    @FXML
    private TextField nameField ;
    
    /** Rotulo (Peso). */
    @FXML
    private Label weight ;
    
    /** Campo de texto (Peso), entrada do usuario) */
    @FXML
    private TextField weightField ;
    
    /** Rotulo (Disciplina) .*/
    @FXML
    private Label discipline ;
    
    /** Menu (Disciplina) .*/
    @FXML
    private SplitMenuButton disciplineMenu ;
    
    /** Rotulo (Medias) .*/
    @FXML
    private Label average ;
    
    /** Menu (Medias) .*/
    @FXML
    private SplitMenuButton averageMenu ;
    
    /** Botao (Voltar). */
    @FXML
    private Button back ;
    
    /** Botao (Salvar). */
    @FXML
    private Button save ;
    
    
    
    /** Passa para a classe pai uma string com o nome do arquivo FXML */
    public AddNewTestController () {
        super ("AddNewTest.fxml") ;
    }
    
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
    public void saveNewTest () throws IOException {
        // salvar os dados e em seguida voltar para a tela (Minhas Avaliacoes)
        backScreenMyTests () ;
    }
}
