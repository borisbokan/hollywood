package com.borcha.hollywood.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by borcha on 20.05.17..
 */
public class AdapterPodaci {
    private  ArrayList<Glumac> _glumciFilmovi;

    public  ArrayList<Glumac> getlistaGlumaca() {
        return _glumciFilmovi;
    }


    //podaci
    public void puniPodatke() {

        _glumciFilmovi=new ArrayList<>();
        /*   Mat Damon
        http://www.imdb.com/name/nm0000354/?ref_=tt_cl_t1   */
        Glumac MatDaemon = new Glumac(1, " Mat", "Damon", new Date(1970, 10, 8), null,3.05f, "MattDamon.jpg");
        MatDaemon.setBiografija(getBiografija(1));

        MatDaemon.addFilmovi(new Film(0, "Incorporated (TV Series) ", "2016", MatDaemon));
        MatDaemon.addFilmovi(new Film(1, "Jason Bourne", "2016", MatDaemon));
        MatDaemon.addFilmovi(new Film(2, "Promised Land", "2012", MatDaemon));



        /*Charlotte Riley
        http://www.imdb.com/name/nm2731660/bio?ref_=nm_ov_bio_sm*/

        Glumac CharlotteRiley = new Glumac(2, "Charlotte", "Riley", new Date(1981, 12, 29), null,4.5f, "CharlotteRiley.jpg");
        CharlotteRiley.setBiografija(getBiografija(2));

        CharlotteRiley.addFilmovi(new Film(0, "Close to the Enemy (TV Series) ", "2016", CharlotteRiley));
        CharlotteRiley.addFilmovi(new Film(1, "London Has Fallen", "2016", CharlotteRiley));
        CharlotteRiley.addFilmovi(new Film(2, "Killing Thyme", "2015", CharlotteRiley));

        /*
        Colin Firth
        http://www.imdb.com/name/nm0000147/bio?ref_=nm_ov_bio_sm     */
        Glumac ColinFirth = new Glumac(3, "Colin", "Firth", new Date(1960, 10, 8), null,4.3f, "ColinFirth.jpg");
        ColinFirth.setBiografija(getBiografija(3));

        ColinFirth.addFilmovi(new Film(0, "Mamma Mia: Here We Go Again", "2018", ColinFirth));
        ColinFirth.addFilmovi(new Film(1, "The Mercy ", "2016", ColinFirth));
        ColinFirth.addFilmovi(new Film(2, "Before I Go to Sleep", "2014", ColinFirth));



          /*  Jessica Chastain
        http://www.imdb.com/name/nm1567113/bio?ref_=nm_ov_bio_sm*/
        Glumac JessicaChastain = new Glumac(4, "Jessica", "Chastain", new Date(1974, 3, 24), null,3.7f, "JessicaChastain.jpg");
        JessicaChastain.setBiografija(getBiografija(4));

        JessicaChastain.addFilmovi(new Film(0, "Molly's Game", "2016", JessicaChastain));
        JessicaChastain.addFilmovi(new Film(1, "The Division", "2017", JessicaChastain));
        JessicaChastain.addFilmovi(new Film(2, "The Martian", "2015", JessicaChastain));


          /*Jude Law*/
        Glumac JudeLaw = new Glumac(5, "Jude", "Low", new Date(1972, 12, 29), null,3.6f, "JudeLaw.jpg");
        JudeLaw.setBiografija(getBiografija(5));

        JudeLaw.addFilmovi(new Film(0, "The Vote ", "2015", JudeLaw));
        JudeLaw.addFilmovi(new Film(1, "Genius", "2016", JudeLaw));
        JudeLaw.addFilmovi(new Film(2, "Dom Hemingway", "2013", JudeLaw));

       /*Julianne Moore
        http://www.imdb.com/name/nm0000194/bio?ref_=nm_ov_bio_sm*/
        Glumac JulianneMoore = new Glumac(6, "Julianne", "Moore", new Date(1960, 12, 3), null,4.4f, "JulianneMoore.jpg");
        JulianneMoore.setBiografija(getBiografija(6));

        JulianneMoore.addFilmovi(new Film(0, "Wonderstruck ", "2016", JulianneMoore));
        JulianneMoore.addFilmovi(new Film(1, "Seventh Son", "2014", JulianneMoore));
        JulianneMoore.addFilmovi(new Film(2, "Still Alice", "2014", JulianneMoore));


           /*
        Nicole  Kidman
        http://www.imdb.com/name/nm0000173/bio?ref_=nm_ov_bio_sm
         */
        Glumac NicoleKidman = new Glumac(7, "Nicole", "Kidman", new Date(1967, 6, 20), null,3.7f, "NicoleKidman.jpg");
        NicoleKidman.setBiografija(getBiografija(7));

        NicoleKidman.addFilmovi(new Film(0, "Aquaman", "2018", NicoleKidman));
        NicoleKidman.addFilmovi(new Film(1, "Genius", "2016", NicoleKidman));
        NicoleKidman.addFilmovi(new Film(2, "Paddington", "2014", NicoleKidman));


        /*
        Renee Zellweger
        http://www.imdb.com/name/nm0000250/bio?ref_=nm_ov_bio_sm */
        Glumac ReneeZellweger = new Glumac(8, "Reene", "Zellweger", new Date(1969, 4, 25), null,3.3f, "ReneeZellweger.jpg");
        ReneeZellweger.setBiografija(getBiografija(8));

        ReneeZellweger.addFilmovi(new Film(0, "Beba Bridžit Džons ", "2016", ReneeZellweger));
        ReneeZellweger.addFilmovi(new Film(1, "Case 39", "2009", ReneeZellweger));
        ReneeZellweger.addFilmovi(new Film(2, "Bee Movie", "2007", ReneeZellweger));



           /*
        Tom Hiddleston
        http://www.imdb.com/name/nm1089991/bio?ref_=nm_ov_bio_sm
           */
        Glumac TomHiddleston = new Glumac(9, "Tom", "Hiddleston", new Date(1954, 9, 13), null,4.3f, "tom_hiddleston.jpg");
        TomHiddleston.setBiografija(getBiografija(9));
        TomHiddleston.addFilmovi(new Film(5, "Skull Island ", "2017", TomHiddleston));
        TomHiddleston.addFilmovi(new Film(6, "Crimson Peak", "2015", TomHiddleston));
        TomHiddleston.addFilmovi(new Film(7, "High-Rise", "2015", TomHiddleston));


        _glumciFilmovi.add(MatDaemon);
        _glumciFilmovi.add(CharlotteRiley);
        _glumciFilmovi.add(ColinFirth);
        _glumciFilmovi.add(JessicaChastain);
        _glumciFilmovi.add(JudeLaw);
        _glumciFilmovi.add(JulianneMoore);
        _glumciFilmovi.add(NicoleKidman);
        _glumciFilmovi.add(ReneeZellweger);
        _glumciFilmovi.add(TomHiddleston);


    }


