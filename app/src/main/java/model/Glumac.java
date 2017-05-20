package model;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import java.util.Date;

/**
 * Created by borcha on 20.05.17..
 */
public class Glumac {

    private int id;
    private String ime;
    private String prezime;
    private String biografija;
    private Date datumRodjenja;
    private Date datumSmrti;
    private int slika;

    private ArrayList<Film> filmovi;

    public Glumac(){
        filmovi=new ArrayList<>();
    }

    public Glumac(int _id,String _ime,String _prezime,Date _datumRodjenja,Date _datumSmrti,int _slika){
        this.id=_id;
        this.ime=_ime;
        this.prezime=_prezime;
        this.datumRodjenja=_datumRodjenja;
        this.datumSmrti=_datumSmrti;
        this.slika=_slika;

        filmovi=new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBiografija() {
        return biografija;
    }

    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public Date getDatumSmrti() {
        return datumSmrti;
    }

    public void setDatumSmrti(Date datumSmrti) {
        this.datumSmrti = datumSmrti;
    }

    public int getSlika() {
        return slika;
    }

    public void setSlika(int slika) {
        this.slika = slika;
    }

    public ArrayList<Film> getFilmovi() {
        return filmovi;
    }

    public void setFilmovi(ArrayList<Film> filmovi) {
        this.filmovi = filmovi;
    }

    public void addFilmovi(Film _film) {
        this.filmovi.add(_film);
    }

    public String toString(){
        return "Glumac>> " + id + " - " + ime + " " + prezime + " " + datumRodjenja + " / " + datumSmrti;
    }


    //pomocne metode
    public int godineZivota(Date _datumRodjenja,Date _datumSmrti){
        long rezul=0l;

       if(datumSmrti!=null){
            long datum=_datumSmrti.getTime()-_datumRodjenja.getTime();
            rezul= TimeUnit.MILLISECONDS.toDays(datum)/365;

            return (int)rezul;
        }else{
           Date danas=new Date();
            long brojDanaDanas= danas.getTime() / 1000 * 60 * 60 * 24;
            long datum=brojDanaDanas -_datumRodjenja.getTime();
            rezul= TimeUnit.MILLISECONDS.toDays(datum)/365;

            return (int)rezul;
        }


    }

}
