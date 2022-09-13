/**
 * 
 */
package com.revature.guis.fx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileViewer extends Application {

	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {

		primaryStage.setTitle("File Hunter");

		ImageView imageView = new ImageView(); // you need the object that views the img
		FileChooser fileChooser = new FileChooser(); // the obj that encapsulates choosing the file

		Button button = new Button("Select an image file");

		button.setOnAction(e -> {

			File file = fileChooser.showOpenDialog(primaryStage);

			if (file != null) {

				try {

					Image image = new Image(new FileInputStream(file));
					imageView.setImage(image);
				} catch (FileNotFoundException e1) {

					//
				}

			}

		});

		BorderPane bp = new BorderPane();
		bp.setTop(button);
		bp.setCenter(imageView);
		Scene scene = new Scene(bp, 500, 700);

		primaryStage.setScene(scene);

		primaryStage.show();

	};

	public static void main(String[] args) {
		launch(args);

	}

}
