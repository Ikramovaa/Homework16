public class Main {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(4,6);
        Rectangle rectangle=new Rectangle(22,12);
        Circle circle=new Circle(4,44,8);
        Square square=new Square(8);

        triangle.area();
        rectangle.area();
        circle.area();
        square.area();


    }
}