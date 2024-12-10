package com.paintipr1.paintipr1.drawers;

import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;
import javafx.util.Pair;

public class EllipseDrawer implements Drawer{

  @Override
  public Node draw(Pane pane, Pair<Double, Double> cordPair, ArrayList<Integer> args) {
    Ellipse ellipse = new Ellipse();
    ellipse.setRadiusY(args.get(0));
    ellipse.setRadiusX(args.get(1));
    ellipse.setCenterX(cordPair.getKey());
    ellipse.setCenterY(cordPair.getValue());
    pane.getChildren().add(ellipse);
    return ellipse;
  }
}
