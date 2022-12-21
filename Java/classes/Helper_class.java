package classes;

public class Helper_class {
    public static int count_sv_massage() {
        int count_m = Massage.get_count_massage();
        int count_c = Client.get_count_client();
        int count = count_m - count_c;
        return count;
    }
}
