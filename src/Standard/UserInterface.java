package Standard ;

import java.io.IOException ;
import java.util.logging.Level ;
import java.util.logging.Logger ;
import javafx.fxml.FXMLLoader ;
import javafx.fxml.Initializable ;
import javafx.scene.Scene ;
import javafx.scene.layout.Pane ;

public abstract class UserInterface implements Initializable {
    
    private Scene myScene ;
    private String fxmlPath ;
    
    protected UserInterface (String fxmlPath) {
        this.fxmlPath = fxmlPath ;
    }
    
    public Scene getScene ()  {
        if (this.myScene != null) {
            return this.myScene ;
        }
        
        try {
            Pane elementoPrincipal = FXMLLoader.load(getClass().getResource(fxmlPath)) ;
            this.myScene = new Scene (elementoPrincipal, 600, 400) ;
        } catch (IOException ex) {
            Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex) ;
        }
        
        return this.myScene ;
    }
    
}
