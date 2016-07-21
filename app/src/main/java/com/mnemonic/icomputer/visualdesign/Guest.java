package com.mnemonic.icomputer.visualdesign;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by iComputer on 15-07-2016.
 */
public class Guest {
    public int id;
    public String name;
    public Date birthdate;

    public Guest (int id, String name, String birthdate) {
        this.id = id;
        this.name = name;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date result = new Date();
        try {
            result =  df.parse(birthdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.birthdate = result;
    }
}
