public class Date {

    private final String[] month = {"janvier", "fevier", "mars", "avril", "mai", "juin", "juillet", "aout", "juillet", "aout", "septembre", "octobre", "novembre", "decembre"};
    private  int day;
    private  int year;
    private  int months;


    public Date(int jour, int mois, int annee) {
        this.day = jour;
        this.months = mois;
        this.year = annee;
    }

    public int getDay() {
        return day;
    }

    public String getMonths() {
        return month[months - 1];
    }

    public int getYear() {
        return year;
    }

    public void printdate() {
        System.out.println(this.day + " " + this.getMonths() + " " + this.getYear());
    }

    public boolean isbisex() {
        boolean bis = false;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            bis = !bis;
        }
        // year % 4 == 0 && year % 100 != 0 || year % 400 == 0
        return bis;
    }

    public void adddate() {
        this.day=this.day+1;
    }


}
