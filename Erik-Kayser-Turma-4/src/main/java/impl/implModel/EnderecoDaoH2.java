package impl.implModel;

import config.ConfigJDBC;
import impl.IDao;
import model.Endereco;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EnderecoDaoH2 implements IDao <Endereco>{

    private ConfigJDBC configJDBC;
    final static Logger log=Logger.getLogger(EnderecoDaoH2.class);


    public EnderecoDaoH2() {
        this.configJDBC = new ConfigJDBC();
    }

    //methods
    //
    //
    @Override
    public Endereco save(Endereco endereco) {
        log.debug("Registrando endereço");
        Connection con= configJDBC.connectBD();
        Statement statement=null;
        String queryInsert=String.format("INSERT INTO ENDERECO (RUA, NUMERO, CIDADE, ESTADO) VALUES ('%s', '%s', '%s', '%s')",
                endereco.getRua(),
                endereco.getNumero(),
                endereco.getCidade(),
                endereco.getEstado());

        try{
            statement=con.createStatement();
            statement.executeUpdate(queryInsert, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs=statement.getGeneratedKeys();
            if (rs.next()){
                endereco.setId(rs.getInt(1));
                statement.close();
                con.close();

            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return endereco;


    }

    @Override
    public Optional<Endereco> search(Integer id) {
        log.debug("Buscando endereço com id "+id);

        Connection con= configJDBC.connectBD();
        Statement statement=null;
        String querySearch=String.format("SELECT ID, RUA, NUMERO, CIDADE, ESTADO FROM ENDERECO WHERE ID= '%s'",id);
        Endereco endereco=null;

        try{
            statement = con.createStatement();
            ResultSet rs= statement.executeQuery(querySearch);
            while (rs.next()){
                endereco=createObjEndereco(rs);
            }

            statement.close();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return endereco !=null ? Optional.of(endereco) : Optional.empty() ;
    }

    private Endereco createObjEndereco(ResultSet rs) throws SQLException {
        Integer id= rs.getInt("ID");
        String rua=rs.getString("RUA");
        String numero=rs.getString("NUMERO");
        String cidade=rs.getString("CIDADE");
        String estado=rs.getString("ESTADO");

        return new Endereco(id,rua,numero,cidade,estado);

    }

    @Override
    public void delete(Integer id) {

        log.debug("Deletando o endereco com id: "+id);
        Connection con= configJDBC.connectBD();
        Statement statement=null;
        String queryDelete=String.format("DELETE FROM ENDERECO WHERE ID = '%s'",id);
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
    public List<Endereco> searchAll() {
        log.debug("Buscando todos os enderecos");
        Connection con= configJDBC.connectBD();
        Statement statement=null;
        String querySearchAll="SELECT * FROM ENDERECO";
        List<Endereco> enderecos=new ArrayList<>();

        try{
            statement=con.createStatement();
            ResultSet rs=statement.executeQuery(querySearchAll);
            while (rs.next()){
                enderecos.add(createObjEndereco(rs));
            }

            statement.close();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return enderecos;
    }
}
