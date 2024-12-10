package com.paintipr1.paintipr1.shapes;

import java.util.LinkedHashMap;

public class RightTriangle implements Shape {

  private int legA = 200;
  private int legB = 200;
  private static final LinkedHashMap<String, Integer> variablesMap = new LinkedHashMap<>();
  public RightTriangle(){}

  @Override
  public LinkedHashMap<String, Integer> getVariables() {
    variablesMap.put("Leg A", legA);
    variablesMap.put("Leg B", legB);
    return variablesMap;
  }
}
