package com.example.shapetransformations;

// bunch of imports needed for the program to function
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

// names the public class to ShapeTransformation, file named also changed
public class ShapeTransformations extends Application {
    @Override
    public void start(Stage primaryStage) {

        // pane makes a pane shape
        Pane pane = new Pane();

        // rectangle makes a new rectangle at the provided coordinates
        Rectangle rectangle = new Rectangle(50, 50, 100, 60);

        // fills the color of the rectangle with light blue
        rectangle.setFill(Color.LIGHTBLUE);

        // outline of the rectangle is set to black
        rectangle.setStroke(Color.BLACK);

        // creates a new circle at the set coordinates
        Circle circle = new Circle(200, 80, 40);

        // sets the color of the circle to orange
        circle.setFill(Color.ORANGE);

        // sets the color of the circle to black
        circle.setStroke(Color.BLACK);

        // creates an eclipse at the set coordinates
        Ellipse ellipse = new Ellipse(350, 80, 60, 30);

        // sets the color of the eclipse to green
        ellipse.setFill(Color.GREEN);

        // sets the outline of the eclipse to black
        ellipse.setStroke(Color.BLACK);

        // creates a new line at the set coordinates, from 50,150 to 150,200
        Line line = new Line(50, 150, 150, 200);

        // sets the line outline to red
        line.setStroke(Color.RED);

        // boldens or makes the line thicker
        line.setStrokeWidth(3);

        // creates a new polygon shape
        Polygon polygon = new Polygon();

        // gets the coordinates of the polygon vertices, also adds all the elements to a set
        polygon.getPoints().addAll(250.0, 150.0, 300.0, 250.0, 200.0, 250.0);

        // sets the polygon color to yellow
        polygon.setFill(Color.YELLOW);

        // sets the outline of the polygon to black
        polygon.setStroke(Color.BLACK);

        // creates an arc at the set coordinates
        Arc arc = new Arc(420, 200, 50, 50, 30, 180);

        // sets the color of the polygon to pink
        arc.setFill(Color.PINK);

        // sets the outline of the polygon to black
        arc.setStroke(Color.BLACK);

        // sets the type of the arc to open
        arc.setType(ArcType.OPEN);

        // creates a button named "Rotate Rectangle"
        Button rotateRectangle = new Button("Rotate Rectangle");

        // allows the button to be pressed and to rotate the rectangle right by 15 degrees
        rotateRectangle.setOnAction(e -> rectangle.setRotate(rectangle.getRotate()
                + 15));

        // creates a button named "Scale Circle"
        Button scaleCircle = new Button("Scale Circle");

        // allows the button just created to be pressed and to make it bigger by 0.1
        scaleCircle.setOnAction(e -> circle.setScaleX(circle.getScaleX() + 0.1));

        // creates a button named "Move Ellipse"
        Button moveEllipse = new Button("Move Ellipse");

        // allows the button to be pressed and moves the ellipse to the right by 10
        moveEllipse.setOnAction(e -> ellipse.setTranslateX(ellipse.getTranslateX()
                + 10));

        // creates a button named "Rotate Line"
        Button rotateLine = new Button("Rotate Line");

        // allows the button to be pressed and rotates the line to the right by 15 degrees
        rotateLine.setOnAction(e -> line.setRotate(line.getRotate() + 15));

        // creates a new button named "Scale Polygon"
        Button scalePolygon = new Button("Scale Polygon");

        // allows the button to be pressed and creates two actions
        scalePolygon.setOnAction(e -> {
            polygon.setScaleX(polygon.getScaleX() + 0.1);   // increases x axos size by 0.1
            polygon.setScaleY(polygon.getScaleY() + 0.1);   // increases y axis size by 0.1
        });

        // creates a new button named "Move Arc"
        Button moveArc = new Button("Move Arc");

        // allows the button to be pressed, translates the arc rightwards by 10
        moveArc.setOnAction(e -> arc.setTranslateX(arc.getTranslateX() + 10));

        // creates the box where all the buttons are contained, includes all buttons just created
        VBox buttonBox = new VBox(10, rotateRectangle, scaleCircle, moveEllipse,
                rotateLine, scalePolygon, moveArc);

        // sets where the button box is going to be / size
        buttonBox.setLayoutX(520);
        buttonBox.setLayoutY(50);

        // lists all the children of pane and adds them to the names provided below
        pane.getChildren().addAll(rectangle, circle, ellipse, line, polygon, arc,
                buttonBox);

        // configures the size of the whole canvas
        Scene scene = new Scene(pane, 700, 300);

        // sets the title shown on the window
        primaryStage.setTitle("JavaFX Shape Transformations");

        // sets the scene that will be displayed
        primaryStage.setScene(scene);

        // allows the scene to be shown
        primaryStage.show();
    }

    // runs the program or launches it
    public static void main(String[] args) {
        launch(args);
    }
}
