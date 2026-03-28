public class AreaCalculator { 
    void area( int side){         int area = side*side; 
        System.out.println("Area of Square :"+area); 
    } 
    void area ( int length , int breadth){ 
        int area = length*breadth; 
        System.out.println("Area of rectangle :"+area); 
 
    } 
 
    void area(double radius){ 
        double area = 3.14*radius*radius; 
        System.out.println("Area of Circle :"+area); 
    } 
    public void main(String args[]){         area(5);         area(4,3);         area(2.5); 
 
    } 
 
} 
 
 
