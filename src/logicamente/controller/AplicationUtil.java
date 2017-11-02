/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicamente.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import logicamente.dto.UsuarioDto;


/**
 *
 * @author Equipe Optimize
 */
public class AplicationUtil {
     
    //Instância única que será guardada
    private static AplicationUtil instancia = null;
    
    private Stage telaAtual = null;
    private UsuarioDto usuarioLogado = null;

    private AplicationUtil() {
        this.telaAtual = new Stage();
    }
    
    public static AplicationUtil getInstancia()
    {
        if(instancia == null){
            instancia = new AplicationUtil();
        }
        return instancia;
    }
    
    public void irParaTela(String nomeTela) {
        try {
            // Carrega o arquivo da tela desejada
            Parent root = FXMLLoader.load(getClass().getResource("/logicamente/view/".concat(nomeTela)));
            
            //Cria uma nova cena para a tela e adiciona no "palco" (telaAtual)
            Scene scene = new Scene(root);
            this.telaAtual.setScene(scene);
            
            //Exibe o palco caso o mesmo não esteja sendo exibido
            if(!this.telaAtual.isShowing()){
                this.telaAtual.show();
            }
        }catch(Exception e){
            System.err.println("Ocorreu um erro ao tentar navegar para tela: ".concat(nomeTela));
           // e.printStackTrace();
        }
    }
    
    public void setTelaAtual(Stage telaAtual) {
        this.telaAtual = telaAtual;
    }

    public Stage getTelaAtual() {
        return telaAtual;
    }

    public UsuarioDto getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(UsuarioDto usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
    
    
}
