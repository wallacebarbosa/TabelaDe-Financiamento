
public class SAC extends Financiamento implements Calculavel{
	private final double VALOR_AMORTIZA�AO;

	public SAC(double valor, double taxa, int tempo) {
		super(valor, taxa, tempo);
		// TODO Auto-generated constructor stub
		this.VALOR_AMORTIZA�AO = valor / tempo;
	}
	
	public double saldoDevedor(double valorFinaciado ,int mes) {
       if(mes == 0) {
			
			return valorFinaciado;
		} else {
			valorFinaciado = valorFinaciado - VALOR_AMORTIZA�AO;
			return saldoDevedor(valorFinaciado, mes - 1);
		}
	}

	@Override
	public double calcularPrestacaoMes(double valorFinaciado, int mes) {
		
		if(mes == 0) {
			
			return VALOR_AMORTIZA�AO + (valorFinaciado*getTaxaDeJuros());
		} else {
			valorFinaciado = valorFinaciado - VALOR_AMORTIZA�AO;
			return calcularPrestacaoMes(valorFinaciado, mes - 1);
		}
		
		
	}

	@Override
	public double calcularAmortizacao(double valorFinaciado, int mes) {
		// TODO Auto-generated method stub
		return VALOR_AMORTIZA�AO;
	}
	
	@Override
	public Object[][] gerarTabela() {
		
		double saldo;
		double totalPrestacao = 0;
		double totalJuros = 0;
		double prestacao;
		int tempo = getTempoDeFinanciamento();
		double juros = getTaxaDeJuros();
		Object[][] dados = new Object[tempo+3][5];
	
		for(int i = 0; i < tempo ; i++){
			
			saldo = saldoDevedor(getValorFinanciado(), i);
			prestacao = calcularPrestacaoMes(getValorFinanciado(), i+1);
			
			dados[i+1][0] = i+1;
			dados[i+1][1] = prestacao;
			dados[i+1][2] = saldo*juros;
			dados[i+1][3] = VALOR_AMORTIZA�AO;
			dados[i][4] = saldo;
			
			totalPrestacao += prestacao;
			totalJuros +=saldo*juros;
			
				
			
		}
		
		dados[tempo+2][0] = "Total";
		dados[tempo+2][1] = totalPrestacao;
		dados[tempo+2][2] = VALOR_AMORTIZA�AO*tempo;
		dados[tempo+2][3] = totalJuros;
		return dados;
		
	}
	

}
