public class CompareLine {

    public Line getLongerLine(Line line1, Line line2) {
        double line1Lenght = line1.getLenght();
        double line2Lenght = line2.getLenght();

        if (line1Lenght > line2Lenght) {
            return line1;
        } else {
            return line2;
        }
    }
}
