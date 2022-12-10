//1. Write a simple java application that creates an abstract class Shape. 
//The class has read() and show() methods and PI as constant data members. 
//Create classes Rectangle and Circle that inherit shape class. Assume suitable data and member methods.

//Rectangle	Area = l × w	l = length w = width

import java.util.Scanner;
public class abs{

    public static void main(String[] args) {
        rect r = new rect();
        r.read();
        r.show();
        
    }
}
abstract class culculate{


    abstract void  read();
    int length;
    int width;
    int area;
    abstract void show();
 
} 
class  rect extends culculate{
   public void  read(){
       
        
        System.out.println("enter the length ");
        Scanner Sc = new Scanner(System.in);
        length = Sc.nextInt();
        System.out.println("enter the width ");
        width = Sc.nextInt();


   }


  public void show(){

    
       
        
     area =length*width;

     System.out.println("area = "+area);
     
        }  
       

       

    
  
}