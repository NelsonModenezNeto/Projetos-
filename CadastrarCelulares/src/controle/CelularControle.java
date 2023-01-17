/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Celular;
import model.DAO.CelularDAO;

/**
 *
 * @author aluno
 */
public class CelularControle {
    
    public void cadastrarCelular(String Marca, String Modelo, String Processador )
    {
        CelularDAO cldao = new CelularDAO();
        Celular c1 = new Celular(Marca,  Modelo, Processador);
        try 
        {
            cldao.inserirCelular(c1);
        } 
        catch (SQLException ex) {
            Logger.getLogger(CelularControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void excluirCelular(int codigo)
    {
        CelularDAO cldao = new CelularDAO();
        try {
            cldao.excluirCelular(codigo);
        } catch (SQLException ex) {
            Logger.getLogger(CelularControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Celular> buscarCelular() throws SQLException
    {
        CelularDAO cldao = new CelularDAO();
        return(cldao.buscarCelular());
    }
    
}
