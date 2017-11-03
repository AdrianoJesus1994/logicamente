/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicamente.controller;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import logicamente.dto.JogadoresDto;
import logicamente.model.dao.JogadoresDao;


/**
 * FXML Controller class
 *
 * @author Adriano.jesus
 */
public class VisaoGeralController implements Initializable {

        @FXML
    private NumberAxis graficoBarraValor;

    @FXML
    private BarChart<?, ?> graficoBarra;

    @FXML
    private CategoryAxis graficoBarraCategorias;
    
    List<JogadoresDto> jogadores = new JogadoresDao().recuperaJogador();
    
    ObservableList<String> sexo = FXCollections.observableArrayList();
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
//        String[] arraySexo = {"Masc", "Fem"};       
//        sexo.addAll(Arrays.asList(arraySexo));        
//        graficoBarraCategorias.setCategories(sexo); 
//        XYChart.Series series = new XYChart.Series();
//            
//            for (int i =0;i<jogadores.size();i++){
//                
//                if(jogadores.get(i).getSexo().equals("M")){
//                    String sex = "Masculino";
//                    Integer qtd = 1;
//                    series.getData().add(new XYChart.Data(sex, qtd));
//                }else{
//                    String sex = "Feminino";
//                    Integer qtd = 1;
//                    series.getData().add(new XYChart.Data(sex, qtd));
//                }
//                graficoBarra.getData().addAll(series);
//            }
            
            
    }    
    
}
