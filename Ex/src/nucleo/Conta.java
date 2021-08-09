package nucleo;
		
public class Conta {
	protected String nomeTitular;
	protected String cpf;
	int nroconta;
	double saldo;
	
	public String toString() {
		String info = "Nome: " + nomeTitular + "\nCPF: " + cpf + "\nCc: "+nroconta + "\nR$" + saldo;
		return info;
	}
	
	
	
	public Conta(String nomeTitular, String cpf, int nroconta) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.nroconta = nroconta;
		this.saldo = 0;
	}



	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNroconta() {
		return nroconta;
	}

	public void setNroconta(int nroconta) {
		this.nroconta = nroconta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean dbitar (double valor) {
		if (valor > saldo) {
			return true;
		}
		saldo = saldo - valor;
		return false;
	}
	
	public void creditar(double valor) {
		saldo = saldo + valor;
	}
	
}
