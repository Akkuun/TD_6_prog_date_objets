public class DateMain {

    public static void main(String[] args) {

        Date d1 = new Date(1, 6, 2021);
        Date d2 = new Date(14, 12, 2021);

        Date d3 = new Date(1, 2, 2000);


        System.out.println(d1.countDay(d2));
    }
}