import java.util.*;
class Triangle{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter all sides of Triangle.");
    int side1=sc.nextInt();
    int side2=sc.nextInt();
    int side3=sc.nextInt();
    Triangle object=new Triangle();
System.out.println("perimeter of triangle is : "+object.calculatePerimeter(
side1,side2,side3));
System.out.println("area of triangle is : "+object.calculateArea(side1,side2,side3));
  }
  double calculatePerimeter(int s1,int s2,int s3){
    double perimeter=(s1+s2+s3);
    return perimeter;
  }

  double calculateArea(int s1,int s2,int s3){
    double s=(s1+s2+s3)/2;
    double area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    return area;
  }
}
