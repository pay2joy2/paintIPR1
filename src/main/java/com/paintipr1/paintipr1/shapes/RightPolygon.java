package com.paintipr1.paintipr1.shapes;

import java.util.LinkedHashMap;

public class RightPolygon implements Shape{

  private int vertexes = 5;
  private int radius = 100;

  private static final LinkedHashMap<String, Integer>  variablesMap = new LinkedHashMap<>();
  @Override
  public LinkedHashMap<String, Integer> getVariables() {
    variablesMap.put("Vertexes", vertexes);
    variablesMap.put("Radius", radius);
    return variablesMap;
  }
}
