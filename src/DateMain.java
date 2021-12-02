public class DateMain {

    public static void main(String[] args) {

        Date d1 = new Date(23, 2, 1941);
        Date d2 = new Date(18, 12, 1951);

        Date d3 = new Date(1, 2, 2000);


        System.out.println(d1.countDay(d2));
    }
}