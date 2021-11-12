package be.vdab.eindoefeningmovies.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

public class Reservatie {
    @NotNull private final long klantid;
    @NotNull private final Set<Long> filmIds;
    @DateTimeFormat(style = "F-") private final LocalDateTime date;

    public Reservatie(long klantid, Set<Long> filmIds, LocalDateTime date) {
        this.klantid = klantid;
        this.filmIds = filmIds;
        this.date = date;
    }


    public long getKlantid() {
        return klantid;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Set<Long> getFilmIds() {
        return filmIds;
    }
}
