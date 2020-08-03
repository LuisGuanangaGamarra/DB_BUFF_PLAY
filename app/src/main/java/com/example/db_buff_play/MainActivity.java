package com.example.db_buff_play;

import androidx.appcompat.app.AppCompatActivity;

import Modelos.Categorias;
import Modelos.ConexionSqlHelper;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConexionSqlHelper conexion = new ConexionSqlHelper(this, "buffplay.db", null, ConexionSqlHelper.DATA_BASE_VERSION);
        SQLiteDatabase db = conexion.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Categorias.NOMBRE_CATEGORIA, "Literatura");
        values.put(Categorias.DESCRIPCION_CATEGORIA, "Materia de estudio de la lengua española");
        try {
            db.insert(Categorias.TABLE_NAME,Categorias.ID,values);
            String[] columns = new String[] {Categorias.ID,Categorias.NOMBRE_CATEGORIA,Categorias.DESCRIPCION_CATEGORIA};
            Cursor c =db.query(Categorias.TABLE_NAME,columns,null,null,null,null,null);
            //Nos aseguramos de que existe al menos un registro
            if (c.moveToFirst()) {
                //Recorremos el cursor hasta que no haya más registros

                    int codigo= c.getInt(0);
                    String nombre = c.getString(1);
                Toast.makeText(this,nombre,Toast.LENGTH_LONG).show();

            }
        } catch (Exception e) {
            Toast.makeText(this,"Error al insertar",Toast.LENGTH_LONG).show();
        }
        finally {
            if(db.isOpen()){
                db.close();
            }
        }




    }
}