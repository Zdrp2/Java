package classes;

public class Table {
    private Client client;
    private Massage massage;
    private Service service;
    private Place place;

    public Table() {
        client = new Client();
        massage = new Massage();
        service = new Service();
        place = new Place();
    }

    public Table(Client client1, Massage massage1, Service service1, Place place1) {
        client = client1;
        massage = massage1;
        service = service1;
        place = place1;
    }

    public void Input() {
        client.Input();
        massage.Input();
        service.Input();
        place.Input();
    }

    public void Output() {
        client.Output();
        massage.Output();
        service.Output();
        place.Output();
    }
}