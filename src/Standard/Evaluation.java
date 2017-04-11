package Standard ;

import java.util.ArrayList ;

public class Evaluation {
    
    // ------------------------------ ATRIBUTOS ----------------------------- //
    
    /** nome. */
    private String name ;
    /** disciplina. */
    private String discipline ;
    /** peso. */
    private double weight ;
    /** media. */
    private char average ;
    /** nota. */
    private double note ;
    /** identificador no arquivo. */
    private int fileID ;
    
    
    
    // -------------------------------- GETS -------------------------------- //
    
    /** @return nome */
    public String getName() {
        return this.name ;
    }

    /** @return disciplina */
    public String getDiscipline() {
        return this.discipline ;
    }

    /** @return peso */
    public double getWeight() {
        return this.weight ;
    }

    /** @return media */
    public char getAverage() {
        return this.average ;
    }

    /** @return nota */
    public double getNote() {
        return this.note ;
    }

    /** @return identificador no arquivo */
    public int getFileID() {
        return this.fileID ;
    }
    
    
    
    // -------------------------------- SETS -------------------------------- //
    
    /** @param name nome */
    public void setName(String name) {
        this.name = name ;
    }

    /** @param discipline disciplina */
    public void setDiscipline(String discipline) {
        this.discipline = discipline ;
    }

    /** @param weight peso */
    public void setWeight(double weight) {
        this.weight = weight ;
    }

    /** @param average media */
    public void setAverage(char average) {
        this.average = average ;
    }

    /** @param note media */
    public void setNote(double note) {
        this.note = note ;
    }

    /** @param fileID identificador no arquivo */
    public void setFileID(int fileID) {
        this.fileID = fileID ;
    }
    
    
    
    // --------------------------- OUTROS METODOS --------------------------- //
    
    /** ira gravar os valores de todos os atributos de uma avaliacao em um arquivo .csv. */
    public void save () {
        // ira gravar os valores de todos os atributos de uma avaliacao em um arquivo .csv
    }
    
    /** ira abrir o arquivo .csv de uma avaliacao e alterar os valores dos atributos e salvar novamente. */
    public void update () {
        // ira abir o arquivo .csv de uma avaliacao e alterar os valores dos atributos e salvar novamente
        // utilizado quando for informar a nota de uma avaliacao
    }
    
    /** ira retornar uma lista com todas as avaliacoes.*/
    public ArrayList<Evaluation> getEvaluationsList () {
        return null ;
        // ira ler do arquivo "Evaluations.csv" e retornar as avaliacoes
    }
    
    /** ira calcular a media (m1, m2 ou m3) de uma disciplina. */
    public double calculateDisciplineAverage (String discipline, char average) {
        return 0 ;
        // somatorio das notas e pesos das avalicoes em cada media (m1, m2 ou m3)
    }    
}
