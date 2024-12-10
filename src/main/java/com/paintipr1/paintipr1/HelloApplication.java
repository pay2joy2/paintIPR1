package com.paintipr1.paintipr1;

import com.paintipr1.paintipr1.drawers.CircleDrawer;
import com.paintipr1.paintipr1.drawers.Drawer;
import com.paintipr1.paintipr1.drawers.EllipseDrawer;
import com.paintipr1.paintipr1.drawers.IsoscelesTriangleDrawer;
import com.paintipr1.paintipr1.drawers.ParallelepipedDrawer;
import com.paintipr1.paintipr1.drawers.RectangleDrawer;
import com.paintipr1.paintipr1.drawers.RightPolygonDrawer;
import com.paintipr1.paintipr1.drawers.RightTiangleDrawer;
import com.paintipr1.paintipr1.shapes.Circle;
import com.paintipr1.paintipr1.shapes.Ellipse;
import com.paintipr1.paintipr1.shapes.IsoscelesTriangle;
import com.paintipr1.paintipr1.shapes.Parallelepiped;
import com.paintipr1.paintipr1.shapes.Rectangle;
import com.paintipr1.paintipr1.shapes.RightPolygon;
import com.paintipr1.paintipr1.shapes.RightTriangle;
import com.paintipr1.paintipr1.shapes.Shape;
import java.util.LinkedHashMap;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {

        LinkedHashMap<String, Shape> shapesMap = FiguresMap.getInstance();
        LinkedHashMap<String, Drawer> drawersMap = DrawersMap.getInstance();

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Ellipse ellipse = new Ellipse();
        Parallelepiped parallelepiped = new Parallelepiped();
        RightTriangle rightTriangle = new RightTriangle();
        RightPolygon rightPolygon = new RightPolygon();
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        shapesMap.put("Circle", circle);
        shapesMap.put("Rectangle", rectangle);
        shapesMap.put("Ellipse", ellipse);
        shapesMap.put("Parallelepiped",parallelepiped);
        shapesMap.put("Right Triangle", rightTriangle);
        shapesMap.put("Right Polygon", rightPolygon);
        shapesMap.put("Isosceles Triangle", isoscelesTriangle);
        CircleDrawer circleDrawer = new CircleDrawer();
        RectangleDrawer rectangleDrawer = new RectangleDrawer();
        EllipseDrawer ellipseDrawer = new EllipseDrawer();
        ParallelepipedDrawer parallelepipedDrawer = new ParallelepipedDrawer();
        RightTiangleDrawer rightTiangleDrawer = new RightTiangleDrawer();
        RightPolygonDrawer rightPolygonDrawer = new RightPolygonDrawer();
        IsoscelesTriangleDrawer isoscelesTriangleDrawer = new IsoscelesTriangleDrawer();
        drawersMap.put("Circle",circleDrawer);
        drawersMap.put("Rectangle", rectangleDrawer);
        drawersMap.put("Ellipse", ellipseDrawer);
        drawersMap.put("Parallelepiped", parallelepipedDrawer);
        drawersMap.put("Right Triangle", rightTiangleDrawer);
        drawersMap.put("Right Polygon", rightPolygonDrawer);
        drawersMap.put("Isosceles Triangle", isoscelesTriangleDrawer);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}