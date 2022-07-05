package com.company;
import java.util.*;

public class Patient {
   private static   String name;
   private static String gender;
   private  static int age;

   public static void patient_availability()
   {
      Scanner schedule = new Scanner(System.in);
      System.out.println("Enter the Patients Name: ");
      String patient_name = schedule.nextLine();
      System.out.println("Enter the Patients Age: ");
      int patient_age = schedule.nextInt();
      System.out.println("Enter the Patients Gender: ");
      String patients_gender = schedule.nextLine();
   }
   Patient()
   {
      Scanner schedule = new Scanner(System.in);
      System.out.println("Enter the Patients Name: ");
      String patient_name = schedule.nextLine();
      System.out.println("Enter the Patients Age: ");
      int patient_age = schedule.nextInt();
      System.out.println("Enter the Patients Gender: ");
      String patients_gender = schedule.nextLine();

   }

}

Main program

package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Patient patient_data = new Patient();
        


    }
}


