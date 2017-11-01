/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicamente.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import logicamente.dto.UsuarioDto;
import logicamente.model.DaoUtil;

/**
 *
 * @author Adriano.jesus
 */
public class UsuarioDao extends DaoUtil {

    public List<UsuarioDto> listarUsuarios(){
        String sql = "SELECT id, email, nome, senha, dtNasc FROM Usuario";
        List <UsuarioDto> lstret = new LinkedList<UsuarioDto>();
        try {
            ResultSet rs = super.getStatement().executeQuery(sql);
            while (rs.next()) {
                lstret.add(new UsuarioDto(rs.getInt("id"),rs.getString("email"), rs.getString("nome"), rs.getString("senha"), rs.getDate("dtNasc") ) );
            }
            
            rs.close();
            super.destroyConnection();
        } catch (SQLException e) {
            System.out.println("Erro de Consulta" + e);
        }
        return lstret;
    }
    

}
