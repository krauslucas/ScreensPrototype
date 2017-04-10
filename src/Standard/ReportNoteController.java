package Standard ;

import java.io.IOException ;
import java.net.URL ;
import java.util.ResourceBundle ;
import javafx.fxml.FXML ;
import javafx.scene.control.Button ;
import javafx.scene.control.Label ;
import javafx.scene.control.TextField ;
import javafx.scene.layout.AnchorPane ;

public class ReportNoteController extends UserInterface {

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
    
    
    
    /** Passa para a classe pai uma string com o nome do arquivo FXML */
    public ReportNoteController () {
        super ("ReportNote.fxml") ;
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
    
    /** Metodo para salvar os dadose em seguida voltar para a cena (Scene) (Minhas Avaliacoes). */
    @FXML
    public void saveNote () throws IOException {
        // salvar os dados e em seguida voltar para a tela (Minhas Avaliacoes)
        backScreenMyTests () ;
    }
}

