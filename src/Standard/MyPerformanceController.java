package Standard ;

import java.io.IOException ;
import java.net.URL ;
import java.util.ResourceBundle ;
import javafx.fxml.FXML ;
import javafx.scene.chart.BarChart ;
import javafx.scene.control.Button ;
import javafx.scene.control.Label ;
import javafx.scene.layout.AnchorPane ;

public class MyPerformanceController extends UserInterface {

    /** Elemento raiz (background). */
    @FXML
    private AnchorPane background ;
    
    /** Rotulo (Meu Desempenho). */
    @FXML
    private Label tab ;
    
    /** Grafico (Meu Desempenho em ...). */
    @FXML
    private BarChart performance ;
    
    /** Botao (Voltar). */
    @FXML
    private Button back ;
    
    
    
    /** Passa para a classe pai uma string com o nome do arquivo FXML */
    public MyPerformanceController () {
        super ("MyPerformance.fxml") ;
    }
    
    /** A classe (Initializable) possui um metodo abstrato (initialize) que deve ser implementado, 
     *  por isso a tag @Override, significando a sobreescrita. */
    @Override
    public void initialize (URL url, ResourceBundle rb) { }
    
    /** Metodo para voltar para a cena (Scene) (Dashboard). */
    @FXML 
    public void backDashboard () throws IOException {
        WindowManager.getInstance().backWindow() ;
    }
}

