package stqa.pft.sandbox;

/**
 * Created by Vova on 8/8/2016.
 */
public class Rectangle {

  public double a, b;

  public Rectangle (double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double area() {
    return this.a*this.b;
  }
}
