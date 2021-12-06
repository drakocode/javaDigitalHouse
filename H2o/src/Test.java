import java.sql.*;

public class Test {

    private static final String sqlCreateTable="DROP TABLE IF EXISTS TESTE; CREATE TABLE TESTE "
            +"("
            +"ID INT PRIMARY KEY,"
            +"NAME VARCHAR(255) NOT NULL"
            +");";

    private static final String sqlIsert0="INSERT INTO TESTE (ID, NAME) VALUES (1, 'Erik');";
    private static final String sqlIsert1="INSERT INTO TESTE (ID, NAME) VALUES (2, 'Mari');";

    private  static final String sqlSelect="SELECT * FROM TESTE";



    public static void main(String[] args)throws Exception {
        Connection con=null;

        try{
            con = getConnection();
            Statement statement=con.createStatement();
            statement.execute(sqlCreateTable);
            statement.execute(sqlIsert0);
            statement.execute(sqlIsert1);

            showData(con, sqlSelect);


        }catch (Exception e){
e.printStackTrace();

        }finally {
         if (con==null)
             return;
         con.close();

        }




    }

    public static Connection getConnection()throws Exception{
        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }

    private static void showData(Connection connection, String sqlQuery)throws Exception{
        Statement statement=connection.createStatement();
        ResultSet rs=statement.executeQuery(sqlQuery);


        while (rs.next()){
            System.out.println(rs.getInt(1)+" - "+rs.getString(2));


        }



    }










}
