package schedule;

public interface MovieSchedule extends Cloneable {
    MovieSchedule clone();
    void setMovieTitle(String title);
    void setTime(String time);
    void setDate(String date);
    void displaySchedule();
}
