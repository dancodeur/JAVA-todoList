import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("*=*  TODO LIST *=*");
        /**
         * Import of ArrayList Class
         */
        ArrayList<String> Task= new ArrayList<String>();

        Scanner input=new Scanner(System.in);
        System.out.print("Would you like to add an item to the list ? yes or no :");
        String choice=input.nextLine();

        switch(choice) {
            case "yes":
                System.out.println("Adding an item to the list");

                int itemsNumber; // Nombre de tâches à créer...
                String itemName;

                do {
                    System.out.print("How many items would you like to add ? :");
                    itemsNumber = input.nextInt();
                    input.nextLine(); // Vider le tampon pour éviter les problèmes de nextLine()

                    if (itemsNumber <= 0) {
                        System.out.println("Number of items must be greater than 0");
                    }

                } while (itemsNumber <= 0);

                for (int i = 1; i <= itemsNumber; i++) {
                    System.out.print("Item N°" + i + " added to the list : ");
                    itemName = input.nextLine();
                    Task.add(itemName);
                }

                System.out.print("Would you like to see your task ? yes or no :");
                String seeTask=input.nextLine();

                if (seeTask.equals("yes")) {
                    /**
                     * Display All data from task
                     */
                    for (int i = 0; i < Task.size(); i++) {
                        System.out.println("Task n°"+i+" => "+Task.get(i));
                    }
                }else{
                    System.out.println("Okay feel free to add an item to the list ! ");
                }
                break;

            case "no":
                System.out.println("You have not added any item to the list !");
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}