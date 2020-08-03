package Modelos;

public class Post {
    public static final String TABLE_NAME ="post";
    public static final String ID ="idPost";
    public static final String NOMBRE ="nombrePost";
    public static final String RECURSO ="recurso";
    public static final String TIPO ="tipo";
    public static final String FECHA_CREACION ="fechaCreacion";
    public static final String ESTADO ="estado";
    public static final String ID_PERFIL =Perfil.ID;
    public static String creacionString(){
        String sql = "CREATE TABLE "
                +   TABLE_NAME+" ("
                +   ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                +   NOMBRE+" TEXT, "
                +   RECURSO+" TEXT, "
                +   TIPO+" TEXT, "
                +   FECHA_CREACION+" TEXT, "
                +   ESTADO+" TEXT, "
                +   ID_PERFIL+" INTEGER, "
                + "UNIQUE (" + Post.ID + "),"
                + "FOREIGN KEY (" + Post.ID_PERFIL + ") REFERENCES "+Perfil.TABLE_NAME+" ("+Perfil.ID+") )";
        return sql;
    }
    public static String dropString(){
        String sql = "DROP TABLE IF EXISTS " +TABLE_NAME;
        return sql;
    }
}
