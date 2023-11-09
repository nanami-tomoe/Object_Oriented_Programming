public class Geometry {
    public static double cubeVolume(double h) {
        return h*h*h;
    }

    public static double cubeSurface(double h) {
        return 6*h*h;
    }

    public static double sphereVolume(double r) {
        return (double) 4/3*r*r*r*Math.PI;
    }

    public static double sphereSurface(double r) {
        return 4*r*r*Math.PI;
    }

    public static double cylinderVolume(double r, double h) {
        return r*r*Math.PI*h;
    }

    public static double cylinderSurface(double r, double h) {
        return 2*r*r*Math.PI + 2*r*Math.PI*h;
    }

    public static double coneVolume(double r, double h) {
        return (double) 1/3*r*r*Math.PI*h;
    }

    public static double coneSurface(double r, double h) {
        return Math.PI*r*2 + Math.PI*r*Math.sqrt(h*h + r*r);
    }
}
