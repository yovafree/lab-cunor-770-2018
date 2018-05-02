package bd;
import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;


public class ConexionSQLite {

    /* Conexión a utilizar al Compilar el Proyecto, la base de Datos debe de estar
     * en la misma carpeta que el archivo  .jar
     *public String url = "jdbc:sqlite:"+DirectorioActual()+"/base.sqlite"; 
     */
    
    /** Conexión a utilizar en modo de Prueba del Proyecto  */
     public String url = "jdbc:sqlite:db_prueba.s3db"; 
     
    
    public ConexionSQLite()
    {
        
    }

    /**
     * Metodo conectar, realiza la conexion a la base de datos con distintos parametros
     * @return retorna una conexion a la base de datos
     */
    public Connection Conectar()
    {
        Connection link = null;
        try
        {
            //Cargamos el Driver SQLITE
            Class.forName("org.sqlite.JDBC");
            //Creamos un enlace hacia la base de datos
            link = DriverManager.getConnection(this.url, System.getProperties());
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return link;  
    }    
    
    /**
     * Funcion DirectorioActual, determina el directorio en el que se encuentra ejecutando el programa
     * @return Retorna un String, con la ruta en donde se encuentra ejecutando el programa.
     */
    public String DirectorioActual(){
        String directorio = System.getProperty("java.class.path");
        File dir = new File(directorio);
        String directorioPadre = dir.getParent();
        return directorioPadre;
    }


}
