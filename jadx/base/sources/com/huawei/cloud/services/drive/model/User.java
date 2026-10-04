package com.huawei.cloud.services.drive.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.Key;

/* JADX INFO: loaded from: classes8.dex */
public class User extends GenericJson {

    @Key
    private String category;

    @Key
    private String displayName;

    /* JADX INFO: renamed from: me */
    @Key
    private Boolean f52360me;

    @Key
    private String permissionId;

    @Key
    private String profilePhotoLink;

    @Key
    private String userAccount;

    public String getCategory() {
        return this.category;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public Boolean getMe() {
        return this.f52360me;
    }

    public String getPermissionId() {
        return this.permissionId;
    }

    public String getProfilePhotoLink() {
        return this.profilePhotoLink;
    }

    public String getUserAccount() {
        return this.userAccount;
    }

    public User setCategory(String str) {
        this.category = str;
        return this;
    }

    public User setDisplayName(String str) {
        this.displayName = str;
        return this;
    }

    public User setMe(Boolean bool) {
        this.f52360me = bool;
        return this;
    }

    public User setPermissionId(String str) {
        this.permissionId = str;
        return this;
    }

    public User setProfilePhotoLink(String str) {
        this.profilePhotoLink = str;
        return this;
    }

    public User setUserAccount(String str) {
        this.userAccount = str;
        return this;
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
    public User set(String str, Object obj) {
        return (User) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public User clone() {
        return (User) super.clone();
    }
}
