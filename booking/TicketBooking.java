package booking;

public class TicketBooking {

    private String movieTitle;
    private String seatNumber;
    private String snackCombo;
    private String screeningType;


    private TicketBooking(TicketBookingBuilder builder) {
        this.movieTitle = builder.movieTitle;
        this.seatNumber = builder.seatNumber;
        this.snackCombo = builder.snackCombo;
        this.screeningType = builder.screeningType;
    }


    public String getMovieTitle() {
        return movieTitle;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getSnackCombo() {
        return snackCombo;
    }

    public String getScreeningType() {
        return screeningType;
    }

    @Override
    public String toString() {
        return "TicketBooking{" +
                "movieTitle='" + movieTitle + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", snackCombo='" + snackCombo + '\'' +
                ", screeningType='" + screeningType + '\'' +
                '}';
    }


    public static class TicketBookingBuilder {
        private String movieTitle;
        private String seatNumber;
        private String snackCombo;
        private String screeningType;


        public TicketBookingBuilder setMovieTitle(String movieTitle) {
            this.movieTitle = movieTitle;
            return this;
        }

        public TicketBookingBuilder setSeatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
            return this;
        }


        public TicketBookingBuilder setSnackCombo(String snackCombo) {
            this.snackCombo = snackCombo;
            return this;
        }


        public TicketBookingBuilder setScreeningType(String screeningType) {
            this.screeningType = screeningType;
            return this;
        }


        public TicketBooking build() {
            return new TicketBooking(this);
        }
    }
}
