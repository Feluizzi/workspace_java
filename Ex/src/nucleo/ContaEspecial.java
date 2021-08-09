package nucleo;
public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(String nomeTitular, String cpf, int nroconta, double limite) {
		super(nomeTitular, cpf, nroconta);
		this.limite = limite;
	}

	public String toString() {
		String info = "Nome: " + nomeTitular + "\nCPF: " + cpf + "\nCc: " + nroconta + "\nR$" + saldo + "\n limite: R$"
				+ String.format("%.2f", limite);
		return info;
	}

	public boolean debitar(double valor) {
		if (valor < (saldo + limite)) {
			saldo = saldo - valor;
			return true;
		} else
			return false;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
