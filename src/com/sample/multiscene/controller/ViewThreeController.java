package com.sample.multiscene.controller;

import com.sample.multiscene.Main;
import com.sample.multiscene.model.SceneName;
import com.sample.multiscene.view.ViewThree;

import javafx.event.Event;
import javafx.stage.Stage;

/**
 * Controller for {@link ViewThree}.
 * 
 * @author Knute Snortum
 * @version 2018-05-24
 */
public class ViewThreeController {
	
	private Stage stage;
	
	/** Must inject a stage */
	public ViewThreeController(Stage stage) {
		if (stage == null) {
			throw new IllegalArgumentException("Stage cannot be null");
		}
		
		this.stage = stage;
	}
	
	/** Display main scene when the "back" button is clicked */
	public void handleMousePress(Event event) {
		stage.setScene(Main.getScenes().get(SceneName.MAIN));
	}
}
