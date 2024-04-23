import java.util.Scanner;

public class GuessNumber{
    
    public static int takingInput(){
        System.out.println("Please enter a number 1-100: ");
     
        Scanner myObj = new Scanner(System.in);

        while(!(myObj.hasNextInt())){
            System.out.println("Please enter an integer number!");
            String value=myObj.next();
        }
        return myObj.nextInt();
    }
    
public static void main(String[] args){

 int counter=0;
 int random = (int)(Math.random()*101);
 System.out.println(random);

 int guenum=takingInput();

 while(guenum!=random)
 {
    if(guenum<random){
        System.out.println("Guess higher number!");
        guenum=takingInput();
        counter++;
    }
    else if(guenum>random){
        System.out.println("Guess lower number!");
        guenum=takingInput();
        counter++;
    }
 }

    System.out.println("You got it! Congratulations");
    System.out.println("You got it in " + counter + " times!");
}
}


    