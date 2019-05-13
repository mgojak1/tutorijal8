package ba.unsa.etf.rs.tutorijal8;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class TransportDAO {

    private static TransportDAO instance = null;

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
