package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class Exibir extends JFrame {

	private JPanel PExibirCliente;
	private JTextField textIDConsulta;
	private JTextField textNomeConsulta;
	private JTextField textEmailConsulta;
	private JTextField textCPFConsulta;
	private JTextField textSexoConsulta;
	private JTextField textBuscaID;
	private int id, indexCliente;
	private Principal Principal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exibir frame = new Exibir();
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
	public Exibir() {
		setTitle("Exibir Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		PExibirCliente = new JPanel();
		PExibirCliente.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PExibirCliente);
		
		JLabel lbl1 = new JLabel("ID: ");
		lbl1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNomeConsulta = new JLabel("Nome:");
		lblNomeConsulta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomeConsulta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textIDConsulta = new JTextField();
		textIDConsulta.setEditable(false);
		textIDConsulta.setColumns(10);
		
		textNomeConsulta = new JTextField();
		textNomeConsulta.setEditable(false);
		textNomeConsulta.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textEmailConsulta = new JTextField();
		textEmailConsulta.setEditable(false);
		textEmailConsulta.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textCPFConsulta = new JTextField();
		textCPFConsulta.setEditable(false);
		textCPFConsulta.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textSexoConsulta = new JTextField();
		textSexoConsulta.setEditable(false);
		textSexoConsulta.setColumns(10);
		
		textBuscaID = new JTextField();
		textBuscaID.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar ID");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Cliente c = new Cliente();
					
					id = Integer.parseInt(textBuscaID.getText());
					
					indexCliente = -1;
					
					for(Cliente cliente: Principal.listaClientes) {
		                if (cliente.getId() == id) {
		                	indexCliente = Principal.listaClientes.indexOf(cliente);
		                    break;
		                }
		            }
					
					if(indexCliente != -1) {
						
						
						c = Principal.listaClientes.get(indexCliente);
						
						textIDConsulta.setText(Integer.toString(c.getId()));
						textNomeConsulta.setText(c.getNome());
						textCPFConsulta.setText(c.getCpf());
						textEmailConsulta.setText(c.getEmail());
						textSexoConsulta.setText(c.getSexo());
						
					}else {
						
						JOptionPane.showMessageDialog(null,"Cliente não Encontrado!");
					}
					
					
					
					
				
				
				
				
				
			}
		});
		
		GroupLayout gl_PExibirCliente = new GroupLayout(PExibirCliente);
		gl_PExibirCliente.setHorizontalGroup(
			gl_PExibirCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PExibirCliente.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_PExibirCliente.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PExibirCliente.createSequentialGroup()
							.addGroup(gl_PExibirCliente.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNomeConsulta)
								.addComponent(lbl1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_PExibirCliente.createParallelGroup(Alignment.LEADING)
								.addComponent(textIDConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textNomeConsulta, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PExibirCliente.createSequentialGroup()
									.addComponent(textBuscaID, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton))))
						.addGroup(gl_PExibirCliente.createSequentialGroup()
							.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textEmailConsulta, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_PExibirCliente.createSequentialGroup()
							.addComponent(lblCpf, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textCPFConsulta, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_PExibirCliente.createSequentialGroup()
							.addComponent(lblSexo, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textSexoConsulta, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(185, Short.MAX_VALUE))
		);
		gl_PExibirCliente.setVerticalGroup(
			gl_PExibirCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PExibirCliente.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_PExibirCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(textBuscaID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(35)
					.addGroup(gl_PExibirCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(textIDConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl1))
					.addGap(30)
					.addGroup(gl_PExibirCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomeConsulta)
						.addComponent(textNomeConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_PExibirCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(textEmailConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_PExibirCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCpf, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(textCPFConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_PExibirCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSexo, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(textSexoConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(98, Short.MAX_VALUE))
		);
		PExibirCliente.setLayout(gl_PExibirCliente);
		
	
		
		
		
	}

}
