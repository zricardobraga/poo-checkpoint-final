import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Venda {
    private int id;
    private Cliente cliente;
    private String data;
    private Double valor;
    private ArrayList<String> exemplares;

    public Venda(int id, Cliente cliente, String data, Double valor, ArrayList<String> exemplares) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        this.valor = valor;
        this.exemplares = exemplares;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public ArrayList<String> getExemplares() {
        return exemplares;
    }

    public void setExemplares(ArrayList<String> exemplares) {
        this.exemplares = exemplares;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nCliente: " + cliente + "\nData: " + data + "\nValor: " + valor + "\nExemplar(es): " + exemplares;
    }
}
