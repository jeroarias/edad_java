package proyectoInterfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class interfaz extends JFrame implements ActionListener{
	
	
	
	JPanel panel;
	
	
	JLabel titulo;	
	JLabel nombre;
	JLabel añoNacimiento;
	JLabel anoActual;
	JLabel resultado;
	
	
	JTextField nom;
	JTextField anac;
	JTextField actu;
	
	JButton calcular;
	JButton limpiar;
	
	procesos miproceso= new procesos();
	
	
	public interfaz(){
		iniciar();
		
		setTitle("Calculador");
		setSize(800,500);
		setLocationRelativeTo(null);
		
		
		 
	}

		
	public void iniciar() {
		panel =new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.pink);
		
		titulo = new JLabel();
		titulo.setText("VALIDACION DE MAYORIA DE EDAD");
		titulo.setBounds(200, 1, 400, 150);
		titulo.setFont(new Font("ROBOT",Font.BOLD,20));
		
		nombre= new JLabel();
		nombre.setText("Nombre:");
		nombre.setBounds(40, 150, 150, 30);
		
		
		nom =new JTextField();
		nom.setText("");
		nom.setBounds(100, 150, 250, 30);
		
		añoNacimiento= new JLabel();
		añoNacimiento.setText("Año de nacimeineto:");
		añoNacimiento.setBounds(380, 150, 150, 30);
		
		anac =new JTextField();
		anac.setText("");
		anac.setBounds(510, 150, 200, 30);
		
		anoActual = new JLabel();
		anoActual.setText("Año actual:");
		anoActual.setBounds(250, 250, 130, 30);
		
		
		actu =new JTextField();
		actu.setText("");
		actu.setBounds(330, 250, 150, 30);
		
		
		resultado = new JLabel();
		resultado.setText("La edad de la persona es:");
		resultado.setBounds(40, 350, 350, 30);
		
		calcular = new JButton();
		calcular.setText("Calcular");
		calcular.setBounds(150, 400, 150, 30);
		calcular.addActionListener(this);
		
		
		limpiar = new JButton();
		limpiar.setText("Limpiar");
		limpiar.setBounds(490, 400, 150, 30);
		limpiar.addActionListener(this);
		
		
		
		
		
		
		add(panel);
		panel.add(titulo);
		panel.add(nombre);
		panel.add(añoNacimiento);
		panel.add(anac);
		panel.add(nom);
		panel.add(anoActual);
		panel.add(actu);
		panel.add(resultado);
		panel.add(calcular);
		panel.add(limpiar);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== limpiar) {
			nom.setText("");
			anac.setText("");
			actu.setText("2023");
			resultado.setText("Resultado:");
			System.out.println("Se limpio el programa");
			
		}
		
		if(e.getSource()== calcular) {
			
			  miproceso = new procesos();
			 
			  double numero1 = Double.parseDouble(anac.getText());
		      double numero2 = Double.parseDouble(actu.getText());
		      
		      
		      double edad = miproceso.calculo(numero1, numero2 );
		      
		      resultado.setText(nom.getText()+" Usted es del año: "+anac.getText()+". Su edad es: "+edad);
		      
		
					
			
		}
		
		
		
			
		
		
	}


	
	

}
