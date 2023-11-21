import java.util.Scanner;

public class Program {
    //your code goes here
    public static void bot(){
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        if(userInput == 1){
            System.out.println("Order confirmed");
        }else if(userInput == 2){
            System.out.println("info@sololearn.com");
        }else{
            System.out.println("Try again");
        }
        sc.close();
    }
    /*
    User message: "1", Reply: "Order confirmed"
    User message: "2", Reply: "info@sololearn.com"
    For any other number, the reply should be: "Try again". 
    */
    public static void main(String[] args) {
        bot();
    }
}