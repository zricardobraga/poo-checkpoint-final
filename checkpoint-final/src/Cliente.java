import java.util.ArrayList;
public class Cliente extends Pessoa implements Buscar {

	private Endereco endereco;
    private int telefone;

    private ArrayList<Cliente> clientes = new ArrayList<>();

	public Cliente(int id, String nome, String sobrenome, String cpf, Endereco endereco, int telefone) {
		super(id, nome, sobrenome, cpf);
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

	public void setClientes(Cliente cliente){

		this.clientes.add(cliente);
	}

	public ArrayList<String> listarClientes() {
        ArrayList<String> lista = new ArrayList<String>();
        for (Cliente c : clientes) {
            String dado = c.getNome() + " " + c.getSobrenome();
            lista.add(dado);
        }
        return lista;
    }

    @Override
    public Pessoa buscarPorId(int id) {
		try {
			for (Cliente c: clientes) {
				if (id == super.getId()){
					return c;
				} else {
					throw new PessoaException("O cliente não existe");
				}
			}
		} catch (PessoaException pe) {
			System.err.println(pe.getMessage());
		}
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEndereço: " + endereco + "\nTelefone: " + telefone;
    }
}
