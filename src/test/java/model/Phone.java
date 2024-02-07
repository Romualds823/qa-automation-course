package model;

import java.math.BigDecimal;

public class Phone {

    private String phoneModel;
    private String phoneBrand;
    private String colour;
    private BigDecimal price;
    private Boolean phoneWarranty;

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getPhoneWarranty() {
        return phoneWarranty;
    }

    public void setPhoneWarranty(Boolean phoneWarranty) {
        this.phoneWarranty = phoneWarranty;
    }
}
