public class Line {
    Point startPoint;
    Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "Line{" +
                "startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }

    public double getLenght() {
        double pow1 = Math.pow(startPoint.getX() - endPoint.getX(), 2);
        double pow2 = Math.pow(startPoint.getY() - endPoint.getY(), 2);
        double sqrt = Math.sqrt(pow1 + pow2);
        return sqrt;
    }
}
