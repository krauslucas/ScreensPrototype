package Standard ;

import javafx.application.Application ;
import javafx.fxml.FXMLLoader ;
import javafx.scene.Scene ;
import javafx.scene.layout.AnchorPane ;
import javafx.stage.Stage ;

public class Initializer extends Application {
    
    
    public void main (String[] args) {
        launch (args) ;
    }

    @Override
    public void start (Stage mainStage) throws Exception {
        // carregar o elemento raiz (root) a partir do FXML
        AnchorPane root = FXMLLoader.load(getClass().getResource("Dashboard.fxml")) ;
        
        // criar uma cena (Scene), passando para o construtor o elemento raiz (root) do FXML
        Scene firstScene = new Scene (root) ;
        
        // inserir a cena (Scene) criada anteriormente ao palco (Stage)
        mainStage.setScene(firstScene) ;
        
        // exibir o palco (Stage), iniciar o "show"
        mainStage.show() ;
        
        mainStage.setTitle("Screens Prototype") ;
    }
}
