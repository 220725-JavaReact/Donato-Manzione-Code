package com.revature.guis.fx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class LoginFX extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// label for email
		Text text1 = new Text("Username");

		// label for password
		Text text2 = new Text("Password");

		// field for email

		TextField field1 = new TextField();

		// field for password

		TextField field2 = new TextField();

		// buttons

		Button button1 = new Button();

		// the layout definition: it'll be like a grid
		GridPane gridPane = new GridPane();
		gridPane.setMinSize(400, 200);
		gridPane.setAlignment(Pos.CENTER);

		gridPane.add(text1, 0, 0);
		gridPane.add(field1, 1, 0);
		gridPane.add(text2, 0, 1);
		gridPane.add(field2, 1, 1);
		gridPane.add(button1, 0, 2);

		// you have the nodes. now make the scene

		Scene scene = new Scene(gridPane);

		// you have the scene. now set the stage (u got it as an arg).
		// but set title first
		stage.setTitle("Log in");
		stage.setScene(scene);

		// show the window!
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
