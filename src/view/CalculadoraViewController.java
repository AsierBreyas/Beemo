package view;

import App.Beemo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculadoraViewController {

	private Beemo beemo;
	private Double numero1;
	private Double numero2;
	private Boolean operacionActiva = false;
	private String operacion;

	@FXML
	private Label salidaNumeros;

	@FXML
	private Button botonLimpiar;

	@FXML
	private Button botonBorrar;

	@FXML
	private Button botonComa;

	@FXML
	private Button botonOperar;

	public void botonNumeroClicado(ActionEvent event){
		String boton = ((Button)event.getSource()).getText();
		salidaNumeros.setText(salidaNumeros.getText() + boton);
		if(! operacionActiva)
			numero1 = Double.parseDouble(salidaNumeros.getText());
		else
			numero2 = Double.parseDouble(salidaNumeros.getText());
	}
	public void botonOperacionClicado(ActionEvent event){
		String boton = ((Button)event.getSource()).getText();
		System.out.println(boton);
		System.out.println("operacion");
		if(operacion == "" || operacion == null){
			switch(boton){
			case"+":
				operacionActiva = true;
				operacion = "suma";
				salidaNumeros.setText("");
				break;
			case"-":
				operacionActiva = true;
				operacion = "resta";
				salidaNumeros.setText("");
				break;
			case"*":
				operacionActiva = true;
				operacion = "multiplicacion";
				salidaNumeros.setText("");
				break;
			case"/":
				operacionActiva = true;
				operacion= "division";
				salidaNumeros.setText("");
				break;
			}
		}
	}
	public void  setBeemo(Beemo beemo){
		this.beemo = beemo;
	}

}
