package org.cospessardegna.Giornaliera.entities;


import java.io.Serializable;
import java.util.Objects;

public class AuthorizationRoleid implements Serializable {

    private Integer roleId;
    private Integer appEntity;
    private Integer permission;

    public AuthorizationRoleid() {
    }

    public AuthorizationRoleid(Integer roleId, Integer appEntity, Integer permission) {
        this.roleId = roleId;
        this.appEntity = appEntity;
        this.permission = permission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AuthorizationRoleid)) return false;

        AuthorizationRoleid that = (AuthorizationRoleid) o;

        return Objects.equals(roleId, that.roleId)
                && Objects.equals(appEntity, that.appEntity)
                && Objects.equals(permission, that.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, appEntity, permission);
    }
}
