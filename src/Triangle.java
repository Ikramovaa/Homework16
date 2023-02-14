public class Triangle extends Shapes {
    public int base;
    public int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void area(){
        System.out.println((base*height)/2);
    }
}
