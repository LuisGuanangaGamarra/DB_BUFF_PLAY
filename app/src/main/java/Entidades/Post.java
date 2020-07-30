package Entidades;

public class Post {
    public static final String TABLE_NAME ="post";
    public static final String ID ="id_post";
    public static final String NOMBRE ="nombre_post";
    public static final String TIPO ="tipo_post";
    public static final String ORDEN ="orden";
    public static final String ID_PERFIL =Perfil.ID;
    public static String creacionString(){
        String sql = "CREATE TABLE "
                +   TABLE_NAME+" ("
                +   ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                +   NOMBRE+" TEXT, "
                +   TIPO+" TEXT, "
                +   ORDEN+" INTEGER, "
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
