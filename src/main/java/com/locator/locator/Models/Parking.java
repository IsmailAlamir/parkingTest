package com.locator.locator.Models;

import javax.persistence.*;
import java.util.List;


@Entity
public class Parking {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String parkingName;
    private String parkingLocation;
    private int capacity;

    public Parking(){

    }

    public Parking(String parkingName, String parkingLocation, int capacity) {
        this.parkingName = parkingName;
        this.parkingLocation = parkingLocation;
        this.capacity = capacity;
    }

    public String getParkingName() {
        return parkingName;
    }

    public void setParkingName(String parkingName) {
        this.parkingName = parkingName;
    }

    public String getParkingLocation() {
        return parkingLocation;
    }

    public void setParkingLocation(String parkingLocation) {
        this.parkingLocation = parkingLocation;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "parkingName='" + parkingName + '\'' +
                ", parkingLocation='" + parkingLocation + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
