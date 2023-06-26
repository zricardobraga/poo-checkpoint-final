public class PessoaException extends Exception{
	public PessoaException() {
	}

	public PessoaException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return getMessage();
	}
}
