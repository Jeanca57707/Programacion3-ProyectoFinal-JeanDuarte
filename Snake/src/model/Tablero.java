package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;


public class Tablero {

    private int alto;
    private int ancho;
    private int tamañoCasillas;
    
    private Canvas canvas;
    private GraphicsContext gc;

    public Tablero(int alto, int ancho, int tamañoCasillas){
        this.alto = alto;
        this.ancho = ancho;
        this.tamañoCasillas = tamañoCasillas;

        canvas = new Canvas(ancho * tamañoCasillas, alto * tamañoCasillas);

        gc = canvas.getGraphicsContext2D();
    }

    public Canvas getCanvas() {
        return canvas;
    }  

    public void dibujarTablero(){
        for(int i = 0; i< ancho; i++){
            for(int j = 0; j < alto; j++){
                if((i + j) % 2 == 0){
                    gc.setFill(Color.web("AAD751"));
                }
                else{
                    gc.setFill(Color.web("A2D149"));
                }
                gc.fillRect(i * tamañoCasillas , j* tamañoCasillas, tamañoCasillas, tamañoCasillas);
            }
        }
    }
}
