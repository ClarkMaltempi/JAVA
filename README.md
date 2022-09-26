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


//1.	Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.

//IMPLEMENTAÇÃO:
AreaRetngulo 

//2.	Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.

//IMPLEMENTAÇÃO:
AreaQuadrada 

//3.	A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

//IMPLEMENTAÇÃO:
AreaTriangulo - CalcAreaTriangulo

//4.	Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.

//IMPLEMENTAÇÃO:
Media4Valores - MediaAritmetica

//5.	Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.

//IMPLEMENTAÇÃO:
CelsiusXFahrenhit-Exe5 - TransformarCelsiusXFahrenheit

//6.	Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).

//IMPLEMENTAÇÃO:	
Dolar -Exe6 -CalcularRealDolar

//7.	Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.

//IMPLEMENTAÇÃO:
Produtos- CalcProduto

//8.	Entrar via teclado, com dois valores distintos. Exibir o maior deles.

//IMPLEMENTAÇÃO:
MaiorValor.java

//9.	Entrar via teclado, com dois valores distintos. Exibir o menor deles.

//IMPLEMENTAÇÃO:
Exe09_MenorNum

//10.	Entrar com dois valores quaisquer. Exibir o maior deles, se existir, caso contrário, enviar mensagem avisando que os números são idênticos.

//IMPLEMENTAÇÃO:
Ex10testaValores.java

//11.	Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”.

//IMPLEMENTAÇÃO:
RetanguloDecisao.java

//12.	Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”, caso contrário, exibir a mensagem “Terreno pequeno”.

//IMPLEMENTAÇÃO:
Exe12RetTerr.java

//13.	Entrar via teclado com três valores distintos. Exibir o maior deles.

//IMPLEMENTAÇÃO:
Exe13_MaiorVal.java

//14.	Entrar com o peso e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².

//IMPLEMENTAÇÃO:
PesoIdeal.java

//15.	A partir de três valores que serão digitados, verificar se formam ou não um triângulo. Em caso positivo, exibir sua classificação: “Isósceles, escaleno ou //eqüilátero”. Um triângulo escaleno possui todos os lados diferentes, o isósceles, dois lados iguais e o eqüilátero, todos os lados iguais. Para existir triângulo é //necessário que a soma de dois lados quaisquer seja maior que o outro, isto, para os três lados.

//IMPLEMENTAÇÃO:
Triangulo.java

//16.	Verificar se três valores quaisquer (A, B, C) que serão digitados formam ou não um triângulo retângulo. Lembre-se que o quadrado da hipotenusa é igual a soma //dos quadrados dos catetos.

//IMPLEMENTAÇÃO:
IdTrianguloRetangulo.java

//17. Entrar com o peso, o sexo e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².

 
//IMPLEMENTAÇÃO:
FaixaPesoIdeal.java

//18. Criar um programa para analisar a velocidade de um automóvel. Solicitar via teclado os valores da aceleração (a em m/s2), velocidade inicial (v0 em m/s) e o //tempo de percurso (t em s). Calcular e exibir a velocidade final do automóvel em km/h. E exibir mensagem de acordo com a tabela abaixo:

//Fórmula para o cálculo da velocidade em m/s: V = v0 + a. t

//IMPLEMENTAÇÃO:
Exe18_VelVeiculo.java

//19. Uma escola com cursos em regime semestral, realiza duas avaliações durante o semestre e calcula a média do aluno, da seguinte maneira:

//MEDIA = (P1 + 2.P2) / 3

//Fazer um programa para entrar via teclado com os valores das notas (P1 e P2) e calcular a média. Exibir a situação final do aluno (“Aprovado ou Reprovado”), sabendo //que a média de aprovação é igual a cinco.

//IMPLEMENTAÇÃO:
Exe19_Media.java

//20. Uma escola com cursos em regime semestral realiza duas avaliações durante o semestre e calcula a média do aluno, da seguinte maneira:

//MEDIA = (P1 + 2.P2) / 3

//Fazer um programa para entrar via teclado com o valor da primeira nota (P1) e o programa deverá calcular e exibir quanto o aluno precisa tirar na segunda nota //minimamente (P2) para ser aprovado, sabendo que a média de aprovação é igual a cinco.

//IMPLEMENTAÇÃO:
Exe20_Media.java

//21. Entrar via teclado com dois valores quaisquer. Após a digitação, exibir um seletor de opções (“menu”) com as seguintes opções: (Fazer esse exercício utilizando //If..Else e/ou Case)

