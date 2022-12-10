//2. Write a java program to implement a method named 'getRateOfInterest' 
//in such a way that different banks could have various Rates of Interest. 
//So make a class Bank as abstract class having 'getRateOfInterest' abstract method,
// and all other banks can vary their rate of interest by implementing that method.
public class inter {
   


    public static void main(String[] args) {
       
        vir v = new User();
        vir u = new User() {
              public void getRateOfInterest(int a){
                

              }
        };
        v.getRateOfInterest(19, 4, 5);
        u.getRateOfInterest(19, 4, 5);
            



    }


    
}
interface vir {

  public void  getRateOfInterest(int pricnciple,  int rate,int time);



    
}
class User implements vir {

int a;
   public void getRateOfInterest(int pricnciple,  int rate,int time){

    System.out.println("the principle is "+pricnciple);
       System.out.println("the rate is "+rate);
       System.out.println("the time is "+time);

       a=pricnciple*rate*time;

              System.out.println("the total is "+a);


        }

}
