public class Ansatt extends Person {


    private String ansNr;

    Ansatt(String navn , int alder, String ansattNummer) {

        super (navn,alder);
        ansNr = ansattNummer;



    }
    @Override
    public String toString(){

        return super.navn + "ansattNR " + ansNr;

    }

    @Override
public void harBursdag() {

        super.harBursdag();
        System.out.println("GReatulere med dagen" + super.navn);


    }


}
