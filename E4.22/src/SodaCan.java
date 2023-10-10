public class SodaCan {
    private double diameter;
    private double height;

    public SodaCan(double h, double d) {
        height = h;
        diameter = d;
    }

    public double getVolume() {
        return Math.pow(diameter/2, 2) * Math.PI * height;
    }

    public double getSurfaceArea() {
        return (2*Math.pow(diameter/2, 2)* Math.PI) + (diameter * Math.PI * height);
    }
}
