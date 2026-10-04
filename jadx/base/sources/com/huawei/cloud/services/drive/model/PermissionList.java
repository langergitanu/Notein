package com.huawei.cloud.services.drive.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.Key;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PermissionList extends GenericJson {

    @Key
    private String category;

    @Key
    private String nextCursor;

    @Key
    private List<Permission> permissions;

    public String getCategory() {
        return this.category;
    }

    public String getNextCursor() {
        return this.nextCursor;
    }

    public List<Permission> getPermissions() {
        return this.permissions;
    }

    public PermissionList setCategory(String str) {
        this.category = str;
        return this;
    }

    public PermissionList setNextCursor(String str) {
        this.nextCursor = str;
        return this;
    }

    public PermissionList setPermissions(List<Permission> list) {
        this.permissions = list;
        return this;
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
    public PermissionList set(String str, Object obj) {
        return (PermissionList) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public PermissionList clone() {
        return (PermissionList) super.clone();
    }
}
