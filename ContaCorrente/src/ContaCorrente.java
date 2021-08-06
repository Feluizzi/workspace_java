
public class ContaCorrente {
	private int numeroconta, digito;
	private String nometit, cpftit;
	private double saldo;

	
	// GETS AND SETS
	public void setAll (int numeroconta, int digito, String nometit, String cpftit, double saldo) {
		this.numeroconta = numeroconta;
		this.digito = digito;
		this.nometit = nometit;
		this.cpftit = cpftit;
		this.saldo = saldo;
	}
	
	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public String getNometit() {
		return nometit;
	}

	public void setNometit(String nometit) {
		this.nometit = nometit;
	}

	public String getCpftit() {
		return cpftit;
	}

	public void setCpftit(String cpftit) {
		this.cpftit = cpftit;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

// METODOS MANEIROS
	
	public void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Valor depositado na C/C: R$" + valor);
	}

	public String exibirInfo() {
		return "\nC/C: " + numeroconta + " - " + digito + "\n Titular: " + nometit + "\n" + cpftit + "\n Saldo: R$ "
				+ saldo;
	}

	public boolean sacar(double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			//System.out.println("Valor sacado: R$" + valor);
			return true;
		}
		//System.out.println("Valor solicitado maior que saldo atual");
		return false;

	}

}
