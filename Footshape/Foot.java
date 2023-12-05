package Footshape;
import java.util.Scanner;

public class Foot {
    public void draw(int a) {
        FootShape f = new FootShape();
        if (a == 1) {
         f.drawAsEllipse();
      }
        else if (a == 2) {
         f.drawAsRectangle();
      } else {
         System.out.print("error");
      }    
    }

    public static void main(String[] args) {
        Foot F = new Foot();
        Scanner sc = new Scanner(System.in);
        System.out.print("What to draw? 1.Ellipse, 2.Rectangle ");
        F.draw(sc.nextInt());  
    } 

}
