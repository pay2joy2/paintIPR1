package com.paintipr1.paintipr1.drawers;

import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.util.Pair;

public interface Drawer {

  Node draw(Pane pane, Pair<Double,Double> cordPair, ArrayList<Integer> args);

}
