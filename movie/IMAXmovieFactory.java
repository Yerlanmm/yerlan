package movie;

public class IMAXmovieFactory extends MovieFactory {
    @Override
    public Movie createMovie() {
        return new IMAXmovie();
    }
}
