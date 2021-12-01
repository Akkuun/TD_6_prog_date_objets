public class Date {

    private static final String[] month = {"janvier", "fevier", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "decembre"};
    //static relatif à la classe global
    //final = contante on peut pas le redefinir
    private int[] maxjours = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int day;
    private int year;
    private int months;


    public Date(int jour, int mois, int annee) {

        maxjours[1] = isbisex() ? 29 : 28; //is isbisex=true maxjour[1] =29 else maxjour[1] =28

        day = jour;
        months = mois;
        year = annee;
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

        System.out.println(this.getDay() + " " + this.getMonths() + " " + this.getYear());
    }

    public boolean isbisex() {

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0; //si c'est le cas bah ça renvoie vrai sinon non
    }

    public Date addjour() {

        day = day + 1;


        if (day > maxjours[months - 1]) {
            months ++;
            day = 1;
            if (months > 12) {
                year ++;
                months = 1;
            }
        }
        return this;
    }

    public Date lendemain() {
        Date d1 = this;

        return new Date(d1.day, d1.months, d1.year).addjour();
    }
    public boolean testdate(Date d1,Date d2){
        //if d1.day = d2.day ==true return true
        boolean issame=false;
        if (d1.day!=d2.day&&d1.months!= d2.months&&d1.year!=d2.year){
            issame=!issame;
        }
        return issame;
    }

}
