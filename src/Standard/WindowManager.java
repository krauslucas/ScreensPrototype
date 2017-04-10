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
    private Stack<InterfaceUsuario> stackReturn ;
    private InterfaceUsuario actualWindow ;
    
    public void inicializaPalco(Stage p, InterfaceUsuario interfaceInicial){
        this.appStage = p;
        this.actualWindow = interfaceInicial;
        this.appStage.setScene(interfaceInicial.obterCena());
        this.appStage.show();
    }
    
    private Stage getPalco(){
        return this.appStage;
    }
    
    public void abreJanela(InterfaceUsuario novaJanela) {
        this.stackReturn.push(this.actualWindow);
        this.getPalco().setScene(novaJanela.obterCena());
        this.actualWindow = novaJanela;
        System.out.println(this.stackReturn.size());
    }
    
    public void voltar() {
        if(!this.stackReturn.empty()){
            InterfaceUsuario anterior = this.stackReturn.pop();
            this.getPalco().setScene(anterior.obterCena());
            this.actualWindow = anterior;
            return;
        }
        System.err.println("A pilha de retorno vazia");
    }
    
    public void voltar(int quantasTelas) {
        if(quantasTelas <= this.stackReturn.size()){
            while(quantasTelas > 1){
                this.stackReturn.pop();
                quantasTelas--;
            }
            InterfaceUsuario anterior = this.stackReturn.pop();
            this.getPalco().setScene(anterior.obterCena());   
            this.actualWindow = anterior;
            return;
        }
        System.err.println("Numero de retornos maior que o tamanho da pilha");       
    }
    
    
    public void abreEmPopup(InterfaceUsuario novaJanela){
        Stage popUp = new Stage();
        popUp.setScene(novaJanela.obterCena());
    }
    
}
