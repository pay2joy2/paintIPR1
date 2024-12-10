package com.paintipr1.paintipr1.drawers;

import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.util.Pair;

public class ParallelepipedDrawer implements Drawer{

  @Override
  public Node draw(Pane pane, Pair<Double, Double> cordPair, ArrayList<Integer> args) {
    Polygon polygon = new Polygon();

    int base = args.get(0);
    int side = args.get(1);
    int angle = args.get(2);

    polygon.getPoints().addAll(
        cordPair.getKey(), cordPair.getValue(),
        cordPair.getKey() + base, cordPair.getValue(),
        (cordPair.getKey() + base) + side * Math.cos(Math.toRadians(angle)), cordPair.getValue() - side,
        cordPair.getKey() + side * Math.cos(Math.toRadians(angle)),cordPair.getValue() - side
    );
    pane.getChildren().add(polygon);
    return polygon;
  }
}
