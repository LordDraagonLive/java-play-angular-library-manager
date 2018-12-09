package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;
import model.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

import java.text.DateFormat;
import java.util.Date;
import java.lang.Exception;

class AppSummary {
    private String content;

    AppSummary(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

public class HomeController extends Controller {

    public Result appSummary() {
        JsonNode jsonNode = Json.toJson(new AppSummary("Java Play Angular Seed"));
        return ok(jsonNode).as("application/json");
    }

    public Result postTest() {
        JsonNode jsonNode = Json.toJson(new AppSummary("Post Request Test => Data Sending Success"));
        return ok(jsonNode).as("application/json");
    }

    public Result libraryPostTest(){

        DateTime dateTime = new DateTime("12/12/2018");
        DateFormat formatter = new SimpleDateFormat("dd-MMM-yy") ;
        Date date = null;
        try {
            date = formatter.parse("11/12/2018");

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        
        JsonNode jsonNode = Json.toJson(new Book("1234","title","sector",dateTime,date,12,23,25,400) );
        return ok(jsonNode).as("application/json");
    }
}
