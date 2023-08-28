package JAVAFundamentals.JavaFundamentalsTema1;

public class TemaConditionalQ8 {
    public static void main(String[] args) {
        int dayOfWeek = 2;
        String schedule;  //doar declarare

        switch (dayOfWeek) {   //aici faci actualizare
            case 1:
                schedule = "Gym in the morning";
                break;
            case 2:
                schedule = "Class after work";
                break;
            case 3:
                schedule = "Meetings all day";
                break;
            case 4:
                schedule = "Work from home";
                break;
            case 5:
                schedule = "Game night after work";
                break;
            case 6:
            case 7:
                schedule = "Free!";
                break;



        }
       //System.out.println(schedule);

    }
}
