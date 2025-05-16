package org.cospessardegna.giornaliera.entities;


import java.io.Serializable;
import java.util.Objects;

public class UserTeamId implements Serializable {

    private Integer teamId;
    private Integer userId;

    public UserTeamId() {
    }

    public UserTeamId(Integer team, Integer user) {
        this.teamId = team;
        this.userId =user;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserTeamId)) return false;

        UserTeamId that = (UserTeamId) o;

        return Objects.equals(teamId, that.teamId)
                && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamId, userId);
    }
}
