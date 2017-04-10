package Standard ;

import java.io.IOException ;
import java.net.URL ;
import java.util.ResourceBundle ;
import javafx.fxml.FXML ;
import javafx.scene.control.Button ;
import javafx.scene.control.Label ;
import javafx.scene.control.TableView ;
import javafx.scene.layout.AnchorPane ;

public class MyTestsController extends UserInterface {

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

    
    
    /** Passa para a classe pai uma string com o nome do arquivo FXML */
    public MyTestsController () {
        super ("MyTests.fxml") ;
    }
    
    /** A classe (Initializable) possui um metodo abstrato (initialize) que deve ser implementado, 
     *  por isso a tag @Override, significando a sobreescrita. */
    @Override
    public void initialize (URL url, ResourceBundle rb) { }
    
    /** Metodo para voltar para a cena (Scene) (Dashboard). */
    @FXML
    public void backScreenDashboard () throws IOException {
        WindowManager.getInstance().backWindow() ;
    }
    
    /** Metodo para voltar para a cena (Scene) (Informar Nota). */
    @FXML
    public void reportNote () throws IOException {
        WindowManager.getInstance().changeWindow(new ReportNoteController()) ;
    }
    
    /** Metodo para voltar para a cena (Scene) (Informar Nota). */
    @FXML
    public void addNewTest () throws IOException {
        WindowManager.getInstance().changeWindow(new AddNewTestController()) ;
    }
}

