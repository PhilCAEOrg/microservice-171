package i5.las2peer.services.res;

import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class classes {

    class Todo {

    public Todo() {}
    
    private String date;

    public void setdate(String setValue) {
        this.date = setValue;
    }

    public String getdate() {
        return this.date;
    }
    private String title;

    public void settitle(String setValue) {
        this.title = setValue;
    }

    public String gettitle() {
        return this.title;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("date", this.date); 
        jo.put("title", this.title); 

        return jo;
    }

    public void fromJSON(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.date = (String) jsonObject.get("date"); 
        this.title = (String) jsonObject.get("title"); 

    }

}

    
}
