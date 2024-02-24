import java.util.Scanner;


class Point {
    private double x;
    private double y;
    public Point(){
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        x = p.getX();
        y = p.getY();
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    
    public double khoangCach(double x, double y){
        return Math.sqrt((this.x - x)*(this.x - x) + (this.y-y)*(this.y-y));
    }
    public double distance(Point p){
        return khoangCach(p.getX(), p.getY());
    }
    public double distance(Point a, Point b){
        return Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX()) + (a.getY()-b.getY())*(a.getY()-b.getY()));
    }
   
    @Override
    public String toString(){
        return String.valueOf(x) + " " + String.valueOf(y);
    }
}





/**
 *
 * @author Admin
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            Point a = new Point(x1, y1);
            Point b = new Point(x2, y2);

            System.out.printf("%.4f", a.distance(b));
            System.out.println("");
        }
        
    }
    
}