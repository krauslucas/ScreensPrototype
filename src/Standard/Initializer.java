package Standard ;

import javafx.application.Application ;
import javafx.stage.Stage ;

public class Initializer extends Application {
    
    public static void main (String[] args) {
        launch (args) ;
    }

    @Override
    public void start (Stage mainStage) throws Exception {
        // cria a primeira janela
        DashboardController mainWindow = new DashboardController () ;
        
        // mostra a primeira janela
        WindowManager.getInstance().initalizeStage(mainStage, mainWindow) ;
        
        // insere um titulo na janela
        mainStage.setTitle("Screens Prototype") ;
    }
}
