package Entidades;

public class Perfil {
    public static final String TABLE_NAME ="perfil";
    public static final String ID ="id_perfil";
    public static final String NOMBRE ="nombre";
    public static final String TELEFONO ="telefono";
    public static final String EMAIL ="email";
    public static final String GENERO ="genero";
    public static final String STATUS ="st_perfil";
    public static final String FOTO ="foto";
    public static String creacionString(){
        String sql = "CREATE TABLE "
                +   TABLE_NAME+" ("
                +   ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                +   NOMBRE+" TEXT, "
                +   TELEFONO+" TEXT, "
                +   EMAIL+" TEXT, "
                +   GENERO+" TEXT, "
                +   STATUS+" TEXT, "
                +   FOTO+" TEXT,"
                + "UNIQUE (" + Perfil.ID + "))";
        return sql;
    }
    public static String dropString(){
        String sql = "DROP TABLE IF EXISTS " +TABLE_NAME;
        return sql;
    }
}
