package org.cospessardegna.giornaliera.entities;


import java.io.Serializable;
import java.util.Objects;

public class UserTeamId implements Serializable {

    private Integer team;
    private Integer user;

    public UserTeamId() {
    }

    public UserTeamId(Integer team, Integer user) {
        this.team = team;
        this.user =user;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserTeamId)) return false;

        UserTeamId that = (UserTeamId) o;

        return Objects.equals(team, that.team)
                && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(team, user);
    }
}
