package Entidades;

public class PostComentario {
    public static final String TABLE_NAME ="post_comentario";
    public static final String ID ="id_post_comentario";
    public static final String ID_POST =Post.ID;
    public static final String ID_PERFIL =Perfil.ID;
    public static final String MENSAJE = "mensaje";
    public static final String STATUS = "st_post_comentario";
    public static String creacionString(){
        String sql = "CREATE TABLE "
                +   TABLE_NAME+" ("
                +   ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                +   ID_POST+" INTEGER, "
                +   ID_PERFIL+" INTEGER, "
                +   MENSAJE+" TEXT, "
                +   STATUS+" TEXT, "
                + "UNIQUE (" + ID + "),"
                + "FOREIGN KEY (" + ID_PERFIL + ") REFERENCES "+Perfil.TABLE_NAME+" ("+Perfil.ID+"), "
                + "FOREIGN KEY (" + ID_POST + ") REFERENCES "+Post.TABLE_NAME+" ("+Post.ID+")"
                +")";
        return sql;
    }
    public static String dropString(){
        String sql = "DROP TABLE IF EXISTS " +TABLE_NAME;
        return sql;
    }
}
