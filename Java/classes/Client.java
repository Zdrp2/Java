package classes;
import java.util.Scanner;

public class Client {
    private int ID;
    private String FIO;
    public Client() {
    }
    public Client(int id, String name) {
        ID = id;
        FIO = name;
    }
    public void Input() {
        Scanner input = new Scanner(System.in, "Cp1251");
        System.out.print("Введите ФИО клиента: ");
        FIO = input.nextLine();
        System.out.print("Введите id клиента: ");
        ID = input.nextInt();
    }
    public void Output() {
        System.out.println("ID клиента: " + ID);
        System.out.println("ФИО клиента: " + FIO);
    }
}