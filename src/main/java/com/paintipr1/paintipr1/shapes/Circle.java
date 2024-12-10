package com.paintipr1.paintipr1.shapes;

import java.util.LinkedHashMap;

public class Circle implements Shape {
  private int radius = 50;
  private static final LinkedHashMap<String, Integer>  variablesMap = new LinkedHashMap<>();

  public Circle(){}

  @Override
  public LinkedHashMap<String, Integer> getVariables(){
    variablesMap.put("Radius", radius);
    return variablesMap;
  }
}
