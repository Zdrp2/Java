package classes;
import java.util.Scanner;

public class Massage {
    private int ID;
    private String FIO;
	private int EXP;
    public Massage() {
    }
    public Massage(int id, String name, int exp) {
        ID = id;
        FIO = name;
		EXP = exp;
    }
    public void Input() {
        Scanner input = new Scanner(System.in, "Cp1251");
        System.out.print("Введите ФИО массажиста: ");
        FIO = input.nextLine();
		System.out.print("Введите стаж массажиста: ");
        EXP = input.nextInt();
        System.out.print("Введите id массажиста: ");
        ID = input.nextInt();
    }
    public void Output() {
        System.out.println("ID массажиста: " + ID);
        System.out.println("ФИО массажиста: " + FIO);
		System.out.println("Стаж: " + EXP);
    }
}