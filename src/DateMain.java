public class DateMain {

    public static void main(String[] args) {
        Date d4;
        Date d1 = new Date(29, 2, 2024);
        Date d2 = new Date(31, 12, 2000);

        Date d3 = new Date(1, 3, 2016);
        System.out.println(d1.isbisex());
        System.out.println(d2.isbisex());
        System.out.println(d3.isbisex());
        d2.printdate();
        d2.addjour();
        d2.printdate();
        d1.lendemain();
        d4=d4.lendemain();
    }
}
