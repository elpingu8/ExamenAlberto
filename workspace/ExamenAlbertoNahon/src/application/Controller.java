package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class Controller implements Initializable {

	 	@FXML
	    private AnchorPane pane1;

	    @FXML
	    private AnchorPane pane2;

	    @FXML
	    private Button signinButton;

	    @FXML
	    private ImageView logoImage;



		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			translateAnimation(0.1,pane2,600);//tiempo,objeto que queremos mover, el ancho

	    	rotateAnimation();

		}
		@FXML
		void rotateAnimation(){

			 RotateTransition rotar= new RotateTransition(Duration.seconds(100),logoImage);
			 rotar.setByAngle(360*10);
			 rotar.play();
		}

		private void translateAnimation(double tiempo, Node node, double distancia) {
			TranslateTransition translate = new TranslateTransition(Duration.seconds(tiempo),node);
			translate.setByY(distancia);
			translate.play();
		}

		@FXML
		void nextWindow(){

			translateAnimation(0.5,pane2,-600);
		}
		@FXML
		void previousWindow(){

			translateAnimation(0.5,pane2,600);
		}

}
