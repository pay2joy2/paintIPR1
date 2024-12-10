package com.paintipr1.paintipr1.shapes;

import java.util.LinkedHashMap;

public class Rectangle implements Shape{
  private static final LinkedHashMap<String, Integer> variablesMap = new LinkedHashMap<>();
  private int height = 100;
  private int width = 200;
  public Rectangle(){}

  @Override
  public LinkedHashMap<String, Integer> getVariables() {
    variablesMap.put("Height", height);
    variablesMap.put("Width", width);
    return variablesMap;
  }
}
