package config;

public class CinemaConfig {
    private static CinemaConfig instance;
    private String cinemaName;
    private int numberOfScreens;
    private String operatingHours;


    private CinemaConfig() {}

    public static synchronized CinemaConfig getInstance() {
        if (instance == null) {
            instance = new CinemaConfig();
        }
        return instance;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setNumberOfScreens(int numberOfScreens) {
        this.numberOfScreens = numberOfScreens;
    }

    public int getNumberOfScreens() {
        return numberOfScreens;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }

    public String getOperatingHours() {
        return operatingHours;
    }





}
