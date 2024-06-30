import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Add task");
            System.out.println("2. Complete task");
            System.out.println("3. Remove task");
            System.out.println("4. Show tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    taskList.addTask(name);
                    break;
                case 2:
                    System.out.print("Enter task number to complete: ");
                    int completeIndex = scanner.nextInt() - 1;
                    taskList.completeTask(completeIndex);
                    break;
                case 3:
                    System.out.print("Enter task number to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    taskList.removeTask(removeIndex);
                    break;
                case 4:
                    taskList.showTasks();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}

