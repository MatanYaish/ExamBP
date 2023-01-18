import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Show {
    private String showName1;
    private String showName2;
    private String showName3;
    private String showName4;




    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getShowName() {
        return showName4;
    }

    public void setShowName(String showName) {
        this.showName = showName1;
        this.showName = showName2;
        this.showName = showName3;
        this.showName = showName4;

    }

    public Data getShowDate() {
        return showDate;
    }

    public void setShowDate(Data showDate) {
        this.showDate = showDate;
    }

    public ArrayList<String> getShowList() {
        return showList;
    }

    public void setShowList(ArrayList<String> showList) {
        this.showList = showList;
    }

    private int Id;
    private String showName;
    private Data showDate;
    private ArrayList<String> showList;
}
