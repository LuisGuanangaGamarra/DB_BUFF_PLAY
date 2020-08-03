package Modelos;

public class CategoriasPost {
    public static final String TABLE_NAME ="categoriasPost";
    public static final String ID ="id";
    public static final String ID_POST =Post.ID;
    public static final String ID_CATEGORIA =Categorias.ID;
    public static String creacionString(){
        String sql = "CREATE TABLE "
                +   TABLE_NAME+" ("
                +   ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                +   ID_POST+" INTEGER, "
                +   ID_CATEGORIA+" INTEGER, "
                + "UNIQUE (" + ID + "),"
                + "FOREIGN KEY (" + ID_POST + ") REFERENCES "+Post.TABLE_NAME+" ("+Post.ID+"), "
                + "FOREIGN KEY (" + ID_CATEGORIA + ") REFERENCES "+Categorias.TABLE_NAME+" ("+Categorias.ID+")"
                +")";
        return sql;
    }
    public static String dropString(){
        String sql = "DROP TABLE IF EXISTS " +TABLE_NAME;
        return sql;
    }
}
