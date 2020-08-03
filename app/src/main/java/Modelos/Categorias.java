package Modelos;

public class Categorias {
    public static final String TABLE_NAME ="categorias";
    public static final String ID ="idCategoria";
    public static final String NOMBRE_CATEGORIA ="nombre";
    public static final String DESCRIPCION_CATEGORIA ="descripcion";
    public static final String RECURSO ="recurso";
    public static final String ESTADO ="estado";

    public static String creacionString(){
        String sql = "CREATE TABLE "
                +   TABLE_NAME+" ("
                +   ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                +   NOMBRE_CATEGORIA+" TEXT, "
                +   DESCRIPCION_CATEGORIA+" TEXT, "
                +   RECURSO+" TEXT, "
                +   ESTADO+" TEXT, "
                + "UNIQUE (" + ID + "))";
        return sql;
    }
    public static String dropString(){
        String sql = "DROP TABLE IF EXISTS " +TABLE_NAME;
        return sql;
    }
}
