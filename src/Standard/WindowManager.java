package Standard ;

import java.util.Stack ;
import javafx.stage.Stage ;

/** classe para Gerenciar as Telas da apliacacao. */
public class WindowManager {
    
    /** atributo estatico, garantindo que seja instanciado somente uma unica vez (Singleton). */
    private static WindowManager uniqueInstance ;
    /** appStage sera o "palco" da apliacao". */
    private Stage appStage ;
    /** currentWindow eh a janela atual. */
    private UserInterface currentWindow ;
    /** eh a pilha a ser utilizado pela funcao (backWindow). */
    final private Stack<UserInterface> returnStack ;
    
    /** construtor cria uma pilha para armazenar as janelas aberta, semelhante ao funcionamento do Android. */
    private WindowManager () {
        this.returnStack = new Stack<> () ;
    }
    
    /** metodo para retorna a instancia. */
    public static WindowManager getInstance() {
        if (WindowManager.uniqueInstance == null) {
            WindowManager.uniqueInstance = new WindowManager () ;
        }
        return WindowManager.uniqueInstance ;
    }
    
    /** prepara e inicializa o "palco" e em seguida inicia o "show".
     *  @param appStage eh o "palco"
     *  @param firstWindow eh a primeira janela que sera mostrada */
    public void initalizeStage (Stage appStage, UserInterface firstWindow) {
        this.appStage = appStage ;
        this.currentWindow = firstWindow ;
        this.appStage.setScene(firstWindow.getScene()) ;
        this.appStage.show() ;
    }
    
    /** retorna o "palco" . */
    private Stage getStage () {
        return this.appStage ;
    }
    
    /** muda a janela.
     *  @param newWindow eh a nova janela que sera mostrada */
    public void changeWindow (UserInterface newWindow) {
        this.returnStack.push(this.currentWindow) ;
        this.getStage().setScene(newWindow.getScene()) ;
        this.currentWindow = newWindow ;
        System.out.println("ABRIU " + this.returnStack.size());
    }
    
    /** voltar para a janela anterior, desempilhar a pilha de janelas. */
    public void backWindow () {
        if (!this.returnStack.empty()) {
            UserInterface previous = this.returnStack.pop() ;
            this.getStage().setScene(previous.getScene()) ;
            this.currentWindow = previous ;
            System.out.println("FECHOU " + this.returnStack.size());
            return ;
        }
        System.err.println ("A pilha de retorno vazia") ;
    }
    
    /** voltar para a janela x, desempilhar x janelas da pilha de janelas.
     *  @param nWindows eh a quantidade de janelas que deseja voltar */
    public void backWindow (int nWindows) {
        if (nWindows <= this.returnStack.size()) {
            while (nWindows > 1) {
                this.returnStack.pop() ;
                nWindows-- ;
            }
            UserInterface previous = this.returnStack.pop() ;
            this.getStage().setScene(previous.getScene()) ;
            this.currentWindow = previous ;
            return ;
        }
        System.err.println ("Numero de retornos maior que o tamanho da pilha") ;
    }
    
    /** abre uma nova janela em novo palco.
     *  @param newWindow eh a nova janela que sera mostrada */
    public void showPopUp (UserInterface newWindow) {
        Stage popUp = new Stage () ;
        popUp.setScene(newWindow.getScene()) ;
    }
}

