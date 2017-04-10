package Standard ;

import java.io.IOException;
import java.net.URL ;
import java.util.ResourceBundle ;
import javafx.fxml.FXML ;
import javafx.scene.control.Button ;
import javafx.scene.control.Label ;
import javafx.scene.control.SplitMenuButton ;
import javafx.scene.control.TextField ;
import javafx.scene.layout.AnchorPane ;

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
        WindowManager.getInstance().backWindow() ;
    }
    
    /** Metodo para salvar os dados e em seguida voltar para a cena (Scene) (Minhas Avaliacoes). */
    @FXML
    public void saveNewTest () throws IOException {
        // a ser implementado ainda
        backScreenMyTests() ;
    }
}

