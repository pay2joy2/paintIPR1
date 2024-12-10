package com.paintipr1.paintipr1;

import java.util.ArrayList;
import java.util.Arrays;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class ShapeParser {

  public ShapeParser(){}

  public ArrayList<Node> parseInput(ArrayList<String> data){

    ArrayList<Node> nodes = new ArrayList<>();

    for (String s : data) {
      if (s.startsWith("Circle")) {
        Circle circle = parseCircle(s);
        nodes.add(circle);
      } else if (s.startsWith("Ellipse")) {
        Ellipse ellipse = parseEllipse(s);
        nodes.add(ellipse);
      } else if (s.startsWith("Polygon")) {
        Polygon polygon = parsePolygon(s);
        nodes.add(polygon);
      } else if (s.startsWith("Rectangle")) {
        Rectangle rectangle = parseRectangle(s);
        nodes.add(rectangle);
      }
    }
    return nodes;
  }

  private Ellipse parseEllipse(String data) {
    String[] parts = data.split(", ");
    double centerX = Double.parseDouble(parts[0].split("=")[1]);
    double centerY = Double.parseDouble(parts[1].split("=")[1]);
    double radiusX = Double.parseDouble(parts[2].split("=")[1]);
    double radiusY = Double.parseDouble(parts[3].split("=")[1]);
    Color color = parseColor(parts[4].split("=")[1].replace("]", ""));

    Ellipse ellipse = new Ellipse(centerX, centerY, radiusX, radiusY);
    //ellipse.setFill(color);
    return ellipse;
  }

  private Rectangle parseRectangle(String data) {
    String[] parts = data.split(", ");
    double x = Double.parseDouble(parts[0].split("=")[1]);
    double y = Double.parseDouble(parts[1].split("=")[1]);
    double width = Double.parseDouble(parts[2].split("=")[1]);
    double height = Double.parseDouble(parts[3].split("=")[1]);
    Color color = parseColor(parts[4].split("=")[1].replace("]", ""));

    Rectangle rectangle = new Rectangle(x, y, width, height);
    //rectangle.setFill(color);
    return rectangle;
  }

  private Circle parseCircle(String data) {
    String[] parts = data.split(", ");
    double centerX = Double.parseDouble(parts[0].split("=")[1]);
    double centerY = Double.parseDouble(parts[1].split("=")[1]);
    double radius = Double.parseDouble(parts[2].split("=")[1]);
    Color color = parseColor(parts[3].split("=")[1].replace("]", ""));

    Circle circle = new Circle(centerX, centerY, radius);
    //circle.setFill(color);
    return circle;
  }

  private Polygon parsePolygon(String data) {
    String pointsData = data.split("points=")[1].split("],")[0] + "]";
    pointsData = pointsData.replaceAll("[\\[\\]]", "");
    String[] pointsArray = pointsData.split(", ");

    double[] points = Arrays.stream(pointsArray)
        .mapToDouble(Double::parseDouble)
        .toArray();

    Color color = parseColor(data.split("fill=")[1].replace("]", ""));

    Polygon polygon = new Polygon();
    for (int i = 0; i < points.length; i += 2) {
      polygon.getPoints().addAll(points[i], points[i + 1]);
    }
    //polygon.setFill(color);
    return polygon;
  }

  private Color parseColor(String hex) {
    int colorValue = Integer.parseInt(hex.substring(2), 16); // Пропускаем "0x"
    int alpha = (colorValue >> 24) & 0xff;
    int red = (colorValue >> 16) & 0xff;
    int green = (colorValue >> 8) & 0xff;
    int blue = colorValue & 0xff;
    return Color.rgb(red, green, blue, alpha / 255.0);
  }

}
