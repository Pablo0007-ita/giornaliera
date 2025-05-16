package org.cospessardegna.giornaliera.entities;


import java.io.Serializable;
import java.util.Objects;

public class ShiftUserId implements Serializable {

    private Integer shiftId;
    private Integer userId;

    public ShiftUserId() {
    }

    public ShiftUserId(Integer shift, Integer user) {
        this.shiftId = shift;
        this.userId =user;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShiftUserId)) return false;

        ShiftUserId that = (ShiftUserId) o;

        return Objects.equals(shiftId, that.shiftId)
                && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shiftId, userId);
    }
}
