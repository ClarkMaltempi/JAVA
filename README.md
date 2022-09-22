# JAVA
Project in language JAVA




<h2>Indice</h2></br>
<a href="#Sobre">Sobre</a></br>
<a href="#Implementacao">Implementacao</a></br>
<a href="#Cliente-Servidor-Web">Cliente-Servidor Web</a></br>
<a href="#Cliente-Servidor">Cliente-Servidor</a></br>
<a href="#53_Exe_Java">53 Exercicios em Java</a></br>

# Sobre

>Principais conceitos trabalhados com a linguagem JAVA
>Em construção
<p> Esse repositório contém exemplos de implementações e principais metodologias abordados pela linguagem


# Implementacao

# Tela
>Description

<p> Essa implantação consiste na construção de uma tela Windows form, onde simula uma inserção de dados de uma Pessoa física ou Jurídica, onde sua respectiva saída exibe os dados inseridos no console.

<p> Segue classe principal Informa dados

```java

//informa dados
import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

public class Informa_dados extends JFrame implements ActionListener {


Dados_Contribuinte receita = new Dados_Contribuinte();


JLabel L1, L2, L3, L4, L5; 
JButton B1;

JTextField T1, T2, T3, T4;

JCheckBox C1, C2;

boolean j1, j2;

String a, b, c, d;

public static void main (String [] args) {

JFrame janela = new Informa_dados();

janela.show();

WindowListener x = new WindowAdapter()

	{ public void windowClosing (WindowEvent fecha)
			{System.exit(0);}
	};
janela.addWindowListener(x);

/* sendo a variavel de instancia =“ a “

a.setNome("Daniela Bento");

a.setCPF("@65.887.443-54");

a.setCNPJ("776 998 /0001");

33 a.setCartao("9776-]");

34 System.out.println("nome do contribuinte " + a.getNome());

35 System.out.println¢"CPF do contribuinte " + a.getCPF());

36 System.out.printin("CNPJ do contribuinte " + a.getCNPJ());

37 System.out.println("cartaéo do contribuinte " + a.getCartao());

38 */
}

//Método, Construtor.

Informa_dados() {
	setTitle("PROTOTIPO DE ENGENHARIA DE SOFTWARE III");
	setSize (800,400);

	getContentPane().setBackground (new Color (200,200, 200));
	getContentPane().setLayout (new GridLayout(6,2));
	L1 = new JLabel("Identificacao");
	L1.setForeground(Color.green) ;
	L1.setFont(new Font(" ",Font.BOLD,14));
	L2 = new JLabel("CPF");
	L2.setForeground(Color.green) ;
	L2.setFont(new Font(" ",Font.BOLD,14));
	L3 = new JLabel("CNPJ");
	L3.setForeground(Color.green);
	L3.setFont(new Font(" ",Font.BOLD,14));
	L4 = new JLabel("Cartao");
	L4.setForeground(Color.green) ;
	L4.setFont(new Font(" ",Font.BOLD,14));
	L5 = new JLabel("");
	L5.setForeground(Color.gray) ;

	T1 = new JTextField();
	T1.setBackground(Color.white) ;
	T1.setForeground(Color.black);
	T2 = new JTextField();
	T2.setBackground(Color.white) ;
	T2.setForeground(Color.black);
	T3 = new JTextField();
	T3.setBackground(Color.white) ;
	T3.setForeground(Color.black);
	T4 = new JTextField();
	T4.setBackground(Color.white) ;
	T4.setForeground(Color.black);
	C1 = new JCheckBox("Pessoa Fisica");
	C2 = new JCheckBox("Pessoa Juridica");
	B1 = new JButton("leitura de dados");
	B1.setBackground(Color.white) ;
	B1.setForeground(Color. blue) ;
	B1.addActionListener(this) ;
	
	getContentPane().add(T1);
	getContentPane().add(L1); 
	getContentPane().add(T2);
	getContentPane().add(L2);
	getContentPane().add(T3); 
	getContentPane().add(L3);
	getContentPane().add(T4); 
	getContentPane().add(L4);
	getContentPane().add(C1);
	getContentPane().add(C2);
	getContentPane().add(B1);
	getContentPane().add(L5);
//fim do Método Construtor
}
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==B1) {
			a = T1.getText();
			b = T2.getText();
			c = T3.getText();
			d = T4.getText();
			j1 = C1.isSelected();
			j2 = C2.isSelected();
			informa_dados();
}
}

	public void informa_dados() {
		receita.setNome(a);
		receita.setCPF(b);
		receita.setCNPJ(c);
		receita.setCartao(d);
		System.out.println("IDENTIFICACAO DO CONTRIBUINTE\t" + receita.getNome());
		System.out.println("CARTAO DO CONTRIBUINTE OU EMPRESA\t" + receita.getCartao());
		if (j1 == true)
		System.out.println("CPF DO CONTRIBUINTE\t" + receita.getCPF());
		if (j2 == true)
		System.out.println("CNPJ DO CONTRIBUINTE\t" + receita.getCNPJ());
		}
	//fim do métedo informa_dados()

}

```


