package com.example.login;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class BDHelper extends SQLiteOpenHelper {


    String sCrea="CREATE table jugador (nick varchar (20) primary key, correo varchar (30))";
    String sBorra="DROP table if exists jugador";
    String sConsulta ="SELECT * FROM jugador";
    static String sBD="juego.db";

    public BDHelper(Context context/* String name, SQLiteDatabase.CursorFactory factory, int version */) {
        super(context, sBD, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sCrea);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(sBD);
        db.execSQL(sConsulta);
        onCreate(db);

    }
}
