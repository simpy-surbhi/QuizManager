package com.sample.multiscene.view;

import com.sample.multiscene.controller.ViewThreeController;

import javafx.stage.Stage;

/**
 * Creates and returns the scene for the third view.
 * 
 * @author Knute Snortum
 * @version 2018-05-24
 */
public class ViewThree extends ViewBase {

	/** Must inject a stage */
	public ViewThree(Stage stage) {
		super(stage, "This is scene 3", e -> new ViewThreeController(stage).handleMousePress(e));
	}

}
