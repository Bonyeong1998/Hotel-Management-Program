package hms.management;

public class ReportInfo {

    String divide;
    String type;
    String pricetype;
    String price;

    public ReportInfo(String divide, String type, String pricetype, String price) {
        this.divide = divide;
        this.type = type;
        this.pricetype = pricetype;
        this.price = price;
    }

    public String getDivide() {
        return divide;
    }

    public void setDivide(String divide) {
        this.divide = divide;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPricetype() {
        return pricetype;
    }

    public void setPricetype(String pricetype) {
        this.pricetype = pricetype;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
