/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PC PRAKTIKUM
 */
public class modeltabeldatabuku extends AbstractTableModel{
    List<databuku> dbk;
    public modeltabeldatabuku(List<databuku>dbk){
        this.dbk = dbk;
    }
    @Override
    public int getRowCount() {
        return dbk.size();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama Penyewa";
            case 2:
                return "Judul Buku";
            case 3:
                return "Jenis Buku";
            case 4:
                return "Nomor Telepon";
            case 5:
                return "Durasi Sewa";
            case 6:
                return "Total Biaya";
            default:
                return null;
        } // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return dbk.get(row).getId();
            case 1:
                return dbk.get(row).getNama_penyewa();
            case 2:
                return dbk.get(row).getJudul_buku();
            case 3:
                return dbk.get(row).getJenis_buku();
            case 4:
                return dbk.get(row).getNomor();
            case 5:
                return dbk.get(row).getDurasi();
            case 6:
                return dbk.get(row).getTotalb();
            default:
                return null;
        }
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
