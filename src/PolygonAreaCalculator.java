import java.util.Scanner;

public class PolygonAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of vertices of the polygon: ");
        int numVertices = scanner.nextInt();
        
        int[] xCoordinates = new int[numVertices];
        int[] yCoordinates = new int[numVertices];
        
        System.out.println("Enter the coordinates of the vertices:");
        
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + (i + 1) + " - x coordinate: ");
            xCoordinates[i] = scanner.nextInt();
            System.out.print("Vertex " + (i + 1) + " - y coordinate: ");
            yCoordinates[i] = scanner.nextInt();
        }
        
        double area = calculatePolygonArea(numVertices, xCoordinates, yCoordinates);
        System.out.println("The area of the polygon is: " + area);
    }
    
    public static double calculatePolygonArea(int numVertices, int[] x, int[] y) {
        double area = 0;
        
        int j = numVertices - 1;
        for (int i = 0; i < numVertices; i++) {
            area += (x[j] + x[i]) * (y[j] - y[i]);
            j = i;
        }
        
        return Math.abs(area / 2);
    }
}
