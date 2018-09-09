package clist.amirmfallah.com.customlistview;

/**
 * Created by Amir Mohammad Fallah on 9/8/2018.
 */

public class ListModel {

    private int Drawable;
    private String AppName;
    private String Noti;
    private String Date;

    public ListModel(int imageDrawable, String Name, String Message,String date) {
        this.Drawable = imageDrawable;
        this.AppName = Name;
        this.Noti = Message;
        this.Date = date;
    }

    public int getImage() {
        return Drawable;
    }

    public void setImage(int imageDrawable) {
        this.Drawable = imageDrawable;
    }

    public String getmTitle() {
        return AppName;
    }

    public void setTitle(String Name) {
        this.AppName = Name;
    }

    public String getNoti() {
        return Noti;
    }

    public void setNoti(String Notification) {
        this.Noti = Notification;
    }

    public String Date() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }

}