import java.util.*;
public class numbergame {
    public static void main(String[] args){

        //Scanner class for user input
        Scanner sc = new Scanner(System.in);

        //generate the random number 
        int number =1+(int)(100*Math.random());

        //no. of trails for user
        int K=5,i,guess;

        System.out.println("A number is chossen"+"between 1 to 100"+"guess the number"+"within a 5 trails");

        //iteration over the k trails
        for(i=0;i<K;i++){
            System.out.print("Guess the Number :");

            //take the input no is gussed
            guess=sc.nextInt();

            //the number is gussed
            if(number==guess){
                System.out.println("Congratulation!!");
                break;
               
            }else if(number<guess && i!=K-1){
                System.out.println("the number is "+"lesser than "+guess);
            }else if(number>guess && i!=K-1){
                System.out.println("the number is "+"greater than"+guess);
            }
        }
        if(i==K){
        System.out.println("You have to try maximum"+"k no. of trails.");
        System.out.println("the real number is :" +number);
        }

    }
}
