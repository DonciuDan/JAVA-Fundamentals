package JavaFundamentalsTema4.Pb1;

public class MainTema {
    public static void main(String[] args) {
        CosDeCumparaturi obiectCosDeCumparaturi = new CosDeCumparaturi(130,"impins","albastru","metal");
        Alimente alimente = new Alimente();
        System.out.println("Cosul de cumparaturi are urmatoarele caracteristici: ");
        obiectCosDeCumparaturi.printAllInformation();
        System.out.println(alimente.getAlimenteCumparate());
        System.out.println("---------------------------------------------------------");

        Cursant obiectCursant = new Cursant("Alin","albastri",182,"Negru",180);
        OreDeCurs oraDeCurs = new OreDeCurs();
        System.out.println("Descrierea cursantului: ");
        obiectCursant.printAllInformation();
        System.out.println();
        System.out.println("Cursantul are ore de curs care dureaza " + oraDeCurs.getOraDeCurs() + "minute");
        System.out.println("---------------------------------------------------------");

        Televizor obiectTelevizor = new Televizor(120,90,10000,"negru","Samsung");
        Telecomanda telecomanda = new Telecomanda();
        obiectTelevizor.printAllInformation();
        System.out.println();
        System.out.println("Telecomanda " + telecomanda.getTelecomanda());
        System.out.println("---------------------------------------------------------");

        Masina obiectMasina = new Masina(4,18,"Albastru",5.0f,70);
        VitezaMaxima vitezaMaxima = new VitezaMaxima();
        obiectMasina.printAllInformation();
        System.out.println(vitezaMaxima.getVitezaMasinii());
        System.out.println("---------------------------------------------------------");

    }
}
