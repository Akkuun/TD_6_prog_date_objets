public class DateMain {

    public static void main(String[] args) {
        Date d1 = new Date(1, 3, 1900);
        Date d2 = new Date(1, 3, 2000);

        Date d3 = new Date(1, 3, 2016);
        System.out.println(d1.isbisex());
        System.out.println(d2.isbisex());
        System.out.println(d3.isbisex());
        d1.addjour();
        d1.printdate();
    }
}
