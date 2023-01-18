import javax.xml.crypto.Data;

abstract class OrderType {

    int ID;
    int rowNumber;
    int sitNumber;
    int ticketPrice;
    boolean ticketCustomer;
    String showName;
    Data showDate;

    public OrderType() {
        this.ID = ID;
        this.rowNumber = rowNumber;
        this.sitNumber = sitNumber;
        this.ticketPrice = ticketPrice;
        this.ticketCustomer = ticketCustomer;
        this.showName = showName;
        this.showDate = showDate;
    }

    public int getID() {
        return ID;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getSitNumber() {
        return sitNumber;
    }

    public void setSitNumber(int sitNumber) {
        this.sitNumber = sitNumber;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public boolean isTicketCustomer() {
        return ticketCustomer;
    }

    public void setTicketCustomer(boolean ticketCustomer) {
        this.ticketCustomer = ticketCustomer;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public Data getShowDate() {
        return showDate;
    }

    public void setShowDate(Data showDate) {
        this.showDate = showDate;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
