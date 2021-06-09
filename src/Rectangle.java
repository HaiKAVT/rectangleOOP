public class Rectangle {
    double width, height;
    public Rectangle(){
    }
    public Rectangle(double width , double height){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public  double getPerimeter(){
        return (this.height + this.width);
    }
    public String Display(){
       return "Rectangle {" + "width = " + this.width + "height = " + this.height + "}";
    }
}
