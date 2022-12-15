package classes;
import java.util.Scanner;

public class Client {
    public static int count_client = 0;
    private int ID;
    private String FIO;
    public static int get_count_client(){
        return count_client;
    }
    public Client() {
        ID = 0;
        FIO = "Нет имени";
        count_client++;
    }
    public Client(int id, String name) {
        ID = id;
        FIO = name;
        count_client++;
    }
    public void Input() {
        Scanner input = new Scanner(System.in, "Cp1251");
        System.out.print("Введите ФИО клиента: ");
        FIO = input.nextLine();
        System.out.print("Введите id клиента: ");
        ID = input.nextInt();
        count_client++;
    }
    public void Output() {
        System.out.println("ID клиента: " + ID);
        System.out.println("ФИО клиента: " + FIO.toUpperCase());
    }
}