package hotel.entity;

import java.math.BigDecimal;

public class Rooms {

        String quarters;
        String rmName;
        String rmType;
        BigDecimal rmPrice;

    public String getQuarters() {
        return quarters;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "quarters='" + quarters + '\'' +
                ", rmName='" + rmName + '\'' +
                ", rmType='" + rmType + '\'' +
                ", rmPrice=" + rmPrice +
                '}';
    }

    public void setQuarters(String quarters) {
        this.quarters = quarters;
    }

    public String getRmName() {
        return rmName;
    }

    public void setRmName(String rmName) {
        this.rmName = rmName;
    }

    public String getRmType() {
        return rmType;
    }

    public void setRmType(String rmType) {
        this.rmType = rmType;
    }

    public BigDecimal getRmPrice() {
        return rmPrice;
    }

    public void setRmPrice(BigDecimal rmPrice) {
        this.rmPrice = rmPrice;
    }
}


