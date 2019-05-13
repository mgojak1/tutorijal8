package ba.unsa.etf.rs.tutorijal8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class TransportDAO {

    private static TransportDAO instance = null;
    private static Connection conn;
    private static PreparedStatement addDriver;
    private static PreparedStatement addBus;
    private static PreparedStatement removeDriver;

    private TransportDAO(){
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:baza.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    private static void initialize(){
        instance = new TransportDAO();
    }

    public static TransportDAO getInstance() {
        if(instance == null) initialize();
        return instance;
    }

    public void resetDatabase() {

    }

    public ArrayList<Driver> getDrivers() {
        return null;
    }

    public ArrayList<Bus> getBusses() {
        return null;
    }

    public void dodijeliVozacuAutobus(Driver driver, Bus bus, int which) {
    }

    public void deleteBus(Bus bus) {
    }

    public void deleteDriver(Driver driver) {
    }

    public void addBus(Bus bus) {
    }
    public void addDriver(Driver driver) {
    }
}
