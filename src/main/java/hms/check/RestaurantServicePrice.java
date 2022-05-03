package hms.check;

public class RestaurantServicePrice {

    String service;
    String price;

    public RestaurantServicePrice(String service, String price) {
        this.service = service;
        this.price = price;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
