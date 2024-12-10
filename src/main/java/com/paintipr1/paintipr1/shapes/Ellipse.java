package com.paintipr1.paintipr1.shapes;

import java.util.LinkedHashMap;

public class Ellipse implements Shape{

  private int radiusA = 50;
  private int radiusB = 100;

  private static final LinkedHashMap<String,Integer> variablesMap = new LinkedHashMap<>();

  @Override
  public LinkedHashMap<String, Integer> getVariables() {
    variablesMap.put("Radius A", radiusA);
    variablesMap.put("Radius B", radiusB);
    return variablesMap;
  }
}
