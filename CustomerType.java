import javax.xml.crypto.Data;

public class CustomerType {

    public static void foodVoucher() {
        Object foodVoucher = new Object();
    }

    public static void takeFood() {

    }

    private int ID;
    private int rowNumber;
    private int sitNumber;
    private int ticketPrice;
    private boolean ticketCustomer;
    private String showName;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    private Data showDate;

    public static boolean VipCustomer() {
        return false;
    }
}
