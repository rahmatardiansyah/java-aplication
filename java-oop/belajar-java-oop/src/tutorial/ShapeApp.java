package tutorial;

public class ShapeApp {
    public static void main(String[] args) {
        
        Shape shape = new Shape();
        System.out.println(shape.getCorner());
        
        Rectangel rectangel = new Rectangel();
        System.out.println(rectangel.getCorner());
        
        //mengakses super keyword
        System.out.println(rectangel.getParentCorner());
    }
}
