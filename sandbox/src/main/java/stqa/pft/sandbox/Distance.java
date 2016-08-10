package stqa.pft.sandbox;

public class Distance {

  public static void main(String[] args) {
    Point point1 = new Point(5, 6);
    Point point2 = new Point(2, 2);

    soutDistance(point1, point2, distance(point1, point2));
    soutDistance(point1, point2, distance(point2, point1));

    soutDistance(point2, point1, point2.distance(point1));
    soutDistance(point2, point1, point1.distance(point2));
  }

  public static double distance(Point p1, Point p2) {
    double delta_x = p2.x - p1.x;
    double delta_y = p2.y - p1.y;
    return Math.sqrt(delta_x * delta_x + delta_y * delta_y);
  }

  public static void soutDistance(Point p1, Point p2, double distance) {
    System.out.println("Distance between points (" + p1.x + ", " + p1.y + ") and (" +
            p2.x + ", " + p2.y + ") equals " + distance + ".");
  }
}
