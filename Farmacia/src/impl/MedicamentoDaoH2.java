package impl;

import config.ConfigurationJDBC;
import model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MedicamentoDaoH2 implements IDao <Medicamento>{

    private ConfigurationJDBC configurationJDBC;
    private static Logger log = Logger.getLogger(MedicamentoDaoH2.class);

    public MedicamentoDaoH2(ConfigurationJDBC configurationJDBC) {
        this.configurationJDBC = configurationJDBC;
    }


    @Override
    public Medicamento save(Medicamento medicamento) {
        log.debug("Registrando novo medicamento :"+medicamento.toString());
        Connection con= configurationJDBC.connectBD();
        Statement statement=null;

        String queryAdd=String.format("INSERT INTO MEDICAMENTO (NOME, LABORATORIO, QUANTIDADE, PRECO) VALUES ('%s, %s, %s, %f,)",
                medicamento.getNome(),
                medicamento.getLaboratorio(),
                medicamento.getQuantidade(),
                medicamento.getPreco());

        try{
            statement=con.createStatement();
            statement.execute(queryAdd,Statement.RETURN_GENERATED_KEYS);
            ResultSet keys=statement.getGeneratedKeys();

            if (keys.next()){
                medicamento.setId(keys.getInt(1));
                statement.close();
                con.close();
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return medicamento;
    }



    @Override
    public Medicamento search(Integer id) {
        log.debug("Buscando medicamento com id: "+id);
        Connection con= configurationJDBC.connectBD();
        Statement statement=null;
        String query=String.format("SELCT ID, NOME, LABORATORIO, QUANTIDADE, PRECO FROM MEDICAMENTO WHERE ID= '%s'",id);
        Medicamento medicamento=null;

        try{
            statement=con.createStatement();
            ResultSet resultSet=statement.executeQuery(query);

            while (resultSet.next()){
                medicamento=new Medicamento(resultSet.getInt("id"),
                    resultSet.getString("nome"),
                    resultSet.getString("laboratorio"),
                    resultSet.getInt("quantidade"),
                    resultSet.getDouble("preco"));
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();



        }return medicamento;




    }
}
