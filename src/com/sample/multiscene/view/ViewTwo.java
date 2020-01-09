package com.sample.multiscene.view;

import com.sample.multiscene.controller.ViewTwoController;

import javafx.stage.Stage;

/**
 * Creates and returns the scene for the second view.
 * 
 * @author Knute Snortum
 * @version 2018-05-24
 */
public class ViewTwo extends ViewBase {

	/** Must inject a stage */
	public ViewTwo(Stage stage) {
		super(stage, "This is scene 2", e -> new ViewTwoController(stage).handleMousePress(e));
	}

}
