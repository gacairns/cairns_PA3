import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Random;

public class cairns_p1 {
    static int correct=0, incorrect=0;

    public static int multiply() {
        SecureRandom rand = new SecureRandom();
        int rand1 = rand.nextInt(10);
        int rand2 = rand.nextInt(10);

        System.out.println("How much is " + rand1 + " times " + rand2 + "?");
        return rand1*rand2;
    }

    public static int add(){
        SecureRandom rand = new SecureRandom();
        int rand1 = rand.nextInt(10);
        int rand2 = rand.nextInt(10);

        System.out.println("How much is "+rand1+" plus "+rand2+"?");
        return rand1+rand2;
    }

    public static double divide(){
        SecureRandom rand = new SecureRandom();
        double rand1 = rand.nextInt(10);
        double rand2 = rand.nextInt(10);

        System.out.println("How much is "+rand1+" divided by "+rand2+"?");
        return rand1/rand2;
    }

    public static int subtract(){
        SecureRandom rand = new SecureRandom();
        int rand1 = rand.nextInt(10);
        int rand2 = rand.nextInt(10);

        System.out.println("How much is "+rand1+" minus "+rand2+"?");
        return rand1-rand2;
    }

    public static void main(String args[]){
        int num, userNum, choice, correct, incorrect, count;
        double numDouble, userNumDouble, percent;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter level number: (1: addition, 2: subtraction, 3: multiplication, and 4: division) ");
        choice = scnr.nextInt();
        while(true){
            switch(choice){
                case 1:
                    count = 0;
                    correct = 0;
                    incorrect = 0;
                    while(count<10){
                        num = add();
                        userNum = scnr.nextInt();
                        if (userNum == num){
                            System.out.println("Correct!");
                            correct++;
                        }
                        else{
                            System.out.println("Nope!");
                            incorrect++;
                        }
                        count++;
                    }
                    percent = (correct/10)*100;
                    if (percent>75){
                        System.out.println("Congratulations, you are ready to move on!");
                        System.out.println("Correct: "+correct);
                        System.out.println("Incorrect: " +incorrect);

                    }
                    else if (percent>=75){
                        System.out.println("Please go ask the teacher for more help");
                        System.out.println("Correct: "+correct);
                        System.out.println("Incorrect: " +incorrect);
                    }
                    break;
                case 2:
                    count = 0;
                    correct = 0;
                    incorrect = 0;
                    while(count<10){
                        num = subtract();
                        userNum = scnr.nextInt();
                        if (userNum == num){
                            System.out.println("Correct!");
                            correct++;
                        }
                        else{
                            System.out.println("Nope!");
                            incorrect++;
                        }
                        count++;
                    }
                    percent = (correct/10)*100;
                    if (percent>75){
                        System.out.println("Congratulations, you are ready to move on!");
                        System.out.println("Correct: "+correct);
                        System.out.println("Incorrect: " +incorrect);

                    }
                    else if (percent>=75){
                        System.out.println("Please go ask the teacher for more help");
                        System.out.println("Correct: "+correct);
                        System.out.println("Incorrect: " +incorrect);
                    }
                    break;
                case 3:
                    count = 0;
                    correct = 0;
                    incorrect = 0;
                    while(count<10){
                        num = multiply();
                        userNum = scnr.nextInt();
                        if (userNum == num){
                            System.out.println("Correct!");
                            correct++;
                        }
                        else{
                            System.out.println("Nope!");
                            incorrect++;
                        }
                        count++;
                    }
                    percent = (correct/10)*100;
                    if (percent>75){
                        System.out.println("Congratulations, you are ready to move on!");
                        System.out.println("Correct: "+correct);
                        System.out.println("Incorrect: " +incorrect);

                    }
                    else if (percent>=75){
                        System.out.println("Please go ask the teacher for more help");
                        System.out.println("Correct: "+correct);
                        System.out.println("Incorrect: " +incorrect);
                    }
                    break;
                case 4:
                    count = 0;
                    correct = 0;
                    incorrect = 0;
                    while(count<10){
                        numDouble = divide();
                        userNumDouble = scnr.nextDouble();
                        if (userNumDouble == numDouble){
                            System.out.println("Correct!");
                            correct++;
                        }
                        else{
                            System.out.println("Nope!");
                            incorrect++;
                        }
                        count++;
                    }
                    percent = (correct/10)*100;
                    if (percent>75){
                        System.out.println("Congratulations, you are ready to move on!");
                        System.out.println("Correct: "+correct);
                        System.out.println("Incorrect: " +incorrect);

                    }
                    else if (percent>=75){
                        System.out.println("Please go ask the teacher for more help");
                        System.out.println("Correct: "+correct);
                        System.out.println("Incorrect: " +incorrect);
                    }
                    break;
            }
        }
    }
}

