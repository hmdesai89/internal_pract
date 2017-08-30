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
public interface Seats {
    
    public void setSeatNumber(int seatNumber);
    public int getSeatNumber();
    public void setCushion(String cushion);
    public String getCushion(String cushion);
    public void isReclinable();
    public void occupy();
    public void release();
    public void setPrice(int price);
    public int getPrice();
}
