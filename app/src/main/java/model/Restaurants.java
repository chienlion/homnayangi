package model;

public class Restaurants {
    private String title;
    private String address;
    private String species; // loại nhà hàng ( cafe ) hoặc nhà hàng ẩm thực v.v
    private int image;
    private String sale;
    private String OpenSale;
    private String CloseSale;
    private String openAndClose;
    private String TimeSave;



    public Restaurants(String title, String address, int image, String openAndClose) {
        this.title = title;
        this.address = address;
        this.image = image;
        this.openAndClose = openAndClose;
    }

    //phuong thuc khoi tao cho Save
    public Restaurants(String title, String address, String species, int image,String timeSave) {
        this.title = title;
        this.address = address;
        this.species = species;
        this.image = image;
        this.TimeSave = timeSave;
    }

    public Restaurants() {

    }

    public String getOpenAndClose() {

        return openAndClose;
    }

    public void setOpenAndClose(String openAndClose) {
        this.openAndClose = openAndClose;
    }

    public Restaurants(String title, String address, int image, String sale, String openSale, String closeSale) {
        this.title = title;
        this.address = address;
        this.image = image;
        this.sale = sale;
        OpenSale = openSale;
        CloseSale = closeSale;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    public String getOpenSale() {
        return OpenSale;
    }

    public void setOpenSale(String openSale) {
        OpenSale = openSale;
    }

    public String getCloseSale() {
        return CloseSale;
    }

    public void setCloseSale(String closeSale) {
        CloseSale = closeSale;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTimeSave() {
        return TimeSave;
    }

    public void setTimeSave(String timeSave) {
        TimeSave = timeSave;
    }


    public Restaurants(String title, String address, String species, int image) {

        this.title = title;
        this.address = address;
        this.species = species;
        this.image = image;
    }





}
