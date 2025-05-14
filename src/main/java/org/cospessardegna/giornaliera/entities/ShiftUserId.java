package org.cospessardegna.Giornaliera.entities;


import java.io.Serializable;
import java.util.Objects;

public class ShiftUserId implements Serializable {

    private Integer shift;
    private Integer user;

    public ShiftUserId() {
    }

    public ShiftUserId(Integer shift, Integer user) {
        this.shift = shift;
        this.user =user;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShiftUserId)) return false;

        ShiftUserId that = (ShiftUserId) o;

        return Objects.equals(shift, that.shift)
                && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shift, user);
    }
}