    //Biografije

    private static String getBiografija(int i) {

        switch (i) {
            case 1:

                return "Metju Pejdž Dejmon (engl. Matthew Paige Damon) američki je glumac i scenarista, rođen 8. oktobra 1970. godine u Kembridžu (Masačusets).";

            case 2:

                return "Charlotte Riley was born on December 29, 1981 in England. She is an actress, known for Edge of Tomorrow (2014), In the Heart of the Sea (2015) and Easy Virtue (2008). She has been married to Tom Hardy since July 4, 2014. They have one child";

            case 3:

                return "Kolin Endru Fert (engl. Colin Andrew Firth; Grejshot, 10. septembar 1960) engleski je filmski, televizijski i pozorišni glumac. Široj publici je postao poznat po ulozi gospodina Darsija u televizijskoj adapciji romana Gordost i predrasuda iz 1995. Glumio je glavnu ulogu u filmu Kraljev govor iz 2010. godine.Pevao je u nekoliko filmova u kojima je glumio. Tu spadaju Mama mija i Važno je zvati se Ernest. Fert živi u Londonu i Italiji i oženjen je sa filmskom producentkinjom Livijom Đuđoli sa kojom ima dva sina.";

            case 4:

                return " Džesika Častejn (engl. Jessica Chastain; rođena kao Džesika Hauard, 29. marta 1977) je američka filmska, televizijska i pozorišna glumica. Polet u njenoj karijeri počinje 2011. godine, kada je igrala u čak sedam filmova, između ostalih i u kritičkom i komercijalnom hitu Služavke, za koji je bila nominovana za Oskara za najbolju glumicu u sporednoj ulozi. Već sledeće godine, za ulogu u filmu 00:30 – Tajna operacija, osvojila je Zlatnog globusa za najbolju glavnu glumicu u drami i nominovana je za Oskara za najbolju glavnu glumicu. ";
            case 5:

                return "Džud Lo (engl. David Jude Heyworth Law) je britanski glumac i režiser, rođen 29. decembra 1972. u Londonu. Nominovan je za Oskara, za uloge u filmovima Hladna planina i Talentovani gospodin Ripli. Francuska vlada ga je 2007. godine proglasila Vitezom umetnosti.";

            case 6:

                return "Džuli En Smit (engl. Julie Anne Smith; 3. decembar 1960, Severna Karolina) je američka filmska i televizijska glumica i autor knjiga za decu.Karijeru je započela 1983. godine sa nekoliko epizodnih uloga da bi početkom dvadeset prvog veka postala jedna od najpriznatijih i najnagrađivanijih glumica svoje generacije. Nominovana je za Oskara za najbolju sporednu glumicu za filmove Kralj pornića iz 1997, i Sati iz 2002, kao i za Oskara za najbolju glavnu glumicu za uloge u filmovima Kraj jedne ljubavne priče iz 1999, i Daleko od raja iz 2002. godine. Nominovana je za deset Zlatnih globusa, jedanaest Nagrada Udruženja filmskih glumaca i četiri BAFTA nagrade. Za uloge u TV seriji Kako se svet kreće i TV filmu Promena igre dobila je Emi za najbolju glumicu. Krunom njene dosadašnje karijere kritičari smatraju film I dalje Alis iz 2014. godine, u kojoj Murova glumi sredovečnu profesorku lingvistike koja boluje od Alchajmerove bolesti, a za koju je nagrađena Oskarom.Pored mnogobrojnih maestralno odigranih uloga, najčešće nekonvencionalnih žena, i to varirajući — od blokbastera do arthaus filmova — karijeru Džulijane Mur karakterišu borba za zaštitu dece i legalizaciju istopolnih brakova, kao i trostruka evropska kruna — nagrade na festivalima u Veneciji, Kanu i Berlinu.";

            case 7:

                return "Nikol Meri Kidman (engl. Nicole Mary Kidman) je australijska glumica, producent i pevačica, rođena 20. juna 1967. godine u Honolulou (Havaji). Jedna je od najmoćnijih i najbogatijih glumica 21. veka. S obzirom da su joj roditelji Australijanci i da je rođena na Havajima, Kidmanova ima dvojno australijsko i američko državljanstvo.[1]Karijeru je započela u Australiji, gdje je glumila u više serija i filmova, prije nego što je postala međunarodno poznata zbog filma Dani groma (1990). U njenoj dugogodišnjoj karijeri zabeleženi su veliki svetski blokbasteri poput filmova Australija (2008), Hladna planina (2003), Mulen ruž! (2001), i filma Sati (2002) za koji je dobila Oskara za najbolju glavnu žensku ulogu. Zaštitno je lice „Nintendo-a, te je bila zaštitno lice parfema Šanel broj 5, a 2003. godine dobila je svoju zvezdu na Bulevaru slavnih[3]Pored svoje glumačke karijere, Kidmanova je poznata i po svome humanitarnom radu. Od 1994. godine je Ambasador Dobre Volje za Unicef, a od 2006. takođe i za UNIFEM.[4] 2007. godine je dobila najviše civilno priznanje od australijanske vlade, za doprinos scenskim umjetnostima i humanitarnom radu za zdravlje žena.[5]";

            case 8:

                return "Rene Zelveger (engl. Renée Zellweger) je američka glumica i producent, rođena 25. aprila 1969. godine u Kejtiju (Teksas). Pažnju publike privukla je igrajući u filmu Džeri Magvajer, zatim je osvojila dve nominacije za Oskara za najbolju žensku ulogu Bridžit Džonson u filmu Dnevnik Bridžit Džonson (2001) i za ulogu Roksi Hart u filmu Čikago (2002). Godine 2003. osvojila je Oskara za najbolju sporednu žensku ulogu u filmu Hladna planina.";


            case 9:

                return "Tom Hidlston (engl. Tom Hiddleston; 9. februar 1981) je britanski filmski, televizijski, pozorišni i radio glumac. Spada u mlađe britanske glumce koji uspešnu karijeru grade u Britaniji i Holivudu. Obrazovan na Itonu i Kembridžu, Hidlston je karijeru započeo u pozorištu i u nizu zapaženih televizijskih ostvarenja. Pažnju javnosti privukao je 2011, kada su premijerno prikazani kritički nagrađivani Ponoć u Parizu, Ratni konj, Duboko plavo more i komercijalno uspešni Marvelov film Tor. Nakon Tora, gde glumi glavnog negativca Lokija, snimio je još dva nastavka (Osvetnici i Tor: Mračni svet), a u planu su još tri filma iz istog serijala. Hidlston uspešno balanira pri odabiru uloga između komercijalnih i autorskih ostvarenja. Tumačio je glavnu ulogu u filmovima: Samo ljubavnici opstaju (2013), Izložba (2013), Grimizni vrh (2015), Oblakoder (2015) i Video sam svetlost (2015), kao i u televizijskim mini-serijama Šuplja kruna (2012) i Noćni recepcionar (2016). Paralerno sa filmskom i televizijskom karijerom, gradi karijeru u pozorištu. Osvojio je nagradu Lorens Olivije za najboljeg novog glumca 2008. za ulogu u Šekspirovom komadu Simbelin, a nominovan je istovremeno za ulogu Kasija u Otelu.";

            default:
                return "Nema biografiju! Ili je pogresen ID glumca!";
        }


    }


}

