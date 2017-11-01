/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicamente.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import logicamente.dto.UsuarioDto;
import logicamente.model.dao.UsuarioDao;

/**
 * FXML Controller class
 *
 * @author Adriano.jesus
 */
public class LoginController implements Initializable {
    @FXML
    private Button btnLogin;

    @FXML
    private TextField inputLogin;

    @FXML
    private PasswordField inputSenha;

    @FXML
    private Button btnCadatrar;
    
    @FXML
    private Label labelStatus;
    
    @FXML
    private AnchorPane anchorpaneLogin;
    
    @FXML
    void realizarLogin(ActionEvent event) {
       List <UsuarioDto> usuarios  = new UsuarioDao().listarUsuarios();
       
        try {

            for (int i = 0; i<usuarios.size(); i++) {
                if( inputLogin.getText().equals(usuarios.get(i).getEmail()) && inputSenha.getText().equals(usuarios.get(i).getSenha()) ){
                //if (inputLogin.getText().equals(usuario.getEmail()) && inputSenha.getText().equals(usuario.getSenha()) ) {
                    try {
                                              
                        Parent root = FXMLLoader.load(getClass().getResource("/logicamente/view/VboxMain.fxml"));
                        Stage stage = new Stage();
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                        break;
                        
                    } catch (IOException e) {
                        System.out.println("Erro: " + e);
                    }
                }else{
                    labelStatus.setText("Erro Na Autenticação");
                    inputLogin.setText("");
                    inputSenha.setText("");
                }
            }
            
        } catch (Exception e) {
          labelStatus.setText("Ocorreu um Erro: " + e);
        }      
    }

    @FXML
    void realizarCadastro(ActionEvent event) {
        try {
            
            AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/logicamente/view/CadastroUsuario.fxml"));
            anchorpaneLogin.getChildren().setAll(a);
            
//            Parent root = FXMLLoader.load(getClass().getResource("/logicamente/view/CadastroUsuario.fxml"));
//            Stage stage = new Stage();
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.show();

        } catch (IOException e) {
            System.out.println("Erro: " + e);
        }  
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
