package bli.vt41.bstu.ru.secondandroidapp;

import java.util.Date;

public class Post {
    private String title;
    private String text;
    private int imageID;
    private Date time;

    public Post(String title, String text, int imageID, Date time) {
        this.title = title;
        this.text = text;
        this.imageID = imageID;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
