
public class PRICE extends Financiamento implements Calculavel{

	private final double VALOR_PRESTACAO;
	public PRICE(double valor, double taxa, int tempo) {
		super(valor, taxa, tempo);
		// TODO Auto-generated constructor stub
		this.VALOR_PRESTACAO = valor * ((Math.pow(1 + taxa, tempo)*taxa)/(Math.pow(1 + taxa, tempo)-1));
	}
	
	public double saldoDevedor(double valorFinaciado ,int mes) {
	       if(mes == 0) {
				
				return valorFinaciado;
			} else {
				valorFinaciado = valorFinaciado - (VALOR_PRESTACAO - valorFinaciado*(getTaxaDeJuros()));
				return saldoDevedor(valorFinaciado, mes - 1);
			}
		}
	
	@Override
	public double calcularPrestacaoMes(double valorFinaciado, int mes) {	
		
		return VALOR_PRESTACAO;
		
	}
	@Override
	public double calcularAmortizacao(double valorFinaciado, int mes) {
		if(mes == 1) {
			return VALOR_PRESTACAO - (valorFinaciado*getTaxaDeJuros());
		} else {
			valorFinaciado = valorFinaciado - (VALOR_PRESTACAO - valorFinaciado*(getTaxaDeJuros()));
			return calcularAmortizacao(valorFinaciado, mes - 1);
		}
	}
	
	@Override
	public Object[][] gerarTabela() {
		double saldo;
		double totalAmortizacao = 0;
		double totalJuros = 0;
		double amortizacao;
		int tempo = getTempoDeFinanciamento();
		double juros = getTaxaDeJuros();
		Object[][] dados = new Object[tempo+3][5];
		
		for(int i = 0; i < tempo ; i++){
			
			saldo = saldoDevedor(getValorFinanciado(), i);
			amortizacao = calcularAmortizacao(getValorFinanciado(), i+1);
			
			dados[i+1][0] = i+1;
			dados[i+1][1] = VALOR_PRESTACAO;
			dados[i+1][3] = amortizacao;
			dados[i+1][2] = saldo*juros;
			dados[i][4] = saldo;
			
			totalAmortizacao += amortizacao;
			totalJuros +=saldo*juros;
			
				
			
		}
		
		dados[tempo+2][0] = "Total";
		dados[tempo+2][1] = VALOR_PRESTACAO*tempo;
		dados[tempo+2][2] = totalAmortizacao;
		dados[tempo+2][3] = totalJuros;
		return dados;
		
	}

}
