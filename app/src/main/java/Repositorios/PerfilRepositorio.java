package Repositorios;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import Entidades.Perfil;

public class PerfilRepositorio {
    private  SQLiteDatabase db;
    public PerfilRepositorio(SQLiteDatabase db) {
        this.db = db;
    }

    public boolean insert(Perfil perfil)
    {
        ContentValues valores = new ContentValues();
        try{
            valores.put(Modelos.Perfil.);
            return true;
        }catch (Exception e)
        {
            return false;
        }
    }
}
