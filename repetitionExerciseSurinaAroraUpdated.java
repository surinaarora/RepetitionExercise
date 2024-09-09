/*
@Author: Surina Arora 
@Date: September 5, 2024
@Description: Using a switch, this program encorporates 6 different 
methods (or 6 programs), that all output an answer to a specific math question. 
This is done when the user inputs a number between 1-6 (indicating a program 
of their choice), which then runs the program and outputs an answer. The code will finish once the 
user enters 0 to finish off the loop. 
*/ 

import java.util.Scanner;

class repetitionExerciseSurinaAroraUpdated {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Loop to continuously ask for input
        do {
            System.out.println("Enter a number from 1 to 6 to choose a program, or 0 to finish running the program.");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    programOne();
                    break;
                case 2:
                    programTwo();
                    break;
                case 3:
                    programThree();
                    break;
                case 4:
                    programFour();
                    break;
                case 5:
                    programFive();
                    break;
                case 6:
                    programSix();
                    break;
                case 0:
                    System.out.println("Program Finished. ");
                    break;
                default:
                    System.out.println("Invalid choice, please enter a number from 1 to 6.");
            }
        } while (choice != 0); //loop continues until the user enters 0
    }
    
    // Program 1: Sum of odd integers between 1 and 99  
    public static void programOne() {
    
    // Variable Declaration and Initialization
        int start = 1;
        int end = 99;
        int sum = 0;
        
     // Program Execution and Output 
        for (int i = start; i <= end; i++) {
            if (i % 2 == 1)
                sum = sum + i;
        }
        System.out.printf("%d is the sum of all odd integers between 1-99.%n", sum);
    } //end of program one 

    // Program 2: Investment calculations
    public static void programTwo() {
        // Part A: investing from 1850 to 2024
        // Variable Declaration and Initialization
        double startingAmountA = 100.0;
        double interestRateA = 4.0;
        int startYearA = 1850;
        int endYearA = 2024;
        int yearsInvested = endYearA - startYearA;

        for (int i = 1; i <= yearsInvested; i++) {
            startingAmountA = startingAmountA * (1 + interestRateA / 100);
        }
        
          /*******************************************************************************************************
          for loop is running the block continously. 
          i is set to 1, and the loop will continue until i is less than or equal to the years invested, increasing 
          by 1 each time. It then calculates the new principal by adding the amount of interest for one year every 
          year, by changing it to a decimal, then adding one to show the increase in interest by 4% every year.  
          *******************************************************************************************************/ 

        System.out.printf("Part A Answer: Investing 4 percent annually with a starting amount of $100 for 174 years gives you a total of %.2f %n", startingAmountA);

        // Part B: investing from 2024 to 2025
        // Variable Declaration and Initialization 
        double startingAmountB = 1000.0;
        double interestRateB = 2.5;
        int yearsInvestedB = 2025 - endYearA;//the endYearA from part A is 2024, our current year
        
        //Program Execution and Output 
        for (int i = 1; i <= yearsInvestedB; i++) {
            startingAmountB = startingAmountB * (1 + interestRateB / 100);
        } //same concept as the for loop in part A 
        System.out.printf("Part B Answer: If 1000 was invested today, with an annual rate of 2.5 percent, then by 2025 it would be worth %.2f %n", startingAmountB);
    } //end of program 2 

    // Program 3: Doubling allowance
    public static void programThree() {
    
    // Variable Declaration and Initialization 
        double finalAmount = 10000;
        double currentSum = 0.0; //basically just the accumulated amount 
        double allowance = 1.0;
        int months = 0; //trying to solve for this variable 
        
    //Program Execution and Output 

        while (currentSum < finalAmount) {
            currentSum = currentSum + allowance; //added the amount of allowance given for the current month
            allowance = allowance * 2; //this calculates the new allowance every month as it doubles
            months++; //incremented month counter
        } //ends loop when reaching 10000 on new allowance 
        System.out.println("It will take " + months + " months to accumulate $10,000.");
    } //end of program 3 

    // Program 4: George buying books
    public static void programFour() {
    
    //Variable Declaration and Initialization 
        double piggyBankCash = 1000;
        double costOfOneBook = 1.49;
        int booksPurchased = 2; //per week 
        double costOfTwoBooks = booksPurchased * costOfOneBook;
        
     //Program Execution and Output 

        int numberOfBooks = (int) (piggyBankCash / costOfTwoBooks);
        
        /**(***********************************************************************************
        firstly, the piggy bank cash is being divided by the cost of 2 books.
        now, since both the cash and cost of 2 books are double values, it will return a double.
        so, i simply casted the number with (int), to remove the decimal in the answer. 
        ***************************************************************************************/ 
        
        int totalNumberOfBooks = numberOfBooks * booksPurchased;

        System.out.println("George can buy a total of " + totalNumberOfBooks + " books before he depletes his $1000.");
    } // end of program 4 

    // Program 5: Apples brought and stolen
    public static void programFive() {
    
    //Variable Declaration and Initialization 
        int totalSchoolDays = 194;
        int everyThirdDay = 3; //bart and millhouse bring every 3rd day
        int everyFifthDay = 5; //bart steals every 5th day
        
    //Program Execution and Output 
    
        /**************************************************************************************
        initially, what we are doing below, is using our constant variables above, to calculate 
        simple numbers that we will need to know in order to solve this problem
        **************************************************************************************/

        int daysApplesBrought = totalSchoolDays / everyThirdDay; //calculates how many days out of the 194 days that bart and millhouse bring apples
        int totalApples = daysApplesBrought * 2; //calculates how many apples brought by bart and millhouse on the days apples are brought
        int stolenApples = totalSchoolDays / everyFifthDay; //calculates how many days out of the 194 days that bart steals an apple

        /**********************************************************************
        finally, using the calculations above, we can calculate how many apples
        Ms. Crobopple will have at the end of the school year
        ***********************************************************************/

        int finalApples = totalApples - stolenApples;
         System.out.println("Ms. Crobopple will have " + finalApples + " apples at the end of the school year.");
    } // end of program 5 

    // Program 6: Jelly Beans consumption and purchase
    public static void programSix() {
    
    //Variable Declaration and Initialization 
        int initialJellyBeans = 231;
        int moneyInCents = 2000; //converted $20 to cents
        int day = 0;
        int jellyBeansEaten = 6;
        int jellyBeansBought = 8;
        int costPerJellyBean = 5;
        int costPerPurchase = jellyBeansBought * costPerJellyBean; //40 cents is the total per purchase, 8 jelly beans x 5 cents
        int eatDay = 3; //tracks what day George eats jelly beans
        int buyDay = 5; //tracks what day George steals jelly beans
        
        //Program Execution and Output 
        
        /*******************************************************************************************************
        while loop is being used to calculate the answer. it will continue to run as long as George has
        either money or jelly beans. 
        
        going line by line, the day counter wil increment every time the loop runs. then, it checks if it 
        is the day George is supposed to eat jelly beans. "eatDay" is initially set to day 3. everytime the third 
        day hits, it updates it to the next time he will eat. 
        ********************************************************************************************************/
        
        while (initialJellyBeans > 0 && moneyInCents >= 0) {
            day++;
            if (day == eatDay) {
                initialJellyBeans -= jellyBeansEaten; //subtracts amount ate if its a day to eat
                eatDay += 3; //next eating day (every 3rd day)

                if (initialJellyBeans <= 0) {
                    System.out.println("George will run out of jelly beans first on day " + day);
                    break;
                } //if no jelly beans are left, this if statement will run, and the break will stop the loop
            } //close while loop
            
            /*********************************************************************************************
            this next block of code starts with checking if the current day matches with the day George is 
            supposed to buy jelly beans(every 5th day, it continues to update itself).
            then, it will check to see if George has enough money to buy 8 jelly beans(40 cents).
            if he has enough, it will add 8 jellybeans to the amount he already has, and subtracts 40 cents 
            from the amount of money he already has. 
            **********************************************************************************************/

            if (day == buyDay) {
                if (moneyInCents >= costPerPurchase) {
                    initialJellyBeans += jellyBeansBought;
                    moneyInCents -= costPerPurchase;
                    buyDay += 5;
                } else {
                    System.out.println("George runs out of money first on day " + day); //if George doesn't have enough money, then this will print out
                    break; //no money, will stop the loop
                } //closes else statement
            } //closes if statement
        }//closes while loop
    } // end of program 6 
} // end class 
