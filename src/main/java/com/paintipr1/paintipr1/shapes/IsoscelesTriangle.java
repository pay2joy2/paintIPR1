package com.paintipr1.paintipr1.shapes;

import java.util.LinkedHashMap;

public class IsoscelesTriangle implements Shape{

  private int base = 100;
  private int height = 150;

  private static final LinkedHashMap<String, Integer>  variablesMap = new LinkedHashMap<>();
  @Override
  public LinkedHashMap<String, Integer> getVariables() {
    variablesMap.put("Base", base);
    variablesMap.put("Height", height);
    return variablesMap;
  }
}
