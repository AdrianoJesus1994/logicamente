
package logicamamente.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import logicamamente.dto.PartidaDto;
import logicamamente.model.DaoUtil;

/**
 *
 * @author Adriano
 */
public class PartidaDao extends DaoUtil {
    
    public List<PartidaDto> recuperaPartida(){
        String sql = "SELECT id, dt_jogo, tipo_dificuldade, num_movimentos, tempo_jogo, id_jogador FROM Partida";
        
        List <PartidaDto> partidas = new LinkedList<PartidaDto>();
        try {
            ResultSet retorno = super.getStatement().executeQuery(sql);
            while (retorno.next()) {
                partidas.add(new PartidaDto(retorno.getInt("id"), retorno.getDate("dt_jogo"), retorno.getInt("tipo_dificuldade"), retorno.getInt("num_movimentos"), retorno.getTime("tempo_jogo"), retorno.getInt("id_jogador")));
            }
            
            retorno.close();
            super.destroyConnection();
        } catch (SQLException e) {
            System.out.println("Erro de Consulta" + e);
        }
        
        return partidas;
    }
    
     public List<PartidaDto> recuperaPartidaData(PartidaDto data){
        String sql = "SELECT * FROM Partida WHERE dt_jogo = ?";
        
        List <PartidaDto> partidas = new LinkedList<PartidaDto>();
        
        try {
            PreparedStatement pst = super.getPreparedStatement(sql);
            pst.setDate(1, data.getData());
            ResultSet retorno = super.getStatement().executeQuery(sql);
            while (retorno.next()) {
                partidas.add(new PartidaDto(retorno.getInt("id"), retorno.getDate("dt_jogo"), retorno.getInt("tipo_dificuldade"), retorno.getInt("num_movimentos"), retorno.getTime("tempo_jogo"), retorno.getInt("id_jogador")));
            }
            
            retorno.close();
            super.destroyConnection();
        } catch (SQLException e) {
            System.out.println("Erro de Consulta" + e);
        }
        
        return partidas;
    }
     
    public List<PartidaDto> recuperaPartidaJogador(PartidaDto idjogador){
        String sql = "SELECT * FROM Partida WHERE id_jogador = ?";
        
        List <PartidaDto> partidas = new LinkedList<PartidaDto>();
        
        try {
            PreparedStatement pst = super.getPreparedStatement(sql);
            pst.setInt(1, idjogador.getId_jogador());
            ResultSet retorno = super.getStatement().executeQuery(sql);
            while (retorno.next()) {
                partidas.add(new PartidaDto(retorno.getInt("id"), retorno.getDate("dt_jogo"), retorno.getInt("tipo_dificuldade"), retorno.getInt("num_movimentos"), retorno.getTime("tempo_jogo"), retorno.getInt("id_jogador")));
            }
            
            retorno.close();
            super.destroyConnection();
        } catch (SQLException e) {
            System.out.println("Erro de Consulta" + e);
        }
        
        return partidas;
    }
}
