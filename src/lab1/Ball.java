package lab1;

public class Ball {
    private String color;
    private int size;

    public Ball(String n, int a){
        color = n;
        size = a;
    }
    public Ball(String n){
        color = n;
        size = 2;
    }
    public Ball(){
        color = "red";
        size = 0;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public int getSize(){
        return size;
    }
    public String toString(){
        return this.color + ", size " + this.size;
    }
}
