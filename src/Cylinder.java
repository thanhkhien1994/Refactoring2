public class Cylinder {
    public static double getVolume(int radius, int height) {
        return getPerimeter(radius, height) * height + 2 * getArea(radius, height);

    }

    public static double getArea(int radius, int height) {
        return Math.PI * radius * radius;
    }

    public static double getPerimeter(int radius, int height) {
        return 2 * Math.PI * radius;
    }

}
