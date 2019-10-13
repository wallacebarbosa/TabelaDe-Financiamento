import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class telaTabela extends JFrame{

	
	private JTable table;
	private Object dados [][];
	private String [] COLUNAS = {"N. Parcelas", "Prestação", "Juros", "Armotização", "Saldo Devedor"}; 
	




	
	 
	public telaTabela(Object dados [][]) {
		this.dados = dados;
		iniTelaTable();
		
	}
	
	public void iniTelaTable() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initialize();
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public telaTabela() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		new JFrame();
		setVisible(true);
		setBounds(100, 100, 720, 391);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		table = new JTable(dados,COLUNAS);
		//table = new JTable();
		
		table.setColumnSelectionAllowed(true);
		table.setEnabled(false);
		table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table.setBackground(SystemColor.window);
		table.setBounds(101, 23, 487, 283);

		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(100, 149, 237));
		panel.setBounds(0, 0, 704, 341);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane(table);
		scrollPane_1.setBorder(new MatteBorder(4, 0, 0, 0, (Color) new Color(0, 0, 0)));
		scrollPane_1.setBounds(0, 69, 704, 284);
		panel.add(scrollPane_1);
		
		JLabel lblTabelaSac = new JLabel("Tabela SAC");
		lblTabelaSac.setFont(new Font("Arial", Font.BOLD, 16));
		lblTabelaSac.setHorizontalAlignment(SwingConstants.CENTER);
		lblTabelaSac.setBounds(196, 11, 311, 47);
		panel.add(lblTabelaSac);
	}
}


