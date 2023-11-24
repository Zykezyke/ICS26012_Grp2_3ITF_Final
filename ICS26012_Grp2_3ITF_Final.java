import java.util.Scanner;

public class ICS26012_Grp2_3ITF_Final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of processes
        System.out.print("Input no. of processes [2-9]: ");
        int numProcesses = scanner.nextInt();

        // Validate the number of processes
        if (numProcesses < 2 || numProcesses > 9) {
            System.out.println("Invalid number of processes. Exiting.");
            return;
        }

        // Input individual arrival time
        int[] arrivalTimes = new int[numProcesses];
        System.out.println("Input individual arrival time:");
        for (int i = 0; i < numProcesses; i++) {
            System.out.print("AT" + (i + 1) + ": ");
            arrivalTimes[i] = scanner.nextInt();
        }

        // Input individual burst time
        int[] burstTimes = new int[numProcesses];
        System.out.println("Input individual burst time:");
        for (int i = 0; i < numProcesses; i++) {
            System.out.print("BT" + (i + 1) + ": ");
            burstTimes[i] = scanner.nextInt();
        }

        // Display CPU Scheduling Algorithm menu
        while (true) {
            System.out.println("CPU Scheduling Algorithm:");
            System.out.println("[A] First Come First Serve (FCFS)");
            System.out.println("[B] Preemptive Priority (Prio)");
            System.out.println("[C] Multilevel Queue (MLQ)");
            System.out.println("[D] Exit");

            System.out.print("Enter your choice: ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'A':
                case 'a':
                    System.out.println("You selected FCFS algorithm.");
                    // Implement FCFS logic here
                    break;

                case 'B':
                case 'b':
                    System.out.println("You selected Preemptive Priority algorithm.");
                    // Implement Preemptive Priority logic here
                    break;

                case 'C':
                case 'c':
                    System.out.println("You selected Multilevel Queue algorithm.");
                    // Implement Multilevel Queue logic here
                    break;

                case 'D':
                case 'd':
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
