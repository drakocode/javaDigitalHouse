package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigurationJDBC {

    private String jdbcDriver;
    private String dbUrl;
    private String userName;
    private String passwordUser;

    public ConfigurationJDBC(String jdbcDriver, String dbUrl, String userName, String passwordUser) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.userName = userName;
        this.passwordUser = passwordUser;
    }

    public ConfigurationJDBC(){
        this.jdbcDriver="org.h2.Driver";
        this.dbUrl="jdbc:h2:~/test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'src/create.sql'";
        this.userName="sa";
        this.passwordUser="";

    }

    public Connection connectBD(){
        Connection con=null;
        try{
            con= DriverManager.getConnection(dbUrl,userName,passwordUser);
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }
        return con;
    }


}
