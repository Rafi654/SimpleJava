public class Driver{
     public static void main(String arg[])
    {
        Rectangular rect=new Rectangular();
        Circle circle=new Circle();
        System.out.println("Area of rectangular: "+rect.compute(52.2f,40.0f));
        System.out.println("Area of Circle: "+circle.compute(10.5f,63.0f));
    }

}