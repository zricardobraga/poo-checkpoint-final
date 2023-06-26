import java.util.ArrayList;

public class Revista extends Exemplar {
    private String tema;

    public Revista(String nome, String editora, int edicao, String tema) {
        super(nome, editora, edicao);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTema: " + tema;
    }
}
