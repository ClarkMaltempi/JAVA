package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;

public class Sobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre frame = new Sobre();
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
	public Sobre() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JLabel lblSobre = new JLabel("Sobre");
		menuBar.add(lblSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lbl1 = new JLabel("Clark Maltempi");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblMarilene = new JLabel("Marilene");
		lblMarilene.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lbl1_1_1 = new JLabel("Karine");
		lbl1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lbl1_1_1_1 = new JLabel("Luis");
		lbl1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JTextPane txtpnEsteUm = new JTextPane();
		txtpnEsteUm.setBackground(SystemColor.controlHighlight);
		txtpnEsteUm.setEditable(false);
		txtpnEsteUm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnEsteUm.setText("Este é um projeto de conclusão da disciplina de POO, onde foram aplicados os conceitos abordados durante o semestre, como classes, objetos, herança, polimorfismo e encapsulamento.");
		
		JLabel lblInteg = new JLabel("Integrantes:");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblInteg)
						.addComponent(lbl1)
						.addComponent(lblMarilene, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl1_1_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl1_1_1_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtpnEsteUm, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(62, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnEsteUm, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lblInteg)
					.addGap(13)
					.addComponent(lbl1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblMarilene, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbl1_1_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbl1_1_1_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
