
 import java.util.Scanner;

 public class Madlibs {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
         // Introduction
         System.out.println("Welcome to the Mad Libs game");
         System.out.println("You'll enter different types of words to make a funny story.");
 
         // Collect user input
         System.out.print("Enter a noun: ");
         String noun1 = input.nextLine();
 
         System.out.print("Enter a verb: ");
         String verb1 = input.nextLine();
 
         System.out.print("Enter an adjective: ");
         String adj1 = input.nextLine();
 
         System.out.print("Enter another noun: ");
         String noun2 = input.nextLine();
 
         System.out.print("Enter another verb: ");
         String verb2 = input.nextLine();
 
         System.out.print("Enter a plural noun: ");
         String pluralNoun = input.nextLine();
 
         System.out.print("Enter an emotion (e.g., happy, angry): ");
         String emotion = input.nextLine();
 
         
         System.out.println("Your Mad Lib Story ");
 
         // Story 1
         System.out.println("The " + noun1 + " " + verb1 + " across the " + adj1 + " pond.");
 
         // Story 2
         System.out.println("I went to the zoo to see a " + noun2 + ".");
         System.out.println("There were people " + verb2 + " around the enclosure,");
         System.out.println("which made the " + adj1 + " " + pluralNoun + " go completely " + emotion + "!");
 
         System.out.println("Thanks for playing Mad Libs!");
 
         input.close();
     }
 }
 