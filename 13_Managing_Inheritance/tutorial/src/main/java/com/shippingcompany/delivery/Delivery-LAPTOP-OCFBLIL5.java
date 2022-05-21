package com.shippingcompany.delivery;
import com.shippingcompany.Shipment;

import java.time.LocalDateTime;

public abstract class Delivery {
    private String origin;
    private String destination;
    private int distance;
    private Shipment shipment;
    //Methods
    public abstract int getDuration();
    protected int convertHoursToMinutes (double decimalHour) {
        int hours = (int) decimalHour;
        int minutes = (int) Math.round((decimalHour - hours) * 60);
        return hours * 60 +minutes;
    }
    public final LocalDateTime getExpectedArrival(LocalDateTime departure) {
        return departure.plusMinutes(getDuration());
    }
    //Getters and Setters
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }
}
