package model;

/**
 * Created by borcha on 20.05.17..
 */
public class Film {

    private int id;
    private String nazivFilma;
    private String  godina;
    private Glumac glumac;


    public Film(int _id,String _nazivFilma,String _godina,Glumac _glumac){
        this.id=_id;
        this.nazivFilma=_nazivFilma;
        this.godina=_godina;
        this.glumac=_glumac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazivFilma() {
        return nazivFilma;
    }

    public void setNazivFilma(String nazivFilma) {
        this.nazivFilma = nazivFilma;
    }

    public String getGodina() {
        return godina;
    }

    public void setGodina(String godina) {
        this.godina = godina;
    }

    public Glumac getGlumac() {
        return glumac;
    }

    public void setGlumac(Glumac glumac) {
        this.glumac = glumac;
    }


    public String toString(){
        return "Film>> " + id + " - " + nazivFilma + " (" + godina + ") " + glumac.getPrezime() + ", " + glumac.getIme();
    }
}
