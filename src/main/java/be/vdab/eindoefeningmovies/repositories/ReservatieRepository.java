package be.vdab.eindoefeningmovies.repositories;

import be.vdab.eindoefeningmovies.domain.Reservatie;

public interface ReservatieRepository {
    void create(long klantId, long filmId);
}
