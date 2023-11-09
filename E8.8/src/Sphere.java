public class Sphere {
    /**
     Calculates the volume of a sphere.
     @param r the radius of the sphere
     @return the volume of the sphere
     */
    public static double sphereVolume(double r)
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(r, 3);
    }

    /**
     Calculates the surface area of a sphere.
     @param r the radius of the sphere
     @return the surface area of the sphere
     */
    public static double sphereSurface(double r)
    {
        return 4.0 * Math.PI * r * r;
    }
}
