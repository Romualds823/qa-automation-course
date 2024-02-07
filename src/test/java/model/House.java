package model;

import java.math.BigDecimal;

public class House {

    private String houseType;
    private String numberOfFloors;
    private String numbersOfRooms;
    private Double squareFootage;
    private BigDecimal price;

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getNumbersOfRooms() {
        return numbersOfRooms;
    }

    public void setNumbersOfRooms(String numbersOfRooms) {
        this.numbersOfRooms = numbersOfRooms;
    }

    public Double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(Double squareFootage) {
        this.squareFootage = squareFootage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
