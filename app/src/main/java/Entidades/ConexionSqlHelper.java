package Entidades;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexionSqlHelper extends SQLiteOpenHelper {
    public static final String DATA_BASE_NAME = "buffplay";
    public static final int DATA_BASE_VERSION = 3;
    public ConexionSqlHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            db.execSQL(Perfil.creacionString());
            db.execSQL(Post.creacionString());
            db.execSQL(PostComentario.creacionString());
            db.execSQL(Categorias.creacionString());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(Perfil.dropString());
        db.execSQL(Post.dropString());
        db.execSQL(PostComentario.dropString());
        db.execSQL(Categorias.dropString());
        onCreate(db);
    }
}
