public class Q5 {
    public static double area(int n, double side) {
        return (n*side*side)/(4*Math.tan(Math.PI/n));
    }

    public static void main(String[] args) {
        double polygonArea = area(5,5);
        System.out.println("Area of the regular polygon: " + polygonArea);
    }
}
