package modelDAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Canto;

public class CantoDAO {
    
        Connection con = null;
        
    public ArrayList<String> incluirCanto(Canto c) throws SQLException, ClassNotFoundException{
        con = new Conexao().getConnection();
        ArrayList<String> listaCombo = new ArrayList<String>(); 
        String sql = "INSERT INTO `estudioCanto` (`title`, `href`, `in`, `gr`, `al`,`of`,`co`,`hy`,`tr`,`trSept`,`alPasch`,`ref`,`seq`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        listaCombo.add(c.getTitle());
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, c.getTitle());
        stmt.setString(2, c.getHref());
        stmt.setString(3, c.getIn());
        stmt.setString(4, c.getGr());
        stmt.setString(5, c.getAl());
        stmt.setString(6, c.getOf());
        stmt.setString(7, c.getCo());
        stmt.setString(8, c.getHy());
        stmt.setString(9, c.getTr());
        stmt.setString(10, c.getTrSept());
        stmt.setString(11, c.getAlPasch());
        stmt.setString(12, c.getRef());
        stmt.setString(13, c.getSeq());
        stmt.execute();
        stmt.close();
        con.close();
        return listaCombo;
    }
    
        public ArrayList<String> alimentarBox() throws SQLException, ClassNotFoundException{
        ResultSet retornaResultado;
        ArrayList<String> listaCombo = new ArrayList<String>();
        con = new Conexao().getConnection();
        String comandoSQL = "SELECT title FROM estudioCanto";
        PreparedStatement ponte = con.prepareStatement(comandoSQL);       
        retornaResultado = ponte.executeQuery();
        while(retornaResultado.next())
        {
        String title = retornaResultado.getString("title");
        listaCombo.add(title);
        }
        ponte.close();
        con.close();
        System.out.println(listaCombo);
        return listaCombo;
    }   
    
    public void excluirCanto(String titleProcurado) throws SQLException, ClassNotFoundException 
    {
        con = new Conexao().getConnection();
        String comandoSQL = "DELETE FROM estudioCanto WHERE title = ?";
        PreparedStatement ponte = con.prepareStatement(comandoSQL);
        ponte.setString(1,titleProcurado);
        ponte.execute();
        ponte.close();
        con.close();
    }    
    
    
    public ArrayList<Canto> buscarCanto(String titleProcurado) throws SQLException, ClassNotFoundException{
        ResultSet retornaResultado;
        ArrayList<Canto> lista = new ArrayList<Canto>(); 
        con = new Conexao().getConnection();
        String teste = titleProcurado;
        String comandoSQL = "SELECT * FROM `estudioCanto` WHERE `title` = ?";
        PreparedStatement ponte = con.prepareStatement(comandoSQL); 
        ponte.setString(1,teste);
        retornaResultado = ponte.executeQuery();
        while(retornaResultado.next())
        {
        String title = retornaResultado.getString("title");
        String href = retornaResultado.getString("href");
        String in = retornaResultado.getString("in");
        String gr = retornaResultado.getString("gr");
        String al = retornaResultado.getString("al");
        String of = retornaResultado.getString("of");
        String co = retornaResultado.getString("co");
        String hy = retornaResultado.getString("hy");
        String tr = retornaResultado.getString("tr");   
        String trSept = retornaResultado.getString("trSept");
        String alPasch = retornaResultado.getString("alPasch");
        String ref = retornaResultado.getString("ref");
        String seq = retornaResultado.getString("seq");           
        Canto c = new Canto(title,href,in,gr,al,of,co,hy,tr,trSept,alPasch,ref,seq);
        lista.add(c);
        }
        ponte.close();
        con.close();
        return lista;
    }
    
}
