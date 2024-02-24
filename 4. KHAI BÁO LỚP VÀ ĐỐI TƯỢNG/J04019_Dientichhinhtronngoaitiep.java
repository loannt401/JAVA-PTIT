
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
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
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
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point a = new Point();
            Point b = new Point();
            Point c = new Point();
            a.setX(sc.nextDouble()); a.setY(sc.nextDouble());
            b.setX(sc.nextDouble()); b.setY(sc.nextDouble());
            c.setX(sc.nextDouble()); c.setY(sc.nextDouble());
            
            double canh1 = a.distance(b);
            double canh2 = a.distance(c);
            double canh3 = b.distance(c);
           
            if((canh1+canh2>canh3) && (canh1+canh3>canh2) && (canh2+canh3>canh1)){
                double can = Math.sqrt((canh1+canh2+canh3)*(canh1+canh2-canh3)*(canh1-canh2+canh3)*(-canh1+canh2+canh3));
                double s = (double)1/4 * can;
                double r = (canh1*canh2*canh3)/(4*s);
                double dtht = r*r*Math.PI;
                System.out.printf("%.3f",dtht);
                System.out.println("");
            }
            else {
                System.out.println("INVALID");
            }
            
        }
        
    }
}