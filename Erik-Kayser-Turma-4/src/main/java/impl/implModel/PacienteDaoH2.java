package impl.implModel;

import config.ConfigJDBC;
import impl.IDao;
import model.Endereco;
import model.Paciente;
import org.apache.log4j.Logger;
import util.Util;

import java.awt.image.RescaleOp;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class PacienteDaoH2 implements IDao <Paciente> {

    private ConfigJDBC configJDBC;
    private EnderecoDaoH2 enderecoDaoH2;
    final static Logger log=Logger.getLogger(PacienteDaoH2.class);


    public PacienteDaoH2(EnderecoDaoH2 enderecoDaoH2) {
        this.configJDBC = new ConfigJDBC();
        this.enderecoDaoH2 = enderecoDaoH2;
    }

    //methods
    //
    //
    @Override
    public Paciente save(Paciente paciente) {
        log.debug("Registrando paciente");
        Connection con=configJDBC.connectBD();
        Statement statement=null;
        paciente.setEndereco(enderecoDaoH2.save(paciente.getEndereco()));
        String querySave=String.format("INSERT INTO PACIENTE (NOME, SOBRENOME, RG, DATA_CADASTRO, ENDERECO_ID) VALUES ('%s', '%s', '%s', '%s', '%s')",
                paciente.getNome(),
                paciente.getSobrenome(),
                paciente.getRg(),
                Util.dateTimestamp(paciente.getDataCadastro()),
                paciente.getEndereco().getId());

        try{
            statement=con.createStatement();
            statement.executeUpdate(querySave, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()){
                paciente.setId(rs.getInt(1));
            }
            statement.close();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return paciente;
    }

    @Override
    public Optional<Paciente> search(Integer id) {
        log.debug("Buscando paciente com id "+id);
        Connection con= configJDBC.connectBD();
        Statement statement=null;
        String querySearch=String.format("SELECT ID, NOME, SOBRENOME, RG, DATA_CADASTRO, ENDERECO_ID FROM PACIENTE WHERE ID= '%s'",id);
        Paciente paciente=null;

        try{
            statement = con.createStatement();
            ResultSet rs= statement.executeQuery(querySearch);
            while (rs.next()){
                paciente=createObjPaciente(rs);
            }

            statement.close();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return paciente !=null ? Optional.of(paciente) : Optional.empty() ;
    }

    private Paciente createObjPaciente(ResultSet rs) throws SQLException {
        Integer id= rs.getInt("ID");
        String nome=rs.getString("NOME");
        String sobrenome=rs.getString("SOBRENOME");
        String rg=rs.getString("RG");
        Date dataCadastro=rs.getDate("DATA_CADASTRO");
        Endereco enderecoId=enderecoDaoH2.search(rs.getInt("ENDERECO_ID")).orElse(null);

        return new Paciente(id,nome,sobrenome,rg,dataCadastro,enderecoId);

    }

    @Override
    public void delete(Integer id) {

        log.debug("Deletando o paciente com id: "+id);
        Connection con= configJDBC.connectBD();
        Statement statement=null;
        String queryDelete=String.format("DELETE FROM PACIENTE WHERE ID = '%s'",id);
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
        log.debug("Buscando todos os pacientes");
        Connection con= configJDBC.connectBD();
        Statement statement=null;
        String querySearchAll="SELECT * FROM PACIENTE";
        List<Paciente> pacientes=new ArrayList<>();

        try{
            statement=con.createStatement();
            ResultSet rs=statement.executeQuery(querySearchAll);
            while (rs.next()){
                pacientes.add(createObjPaciente(rs));
            }

            statement.close();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return pacientes;
    }

}
