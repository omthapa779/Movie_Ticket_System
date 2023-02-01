package Model;
import java.util.ArrayList;
public class Movie extends Category{
    private String name;
    private String director;
    private String showTime;
    private double price;

    public Movie(String mainCategory, String category, String name, String director, String showTime, double price) {
        super(mainCategory, category);
        this.name = name;
        this.director = director;
        this.showTime = showTime;
        this.price = price;
    }

    public Movie() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayMovieInformation() {
        Movie m1 = new Movie("sofa","drama","GodFather","Francis Ford Coppola","Friday 8:00PM",700);
        Movie m2 = new Movie("sofa","Action","Telnet","Christopher Nolan","Friday 9:40PM",700);
        System.out.println("Movie: " + m1.getName() + "   " + "Price: Rs" + m1.getPrice());
        System.out.println("Movie: " + m2.getName() + "   " + "Price: Rs" + m2.getPrice());
        System.out.println("");
    }
}
