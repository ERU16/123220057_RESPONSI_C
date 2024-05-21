/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import java.util.ArrayList;
import DAOImplement.DAOImplementbuku;
import DAO.DAObuku;
import model.*;
import view.mainView;
/**
 *
 * @author PC PRAKTIKUM
 */
public class databukucontroller {
    mainView frame;
    DAOImplementbuku implbuku;
    List<databuku> dbk;
    
    public databukucontroller(mainView frame){
        this.frame = frame;
        implbuku = new DAObuku();
        dbk = implbuku.getAll();
    }
    
    public void isitabel(){
        dbk = implbuku.getAll();
        modeltabeldatabuku mb = new modeltabeldatabuku(dbk);
        frame.getTabelDataBuku().setModel(mb);
    }
}
