package control;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Canto;
import modelDAO.CantoDAO;



public class CantoControl {
    
    private ArrayList<String> listaCombo;
    
        public void inserirCanto(String title, String href, String in, String gr, String al, String of, String co, String hy, String tr, String trSept, String alPasch, String ref, String seq) throws SQLException, ClassNotFoundException
        {
            ArrayList<Canto> listaEspelho = new ArrayList<Canto>();  
            Canto c = new Canto(title,href,in,gr,al,of,co,hy,tr,trSept,alPasch,ref,seq);
            CantoDAO cDAO = new CantoDAO();
            listaEspelho.add(c);
            listaCombo = cDAO.incluirCanto(c);
        }
    
        public ArrayList<String> listaCombo() throws SQLException, ClassNotFoundException
        {
            CantoDAO cDAO = new CantoDAO();
            listaCombo = cDAO.alimentarBox();
            return listaCombo;
        }
        
        public ArrayList<Canto> buscar(String escolhido) throws SQLException, ClassNotFoundException
        {
            String titleProcurado=escolhido;
            CantoDAO cDAO = new CantoDAO();
            return cDAO.buscarCanto(titleProcurado);
        }
        
        public void excluir(String escolhido) throws SQLException, ClassNotFoundException
        {
            CantoDAO cDAO = new CantoDAO();
            cDAO.excluirCanto(escolhido);
        }
        
}



