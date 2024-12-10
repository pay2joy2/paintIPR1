package com.paintipr1.paintipr1.drawers;

import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.util.Pair;

public class RightPolygonDrawer implements Drawer{

  @Override
  public Node draw(Pane pane, Pair<Double, Double> cordPair, ArrayList<Integer> args) {
    Polygon polygon = new Polygon();
    int numberOfVertex = args.get(0);
    int radius = args.get(1);

    for (int i = 0; i < numberOfVertex; i++){
      double x = cordPair.getKey() + radius * Math.cos(i * (2 * Math.PI)/numberOfVertex);
      double y = cordPair.getValue() + radius * Math.sin(i * (2 * Math.PI)/numberOfVertex);
      polygon.getPoints().add(x);
      polygon.getPoints().add(y);
    }
    pane.getChildren().add(polygon);
    return polygon;
  }
}
