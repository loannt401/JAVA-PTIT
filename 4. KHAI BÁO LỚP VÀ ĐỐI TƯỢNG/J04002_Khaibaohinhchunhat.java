import java.util.Scanner;



class Rectange {
    private double width;
    private double height;
    private String color;
    public Rectange(){
        width = 1;
        height = 1;
    }
    public Rectange(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.setColor(color);
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        String s = color.substring(0,1).toUpperCase()+color.substring(1).toLowerCase();
        this.color = s;
    }
    public double findArea(){
        return width*height;
    }
    public double findPerimeter(){
        return (width + height)*2;
    }
}

public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dai = sc.nextDouble();
        double rong = sc.nextDouble();
        String mau = sc.next();
        if(dai >0 && rong>0){
            Rectange a = new Rectange(rong, dai, mau);
            System.out.println((int)a.findPerimeter() + " " + (int)a.findArea() + " " + a.getColor());
        }
        else System.out.println("INVALID");
        
    }
    
}