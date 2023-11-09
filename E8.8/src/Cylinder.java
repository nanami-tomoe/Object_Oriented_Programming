public class Cylinder {
    /**
     Calculates the volume of a cylinder.
     @param r the radius of the cylinder
     @param h the height of the cylinder
     @return the volume of the cylinder
     */
    public static double cylinderVolume(double r, double h)
    {
        return Math.PI * r * r * h;
    }

    /**
     Calculates the surface area of a cylinder.
     @param r the radius of the sphere
     @return the surface area of the cylinder
     */
    public static double cylinderSurface(double r, double h)
    {
        return 2 * Math.PI * r * (r + h);
    }
}
