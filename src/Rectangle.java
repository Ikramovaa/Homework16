public class Rectangle extends Shapes{
    public int length;
    public int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area(){
        System.out.println(length*width);
    }

}
