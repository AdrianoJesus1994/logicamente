
package logicamamente.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import logicamamente.dto.JogadoresDto;

/**
 * FXML Controller class
 *
 * @author Adriano
 */
public class ListarJogadoresController implements Initializable {
    @FXML
    private TableView <JogadoresDto> tableViewJogadores;
    @FXML
    private TableColumn <JogadoresDto, String> tabelColumNome;
    @FXML
    private Label labelIdJogador;
    @FXML
    private Label labelNomeJogador;
    @FXML
    private Label labelSexoJogador;
    @FXML
    private Label labelNascJogador;
    
    private List <JogadoresDto> listJogadores;
    private ObservableList <JogadoresDto> oberservableListJogadores;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
