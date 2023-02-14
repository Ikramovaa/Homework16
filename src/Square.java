public class Square extends  Shapes{
    int lengthOfSide;

    public Square(int lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public void area(){
        System.out.println(lengthOfSide*lengthOfSide);
    }
}
