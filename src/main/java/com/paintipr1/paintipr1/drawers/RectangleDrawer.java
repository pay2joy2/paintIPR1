package com.paintipr1.paintipr1.drawers;

import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.util.Pair;

public class RectangleDrawer implements Drawer{

  @Override
  public Node draw(Pane pane, Pair<Double, Double> cordPair, ArrayList<Integer> args) {
    Rectangle rectangle = new Rectangle();
    rectangle.setHeight(args.get(0));
    rectangle.setWidth(args.get(1));
    rectangle.setX(cordPair.getKey());
    rectangle.setY(cordPair.getValue());
    pane.getChildren().add(rectangle);
    return rectangle;
  }
}
