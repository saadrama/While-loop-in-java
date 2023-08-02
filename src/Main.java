public class Main {
    public static void main(String[] args) {
        System.out.println("Loop");
        /*loops can execute a block of code as long as a specified condition is reached
        * Loops are handy because they save time, reduce errors, and they make code more readable*/
        //JAVA WHILE LOOP
        //The while loop loops through a block of code as long as a specified condition is true.
        int i=0;
        while (i<4){
            System.out.println(i);
            i++;
            //THe code in the loop will run, over and over again, as long as a variable (i) is less than 4.
            //Note :Do not forget to increase the variable used in the condition,Otherwise the loop will never end.
        }
        //THE DO/WHILE LOOP
        /*The do while loop is a variant of while loop.
        * This loop will execute the code block once
        * before checking if the conditon is true, then it will repeat the
        * loop as long as the condition is true*/
        int a=0;
        do {
            System.out.println(a);
            a++;
        }
        while (a<4);
        //The loop will always be executed once, even if the condition is false, because the code block is executed before the condiyion is tested


    }
}