package com.paintipr1.paintipr1.drawers;

import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.util.Pair;

public class RightTiangleDrawer implements Drawer{

  @Override
  public Node draw(Pane pane, Pair<Double, Double> cordPair, ArrayList<Integer> args) {
    Polygon polygon = new Polygon();

    double x = cordPair.getKey();
    double y = cordPair.getValue();

    polygon.getPoints().addAll(
        x,y,
        x + args.get(0), y,
        x, y - args.get(1));

    pane.getChildren().add(polygon);
    return polygon;
  }
}
