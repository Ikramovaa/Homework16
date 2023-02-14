public class Circle extends  Shapes{
    public int radius;
    public  int circumference;
    public  int diameter;

    public Circle(int radius, int circumference, int diameter) {
        this.radius = radius;
        this.circumference = circumference;
        this.diameter = diameter;
    }

    @Override
    public void area(){
        System.out.println((circumference/diameter)*radius*radius);
    }
}
