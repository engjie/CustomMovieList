package sg.edu.rp.c346.custommovielist;

/**
 * Created by 16019641 on 16/7/2018.
 */

public class MovieItem {
    private String name;
    private String date;

    public MovieItem (String name, String Date){
        this.name = name;
        this.date = date;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDate(){
        return date ;
    }
    public void setDate(String date){
        this.date = date;
    }


    @Override
    public String toString() {
        return "MovieItem{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
