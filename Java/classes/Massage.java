package classes;
import java.util.Scanner;

public class Massage {
    public static int count_massage = 0;
    private int ID;
    private String FIO;
	private int EXP;
    public Massage() {
        ID = 0;
        FIO = "Нет имени";
		EXP = 0;
        count_massage++;
    }
    public static int get_count_massage(){
        return count_massage;
    }
    public Massage(int id, String name, int exp) {
        ID = id;
        FIO = name;
		EXP = exp;
        count_massage++;
    }
    public void Input() {
        int EXP1;
        Scanner input = new Scanner(System.in, "Cp1251");
        System.out.print("Введите ФИО массажиста: ");
        FIO = input.nextLine();
		System.out.print("Введите стаж массажиста: ");
        EXP1 = input.nextInt();
        try{
			if(EXP1 < 5 || EXP1 > 60) throw new Exception("Неправильный стаж");	
		}
		catch(Exception ex){
         	System.out.println(ex.getMessage());
		}
		finally{
			EXP = EXP1;
		}
        System.out.print("Введите id массажиста: ");
        ID = input.nextInt();
        count_massage++;
    }
    public void Output() {
        System.out.println("ID массажиста: " + ID);
        System.out.println("ФИО массажиста: " + FIO.toUpperCase());
		System.out.println("Стаж: " + EXP);
    }
}