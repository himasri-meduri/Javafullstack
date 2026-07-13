import java.util.Scanner;
class Box{
 double width;
double height;
double depth;
Box(double w,double h,double d
    width = w;
    height = h;
    depth = d;)
    double volume(){
double vol=width*height*depth;
return vol;
    }
public static void main(String args[]){
    Box b=new Box(10.5,5,6);
   double vol= b.volume();
    System.out.println("Volume:" +vol);
}
}