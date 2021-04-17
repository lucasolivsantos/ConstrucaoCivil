package desafio03;

import javax.swing.JOptionPane;
public class CalcularVolume {
	
	private double base;
	private double altura;
	private double comprimento;
	private double volume;
	
	public void Volume() {
		base = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida para base (m): "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida para altura (m): "));
		comprimento = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida para comprimento (m): "));
		
		volume = base * altura * comprimento;
		
		JOptionPane.showMessageDialog(null, "O volume calculado: " + volume);
	}
	
}
