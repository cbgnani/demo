abstract class Shape{
    abstract double area(); //we use the double because of we need the value in decimals.
}
class Circle extends Shape{
    int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius; //if we want to use a return type then we  don't use void.
                                   //instead of void we use some datatype names(int ,double).
    }
}
class Rectangle extends Shape{
    int width;
    int height;
    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    public double area() {
        return width * height; //important remember this if method type is void
                               //then we use only (return;),we don't use the (return value;0.
    }
}
class Triangle extends Shape{
    int base;
    int height;
    public Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }
    public double area() {
        return (base * height)*1/2;
    }
}
public class findingarea {
    public static void main(String[] args){
        Shape cirarea=new Circle(5);
        cirarea.area();
        Shape recArea=new Rectangle(7,8);
        recArea.area();
        Shape triarea=new Triangle(7,8);
        triarea.area();
        Shape[] array=new Shape[3];
        array[0]=cirarea;
        array[1]=recArea;
        array[2]=triarea;
        for(int i=0;i<array.length;i++){
            System.out.println(array[i].area());
        }
    }
}
