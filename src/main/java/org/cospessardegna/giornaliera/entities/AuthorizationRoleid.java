package org.cospessardegna.giornaliera.entities;


import java.io.Serializable;
import java.util.Objects;

public class AuthorizationRoleid implements Serializable {

    private Integer roleId;
    private Integer appEntityId;
    private Integer permissionId;

    public AuthorizationRoleid() {
    }

    public AuthorizationRoleid(Integer roleId, Integer appEntity, Integer permission) {
        this.roleId = roleId;
        this.appEntityId = appEntity;
        this.permissionId= permission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AuthorizationRoleid)) return false;

        AuthorizationRoleid that = (AuthorizationRoleid) o;

        return Objects.equals(roleId, that.roleId)
                && Objects.equals(appEntityId, that.appEntityId)
                && Objects.equals(permissionId, that.permissionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, appEntityId, permissionId);
    }
}
