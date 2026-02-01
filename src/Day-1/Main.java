import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int age = 22;
//        char ch= 'c';
//        long large= 300000;
//        String name = "Ali";
//        double height = 1.80;
//        boolean isMarried = false;
//
//
//        System.out.println("Your name is "+name+" and you are "+age +" Years old.");


//        ============================ 1 ============================
//        int a = 5;
//        int b = 10;
//        if (a * 2 == b && b / 2 == a) {
//            System.out.println("Equal Logic");
//        } else {
//            System.out.println("Not Equal");
//        }
//        Equal Logic

//        ============================ 2 ============================

//        int x = 10;
//        if (x = 5) {
//            System.out.println("Yes");
//        }

//      ==

//          ============================ 3 ============================
//
//        int day  =3;
//        switch (day){
//            case 1:
//                System.out.println("Saturday");
//                break;
//            case 2:
//                System.out.println("Sunday");
//                break;
//            case 3:
//                System.out.println("Monday");
//                break;
//            case 4:
//                System.out.println("Tuesday");
//                break;
//            case 5:
//                System.out.println("Wednesday");
//                break;
//            case 6:
//                System.out.println("Thursday");
//                break;
//            case 7:
//                System.out.println("friday");
//                break;
//            default:
//                System.out.println("Invalid Day");
//        }


//        ============================ 4 ============================
//
//        int x = 7;
//        int y = 3;
//        if (x > 5      ||      ( y > 5 && x + y > 15)) {
//            System.out.println("A");
//        } else {
//            System.out.println("B");
//        }

//        A


//        ============================ 5 ============================

//        int age = 20;
//        boolean hasID = true;
//
//        if (age >= 18) {
//            if (hasID) {
//                System.out.println("Access Granted");
//            }
//        }
//      Access Granted


//          ============================ 6 ============================

//        boolean a = true;
//        boolean b = false;
//        boolean c = true;
//
//        if (a && !b || c && false) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//      True


        //          ============================ 7 ============================
//        int score = 85;
//        if (score >= 90) System.out.println("A");
//        else if (score >= 80) System.out.println("B");
//        else if (score >= 70) System.out.println("C");
//        else System.out.println("F");
// we cant use >= in witch


//          ============================ 8 ============================

//        int x = 5.5;

//        it should be double

        //          ============================ 9 ============================

//        int number = 44;
//        if (number %2==0){
//            if (number>50){
//                System.out.println("Big Even");
//            }
//            else if (number<=50){
//                System.out.println("Small Even");
//            }
//        }else {
//            System.out.println("Odd");
//        }

        //          ============================ 10 ============================
//        String s1 = "Java";
//        String s2 = "Java";
//
//        if (s1 == s2) {
//            System.out.println("Same");
//        } else {
//            System.out.println("Different");
//        }
//        equals(s2)


//        1
        Scanner input = new Scanner(System.in);

        String name;
        int age;
        double height;
        boolean hasMedicalCard;
        int plan;

        System.out.println("Enter Your name: ");
        name = input.nextLine();

        System.out.println("Your Age: ");
        age = input.nextInt();
        input.nextLine();

        System.out.println("Your Height :");
        height = input.nextDouble();

        System.out.println("do you have hasMedicalCard? true/false: ");
        hasMedicalCard = input.nextBoolean();

        System.out.println("Choose your plan 1/2/3:\n1:> Basic Plan – $20\n2:> Standard Plan – $35\n3:> Premium Plan – $50");
        plan = input.nextInt();


        System.out.println("================ Registration Status ====================");

//      2
        if (age < 15) {
            System.out.println("You are too young");
        } else if (age > 60) {
            System.out.println("Special Permission Needed");

        } else {
            System.out.println("Your age is Ok");

        }

//        3
        if (!hasMedicalCard) {
            System.out.println("Medical Card Required");
        }

        switch (plan) {
            case 1:
                System.out.println("Basic Plan $20");
                break;
            case 2:
                System.out.println("Standard plan $35");
                break;
            case 3:
                System.out.println("Premium plan $50");
                break;
            default:
                System.out.println("Invalid plan");
        }

//        5

        if (age >= 18 && hasMedicalCard && height > 1.50) {
            System.out.println("Welcome " + name);
            System.out.println("You are fully eligible");
        } else {
            System.out.println("Not Fully Eligible");
        }


    }
}