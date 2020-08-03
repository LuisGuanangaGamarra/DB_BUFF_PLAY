package Modelos;

public class Cifras {
    public static final String TABLE_NAME ="cifras";
    public static final String ID ="idCifra";
    public static final String NUM_SEGUIDORES ="numSeguidores";
    public static final String NUM_POST ="numPost";
    public static final String NUM_SIGUIENDO ="numSiguiendo";
    public static final String ID_PERFIL =Perfil.ID;
    public static String creacionString(){
        String sql = "CREATE TABLE "
                +   TABLE_NAME+" ("
                +   ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                +   NUM_SEGUIDORES+" INTEGER, "
                +   NUM_POST+" INTEGER, "
                +   NUM_SIGUIENDO+" INTEGER, "
                + "UNIQUE (" + ID + "))";
            return sql;
    }
    public static String dropString(){
        String sql = "DROP TABLE IF EXISTS " +TABLE_NAME;
        return sql;
    }

}
