import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {
        //Variable
        int i = 0;
        int pilih;
        String user;
        String pass;
        Scanner var = new Scanner(System.in);

            System.out.println("=== Library System ===");
            System.out.println("1. Login As Student");
            System.out.println("2. Login As Admin");
            System.out.println("3. Exit");
            System.out.println("Chose Option (1-3) : ");

            pilih = var.nextInt();

            switch(pilih) {
                case 1:
                    System.out.println("Enter Your Nim : ");
                    String nim = var.next();
                    if(nim.equals("202310370311353")) {
                        System.out.print("Succesfully Login as Student");
                    }else {
                        System.out.print("User Not Found");
                    }
                    break;
                case 2:
                    System.out.print("Enter Your Username (Admin) : ");
                    user = var.next();
                    System.out.print("Enter Your Password (Admin) : ");
                    pass = var.next();

                    if (user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")) {
                        System.out.print("Succesfull login as Admin");
                    } else {
                        System.out.print("Admin User Not Found");
                    }
                    break;
                case 3:
                    System.out.print("adios");
                    break;

                default:
                    System.out.print("Pilihan tidak valid");
            }
    }
}
