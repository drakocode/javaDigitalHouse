package impl.implModel;

import config.ConfigJDBC;
import impl.IDao;
import model.Dentista;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DentistaDaoH2 implements IDao <Dentista>{
    private ConfigJDBC configJDBC;
    final static Logger log=Logger.getLogger(DentistaDaoH2.class);


    public DentistaDaoH2() {
        this.configJDBC = new ConfigJDBC();
    }

    //methods
    //
    //
    @Override
    public Dentista save(Dentista dentista) {
        log.debug("Registrando dentista");
        Connection con=configJDBC.connectBD();
        Statement statement=null;
        String querySave=String.format("INSERT INTO DENTISTA (NOME, SOBRENOME, MATRICULA) VALUES ('%s', '%s', '%s')",
                dentista.getNome(),
                dentista.getSobrenome(),
                dentista.getMatricula());
        try{
            statement=con.createStatement();
            statement.executeUpdate(querySave, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()){
                dentista.setId(rs.getInt(1));
            }
            statement.close();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return dentista;
    }

    @Override
    public Optional<Dentista> search(Integer id) {
        log.debug("Buscando paciente com id "+id);
        Connection con= configJDBC.connectBD();
        Statement statement=null;
        String querySearch=String.format("SELECT ID, NOME, SOBRENOME, MATRICULA FROM DENTISTA WHERE ID= '%s'",id);
        Dentista dentista=null;

        try{
            statement = con.createStatement();
            ResultSet rs= statement.executeQuery(querySearch);
            while (rs.next()){
                dentista=createObjDentista(rs);
            }

            statement.close();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return dentista !=null ? Optional.of(dentista) : Optional.empty() ;
    }

    private Dentista createObjDentista(ResultSet rs) throws SQLException {
        Integer id= rs.getInt("ID");
        String nome=rs.getString("NOME");
        String sobrenome=rs.getString("SOBRENOME");
        Integer matricula=rs.getInt("MATRICULA");


        return new Dentista(id,nome,sobrenome,matricula);

    }

    @Override
    public void delete(Integer id) {
        log.debug("Deletando o dentista com id: "+id);
        Connection con= configJDBC.connectBD();
        Statement statement=null;
        String queryDelete=String.format("DELETE FROM DENTISTA WHERE ID = '%s'",id);
        try{

            statement = con.createStatement();
            statement.executeUpdate(queryDelete);
            statement.close();
            con.close();


        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List searchAll() {
        log.debug("Buscando todos os dentistas");
        Connection con= configJDBC.connectBD();
        Statement statement=null;
        String querySearchAll="SELECT * FROM DENTISTA";
        List<Dentista> dentistas=new ArrayList<>();

        try{
            statement=con.createStatement();
            ResultSet rs=statement.executeQuery(querySearchAll);
            while (rs.next()){
                dentistas.add(createObjDentista(rs));
            }

            statement.close();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return dentistas;
    }

}
