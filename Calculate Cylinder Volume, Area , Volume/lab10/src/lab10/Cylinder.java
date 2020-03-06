
package lab10;


public class Cylinder extends Volume {
    
    double radius;
    final double pie = 3.1416;
    
    double cylinderVolume()
    {
        double volume = pie*radius*radius*height;
        return volume;
    }
    
}
