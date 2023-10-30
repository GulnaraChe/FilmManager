import org.example.Film;
import org.example.FilmManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class FilmManagerTest {

    FilmManager manager = new FilmManager();

    private Film first = new Film(1, "Name1");
    private Film second = new Film(2, "Name2");
    private Film third = new Film(3, "Name3");
    private Film fourth = new Film(4, "Name4");
    private Film fifth = new Film(5, "Name5");
    private Film sixth = new Film(6, "Name6");
    private Film seventh = new Film(7, "Name7");
    private Film eighth = new Film(8, "Name8");
    private Film ninth = new Film(9, "Name9");
    private Film tenth = new Film(10, "Name10");

    Film[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};


    @Test
    public void showTenFilms() {
        FilmManager manager = new FilmManager(10);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        Film[] actual = manager.getLastAdd();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showNothing() {
        FilmManager manager = new FilmManager(0);
        Film[] actual = manager.getLastAdd();
        Film[] expected = new Film[0];
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showValid() {
        FilmManager manager = new FilmManager(5);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        Film filmToAdd = new Film(11, "Name11");
        manager.addFilm(filmToAdd);
        Film[] actual = manager.getLastAdd();
        Film[] expected = {filmToAdd, tenth, ninth, eighth, seventh};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void showMax() {
        FilmManager manager = new FilmManager(11);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        Film[] actual = manager.getLastAdd();
        assertArrayEquals(expected, actual);
    }
}