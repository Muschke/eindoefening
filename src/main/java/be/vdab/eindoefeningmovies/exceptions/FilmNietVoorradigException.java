package be.vdab.eindoefeningmovies.exceptions;

public class FilmNietVoorradigException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public FilmNietVoorradigException(String message) {
        super(message);
    }
}
