package svngido;

import java.util.ArrayList;
import java.util.Scanner;

public class SVNgido {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        System.out.println("--- QUAN LY CONG VIEC NHOM ---");

        do {
            System.out.println("\n1. Them moi");
            System.out.println("2. Xem danh sach");
            System.out.println("3. Xoa du lieu");
            System.out.println("4. Chinh sua du lieu");
            System.out.println("5. Thoat");
            System.out.print("Chon: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                addTask(); 
            } else if (choice == 2) {
                showTasks(); 
            } else if (choice == 3) {
                deleteTask(); 
            } else if (choice == 4) {
                editTask();
            }
        } while (choice != 5);
    }


    public static void addTask() {
        
    }

    public static void showTasks() {
        
    }

    public static void deleteTask(){
        
    }

    public static void editTask() {
        System.out.print("Nhap ten cong viec can chinh sua: ");
        String oldTask = scanner.nextLine();
        if (tasks.contains(oldTask)) {
            System.out.print("Nhap ten cong viec moi: ");
            String newTask = scanner.nextLine();
            int index = tasks.indexOf(oldTask);
            tasks.set(index, newTask);
            System.out.println("=> Da chinh sua thanh cong!");
        } else {
            System.out.println("=> Cong viec khong ton tai!");
        }
    }
}
