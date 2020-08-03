package Modelos;

public class Perfil {
    public static final String TABLE_NAME ="perfil";
    public static final String ID ="idPerfil";
    public static final String NOMBRE ="nombres";
    public static final String EMAIL ="email";
    public static final String PRIVADO ="privado";
    public static final String FECHA_NACIMIENTO ="fechaNacimiento";
    public static final String TELEFONO ="telefono";
    public static final String SEXO ="sexo";
    public static final String ESTADO ="estado";
    public static final String RECURSO ="recurso";
    public static final String TOKEN ="token";
    public static final String CONTRASENIA ="contrasenia";
    public static String creacionString(){
        String sql = "CREATE TABLE "
                +   TABLE_NAME+" ("
                +   ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                +   NOMBRE+" TEXT, "
                +   EMAIL+" TEXT, "
                +   PRIVADO+" TEXT, "
                +   FECHA_NACIMIENTO+" TEXT, "
                +   TELEFONO+" TEXT, "
                +   SEXO+" TEXT, "
                +   ESTADO+" TEXT, "
                +   RECURSO+" TEXT, "
                +   TOKEN+" TEXT, "
                +   CONTRASENIA+" TEXT,"
                + "UNIQUE (" + Perfil.ID + "))";
        return sql;
    }
    public static String dropString(){
        String sql = "DROP TABLE IF EXISTS " +TABLE_NAME;
        return sql;
    }
}
