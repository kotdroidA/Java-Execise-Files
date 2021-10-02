import java.util.*;
class Average{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int sum=0;
    int count=0;
    System.out.println("please enter 10 number");
    for(int i =0;i<10;i++){
      int num=sc.nextInt();
      count++;
      sum=sum+num;
    }
    int average=sum/count;
    System.out.println(sum+","+average);
  }
}
