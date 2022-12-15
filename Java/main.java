import classes.*;

public class main {
    public static void main(String args[]) {
        /*System.out.println();
        int id_client = 123;
        String cient_name = "Иванов Иван Иванович";
        Client Client1 = new Client();
        Client Client2 = new Client(id_client, cient_name);
        Client1.Input();
        System.out.println("\n" + "Клиент1:");
        Client1.Output();
        System.out.println("\n" + "Клиент2:");
        Client2.Output();
        System.out.println("\n");

        int id_massage = 1122;
		int exp = 10;
        String massage_name = "Петров Петр Петрович";
        Massage Massage1 = new Massage();
        Massage Massage2 = new Massage(id_massage, massage_name, exp);
        Massage1.Input();
        System.out.println("\n" + "Массажист1:");
        Massage1.Output();
        System.out.println("\n" + "Массажист2:");
        Massage2.Output();
        System.out.println("\n");
        System.out.println("Проверка статического поля: " + Massage.count_massage);
        System.out.println("Количество массажистов: " + Massage.get_count_massage());
        System.out.println("\n");

        System.out.println("Проверка вспомогательного класса (количество свободных массажистов): " + helper_class.count_sv_massage());
        System.out.println("\n");
		
		int id_place = 1212;
		int house = 199;
        String street = "Анатолия";
        Place Place1 = new Place();
        Place Place2 = new Place(id_place, street, house);
        Place1.Input();
        System.out.println("\n" + "Адрес1:");
        Place1.Output();
        System.out.println("\n" + "Адрес2:");
        Place2.Output();
        System.out.println("\n");
		
		int id_service = 1221;
        int price = 2500;
		String title = "Массаж шеи";
        Service Service1 = new Service();
        Service Service2 = new Service(id_service, title, price);
        Service1.Input();
        System.out.println("\n" + "Услуга1:");
        Service1.Output();
        System.out.println("\n" + "Услуга2:");
        Service2.Output();

        System.out.println("\n");
        Service2.sravn_price(Service1);
        System.out.println("\n");
		
		Table[] table = new Table[3];
        for (int i = 0; i < 2; i++) {
            table[i] = new Table();
            table[i].Input();
        }
        table[2] = new Table(Client2, Massage2, Service2, Place2);
        for (int i = 0; i < 3; i++) {
            System.out.println("\n" + "Таблица " + (i+1) + ":");
            table[i].Output();
        }*/
        Table[][] Table = new Table[1][1];
        for (int i=0; i < 1; i++){      //////////////////Ввод двумерного массива
            for (int j=0; j<1;j++){
                System.out.println();
			    Table[i][j] = new Table();
                Table[i][j].Input();
            }
            System.out.println();
		}
        for (int i=0; i < 1; i++){      //////////////////Вывод двумерного массива
            for (int j=0; j<1;j++){
                System.out.println();
                Table[i][j].Output();
            }
            System.out.println();
		}
    }
}