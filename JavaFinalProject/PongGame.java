import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PongGame {

	@FXML
	private Button start;

	@FXML
	void startgame(ActionEvent event) {
		GameFrame frame = new GameFrame();
	}

}
//PongGame.java

// public class PongGame {

// 	public static void main(String[] args) {
// //		GameFrame frame = new GameFrame();
// 		new GameFrame();

// 	}

// }

