import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) throws Exception {
        double side, area, numeratorArea, denominatorArea;
        System.out.println("This program will calcluate the area of a hexagon.");
        System.out.println("Please enter the side length");
        Scanner user = new Scanner(System.in);
        side = user.nextDouble();
        area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("The are of the hexagon is"+ area);



    }
}
