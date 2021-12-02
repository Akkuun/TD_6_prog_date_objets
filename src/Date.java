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

    public int getMonth() {
        return months;
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
            months++;
            day = 1;
            if (months > 12) {
                year++;
                months = 1;

            }
        }

        return this;
    }

    public Date lendemain() {
        Date d1 = this;

        return new Date(d1.day, d1.months, d1.year).addjour();
    }

    public boolean isequal(Date d2) {
        //if d1.day = d2.day ==true return true
        boolean issame = false;
        if (this.day == d2.day && this.months == d2.months && this.year == d2.year) {
            issame = true;
        }
        return issame;
    }

    public boolean isposterieur(Date d2) {
        boolean isposterieur = false;
        if (day < d2.day || months < d2.months || year < d2.year) { // || car si on met && bah on peut avoir un nombre de mois plus petit mais le nb de jour non
            isposterieur = true;
        }
        return isposterieur;
    }

    public boolean issuprerior(Date d2) {
        boolean issuperior = false;
        if (day > d2.day || months > d2.months || year > d2.year) { // || car si on met && bah on peut avoir un nombre de mois plus petit mais le nb de jour non
            issuperior = true;
        }
        return issuperior;
    }

    public int countDay(Date d2) {
        int count = 0;

        /*if (isbisex()) { //366 jours
            if (isposterieur(d2)) { // cas où d1 est inferieur à d2 donc on fait d2-d1
                for (int i = 0; i < d2.months - months; i++) { // on calcul le nombre de jour entre le mois 1 et le mois 2
                    nb_jour_entre_mois = nb_jour_entre_mois + maxjours[(d2.months - 1) - i]; // on compte le nombre de mois=> maxjour[mois_max_actuelle2]+[mois_max_actuelle2-1] .. etc
                }//jusqua atteindre maxjours[mois_max_actuelle_1]
                count = ((d2.year - year) * 366) + (nb_jour_entre_mois) + (d2.day) - day;
            }
            if (issuprerior(d2)) { // cas où d1 est superieur à d2 donc on fait d1-d2
                for (int i = 0; i < months - d2.months; i++) {
                    nb_jour_entre_mois = nb_jour_entre_mois + maxjours[(months - 1) - i];
                }
                count = ((year - d2.year) * 366) + (nb_jour_entre_mois) + (day) - d2.day;
            }

        }

        if (!isbisex()) { //365 jours
            if (isposterieur(d2)) { // cas où d1 est inferieur à d2 donc on fait d2-d1
                for (int i = 0; i < d2.months - months; i++) {
                    nb_jour_entre_mois = nb_jour_entre_mois + maxjours[(d2.months - 1) - i];
                }
                count = ((d2.year - year) * 365) + (nb_jour_entre_mois) + (d2.day) - day;
            }
            if (issuprerior(d2)) { // cas où d1 est superieur à d2 donc on fait d1-d2
                for (int i = 0; i < months - d2.months; i++) {
                    nb_jour_entre_mois = nb_jour_entre_mois + maxjours[(months - 1) - i];
                }
                count = ((year - d2.year) * 365) + (nb_jour_entre_mois) + (day) - d2.day;
            }

        }*/
        while (!this.isequal(d2)) { //tant que d1 est pas égal à d2 on incrémente d1 jusqu'a atteindre d2

            this.addjour();
            count++;

        }

        return count;
    }
}
