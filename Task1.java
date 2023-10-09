import java.util.*;

public class Task1 {

    public static int Random(int a, int b){
        Random random = new Random();
        int min = a , max = b;
        return random.nextInt(max-min+1)+min;
        
    }
    public static void main(String args[]) {
        int round = 1;
        int score = 0;
        
        while(round<=3){
            System.out.println("--Round "+round+ "--");
            
            int n = Random(1,100);

            System.out.println("Number generated");
            System.out.println("You have only 3 attempts");
            System.out.println();

            Scanner sc = new Scanner(System.in);
            int attempts = 0;
            int guess = 0;

            do{
                System.out.print("Enter you guess : ");
                guess = sc.nextInt();
                

                if(n!=guess){
                    if(guess<n){ 
                        System.out.println("Your guess is smaller than the generated number");
                    } else{
                        System.out.println("Your guess is larger than the generated number");
                    }
                } attempts++; 
                
                //System.out.println();
            }while(n!= guess && attempts <3);
            System.out.println();

            if(guess == n){
                System.out.println("Your guess is correct");
                             
                switch(attempts){
                    case 1 : score+=300;  break;  
                    case 2 : score+=200;  break;
                    case 3 : score+=100;  break;
                }
                System.out.println("Current score : " + score);
            }else{
                
                System.out.println("You have exhausted all your attempts. The correct number was: "+n);
            } 
            round++;         
            System.out.println("-------------------------------------------------------------------------------");                
        }     
        System.out.println("Your total score is : " + score) ;
    }
}