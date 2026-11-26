package model;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.effect.Light.Point;

public class Serpiente {

    private int x;
    private int y;
    private List<Point> serpiente = new ArrayList<>();
    private Point cabezaSerpiente;
    
    public Serpiente(int x, int y, List<Point> serpiente, Point cabezaSerpiente) {
        this.x = x;
        this.y = y;
        this.serpiente = serpiente;
        this.cabezaSerpiente = serpiente.getFirst();
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public List<Point> getSerpiente() {
        return serpiente;
    }

    public void setSerpiente(List<Point> serpiente) {
        this.serpiente = serpiente;
    }

    public Point getCabezaSerpiente() {
        return cabezaSerpiente;
    }

    public void setCabezaSerpiente(Point cabezaSerpiente) {
        this.cabezaSerpiente = cabezaSerpiente;
    }

    public void comer(){
        serpiente.addLast(new Point());
    }
}




