import java.util.*;
/**
 * Cette classe est chargé d'afficher les items...
 */
public class TaskManager implements TaskMethod {

    /**
     * This Methode allow to add Item list
     * @param Task
     */
    public void addTaskItem(ArrayList<String> Task) {

        Scanner input = new Scanner(System.in);
        String itemName;
        int itemsNumber; // Nombre de tâches à créer...

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
    }

    /**
     * This Methode allow to display items list
     * @param TaskList
     */
    public  void displayTaskItem(ArrayList<String>TaskList) {
        if(TaskList.isEmpty()){
            System.out.println("Task is empty");
        }
        else{
            for (int i = 0; i < TaskList.size(); i++) {
                System.out.println("Task n°"+i+" => "+TaskList.get(i));
            }
        }
    }
}

