package co.domi.ejercicioclase11.model;

public class Result {

    //Para resolver el ejercicio, puede modificar esto, no es camisa de fuerza

    private String personId;
    private String name;
    private int numVotes;
    private double percentaje;


    public Result(String personId, String name, int numVotes, double percentaje) {
        this.personId = personId;
        this.name = name;
        this.numVotes = numVotes;
        this.percentaje = percentaje;
    }

    public Result() {
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumVotes() {
        return numVotes;
    }

    public void setNumVotes(int numVotes) {
        this.numVotes = numVotes;
    }

    public double getPercentaje() {
        return percentaje;
    }

    public void setPercentaje(double percentaje) {
        this.percentaje = percentaje;
    }

    public void countVote() {
        numVotes++;
    }

    public void computePercentaje(int totalVotes) {
        percentaje = 100*(numVotes /(double)totalVotes);
    }

    //Sobreescritura del método toString() para darle un aspecto al objeto
    @Override
    public String toString() {
        return name+"\n"+"   "+percentaje+"%";
    }
}
