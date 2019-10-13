
public class Financiamento {
	private double valorFinanciado;
	private double taxaDeJuros;
	private int tempoDeFinanciamento;
	
	public Financiamento(double valor, double taxa, int tempo) {
		this.valorFinanciado = valor;
		this.taxaDeJuros = taxa/100;
		this.tempoDeFinanciamento = tempo;
	}
	
	public Object[][] gerarTabela() {
		return null;
		
	}

	public double getValorFinanciado() {
		return valorFinanciado;
	}

	public boolean setValorFinanciado(double valorFinanciado) {
		if(valorFinanciado > 0) {
		this.valorFinanciado = valorFinanciado;
		return true;
	}
		return false;
	}

	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public boolean setTaxaDeJuros(double taxaDeJuros) {
		if(taxaDeJuros > 0) {
			this.taxaDeJuros = taxaDeJuros;
			return true;
		}
			return false;
	}

	public int getTempoDeFinanciamento() {
		return tempoDeFinanciamento;
	}

	public boolean setTempoDeFinanciamento(int tempoDeFinanciamento) {
		if(tempoDeFinanciamento > 0) {
			this.tempoDeFinanciamento = tempoDeFinanciamento;
			return true;
		}
			return false;
		
	}

	public double calcularPrestacaoMes(double valorFinaciado, int mes) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
