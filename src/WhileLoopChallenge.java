public class WhileLoopChallenge {

    public static void main(String[] args){
        int i = 5;
        int totalOddNumbers = 0;
        int totalEvenNumbers = 0;

        //It is considered a better practice to increment first in a while loop, unlike what I did in this example.
        //This makes it easier to not accidentally create an infinite loop.
        //It also helps when using a continue statement.

        while(i <= 20){
            i++;
            if(isEvenNumber(i)){
                totalEvenNumbers++;
            }
            else if(!isEvenNumber(i)){
                totalOddNumbers++;
            }
            if(isEvenNumber(i)){
                System.out.println(i + " is even");
            }
            if(i > 20 || totalEvenNumbers == 5){
                System.out.println("Total odd numbers found is " + totalOddNumbers);
                System.out.println("Total even numbers found is " + totalEvenNumbers);
                break;
            }



        }

    }

    public static boolean isEvenNumber(int number){

        if(number % 2 == 0){
            return true;
        }
        return false;
    }

}
