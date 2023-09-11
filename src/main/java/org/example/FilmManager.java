package org.example;

public class FilmManager {
    private Film[] films = new Film[0];
    private int filmLength = 10;

    public FilmManager() {

    }

    public FilmManager(int customFilmLength) {
        if (customFilmLength > 0) {
            filmLength = customFilmLength;
        }

    }

    public void addFilm(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        int lastFilm = tmp.length - 1;
        tmp[lastFilm] = film;
        films = tmp;

    }

    public Film[] getLastAdd() {
        int filmLength = films.length;
        if (filmLength < this.filmLength) {
            this.filmLength = filmLength;
        }
        Film[] customFilm = new Film[this.filmLength];
        for (int i = 0; i < customFilm.length; i++) {
            int result = filmLength - i - 1;
            customFilm[i] = films[result];

        }
        return customFilm;
    }

}