<p> Estrutura Abstração

```java

//dados_contribuinte
public class Dados_Contribuinte {

		private String nome;
		private String CPF;
		private String CNPJ;
		private String cartao;
		
		public void setNome (String nome) {
			this.nome = nome; }
		
		public void setCPF (String CPF) {
			this.CPF = CPF; }
		
		public void setCNPJ(String CNPJ) {
			 this.CNPJ = CNPJ; }
		
		public void setCartao(String cartao) {
			 this.cartao = cartao; }
			
			 public String getNome () {
			 return nome; }
			
			 public String getCPF() {
			 return CPF; }
			
			 public String getCNPJ() {
			 return CNPJ; }
			
			 public String getCartao() {
			 return cartao; }
}



```
	
	
# Cliente-Servidor-Web
>Description

<p> Essa implantação consiste na construção de uma conexão cliente-servidor que obtem uma resposta e exibe o resultado via console
	
	
```java
	
import java.io.*;
import java.net.*;

public class cliente_web {

	public static void main (String [] args) {
		try {

			Socket s = new Socket ("time-A.timefreq.bldrdoc.gov",13);
			BufferedReader entrada = new BufferedReader (new InputStreamReader (s.getInputStream()));
			boolean adiciona = true;
			while (adiciona){
				String linha = entrada.readLine();
				if (linha == null) adiciona = false;
				else
					System.out.println(linha);
				}
			}catch (IOException exc) {System.out.println ("erro =" + exc);}
		}
}	
	
	
	
```
	
# Cliente-Servidor
	
>Description
	
<p> Criar um projeto em Java para disponibilizar um Serviço (Server) para acesso, utilizando a propria rede local, onde inicialmente a execução start 
<p> run do código em sequencia, o comportamento é esperar uma requisição e devolver um numero 12 (conectado com sucesso)
	
	
```java
	
import java.net.*;
import java.io.*;


public class ServidorTCPNumero {

	public static void main(String[] args) {
		
	int porta = 12258;
	
	try {
		
		ServerSocket servidor = new ServerSocket (porta, 2);
		Socket conexao = servidor.accept();
		
		DataOutputStream saida = new DataOutputStream (conexao.getOutputStream());
		SocketAddress s = conexao.getRemoteSocketAddress();
		System.out.println("Enviando numero ao cliente: "+s.toString());
		saida.writeInt(12);
		
		conexao.close();
		
		
	}catch(Exception exc) {
		
		System.out.println(exc.toString());
		
	}	
		
		
	}

}
	
	
	

```	
	
<p> Codigo simulação Cliente

```java

import java.net.*;
import java.io.*;

public class ClienteTCPNumero {
	
public static void main (String numero[]) {	
	String enderecoServidor = "127.0.0.1";
	int portaServidor = 12258;
	
	try {
		
		
		Socket conexao = new Socket (enderecoServidor, portaServidor);
		
		DataInputStream entrada = new DataInputStream (conexao.getInputStream());
		System.out.println("Numero recebido: "+entrada.readInt());
		
		
		
		conexao.close();
		
		
	}catch (Exception exc)
	{
		
		System.out.println(exc.toString());
		
		
	}
	
	
}
	

}
		
```	


# 53_Exe_Java




```java






```

<p align="center">
  <img src="https://github.com/ClarkMaltempi/JAVA/image/imgEx_ClasseClienteXContaBancaria.png" width="350" title="hover text">
  <img src="your_relative_path_here_number_2_large_name" width="350" alt="accessibility text">
</p>
