/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package drawingtest;

import java.util.*;
import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.control.ScrollPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;



/**
 *
 * @author Conner
 */
public class DrawingTest extends Application {
    static Timeline tl;
    static ArrayList<clickSpace> csArray = new ArrayList<clickSpace>();

    @Override
    public void start(Stage primaryStage) {
        Event ev;
        tl = new Timeline("Timeline Name");
        for(int i = 0; i<10; i++){
            ev = new AtomicEvent();
            ev.setEvent("190"+i+" info","190"+i,""+i,""+i);
            tl.addEvent(ev);
        }
        /* for reference
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        */
        
        StackPane root = new StackPane();
        //root.getChildren().add(btn);
        ScrollPane sp = new ScrollPane();
        sp.setVmax(200);
        sp.setPrefSize(300,600);
        Canvas canvas = new Canvas(2000, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        sp.setContent(canvas);
        
        canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, 
                new EventHandler<MouseEvent>(){
 
            @Override
            public void handle(MouseEvent event) {
               int x = (int)event.getX();
               int y = (int)event.getY();
               for(int i =0; i<csArray.size(); i++){
                   clickSpace cs = csArray.get(i);
                   if(x > cs.x && x < cs.x+15 && y > cs.y && y < cs.y+15){
                       (new Thread(new PopUp())).start();
                        

                   }
               }
                
            }
        });
        root.getChildren().add(sp);
        Scene scene = new Scene(root, 600, 200);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
    }
     private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(1);
        gc.fillText(tl.name, 40, 20);
        gc.strokeLine(40, 40, tl.timelineEvents.size()*100, 40);
        
        Iterator it = tl.timelineEvents.keySet().iterator();
        for(int i = 0; i < tl.timelineEvents.size(); i++ ){
            gc.strokeLine(40+i*100, 40, 40+i*100, 80);
            clickSpace cs = new clickSpace(40+i*100, 25);
            csArray.add(cs);
            gc.fillRect(40+i*100, 25, 15, 15);
            Event next = tl.timelineEvents.get(it.next());
            gc.fillText(next.getStartDate(), 42+i*100, 55);
            gc.fillText(next.getName(), 42+i*100, 75);
        }
        
    }
     
    public class PopUp implements Runnable {

     public void run() {
        System.out.println("Hello from a thread!");
        JOptionPane.showMessageDialog(null, "Aditional data from event goes here");
     }
        

}
}

