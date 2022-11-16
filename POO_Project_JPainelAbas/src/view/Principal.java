package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
//Classe Main herda as funcionalidades do JFrame
public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textEmail;
	private int id, indexCliente;
	private String nome, email, cpf, sexo;
	ArrayList<Cliente> listaClientes = new ArrayList<>();

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
	public Principal() throws ParseException {//Adicionando a Exceção para implementar a máscara e edição do FormatedText
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		//Instanciado o Item do menu Consulta Cliente
		JMenuItem MenuItemCliente_1 = new JMenuItem("Cliente");
		
		
		JMenuItem mntmProduto_1 = new JMenuItem("Produto");
		mnConsulta.add(mntmProduto_1);
		
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
		JMenuItem menuSobre = new JMenuItem("Sobre");
		menuSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Sobre frame = new Sobre();
				
				frame.setVisible(true);
				
			}
		});
		mnSobre.add(menuSobre);
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
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE))
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
							.addGap(334)
							.addComponent(btnCadastrar))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblStatusCliente, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblStatus))))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblStatus)
					.addGap(18)
					.addComponent(lblStatusCliente)
					.addGap(52)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
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
					.addGap(82)
					.addComponent(btnCadastrar)
					.addContainerGap(105, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Cadastro Produto", null, panel_2, null);
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
				
				//Deixando em Branco
				textNome.setText(null);
				textEmail.setText(null);
				//textEmail.setText(null);
				Textcpf.setText(null);
				
				//Exibe Mensagem na tela
				JOptionPane.showMessageDialog(null,"Cliente Cadastrado com Sucesso!");
				lblStatusCliente.setText("Clientes Cadastrados ["+c.getId()+"]");
			}
		});
		
		//Consulta
		
		MenuItemCliente_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Exibir frame = new Exibir();
				frame.setVisible(true);
				
				
			}
		});
		mnConsulta.add(MenuItemCliente_1);
		
		
		
	}
}