//1 – Multiplicação
//2 – Adição
//3 – Divisão
//4 – Subtração
//5 – Fim de processo (sair do programa)

//Solicitar uma opção por parte do usuário, verificar se é ou não uma opção válida (letras ou números) e processar a respectiva operação. Enviar mensagem de erro se a //opção escolhida não existir no seletor.

//Encerrar o programa somente quando o usuário escolher a opção de finalização. Repare que a opção de número três é de divisão e o programa deverá enviar mensagem de //erro, (somente nesta opção) se o denominador for zero.

//IMPLEMENTAÇÃO:
Exe21_SwitchCase.java

//22. Exibir o seguinte seletor de opções e em função de uma escolha, solicitar os dados necessários para o cálculo da respectiva área. Enviar mensagem de erro se o //usuário escolher uma opção inexistente.

//Encerrar o programa somente quando selecionada a opção de finalização. (Fazer esse exercício utilizando If..Else e/ou Case)

//1 – Triângulo
//2 – Quadrado
//3 – Retângulo
//4 – Círculo
//5 – Fim de processo

//IMPLEMENTAÇÃO:
Exe22_SwitchCase2.java

//23. Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor que C.

//IMPLEMENTAÇÃO:
Exe23_SomaCond.java

//24. Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e estado civil seja “CASADA”, solicitar o tempo de casada (anos).

//IMPLEMENTAÇÃO:
Exe24_String.java

//25. Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar. Utilize o operador %

//IMPLEMENTAÇÃO:
Exe25_Par.java

//26. Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o resultado.

//IMPLEMENTAÇÃO:
Exe26_pos.java

//27. Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar, imprimir o resultado desta operação.

//IMPLEMENTAÇÃO:
Exe27_ParOrImpar.java

//28. Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os em ordem crescente.

//IMPLEMENTAÇÃO:
Exe28_OrdenaC.java

//29. Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os em ordem decrescente.

//IMPLEMENTAÇÃO:
Exe29_OrdenaD.java

//30. Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os //códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado e exibir o valor a ser pago no final.

//Código Condição de pagamento
//1 	À vista em dinheiro ou cheque, recebe 10% de desconto
//2 	À vista no cartão de crédito, recebe 15% de desconto
//3 	Em duas vezes, preço normal de etiqueta sem juros
//4 	Em quatro vezes, preço normal de etiqueta mais juros de 10%

//IMPLEMENTAÇÃO:
Exe30_CalcProduto.java

//31. Criar uma rotina de entrada que aceite somente um valor positivo.

//IMPLEMENTAÇÃO:
Exe31.java

//32. Entrar com dois valores via teclado, onde o segundo deverá ser maior que o primeiro. Caso contrário solicitar novamente apenas o segundo valor.

//IMPLEMENTAÇÃO:
Exe32.java

//33. Entrar via teclado com o sexo de determinado usuário, aceitar somente “F” ou “M” como respostas válidas.

//IMPLEMENTAÇÃO:
Exe33.java

//34. Exibir a tabuada do número cinco no intervalo de um a dez.

//IMPLEMENTAÇÃO:
Exe34.java

//35. Entrar via teclado com um valor qualquer. Travar a digitação, no sentido de aceitar somente valores positivos. Após a digitação, exibir a tabuada do valor //solicitado, no intervalo de um a dez.

//IMPLEMENTAÇÃO:
Exe35.java

//36. Entrar via teclado com um valor (X) qualquer. Travar a digitação, no sentido de aceitar somente valores positivos. Solicitar o intervalo que o programa que //deverá calcular a tabuada do valor digitado, sendo que o segundo valor (B), deverá ser maior que o primeiro (A), caso contrário, digitar novamente somente o segundo. //Após a validação dos dados, exibir a tabuada do valor digitado, no intervalo decrescente, ou seja, a tabuada de X no intervalo de B para A.

//IMPLEMENTAÇÃO:
Exe36.java

//37. Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez. Entre as tabuadas, solicitar que o usuário pressione uma tecla.

//IMPLEMENTAÇÃO:
Exe37.java

//38. Exibir a soma dos números inteiros positivos do intervalo de um a cem.

//IMPLEMENTAÇÃO:
Exe38.java

//39. Exibir os trinta primeiros valores da série de Fibonacci. A série: 1, 1, 2, 3, 5, 8, ...

//IMPLEMENTAÇÃO:
Exe39Fibonacci

