public class Main {

    //The while condition will continue executing the code block until the loop expression becomes false.
    //The do while will execute the code block once, then continue executing until the loop condition becomes false.
    public static void main(String[] args){

        //for statements have initialization, expression, and increment values.
        //while statements only have expressions (No initialization, no increment).
        for(int i = 1; i <=5; i++) {
            System.out.println(i);
        }


        //****************Below is an example of a while statement.
        //Only contains an expression, so variable is declared outside the code block, and increment
        //is assigned inside the code block.
        int j = 1;
        boolean isReady = false;
        while(isReady){
            if(j > 5){
                break;
            }
            System.out.println(j);
            j++;
        }
        //****************End of while statement.

        //****************Do while statement below (Uses declared variables from while statement).
        //Do while statement will enter into the "do" block, then check if the condition is false afterward.
        //This means the code will execute at least once and evaluate whether to run again afterward.
        //Adding the isReady = (j > 0) will set isReady to true every iteration, until the condition j >5 is met.
        do{
            if(j > 5){
                break;
            }
            System.out.println(j);
            j++;
            isReady = (j > 0);
        } while(isReady);
        //***************Do while statement above.

        //**********************************************Notes on continue statement below**********************
        //The continue statement will stop execution of a code block under certain conditions (In the if statement)
        //And then begin a new iteration again. In this case, omitting 25 and 50.

        int number = 0;
        while(number < 50){
            number +=5;
            if(number % 25 == 0){
                continue;
            }
            System.out.print(number + "_");
        }
    }

}
