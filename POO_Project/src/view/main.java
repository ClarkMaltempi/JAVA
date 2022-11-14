package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import java.util.*;
import java.awt.Color;
import java.awt.Font;

public class main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private boolean status;
	private int id;
	private String nome, email;
	ArrayList<Cliente> listaClientes = new ArrayList<>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JInternalFrame PaneInterno = new JInternalFrame("Cadastro");
		PaneInterno.setVisible(true);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(PaneInterno, GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(PaneInterno, GroupLayout.PREFERRED_SIZE, 506, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		
		JButton btnCadastro = new JButton("Cadastrar");//Instancia Botão Cadastro
		
		
		JLabel lblNome = new JLabel("Nome:");
		
		JLabel lblEmail = new JLabel("Email:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLayeredPane layeredPane = new JLayeredPane();
		JButton btnExibir = new JButton("Exibir"); //Instanciando o Botão Exibir
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 18));
		GroupLayout groupLayout = new GroupLayout(PaneInterno.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(textArea, Alignment.LEADING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCadastro)
								.addComponent(lblEmail)
								.addComponent(lblNome))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, 302, 302, 302)
								.addComponent(btnExibir))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(layeredPane))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(54)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNome))
							.addGap(10)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEmail)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnCadastro)
								.addComponent(btnExibir))))
					.addGap(18)
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblStatus = new JLabel("_");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStatus.setForeground(new Color(255, 0, 0));
		lblStatus.setBounds(10, 11, 248, 14);
		layeredPane.add(lblStatus);
		PaneInterno.getContentPane().setLayout(groupLayout);
		contentPane.setLayout(gl_contentPane);
		
		PaneInterno.setVisible(false);
		//item menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOpes = new JMenu("Opções");
		menuBar.add(mnOpes);
		
		
		if(listaClientes.isEmpty()) {
			lblStatus.setText("Nenhum Item Cadastrado!");
		}
		
		//Torna o Form Visível
		JMenuItem ItemCadastro = new JMenuItem("Cadastro");
		ItemCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PaneInterno.setVisible(true);
			}
		});
		mnOpes.add(ItemCadastro);
		
		
		//Botão Cadastro
		
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cliente c = new Cliente(); 
				id = listaClientes.size() + 1;
				c.setId(id);	
				
				nome = textField.getText();
				c.setNome(nome);
				email = textField_1.getText();
				c.setEmail(email);
				
				listaClientes.add(c);
				
				textField.setText(null);
				textField_1.setText(null);
				
				JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso!");
				lblStatus.setText("Clientes Cadastrados ["+c.getId()+"]");
				
			}
		});
		
		
		
		//Botão Exibir
		
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
			for(Cliente a: listaClientes) {
						
				textArea.setText(a.getId()+"\n"+a.getNome()+"\n"+a.getEmail());   
				//("\n\nID %d \nNome:%s \nEmail:%s\n",a.getId(), a.getNome(), a.getEmail());
			}
					
				
			}
		});
		
		
		
		
		
	}
}
