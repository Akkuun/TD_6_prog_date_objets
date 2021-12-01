public class Date {

    private static final String[] month = {"janvier", "fevier", "mars", "avril", "mai", "juin", "juillet", "aout", "juillet", "aout", "septembre", "octobre", "novembre", "decembre"};
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

    public void addjour() {

        day=day+1;


        if (day > maxjours[months]) {
        months=months+1;
        }
    }


}
