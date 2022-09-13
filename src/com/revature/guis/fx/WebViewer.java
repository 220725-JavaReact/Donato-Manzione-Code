package com.revature.guis.fx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebViewer extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Web Viewer");
		
		
		WebView webView = new WebView();
		
		webView.getEngine().load("http://google.com");
		
		Group root = new Group(webView);
		
		Scene scene = new Scene(root, 800, 500);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}

}
