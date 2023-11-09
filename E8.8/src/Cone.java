public class Cone {
    /**
     Calculates the volume of a cone.
     @param r the radius of the base of the cone
     @param h the height of the cone
     @return the volume of the cone
     */
    public static double coneVolume(double r, double h)
    {
        return 1.0 / 3.0 * Math.PI * r * r * h;
    }

    /**
     Calculates the surface area of a cone.
     @param r the radius of the base of the cone
     @param h the height of the cone
     @return the surface area of the cone
     */
    public static double coneSurface(double r, double h)
    {
        return Math.PI * r * r + Math.PI * r * Math.sqrt(r * r + h * h);
    }
}
