package org.cospessardegna.giornaliera.entities;


import java.io.Serializable;
import java.util.Objects;

public class CostCenterId implements Serializable {

    private Integer customerId;
    private Integer costCenterId;

    public CostCenterId() {
    }

    public CostCenterId(Integer customerId, Integer costCenterId) {
        this.customerId = customerId;
        this.costCenterId =costCenterId;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CostCenterId)) return false;

        CostCenterId that = (CostCenterId) o;

        return Objects.equals(customerId, that.customerId)
                && Objects.equals(costCenterId, that.costCenterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, costCenterId);
    }
}
