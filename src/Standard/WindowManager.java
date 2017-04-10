package Standard ;

import java.util.Stack ;
import javafx.stage.Stage ;

public class WindowManager {
    
    private static WindowManager uniqueInstance ;
    
    private WindowManager () {
        this.stackReturn = new Stack<> () ;
    }
    
    public static WindowManager getInstance() {
        if (WindowManager.uniqueInstance == null) {
            WindowManager.uniqueInstance = new WindowManager () ;
        }
        return WindowManager.uniqueInstance ;
    }
    
    private Stage appStage ;
    private Stack<UserInterface> stackReturn ;
    private UserInterface actualWindow ;
    
    public void initalizeStage (Stage appStage, UserInterface firstInterface) {
        this.appStage = appStage ;
        this.actualWindow = firstInterface ;
        this.appStage.setScene(firstInterface.getScene()) ;
        this.appStage.show() ;
    }
    
    private Stage getStage () {
        return this.appStage ;
    }
    
    public void openWindow (UserInterface newWindow) {
        this.stackReturn.push(this.actualWindow) ;
        this.getStage().setScene(newWindow.getScene()) ;
        this.actualWindow = newWindow ;
    }
    
    public void backWindow() {
        if (!this.stackReturn.empty()) {
            UserInterface previous = this.stackReturn.pop() ;
            this.getStage().setScene(previous.getScene()) ;
            this.actualWindow = previous ;
            return ;
        }
        System.err.println ("A pilha de retorno vazia") ;
    }
    
    public void backWindow (int nWindows) {
        if (nWindows <= this.stackReturn.size()) {
            while (nWindows > 1) {
                this.stackReturn.pop() ;
                nWindows-- ;
            }
            UserInterface previous = this.stackReturn.pop() ;
            this.getStage().setScene(previous.getScene()) ;
            this.actualWindow = previous ;
            return ;
        }
        System.err.println ("Numero de retornos maior que o tamanho da pilha") ;
    }
    
    public void showPopUp (UserInterface newWindow) {
        Stage popUp = new Stage() ;
        popUp.setScene(newWindow.getScene()) ;
    }
}
