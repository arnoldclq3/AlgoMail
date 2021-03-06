package algo3.tp1.vista;

import algo3.tp1.modelo.AlgoMail;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AccionBotonPrincipal implements EventHandler<ActionEvent> {

	private Stage stage;
	private AlgoMail algoMail;
	private CreadorDeVentanas creador;
	
	public AccionBotonPrincipal(Stage stage,AlgoMail algoMail){
		
		this.stage = stage;
		this.algoMail = algoMail;
		this.creador = new CreadorDeVentanas();
	}
	
	@Override
    public void handle(ActionEvent actionEvent) {

		Scene ventana = creador.crearVentanaPrincipal(stage,algoMail);
        stage.setScene(ventana);
    }

}
