package OOP.Classes;

public class Movie {
    private String title;
    private int durationInMinute;

    //pt a genera getter si setter automat putem da click dreapta si generate
    public void setTitle(String title){ //poti sa ii dai si alt nume daca vrei
        this.title = title; //this. se refera la variabila declarata in clasa

        /* public void setTitle(String titleValue){
             title = titleValue;
            se poate si asa DAR in GENERAL este folosit cu this.
         */
    }

    public void setDurationInMinute(int durationInMinute) {
        this.durationInMinute = durationInMinute;
    }

    public String getTitle (){ //cand vreau sa iau valoarea pun direct tipul variabilei
        return title;
    }

    public int getDurationInMinute (){
        return  durationInMinute;
    }

    void play() {
        System.out.println("The movie " + title + " is playing");
    }

    void stop() {
        System.out.println("The movie " + title + " has stopped");
    }


}
