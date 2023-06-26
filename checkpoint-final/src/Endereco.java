public class Endereco {
    private String logradouro;
    private String num;
    private String bairro;
    private String cep;

    public Endereco(String logradouro, String num, String bairro, String cep) {
        this.logradouro = logradouro;
        this.num = num;
        this.bairro = bairro;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Logradouro: " + logradouro + "\nNúmero: " + num + "\nBairro: " + bairro + "\nCEP: " + cep;
    }
}
