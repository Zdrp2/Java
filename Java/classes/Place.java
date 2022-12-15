package classes;
import java.util.Scanner;

public class Place {
    private int ID;
    private String Street;
	private int house;
    public Place() {
        ID = 0;
        Street = "Нет улицы";
		house = 0;
    }
    public Place(int id, String str, int hs) {
        ID = id;
        Street = str;
		house = hs;
    }
    public void Input() {
        Scanner input = new Scanner(System.in, "Cp1251");
        System.out.print("Введите улицу: ");
        Street = input.nextLine();
		System.out.print("Введите дом: ");
        house = input.nextInt();
		System.out.print("Введите id: ");
        ID = input.nextInt();
    }
    public void Output() {
        System.out.println("ID адреса: " + ID);
        System.out.println("Улица: " + Street);
		System.out.println("Дом: " + house);
    }
}