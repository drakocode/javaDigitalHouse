import org.apache.log4j.Logger;

import java.sql.*;



public class Teste {

    private static final String SQL_CREATE_TABLE="DROP TABLE IF EXISTS H2O; CREATE TABLE H2O "
            +"("
            +"ID INT PRIMARY KEY AUTO_INCREMENT,"
            +"PRIMEIRO_NOME VARCHAR(255) NOT NULL,"
            +"SOBRENOME VARCHAR(255) NOT NULL,"
            +"IDADE INT NOT NULL"
            +");";

    private static final String SQL_INSERT0="INSERT INTO H2O (PRIMEIRO_NOME, SOBRENOME, IDADE) VALUES ( 'Erik', 'Kayser', '21');";
    private static final String SQL_INSERT1="INSERT INTO H2O (PRIMEIRO_NOME, SOBRENOME, IDADE) VALUES ( 'Mari', 'Carvalho', '18');";
    private static final String SQL_INSERT2="INSERT INTO H2O (PRIMEIRO_NOME, SOBRENOME, IDADE) VALUES ( 'Julia', 'Baumann', '22');";
    private static final String SQL_INSERT3="INSERT INTO H2O (PRIMEIRO_NOME, SOBRENOME, IDADE) VALUES ( 'Ana', 'Chan', '20');";

    private static final String SQL_DELETE="DELETE FROM H2O WHERE ID = 2;";

    private static final String SQL_UPDATE="DELETE FROM H2O WHERE ID = 2;";

    private  static final String SQL_SELECT="SELECT * FROM H2O";

    private static  final Logger LOGGER=Logger.getLogger(Teste.class);

    public static void main(String[] args)throws Exception {
        Connection con=null;

        try{
            con = getConnection();
            Statement statement=con.createStatement();

            statement.execute(SQL_CREATE_TABLE);
            statement.execute(SQL_INSERT0);
            statement.execute(SQL_INSERT1);
            statement.execute(SQL_INSERT2);
            statement.execute(SQL_INSERT3);

            showData(con, SQL_SELECT);

            LOGGER.info("o usuario com ID 3 foi deletado");

        }catch (Exception e){
            e.printStackTrace();

        }finally {
            if (con==null)
                return;
            con.close();

        }

        closeCon(con);



    }

    public static void closeCon(Connection con) throws Exception {
        con.close();
        LOGGER.info("Connection closed");
    }

    public static Connection getConnection()throws Exception{
        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }

    private static void showData(Connection connection, String sqlQuery)throws Exception{
        Statement statement=connection.createStatement();
        ResultSet rs=statement.executeQuery(sqlQuery);


        while (rs.next()){
            System.out.println(rs.getInt(1)+" - "
                +rs.getString(2)+" - "
                +rs.getString(3)+" - "
                +rs.getString(4));


        }



    }













}
