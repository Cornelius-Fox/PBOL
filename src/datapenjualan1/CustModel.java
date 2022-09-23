/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datapenjualan1;

/**
 *
 * @author Cornelius
 */
public class CustModel {
 private String idmember,nama, alamat;
    private double total;
    
    public String getIdmember() {
        return idmember;    }
    
    public void setIdmember(String idmember) {        
        this.idmember = idmember;        }
    
    public String getNama() {
        return nama;        }
    
    public void setNama(String nama) {        
        this.nama = nama;        }
    
    public String getAlamat() {
        return alamat;    
    }
    
    public void setAlamat(String alamat) {        
        this.alamat = alamat;    
    }
    
    public double getTotal() {        
        return total;    
    }
    
    public void setTotal(double total) {        
        this.total = total;    
    }

    
    
}
