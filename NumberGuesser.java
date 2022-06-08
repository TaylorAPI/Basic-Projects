import java.util.*;
public class NumberGuesser {
    public static void main(String[] args){
        Randomizer r = new Randomizer(); // Random
        Scanner sc = new Scanner(System.in); // Get User's Input
        boolean quit = false;

        while(true){   // Allows the user to keep guessing a number
            System.out.println(" Please Enter A Value \n Hit 0 To Quit");
            int userPick = sc.nextInt();

            if(userPick==0){ // Will exit the code if 0 is pressed
                System.exit(0);
            }
            if(userPick == r.RandomNum()){
                System.out.println(" Congrats , that is the right number!");
            }
           else{ // If user input does not equal the random number they will have to try again or quit
                System.out.println("Wrong Number Try Again \n The Value was");
                System.out.println(r.RandomNum());
            }
        }
    }
}
class Randomizer{
public int RandomNum(){
    Random r = new Random();
   int RandomValue = r.nextInt(10) + 1 ; // Will start at 1 and go to 10
   // int RandomValue = 2;
    return RandomValue;
}

}


