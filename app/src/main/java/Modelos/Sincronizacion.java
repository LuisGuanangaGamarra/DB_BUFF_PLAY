package Modelos;

public class Sincronizacion {
    public static final String TABLE_NAME ="sincronizacion";
    public static final String ID ="idSincronizacion";
    public static final String ESTADO ="estado";
    public static final String TIPO ="tipo";
    public static final String TABLA ="tabla";
    public static final String ID_REGISTRO ="idRegistro";

    public static String creacionString(){
        String sql = "CREATE TABLE "
                +   TABLE_NAME+" ("
                +   ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                +   ESTADO+" TEXT, "
                +   TIPO+" TEXT, "
                +   TABLA+" TEXT, "
                +   ID_REGISTRO+" INTEGER, "
                + "UNIQUE (" + ID + ") )";
        return sql;
    }
    public static String dropString(){
        String sql = "DROP TABLE IF EXISTS " +TABLE_NAME;
        return sql;
    }
}
