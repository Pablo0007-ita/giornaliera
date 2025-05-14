package org.cospessardegna.giornaliera.entities;


import java.io.Serializable;
import java.util.Objects;

public class CostCenterTeamId implements Serializable {

    private Integer teamId;
    private Integer costCenterId;

    public CostCenterTeamId() {
    }

    public CostCenterTeamId(Integer roleId, Integer appEntity, Integer permission) {
        this.teamId = teamId;
        this.costCenterId =costCenterId;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CostCenterTeamId)) return false;

        CostCenterTeamId that = (CostCenterTeamId) o;

        return Objects.equals(teamId, that.teamId)
                && Objects.equals(costCenterId, that.costCenterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamId, costCenterId);
    }
}
