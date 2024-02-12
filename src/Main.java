import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        DataBaseUtil.createTable();
        
        while (true) {
            menu();
            int action = getAction();
        }
    }
    public static void menu(){
        System.out.println("** Menu ** ");
        System.out.println("1. Add Contact");
        System.out.println("2. Contact Lit");
        System.out.println("3. Delete Contact");
        System.out.println("4. Search Contact");
        System.out.println("0. Exit");
    }

    public static int getAction(){
        System.out.println("Enter action");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}