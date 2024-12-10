package com.paintipr1.paintipr1.drawers;

import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.util.Pair;

public class CircleDrawer implements Drawer{

  @Override
  public Node draw(Pane pane, Pair<Double,Double> cordPair, ArrayList<Integer> args) {
    Circle circle = new Circle();
    circle.setRadius(args.get(0));
    circle.setCenterX(cordPair.getKey());
    circle.setCenterY(cordPair.getValue());
    pane.getChildren().add(circle);
    return circle;
  }
}
