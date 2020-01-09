package com.sample.multiscene;

import java.util.HashMap;
import java.util.Map;

import com.sample.multiscene.model.SceneName;
import com.sample.multiscene.view.MainView;
import com.sample.multiscene.view.ViewOne;
import com.sample.multiscene.view.ViewThree;
import com.sample.multiscene.view.ViewTwo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;



/**
 * Builds all scenes and display the main one.
 * 
 * @author Knute Snortum
 * @version 2018-05-24
 */
public class Main extends Application {
	
	/** Holds the various scenes to switch between */
	private static Map<SceneName, Scene> scenes = new HashMap<>();
	
	@Override
	public void start(Stage stage) {
		
		// Create and store all scenes up front
		scenes.put(SceneName.MAIN, new MainView(stage).getScene());
		scenes.put(SceneName.SCENE1, new ViewOne(stage).getScene());
		scenes.put(SceneName.SCENE2, new ViewTwo(stage).getScene());
		scenes.put(SceneName.SCENE3, new ViewThree(stage).getScene());
		
		// Start with the main scene
		stage.setScene(scenes.get(SceneName.MAIN));
		stage.setTitle("Multi-Scene Demo");
		stage.show();
	}

	/** Returns a Map of the scenes by {@link SceneName} */
	public static Map<SceneName, Scene> getScenes() {
		return scenes;
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
