package Conditionals;

public class SwitchExample {
    public static void main(String[] args) { //se numeste main

        String dayOfWeek = "Sambata";   //regula de Camel Case, doar un apostrov e la caractere
        switch (dayOfWeek) {
            case "Luni":
                System.out.println("Iarba nu creste");
                break; //daca nu era break aici nu se oprea si executa in continuare si aparea si Iarba nu creste si este weekend
                    //daca nu are break el doar executa nu mai ia in continuare celelalte case-uri
            case "Sambata":
            case "Duminica":
                System.out.println("Este weekend!");
                break;

            /*merge si varianta clasica
            case "Sambata":
                System.out.println("Este weekend!");
                break;
            case "Duminica":

             */


            default:
                System.out.println("Este mijlocul saptamanii:");
                break;


        }

    }
}
