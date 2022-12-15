package classes;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Service {
    private int ID;
    private String NAME;
	private int price;
    public Service() {
    }
    public Service(int id, String name, int pr) {
        ID = id;
        NAME = name;
		price = pr;
    }
    public void Input() {
        Scanner input = new Scanner(System.in, "Cp1251");
        System.out.print("Введите название услуги: ");
        NAME = input.nextLine();
		System.out.print("Введите цену услуги: ");
        price = input.nextInt();
		System.out.print("Введите id услуги: ");
        ID = input.nextInt();
    }
    public void Output() {
        System.out.println("ID услуги: " + ID);
        System.out.println("Название услуги: " + NAME);
		System.out.println("Цена: " + price);
    }
    public void sravn_price(Service sr) {
        if (this.price > sr.price) {
            System.out.println(this.NAME + " дороже");
        }
        else if (this.price < sr.price) {
            System.out.println(this.NAME + " дешевле");
        }
        else {
            System.out.println("Цены услуг равны");
        }
    }
}