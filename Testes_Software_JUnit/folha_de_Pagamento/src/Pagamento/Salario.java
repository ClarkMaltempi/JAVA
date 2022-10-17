package Pagamento;

public class Salario {
	private double salario;
	private double horas_trabalhadas;
	private double dias_trabalhados;
	
	public void set_salario(double salario) {
		this.salario = salario;
	}
	
	public void set_horas_trabalhadas(double horas_trabalhadas) {
		this.horas_trabalhadas = horas_trabalhadas;
	}
	
	public void set_dias_trabalhados(int dias_trabalhados) {
		this.dias_trabalhados = dias_trabalhados;
	}
	
	public double get_salario() {
		return salario;
	}
	
	public double get_horas_trabalhadas() {
		return horas_trabalhadas;
	}

	public double get_dias_trabalhados() {
		return dias_trabalhados;
	}
}
