package com.company;
import java.util.*;
import java.math.*;
/**
 *
 * @author arkarmaura
 */

class index {
// Main Scanner class
    static Scanner sc = new Scanner(System.in);
}

class option extends index {
    public static void main(String args[]) {


        option.main();


    }

    public static void main() {
        // This is the menu
        System.out.println("lets do some calculations");
        System.out.println("what do you want to do ");
        System.out.println("Here are your options");
        System.out.println("0- Exit");
        System.out.println("1- Sum");
        System.out.println("2- Difference");
        System.out.println("3- Divide");
        System.out.println("4- Multiply");
        System.out.println("5- Check even or odd");
        System.out.println("6- To calculate factorial");
        // System.out.println("7- To check coulomb force between two charges");
        System.out.println("enter any number listed above to continue :)");
        String i = sc.next();

        while (true) {
            if (i.equals("1")) {
                System.out.println("ok, good choice. Lets do some additions :)");
                try {
                    sum.main();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (i.equals("2")) {
                System.out.println("ok, good choice lets find some difference  ;) ");
                try {
                    minus.main();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }


            } else if (i.equals("3")) {
                System.out.println("ok, good choice lets do some divisions  :]");
                try {
                    divideS.main();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }


            } else if (i.equals("4")) {
                System.out.println("ok, good choice lets do some multiplication :{)");
                try {
                    multiply.main();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }


            } else if (i.equals("0")) {
                break;
            } else if (i.equals("5")) {
                System.out.println("lets check even odd");
                try {
                    evenOdd.main();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (i.equals("6")) {
                System.out.println("Factorials ! cool ! ");
                try {
                    factorial.main();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (i.equals("7")) {
                System.out.println("ok, good choice lets find force between charges  ;) ");
                try {
                    chargbf.main();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {

                System.out.println("Invalid input   :(");
                System.out.println("please try again :)");
                option.main();


            }


        }


    }


    class minus extends index {
        // Class to differentiate numbers
        public static void main() {
            while (true) {
                System.out.println("enter the first no from which you want to subtract :~~");
                float a = sc.nextInt();
                System.out.println("-");
                float b = sc.nextInt();
                System.out.println(a + " - " + b + " is :~~");
                float c = a - b;
                System.out.println("=   " + c);
                System.out.println("do you want to quit or you want to go to the menu(if yes enter 'y' else enter 'n' )" + "(for menu enter m)");
                String dj = sc.next();
                if (dj.equals("y")) {
                    break;


                } else if (dj.equals("n")) {
                    System.out.println("welcome again :)");
                    continue;

                } else if (dj.equals("m")) {

                    option.main();


                } else {

                    System.out.println("invalid input");
                    System.out.println("try again!!");
                    break;

                }


            }


        }


    }


    class sum extends index {
        // Class to add the numbers
        public static void main() {
            while (true) {
                System.out.println("enter the first no you want to add billow :~~");
                float a = sc.nextInt();
                System.out.println("+");
                float b = sc.nextInt();
                System.out.println("The sum of" + a + "and" + b + " is :~~");
                float c = a + b;
                System.out.println("=   " + c);
                System.out.println("do you want to quit or you want to go to the menu(if yes enter 'y' else enter 'n' )" + "(for menu enter m)");
                String dj = sc.next();
                if (dj.equals("y")) {
                    break;


                } else if (dj.equals("n")) {
                    System.out.println("welcome again :)");
                    continue;
                } else if (dj.equals("m")) {

                    option.main();


                } else {

                    System.out.println("invalid input");
                    System.out.println("try again!!");
                    break;


                }
            }

        }
    }


    class divideS extends index {
        // Class to divide numbers
        public static void main() {
            while (true) {
                System.out.println("enter the two want to divide billow :~~");
                float a = sc.nextInt();
                System.out.println("enter the next no through which you want to divide:~~");
                float b = sc.nextInt();
                System.out.println(a + " / " + b + " is :~~");
                float c = a / b;
                System.out.println("=   " + c);
                System.out.println("do you want to quit or you want to go to the menu(if yes enter 'y' else enter 'n' )" + "( for menu enter m)");
                String dj = sc.next();
                if (dj.equals("y")) {
                    break;


                } else if (dj.equals("n")) {
                    System.out.println("welcome again :)");
                    continue;
                } else if (dj.equals("m")) {

                    option.main();


                } else {

                    System.out.println("invalid input");
                    System.out.println("try again!!");
                    break;
                }


            }
        }
    }


    class multiply extends index {
        // Class for the multiplication option in the option main()
        public static void main() {

            while (true) {
                System.out.println("enter the number want to multiply billow :~~");
                float a = sc.nextInt();
                System.out.println("enter the next no billow through which you want to multiply:~~");
                float b = sc.nextInt();
                System.out.println(a + " x " + b + " is :~~");
                float c = a * b;
                System.out.println("=   " + c);
                System.out.println("do you want to quit or you want to go to the menu(if yes enter 'y' else enter 'n' )" + "( for menu enter m)");
                String dj = sc.next();
                if (dj.equals("y")) {
                    break;


                } else if (dj.equals("n")) {

                    System.out.println("welcome again :)");
                    continue;
                } else if (dj.equals("m")) {

                    option.main();


                } else {

                    System.out.println("invalid input");
                    System.out.println("try again!!");
                    break;

                }


            }


        }


    }

    class factorial extends index {
        // Class to check factorial
        public static void main() {

            while (true) {
                System.out.println("enter the number want to calculate the factorial of :~~");
                long a = Integer.parseInt(sc.next());
                BigInteger b = new BigInteger("1");
                long i;
                for (i = 1; i <= a; i++) {

                    b = b.multiply(BigInteger.valueOf(a));
                }
                System.out.println("The factorial of " + a + "is :-  " + b);
                System.out.println("do you want to quit or you want to go to the menu(if yes enter 'y' else enter 'n' )" + "( for menu enter m)");
                String dj = sc.next();
                if (dj.equals("y")) {
                    break;


                } else if (dj.equals("n")) {

                    System.out.println("welcome again :)");
                    continue;
                } else if (dj.equals("m")) {

                    option.main();


                } else {

                    System.out.println("invalid input");
                    System.out.println("try again!!");
                    break;

                }


            }


        }
    }

    class evenOdd extends index {
        // Class to check even or odd
        public static void main() {

            while (true) {
                System.out.println("enter the number you want to check");
                int a = sc.nextInt();
                if (a % 2 == 0) {
                    System.out.println(a + "is even");
                } else {
                    System.out.println(a + "is odd");
                }

                System.out.println("do you want to quit or you want to go to the menu(if yes enter 'y' else enter 'n' )" + "(for menu enter m)");
                String dj = sc.next();
                if (dj.equals("y")) {
                    break;


                } else if (dj.equals("n")) {

                    System.out.println("welcome again :)");
                    continue;
                } else if (dj.equals("m")) {

                    option.main();


                } else {

                    System.out.println("invalid input");
                    System.out.println("try again!!");
                    break;

                }


            }


        }
    }

    class chargbf {
        // Class responsible for the coulomb force between charges menu "7"

        public static void main() {

            while (true) {
                System.out.println("enter the first charge billow ( Should be in Coulomb) :-");
                int a = sc.nextInt();
                System.out.println("enter the second charge billow ( Should be in Coulomb) :-");
                int b = sc.nextInt();
                System.out.println("ok ! lets enter the distance between charges (Should be in meter):-");
                float c = sc.nextFloat();
                BigInteger d = new BigInteger("1");
                BigInteger e = new BigInteger("9000000000");
                d = d.divide(e);
                System.out.println(d);













                System.out.println("do you want to quit or you want to go to the menu(if yes enter 'y' else enter 'n' )" + "(for menu enter m)");
                String dj = sc.next();
                if (dj.equals("y")) {
                    break;


                } else if (dj.equals("n")) {

                    System.out.println("welcome again :)");
                    continue;
                } else if (dj.equals("m")) {

                    option.main();


                } else {

                    System.out.println("invalid input");
                    System.out.println("try again!!");
                    break;

                }


            }


        }

    }

}