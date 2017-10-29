
package logicamamente.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import logicamamente.dto.JogadoresDto;
import logicamamente.model.DaoUtil;

/**
 *
 * @author Adriano
 */
public class JogadoresDao extends DaoUtil{
    
   public List<JogadoresDto> recuperaJogador(){
        String sql = "SELECT id, dt_anoNascimento, nome, sexo FROM Jogador";
        List <JogadoresDto> lstret = new LinkedList<JogadoresDto>();
        try {
            ResultSet rs = super.getStatement().executeQuery(sql);
            while (rs.next()) {
                lstret.add(new JogadoresDto(rs.getInt("id"), rs.getDate("dt_anoNascimento"), rs.getString("nome"), rs.getString("sexo")) );
            }
            
            rs.close();
            super.destroyConnection();
        } catch (SQLException e) {
            System.out.println("Erro de Consulta" + e);
        }
        return lstret;
    }
   
   public List<JogadoresDto> recuperaJogadorNome(JogadoresDto nome){
        String sql = "SELECT idproduto, nome FROM tbproduto WHERE nome LIKE ?";
        List<JogadoresDto> lista = new LinkedList<JogadoresDto>();
        try {
            PreparedStatement pst = super.getPreparedStatement(sql);
            pst.setString(1, "%" + nome.getNome() + "%" );
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                lista.add( new JogadoresDto(rs.getInt("id"), rs.getDate("dt_anoNascimento"), rs.getString("nome"), rs.getString("sexo")));
            }
            
            rs.close();
            pst.close();
            super.destroyConnection();
        } catch (SQLException e) {
            System.out.println("Erro de Consulta" + e);
        }
        return lista;
    }
}
