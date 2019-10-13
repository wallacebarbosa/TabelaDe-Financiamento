import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;
import javax.swing.border.BevelBorder;

public class TelaInicial extends JFrame {

	private JFrame frame;
	private JFrame frameTabela;
	JFormattedTextField textField_1;
	private boolean selectBtnSAC = false;
	private boolean selectBtnPRICE = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws ParseException 
	 */
	
	
	public TelaInicial() throws ParseException {
		initialize();
		formatNumber();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException {
		JButton btnPrice = new JButton("PRICE");
		JButton btnSac = new JButton("SAC");
		
		frame = new JFrame();
		
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 221, 371);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		panel.setBackground(new Color(204, 0, 0));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		/** Barra esquerda 
		 * 
		 */
		

		//JbuttonSac
		
		btnSac.setFocusable(false);
		btnSac.setFont(new Font("Arial", Font.PLAIN, 11));
		btnSac.setBorder(null);
		btnSac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectBtnSAC == false) { 
					btnSac.setBackground(new Color(255, 250, 0));
					btnPrice.setBackground(new Color(255, 255, 255));
					selectBtnPRICE = false;
					selectBtnSAC = true;
					} else {
						
				if(selectBtnSAC == true) {
					btnSac.setBackground(new Color(255, 255, 255));
					selectBtnSAC = false;
				}
					}	
				
			}
		});
		btnSac.setBackground(new Color(255, 255, 255));
		btnSac.setOpaque(true);
		btnSac.setBounds(67, 123, 89, 33);
		panel.add(btnSac);
		
		//JbuttonPrice
		btnPrice.setFocusable(false);
		btnPrice.setFont(new Font("Arial", Font.PLAIN, 11));
		btnPrice.setBorder(null);
		btnPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectBtnPRICE == false) { 
					btnPrice.setBackground(new Color(255, 250, 0));
					btnSac.setBackground(new Color(255, 255, 255));
					selectBtnPRICE = false;
					selectBtnPRICE = true;
					} else {
						
				if(selectBtnPRICE == true) {
					btnPrice.setBackground(new Color(255, 255, 255));
					selectBtnPRICE = false;
				}
					}	
				
			}
		});
		btnPrice.setBackground(new Color(255, 255, 255));
		btnPrice.setBounds(67, 169, 89, 33);
		panel.add(btnPrice);
		
		Label label = new Label("Selecione o tipo \r\nde \r\nfinanciamento");
		label.setFont(new Font("Arial", Font.PLAIN, 13));
		label.setBounds(11, 53, 198, 47);
		panel.add(label);
		label.setForeground(Color.WHITE);
		label.setBackground(new Color(204, 0, 0));
		
		/** fim
		 * 
		 */
		
		JLabel lblValorDoFinanciamento = new JLabel("Valor do financiamento");
		lblValorDoFinanciamento.setBounds(319, 75, 132, 14);
		lblValorDoFinanciamento.setFont(new Font("Arial", Font.PLAIN, 13));
		frame.getContentPane().add(lblValorDoFinanciamento);
		
		NumberFormat format = NumberFormat.getInstance();
	    NumberFormatter formatter = new NumberFormatter(format);
	    formatter.setValueClass(Integer.class);
	    formatter.setMinimum(0);
	    formatter.setMaximum(Integer.MAX_VALUE);
	    formatter.setAllowsInvalid(false);
	    // If you want the value to be committed on each keystroke instead of focus lost
	    formatter.setCommitsOnValidEdit(true);
	    
	    JFormattedTextField textField = new JFormattedTextField(formatter);
		textField.setBounds(284, 90, 202, 28);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBorder(null);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(274, 120, 221, 2);
		separator.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(separator);
		
		JLabel lblTaxaDeJuros = new JLabel("Taxa de juros");
		lblTaxaDeJuros.setBounds(344, 137, 81, 14);
		lblTaxaDeJuros.setFont(new Font("Arial", Font.PLAIN, 13));
		frame.getContentPane().add(lblTaxaDeJuros);
		
		
	    
	    
	      
	      
	    
		//rate field
	    textField_1 = new JFormattedTextField();
		textField_1.setBounds(309, 151, 151, 31);
		
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBorder(null);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(298, 183, 173, 2);
		separator_1.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel = new JLabel("Tempo de financiamento (Em meses):");
		lblNewLabel.setBounds(274, 199, 221, 28);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		frame.getContentPane().add(lblNewLabel);
		
		JFormattedTextField textField_2 = new JFormattedTextField(formatter);
		textField_2.setBounds(342, 221, 86, 31);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBorder(null);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnGerarTabela = new JButton("Gerar tabela");
		btnGerarTabela.setBounds(332, 292, 105, 33);
		btnGerarTabela.setFocusable(false);
		btnGerarTabela.setFont(new Font("Arial", Font.PLAIN, 12));
		btnGerarTabela.setForeground(Color.WHITE);
		btnGerarTabela.setBackground(Color.DARK_GRAY);
		btnGerarTabela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(selectBtnSAC == true) {
					Financiamento a = new SAC((int)textField.getValue(),(int)textField_1.getValue(),(int)textField_2.getValue());
					new telaTabela(a.gerarTabela()).setVisible(true);
							
				} else {
				if(selectBtnPRICE == true) {
					Financiamento a = new PRICE((int)textField.getValue(),(int)textField_1.getValue(),(int)textField_2.getValue());
					new telaTabela(a.gerarTabela()).setVisible(true);
					
					
				} else {
					JOptionPane.showMessageDialog(null, "Selecione o tipo de Financiamento");
				}
					}
			}
		});
		btnGerarTabela.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnGerarTabela.setOpaque(true);
		frame.getContentPane().add(btnGerarTabela);
		
		JButton btnPre = new JButton("Calcular Presta\u00E7\u00E3o");
		btnPre.setBounds(574, 169, 137, 33);
		btnPre.setFocusable(false);
		btnPre.setBackground(new Color(255, 153, 51));
		btnPre.setBorder(null);
		btnPre.setForeground(Color.WHITE);
		btnPre.setFont(new Font("Arial", Font.PLAIN, 13));
		btnPre.setOpaque(true);
		frame.getContentPane().add(btnPre);
		
		JButton btnCalcularAmortizao = new JButton("Calcular Amortiza\u00E7\u00E3o");
		btnCalcularAmortizao.setBounds(574, 125, 137, 33);
		btnCalcularAmortizao.setFocusable(false);
		btnCalcularAmortizao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalcularAmortizao.setBackground(new Color(255, 153, 51));
		btnCalcularAmortizao.setForeground(Color.WHITE);
		btnCalcularAmortizao.setBorder(null);
		btnCalcularAmortizao.setFont(new Font("Arial", Font.PLAIN, 13));
		btnCalcularAmortizao.setOpaque(true);
		frame.getContentPane().add(btnCalcularAmortizao);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(332, 252, 106, 2);
		separator_2.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(separator_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(221, 0, 549, 371);
		frame.getContentPane().add(panel_1);
		btnPre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.setBounds(100, 100, 786, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void formatNumber() {
		try {
			MaskFormatter mask = new MaskFormatter("##########################%");
			mask.setValidCharacters("1234567890.");
			mask.install(textField_1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
