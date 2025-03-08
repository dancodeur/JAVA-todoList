import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("*=*  TODO LIST *=*");
        /**
         * Import of ArrayList Class
         */
        ArrayList<String> Task= new ArrayList<String>();
        TaskManager taskManager = new TaskManager(); // import de la class taskManager

        Scanner input=new Scanner(System.in);
        System.out.print("Would you like to add an item to the list ? yes or no :");
        String choice=input.nextLine();

        switch(choice) {
            case "yes":
                System.out.println("Adding an item to the list");

                /**
                 * Add item form Task...
                 */
                taskManager.addTaskItem(Task);

                System.out.print("Would you like to see your task ? yes or no :");
                String seeTask=input.nextLine();

                if (seeTask.equals("yes")) {
                    /**
                     * Display Task item with displayTaskItem method
                     */
                    taskManager.displayTaskItem(Task);

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