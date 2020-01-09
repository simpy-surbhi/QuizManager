package com.sample.multiscene.view;

import com.sample.multiscene.controller.ViewOneController;

import javafx.stage.Stage;

/**
 * Creates and returns the scene for the first view.
 * 
 * @author Knute Snortum
 * @version 2018-05-24
 */
public class ViewOne extends ViewBase {

	/** Must inject a stage */
	public ViewOne(Stage stage) {
		super(stage, "This is scene 1", e -> new ViewOneController(stage).handleMousePress(e));
	}

}
