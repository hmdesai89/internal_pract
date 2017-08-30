package bms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */
public class SmallSeats implements Seats {
    
    private int seatNumber;
    private String cushionType;
    private boolean isOccupied;
    private int price;

    
    
    public SmallSeats(int newSeatNumber){
        seatNumber = newSeatNumber;
        isOccupied = false;

        
    }

    @Override
    public void setSeatNumber(int newSeatNumber) {
        int seatNumber = newSeatNumber;
    }

    @Override
    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public void setCushion(String newCushion) {
        String cushionType = newCushion;
    }

    @Override
    public String getCushion(String cushion) {
        return cushionType;
        
    }

    @Override
    public void isReclinable() {
        System.out.println("Seat is reclinable");
    }

    @Override
    public void occupy() {
        isOccupied = true;
    }

    @Override
    public void release() {
        isOccupied = false;

    }
    
    public void setPrice(int newPrice) {
        price = newPrice;
    }

    @Override
    public int getPrice() {
        return price;
    }
    
}