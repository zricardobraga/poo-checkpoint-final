import java.util.ArrayList;
public class Funcionario extends Pessoa implements Buscar{
    private Double salarioBase;
    private Double bonus;
    private Double salarioTotal;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Funcionario(int id, String nome, String sobrenome, String cpf, Double salarioBase) {
        super(id, nome, sobrenome, cpf);
        this.salarioBase = salarioBase;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(Double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public void setFuncionarios(Funcionario funcionario){

        this.funcionarios.add(funcionario);
    }

    public Double atribuirBonus(Double bonus) {
        this.bonus = bonus;
        return this.salarioTotal = salarioBase + bonus;
    }

    public ArrayList<String> listarFuncionarios() {

        ArrayList<String> lista = new ArrayList<String>();

        for (Funcionario f : funcionarios) {
            String dado = f.getNome() + " " + f.getSobrenome();
            lista.add(dado);
        }
        return lista;
    }

    @Override
    public Pessoa buscarPorId(int id) {
        try {
            for (Funcionario f: funcionarios) {
                if (id == super.getId()){
                    return f;
                } else {
                    throw new PessoaException("O funcionário não existe");
                }
            }
        } catch (PessoaException pe) {
            System.err.println(pe.getMessage());
        }
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalário Base: " + salarioBase + "\nBônus: " + bonus + "\nSalário total: " + salarioTotal;
    }
}
