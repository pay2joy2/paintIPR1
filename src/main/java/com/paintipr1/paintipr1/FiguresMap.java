package com.paintipr1.paintipr1;

import com.paintipr1.paintipr1.shapes.Shape;
import java.util.LinkedHashMap;

public class FiguresMap {

  static private LinkedHashMap<String, Shape> figuresList = null;

  public static LinkedHashMap<String, Shape> getInstance(){
    if(figuresList == null){
      figuresList = new LinkedHashMap<>();
    }
    return figuresList;
  }

}
