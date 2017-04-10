package Standard ;

import java.io.IOException ;
import java.net.URL ;
import java.util.ResourceBundle ;
import javafx.fxml.FXML ;
import javafx.scene.control.Button ;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane ;

public class DashboardController extends UserInterface {

    /** Elemento raiz (background). */
    @FXML
    private AnchorPane background ;
    
    /** Rotulo (Dashboard). */
    @FXML
    private Label tab ;
    
    /** Botao (Minhas Avaliacoes). */
    @FXML
    private Button myTests ;
    
    /** Botao (Meu Desempenho). */
    @FXML
    private Button myPerformance ;

    
    
    /** Passa para a classe pai uma string com o nome do arquivo FXML */
    public DashboardController () {
        super ("Dashboard.fxml") ;
    }
    
    /** A classe (Initializable) possui metodo abstrato (initialize) que deve ser implementado,
     *  por isso a tag @Override, significando a sobreescrita. */
    @Override
    public void initialize (URL url, ResourceBundle rb) { }
    
    /** Metodo para trocar para a cena (Scene) de (Meu Desempenho). */
    @FXML 
    public void nextScreenMyPerformance () throws IOException {
        WindowManager.getInstance().openWindow(new MyPerformanceController()) ;
    }
    
    /** Metodo para trocar para a cena (Scene) de (Minhas Avaliacoes). */
    @FXML 
    public void nextScreenMyTests () throws IOException {
        WindowManager.getInstance().openWindow(new MyTestsController()) ;
    }
}
