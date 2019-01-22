import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //TWORZENIE 1 odcinka
        System.out.println("Podaj współrzędną 'x' punktu startowego pierwszego odcinka: ");
        int startPoint1_x = scanner.nextInt();
        System.out.println("Podaj współrzędną 'y' punktu startowego  pierwszego odcinka: ");
        int startPoint1_y = scanner.nextInt();

        Point startPoint1 = new Point(startPoint1_x, startPoint1_y);

        System.out.println("Podaj współrzędną 'x' punktu końcowego pierwszego odcinka: ");
        int endPoint1_x = scanner.nextInt();
        System.out.println("Podaj współrzędną 'y' punktu końcowego pierwszego odcinka: ");
        int endPoint1_y = scanner.nextInt();

        Point endPoint1 = new Point(endPoint1_x, endPoint1_y);
        Line line1 = new Line(startPoint1, endPoint1);

        //TWORZENIE 2 ODCINKA
        System.out.println("Podaj współrzędną 'x' punktu startowego drugiego odcinka: ");
        int startPoint2_x = scanner.nextInt();
        System.out.println("Podaj współrzędną 'y' punktu startowego drugiego odcinka: ");
        int startPoint2_y = scanner.nextInt();

        Point startPoint2 = new Point(startPoint2_x, startPoint2_y);

        System.out.println("Podaj współrzędną 'x' punktu końcowego drugiego odcinka: ");
        int endPoint2_x = scanner.nextInt();
        System.out.println("Podaj współrzędną 'y' punktu końcowego drugiego odcinka: ");
        int endPoint2_y = scanner.nextInt();

        Point endPoint2 = new Point(endPoint2_x, endPoint2_y);
        Line line2 = new Line(startPoint2, endPoint2);

        CompareLine compareLine = new CompareLine();
        Line longerLine = compareLine.getLongerLine(line1, line2);

        System.out.println("Wiekszy jest odcinek: " + longerLine);
        System.out.println("Początek odcinka dłuższego: " + longerLine.getStartPoint());
        System.out.println("Koniec odcinka dłuższego: " + longerLine.getEndPoint());
        System.out.println("Długość odcinka dłuższego: " + longerLine.getLenght());
    }
}
