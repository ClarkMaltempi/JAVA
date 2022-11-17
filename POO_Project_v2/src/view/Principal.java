package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.text.MaskFormatter;



import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.DropMode;


//Classe Main herda as funcionalidades do JFrame
public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textEmail;
	private int id, indexCliente;
	private String nome, email, cpf, sexo;
	ArrayList<Cliente> listaClientes = new ArrayList<>();
	private JTable table;
	private int linha=0;
	private JTextField textBusca;
	private JTextField textConsultaNome;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 
	 */
	public Principal() throws ParseException {
		setTitle("Cadastro de Cliente");//Adicionando a Exceção para implementar a máscara e edição do FormatedText
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 807);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSair = new JMenu("Sair");
		menuBar.add(mnSair);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sair");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(ABORT);
			}
		});
		mnSair.add(mntmNewMenuItem);
		
		//Instancia o Menu 
		JMenu mnSobre = new JMenu("Sobre");
		mnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		menuBar.add(mnSobre);
		
		//Instancia o Item do Menu
		
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		tabbedPane.addTab("Cadastro Cliente", null, panel, null);
		
		JSeparator separator = new JSeparator();
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textNome = new JTextField();
		textNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
		comboBox.setToolTipText("");
		
		JButton btnCadastrar = new JButton("Cadastrar");
		JButton btnBusca = new JButton("Buscar");
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		
		//Campo CPF***************************************************************************************************
		//Adicionado uma máscara no campo CPF para limitar a quantidade de dígitos
		MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
		
		JFormattedTextField Textcpf = new JFormattedTextField(mascaraCpf);
		Textcpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//Executa a Mascara
			}
		});
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblStatusCliente = new JLabel("_");
		
		JScrollPane scrollPane = new JScrollPane();
		JButton btnAtualizar = new JButton("Atualizar");
		
		JLabel lblCadastorDeCliente = new JLabel("Cadastor de Cliente");
		lblCadastorDeCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(76)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNome)
								.addComponent(lblEmail)
								.addComponent(lblSexo)
								.addComponent(lblCPF, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
								.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
								.addComponent(textNome, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
								.addComponent(Textcpf, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblCadastorDeCliente, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblStatusCliente, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblStatus))
							.addGap(499))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(314)
							.addComponent(btnCadastrar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnAtualizar)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblStatus)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblStatusCliente)
					.addGap(25)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(lblCadastorDeCliente, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(55)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(textNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCPF, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(Textcpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSexo)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCadastrar)
						.addComponent(btnAtualizar))
					.addGap(36)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setForeground(new Color(255, 255, 255));
		table.setBackground(new Color(64, 128, 128));
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "Nome", "CPF", "Email", "Sexo"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(192, 192, 192), null));
		panel.setLayout(gl_panel);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Cadastro Produto", null, panel_2, null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		textBusca = new JTextField();
		textBusca.setColumns(10);
			
		textConsultaNome = new JTextField();
		textConsultaNome.setColumns(10);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(textBusca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBusca))
						.addComponent(textConsultaNome, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textBusca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBusca))
					.addGap(33)
					.addComponent(textConsultaNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(487, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		tabbedPane.setEnabledAt(1, true);
		
		
		//Botão Cadastrar****************************************************************************************************
			
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cliente c = new Cliente(); 
				
				id = listaClientes.size() + 1;
				c.setId(id);	
				
				nome = textNome.getText();
				c.setNome(nome);
				
				email = textEmail.getText();
				c.setEmail(email);
				
				cpf = Textcpf.getText();
				c.setCpf(cpf);
				
				sexo = comboBox.getSelectedItem().toString();//Seleciona o Item do Combo box, Converte para String
				c.setSexo(sexo);
			
				listaClientes.add(c);
				
				
				
				//Inserir Tabela
				table.setValueAt(id, linha, 0);
				table.setValueAt(nome, linha, 1);
				table.setValueAt(cpf, linha, 2);
				table.setValueAt(email, linha, 3);
				table.setValueAt(sexo, linha, 4);
								
				//Deixando em Branco
				textNome.setText(null);
				textEmail.setText(null);
				textEmail.setText(null);
				Textcpf.setText(null);
				
				linha++;
				
				//Exibe Mensagem na tela
				JOptionPane.showMessageDialog(null,"Cliente Cadastrado com Sucesso!");
				lblStatusCliente.setText("Clientes Cadastrados ["+c.getId()+"]");
			}
		});
		
		//Atualizar Tabela
		
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		
		btnBusca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
		});
		
		
		
	}
}