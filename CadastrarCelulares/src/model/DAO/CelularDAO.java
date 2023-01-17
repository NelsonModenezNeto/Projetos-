/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Celular;

/**
 *
 * @author aluno
 */
public class CelularDAO {
    Connection con;
    
    public void inserirCelular(Celular c1) throws SQLException
    {
        con = new Conexao().getConnection();
        String comando = "Insert into Celulares (Marca,Modelo,Processador) values(?,?,?)";
        PreparedStatement stmt = con.prepareStatement(comando);
        stmt.setString(1, c1.getMarca());
        stmt.setString(2, c1.getModelo());
        stmt.setString(3, c1.getProcessador());
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public void excluirCelular(int codigo) throws SQLException
    {
       con = new Conexao().getConnection();
       String sql = "DELETE FROM Celulares WHERE Codigo = ?";
       PreparedStatement stmt = con.prepareStatement(sql);
       stmt.setInt(1, codigo);
       stmt.execute();
       stmt.close();
       con.close();         
    }
    
    public ArrayList<Celular> buscarCelular() throws SQLException
    {
       ResultSet rs;
       ArrayList<Celular> lista = new ArrayList();
       con = new Conexao().getConnection();
       String sql = "SELECT * FROM Celulares";
       PreparedStatement stmt = con.prepareStatement(sql);
       rs = stmt.executeQuery();
       while(rs.next())
       {
           String marca = rs.getString("Marca");
           String modelo = rs.getString("Modelo");
           String processador = rs.getString("Processador");
           int codigo = rs.getInt("Codigo");
           
           Celular c1 = new Celular(marca,modelo,processador,codigo);
           lista.add(c1);
       }
       stmt.close();
       con.close();
       return lista;
    }
    
}
