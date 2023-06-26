import java.util.ArrayList;

public abstract class Exemplar {
    private String nome;
    private String editora;
    private int edicao;

    public Exemplar(String nome, String editora, int edicao) {
        this.nome = nome;
        this.editora = editora;
        this.edicao = edicao;
    }

    public ArrayList<String> listarExemplares(ArrayList<Exemplar> exemplares){
        ArrayList<String> lista = new ArrayList<String>();
        for (Exemplar e :exemplares) {
            String dado = e.nome + " - Ed:" + e.edicao;
            lista.add(dado);
        }
        return lista;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nEditora: " + editora + "\nEdição:  " + edicao;
    }
}
