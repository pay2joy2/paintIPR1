package com.paintipr1.paintipr1.shapes;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Parallelepiped implements Shape {

  private int base = 150;
  private int side = 100;
  private int angle = 30;

  private static final LinkedHashMap<String, Integer>  variablesMap = new LinkedHashMap<>();

  @Override
  public LinkedHashMap<String, Integer> getVariables() {
    variablesMap.put("Base",base);
    variablesMap.put("Side",side);
    variablesMap.put("Angle",angle);
    return variablesMap;
  }
}
