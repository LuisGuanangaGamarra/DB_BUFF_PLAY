package Entidades;

public class Categorias {
    public static final String TABLE_NAME ="categorias";
    public static final String ID ="id_categoria";
    public static final String NOMBRE_CATEGORIA ="nombre_categoria";
    public static final String ST_CATEGORIA ="st_categoria";

    public static String creacionString(){
        String sql = "CREATE TABLE "
                +   TABLE_NAME+" ("
                +   ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                +   NOMBRE_CATEGORIA+" TEXT, "
                +   ST_CATEGORIA+" TEXT, "
                + "UNIQUE (" + ID + "))";
        return sql;
    }
    public static String dropString(){
        String sql = "DROP TABLE IF EXISTS " +TABLE_NAME;
        return sql;
    }
}
