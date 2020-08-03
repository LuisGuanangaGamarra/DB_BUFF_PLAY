package Modelos;

public class Descargas {
    public static final String TABLE_NAME ="descargas";
    public static final String ID ="idDescarga";
    public static final String ID_PERFIL =Perfil.ID;
    public static final String NOMBRE ="nombrePost";
    public static final String RECURSO ="recurso";
    public static final String TIPO ="tipo";
    public static final String FECHA_CREACION ="fechaCreacion";
    public static String creacionString(){
        String sql = "CREATE TABLE "
                +   TABLE_NAME+" ("
                +   ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                +   ID_PERFIL+" INTEGER, "
                +   NOMBRE+" TEXT, "
                +   RECURSO+" TEXT, "
                +   TIPO+" TEXT, "
                +   FECHA_CREACION+" TEXT, "
                + "UNIQUE (" + ID + ")," +
                 "FOREIGN KEY (" + ID_PERFIL + ") REFERENCES "+Perfil.TABLE_NAME+" ("+Perfil.ID+") )";

        return sql;
    }
    public static String dropString(){
        String sql = "DROP TABLE IF EXISTS " +TABLE_NAME;
        return sql;
    }
}
