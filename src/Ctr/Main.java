/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctr;

import DAO.PhimDAO;
import DAO.VeDAO;
import Entities.Phim;
import Entities.Ve;
import View.HomePage;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        //new HomePage().setVisible(true);
        List<Phim> phimList = new PhimDAO().layDanhSachPhim();
        
        for (Phim e: phimList){
            
            System.out.println(e.toString());
        }
        System.out.println(phimList.size());
        
    }
}
