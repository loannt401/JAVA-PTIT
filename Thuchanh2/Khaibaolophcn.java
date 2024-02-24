import java.util.Scanner;


class Rectange {
    private double width;
    private double height;
    private String color;
    public Rectange(){
        
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
       String s = String.valueOf(color.charAt(0)).toUpperCase() + color.substring(1).toLowerCase();
       this.color = s;
   }
   public double findArea(){
       return this.getWidth()*this.getHeight();
   }
   public double findPerimeter(){
       return 2*(this.getWidth() + this.getHeight());
   }
}

public class HinhChuNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cd = sc.nextInt();
        int cr = sc.nextInt();
        String mau = sc.next();
        Rectange hcn = new Rectange(cd, cr, mau);
        System.out.println(hcn.findPerimeter() + " " + hcn.findArea() + " " + hcn.getColor());
    }
    
}
