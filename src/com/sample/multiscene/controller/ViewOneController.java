package com.sample.multiscene.controller;

import com.sample.multiscene.Main;
import com.sample.multiscene.model.SceneName;
import com.sample.multiscene.view.ViewOne;

import javafx.event.Event;
import javafx.stage.Stage;

/**
 * Controller for {@link ViewOne}.
 * 
 * @author Knute Snortum
 * @version 2018-05-24
 */
public class ViewOneController {
	
	private Stage stage;
	
	/** Must inject a stage */
	public ViewOneController(Stage stage) {
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