package homework;

import java.util.Scanner;

public class HW_IfElseIf {
  public  void getGrade(){

      Scanner input=new Scanner(System.in);

      System.out.println("Enter your score to get the result");
      double score=input.nextDouble();
      if(score>=94){
          System.out.println("Excellent");
      }else if(score>=90){
          System.out.println("Very good");
      }else  if(score>=89){
          System.out.println("Good");
      }else if(score>=85){
          System.out.println("Average");
      }else if(score>=78){
          System.out.println("pass");
      }else if(score>=60){
          System.out.println("poor");
      }else if (score>=50){
          System.out.println("Need to repeat this course");
      }

  }

    static int age=24;
    static String name="Jule";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HW_IfElseIf ob = new HW_IfElseIf();
        ob.getGrade();


        Scanner input1 = new Scanner(System.in);
        System.out.println("*********Let start use scanner if else*******");
        System.out.println("Enter your college name");
        String name = input1.nextLine();

        System.out.println("Enter your age");
        int age = input1.nextInt();


        if (name.equalsIgnoreCase("Girl's college") || age >= 18) {

            System.out.println("Girl's student is eligible");
        }
        else if (name.equalsIgnoreCase("Boy's college") || age >= 18) {

                System.out.println("Boy's student is eligible");
            } else {
                System.out.println("You are not eligible");
            }


        }


    }














