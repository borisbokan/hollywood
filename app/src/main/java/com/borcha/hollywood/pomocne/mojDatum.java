package com.borcha.hollywood.pomocne;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by borcha on 22.05.17..
 */

public class mojDatum {

    /**
     * Vraca formatiran datum pr. 12-2-2016
     * @param _date
     * @return String
     */
    public static String getFormatiranDatum(Date _date){
        final SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy");
        String rezultat=sdfDate.format(_date);
         return rezultat;
    }


}
