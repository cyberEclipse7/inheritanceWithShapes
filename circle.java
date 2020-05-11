package practicinginheritance;

public class circle {
    private double radius;
    private double x;
    private double y;
    
    public circle()
    {
        this.radius = 0;
        this.x = 0;
        this.y = 0;
    }
    public circle(double radius, double x, double y)
    {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public void set(double radius, double x, double y)
    {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString()
    {
        return String.format("myCylinder: <([%.2f, %.2f], %.2f ", getX(), getY(), getRadius());
    }
    public double getArea()
    {
        return Math.PI * getRadius() * getRadius();
    }
    public double getCircumference()
    {
        return 2 * Math.PI * getRadius();
    }
}
