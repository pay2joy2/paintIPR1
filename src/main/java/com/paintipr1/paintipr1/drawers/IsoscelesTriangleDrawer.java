package com.paintipr1.paintipr1.drawers;

import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.util.Pair;

public class IsoscelesTriangleDrawer implements Drawer{

  @Override
  public Node draw(Pane pane, Pair<Double, Double> cordPair, ArrayList<Integer> args) {
    Polygon polygon = new Polygon();

    double x = cordPair.getKey();
    double y = cordPair.getValue();

    polygon.getPoints().addAll(
        x,y,
        x + args.get(0), y,
        x + args.get(0)/2, y - args.get(1));
    pane.getChildren().add(polygon);
    return polygon;
  }
}
