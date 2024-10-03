package schedule;

public class StandardSchedule implements MovieSchedule {
    private String movieTitle;
    private String time;
    private String date;


    public StandardSchedule(String movieTitle, String time, String date) {
        this.movieTitle = movieTitle;
        this.time = time;
        this.date = date;
    }


    @Override
    public MovieSchedule clone() {
        try {
            return (MovieSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public void setMovieTitle(String title) {
        this.movieTitle = title;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public void displaySchedule() {
        System.out.println("Movie Title: " + movieTitle + ", Time: " + time + ", Date: " + date);
    }
}
