package aula15.Excessoes;

public class ExcessaoPersonalizada extends Exception {
	protected int linhaDoErro;

	public ExcessaoPersonalizada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExcessaoPersonalizada(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ExcessaoPersonalizada(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ExcessaoPersonalizada(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ExcessaoPersonalizada(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	public ExcessaoPersonalizada(String message, int linha) {
		super(message);
		linhaDoErro = linha;
	}

	public int getLinhaDoErro() {
		return linhaDoErro;
	}
	
}
