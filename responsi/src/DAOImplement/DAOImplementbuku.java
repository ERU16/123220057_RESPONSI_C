/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;
import java.util.List;
import model.*;
/**
 *
 * @author PC PRAKTIKUM
 */
public interface DAOImplementbuku {
     public void insert(databuku m);
     public void update(databuku m);
     public void delete(String judul);
     public List<databuku> getAll();
}
