package stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    hello("World");

    Square s = new Square(6);
    Rectangle r = new Rectangle(3,4);

    System.out.println("Area of a square with side length of " + s.l + " equals " + s.area());
    System.out.println("Area of a rectangle with side lengths of " + r.a + " and " + r.b + " equals " + r.area());

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }


}