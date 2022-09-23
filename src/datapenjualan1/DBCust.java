/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datapenjualan1;

import java.sql.ResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author LIKMI
 */
public class DBCust {
        private CustModel dt=new CustModel();    
    public CustModel getCustModel(){ return(dt);}
    public void setCustModel(CustModel s){ dt=s;}
    
    public ObservableList<CustModel>  Load() {
        try {
            ObservableList<CustModel> tableData=FXCollections.observableArrayList();
            Koneksi con = new Koneksi();            
            con.bukaKoneksi();
            con.statement = con.dbKoneksi.createStatement();
            ResultSet rs = con.statement.executeQuery("Select idmember, nama, alamat, total from customer");
int i = 1;
            while (rs.next()) {
                CustModel d=new CustModel();
                d.setIdmember(rs.getString("idmember"));                
                d.setNama(rs.getString("nama"));
                d.setAlamat(rs.getString("alamat"));                
                d.setTotal(rs.getDouble("total"));           
                tableData.add(d);                
                i++;            
            }
            con.tutupKoneksi();            
            return tableData;
        } catch (Exception e) {            
            e.printStackTrace();            
            return null;        
        }
    }
}
