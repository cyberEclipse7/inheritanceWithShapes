package practicinginheritance;

public class cylinder extends circle {
    private double height;
    
    public cylinder()
    {
        super();
        this.height = 0;
    }
    public cylinder(double radius, double x, double y ,double height)
    {
        super(radius, x, y);
        this.height = height;
    }
    public double getHeight()
    {
        return height;
    }

    /**
     *
     * @param radius
     * @param x
     * @param y
     * @param height
     */
    public void set(double radius, double x, double y ,double height)
    {
        super.set(radius, x, y);
        this.height = height;
    }
    @Override
    public String toString()
    {
        return String.format(super.toString() + "), %.2f > \n \nSurface area of myCylinder : %.2f \n \nVolume of myCylinder : %.2f",
                              getHeight(), getSurfaceArea(), getVolume());
    }
    public double getSurfaceArea()
    {
        return 2 * super.getArea() + getHeight() * super.getCircumference();
    }
    public double getVolume()
    {
        return getHeight() * super.getArea();
    }
}
