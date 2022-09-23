/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datapenjualan1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Cornelius
 */
public class FXMLDataCustController implements Initializable {
       @FXML
    private TableView<CustModel> tbvcust;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showdata();
    }    
    
    public void showdata(){
        ObservableList<CustModel> data=FXMLDocumentController.dtcust.Load();
        if(data!=null){            
            tbvcust.getColumns().clear();            
            tbvcust.getItems().clear();
            TableColumn col=new TableColumn("idmember");
            col.setCellValueFactory(new PropertyValueFactory<CustModel,String>("idmember"));
            tbvcust.getColumns().addAll(col);
            col=new TableColumn("nama");
            col.setCellValueFactory(new PropertyValueFactory<CustModel, String>("nama"));
            tbvcust.getColumns().addAll(col);
            col=new TableColumn("alamat");
            col.setCellValueFactory(new PropertyValueFactory<CustModel, String>("alamat"));
            tbvcust.getColumns().addAll(col);
            col=new TableColumn("total");
            col.setCellValueFactory(new PropertyValueFactory<CustModel, String>("total"));
          
            tbvcust.getColumns().addAll(col);
            tbvcust.setItems(data);
    }else {  Alert a=new Alert(Alert.AlertType.ERROR,"Data kosong",ButtonType.OK);
            a.showAndWait();
            tbvcust.getScene().getWindow().hide();;
        }                
    }
 

    @FXML
    private Button btnawal;
    @FXML
    private Button btnsesudah;
    @FXML
    private Button btnsebelum;
    @FXML
    private Button btnakhir;
    @FXML
    private Button btntambah;
    @FXML
    private Button btnupdate;
    @FXML
    private Button btnhapus;
    @FXML
    private Button btnquit;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */

    /* public void initialize(URL url, ResourceBundle rb) {
    // TODO
    }   */ 

    /* public void initialize(URL url, ResourceBundle rb) {
       // TODO
       }   */
       @FXML
    private void awalklik(ActionEvent event) {
    }

    @FXML
    private void sesudahklik(ActionEvent event) {
    }

    @FXML
    private void sebelumklik(ActionEvent event) {
    }

    @FXML
    private void akhirklik(ActionEvent event) {
    }

    @FXML
    private void tambahklik(ActionEvent event) {
    }

    @FXML
    private void updateklik(ActionEvent event) {
    }

    @FXML
    private void hapusklik(ActionEvent event) {
    }

    @FXML
    private void quitklik(ActionEvent event) {
    }
    
}
