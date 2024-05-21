/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import java.util.*;
import connector.connector;
import model.*;
import DAOImplement.DAOImplementbuku;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PC PRAKTIKUM
 */
public class DAObuku implements DAOImplementbuku {
    Connection connection;
    
    final String select = "select * from db_responsi;";
    final String insert = "INSERT INTO sewa_buku (id, nama_penyewa, judul_buku, jenis_buku, nomor_telepon, durasi_sewa, total_biaya) VALUES (?, ?, ?, ?, ?, ?);";
    final String update = "update sewa_buku set nama_penyewa=?, judul_buku=?, jenis_buku=?, nomor_telepon=?, durasi_sewa=?, total_biaya=? where id=?";
    final String delete = "delete from sewa_buku where id=?";
    private databuku buku;
    
    
    public DAObuku(){
        connection = connector.connection();
    }
    @Override
    public void insert(databuku m) {
       PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, m.getId());
            statement.setString(2, m.getNama_penyewa());
            statement.setString(3, m.getJudul_buku());
            statement.setString(4, m.getJenis_buku());
            statement.setString(5, m.getNomor());
            statement.setInt(6, m.getDurasi());
            statement.setInt(7, m.getTotalb());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while(rs.next()){
                m.setId(rs.getInt(1));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public void update(databuku m) {
       PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, m.getNama_penyewa());
            statement.setString(2, m.getJudul_buku());
            statement.setString(3, m.getJenis_buku());
            statement.setString(4, m.getNomor());
            statement.setInt(5, m.getDurasi());
            statement.setInt(6, m.getTotalb());
            statement.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        try {
            statement.close();
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            }
        }
    }
    
     @Override
    public void delete(String id) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            
            statement.setString(1, id);
            statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    
     @Override
    public List<databuku> getAll() {
        List<databuku> dbk = null;
        try{
            dbk = new ArrayList<databuku>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                databuku sbuku = new databuku();
                sbuku.setId(rs.getInt("ID"));
                sbuku.setNama_penyewa(rs.getString("Nama Penyewa"));
                sbuku.setJudul_buku(rs.getString("Judul Buku"));
                sbuku.setJenis_buku(rs.getString("Jenis Buku"));
                sbuku.setNomor(rs.getString("Nomor Telepon"));
                sbuku.setDurasi(rs.getInt("Durasi"));
                sbuku.setTotalb(rs.getInt("Total Biaya"));
                dbk.add(sbuku);
                
            }
        }catch(SQLException ex){
            Logger.getLogger(DAObuku.class.getName()).log(Level.SEVERE, null,ex);
        }
        
        return dbk;
    }
    
}