//40. Exibir os vinte primeiros valores da série de Bergamaschi. A série: 1, 1, 1, 3, 5, 9, 17, ...

//IMPLEMENTAÇÃO:
Exe40Bergamaschi

//41. Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O valor “N” será digitado, deverá ser positivo, mas menor que cem. Caso o valor não //satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente.
//A seqüência: 2, 5, 10, 17, 26, ....

//IMPLEMENTAÇÃO:
Exe41SeqSoma

//42. Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O valor “N” será digitado, deverá ser positivo, mas menor que cinqüenta. Caso o valor não //satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente.
 
//IMPLEMENTAÇÃO:
Exe42SeqSoma

//43. Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O valor “N” será digitado, deverá ser positivo, mas menor que cinqüenta. Caso o valor não //satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente.
 
//IMPLEMENTAÇÃO:
Exe43SeqSoma.java

//44. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de erro, se necessário. Após a digitação, exibir:
//a) O maior valor;
//b) A soma dos valores;
//c) A média aritmética dos valores;

//IMPLEMENTAÇÃO:
Exe44.java

//45. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de números) será digitado, deverá ser positivo, mas menor que vinte. Caso a //quantidade não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a digitação dos “N” valores, exibir:
//a) O maior valor;
//b) O menor valor;
//c) A soma dos valores;
//d) A média aritmética dos valores;
//e) A porcentagem de valores que são positivos;
//f) A porcentagem de valores negativos;

//IMPLEMENTAÇÃO:
Exe45.java

//46. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de números) será digitado, deverá ser positivo, mas menor que vinte. Caso //a quantidade não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a digitação dos “N” valores, exibir:
//a) O maior valor;
//b) O menor valor;
//c) A soma dos valores;
//d) A média aritmética dos valores;
//e) A porcentagem de valores que são positivos;
//f) A porcentagem de valores negativos;

//IMPLEMENTAÇÃO:
Exe46.java
//Após exibir os dados, perguntar ao usuário se deseja ou não uma nova execução do programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o //programa em função dessa resposta.

//47. Calcular o fatorial de um valor que será digitado. Este valor não poderá ser negativo. Enviar mensagem de erro e solicitar o valor novamente, se necessário. //Perguntar se o usuário deseja ou não fazer um novo cálculo, consistir a resposta em “S” ou “N”.
//N! = N x N-1 x N-2 x N-3 x ....... x (N - (N-1))
//Ex: 5! = 5 x 4 x 3 x 2 x 1 = 120

//IMPLEMENTAÇÃO:
Exe47Fatorial.java

//48. Crie um programa em que o usuário entre com um número inteiro qualquer, e o programa imprima os 20 números subsequentes ao que foi digitado pelo usuário

//IMPLEMENTAÇÃO:
Exe48Contagem.java

//49. Crie um programa que solicite que o usuário entre com dois números (inicial e final). Ao final o programa deverá apresentar o valor total da soma de todos os //números do intervalo digitado pelo usuário

//IMPLEMENTAÇÃO:
Exe49Interval.java

//50. Elabore um programa que apresente os números pares maiores que 10 no intervalo fechado [A, B]. Sendo que A e B serão números inteiros escolhidos pelo usuário. Um //número é par quando este satisfaz a seguinte condição: (NÚMERO mod 2 = 0)

//IMPLEMENTAÇÃO:
Exe50_ParInterval.java

//51. Crie uma classe conforme o Diagrama de Classe (UML). Crie um programa que utilize essa classe para cadastrar 5 clientes em uma lista de clientes. Ao final exibir //apenas os clientes que tem mais de 18 anos.

 
//IMPLEMENTAÇÃO:
Exe48Classe

//52. Crie uma classe conforme o Diagrama de Classe (UML). Crie um programa que utilize essa classe para cadastrar 10 produtos em uma lista de produtos. Ao final //exibir apenas os produtos cujo valor é menor do que 100 reais.

 
//IMPLEMENTAÇÃO:
Exe49Produto

//53. Crie as classes conforme o Diagrama de Classe (UML) abaixo. Crie um programa que utilize essas classes para cadastrar 5 clientes em uma lista de clientes e //pergunte para cada cliente se ele tem ou não conta bancária. Caso o cliente tenha, permita ele cadastrar os dados da conta bancária. Ao final exibir todos os //clientes e suas respectivas contas bancárias, se houver.


//IMPLEMENTAÇÃO:
Exe53Banco


```



  

