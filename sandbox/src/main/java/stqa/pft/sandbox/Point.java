package stqa.pft.sandbox;

public class Point {

  public double x;
  public double y;

  public Point(double xxx, double yyy) {
    this.x = xxx;
    this.y = yyy;
  }

  public double distance(Point p2) {
    double delta_x = p2.x - x;
    double delta_y = p2.y - y;
    return Math.sqrt(delta_x * delta_x + delta_y * delta_y);
  }

}
