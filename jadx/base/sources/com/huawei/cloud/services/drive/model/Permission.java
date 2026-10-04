package com.huawei.cloud.services.drive.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.DateTime;
import com.huawei.cloud.base.util.Key;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class Permission extends GenericJson {

    @Key
    private String accountType;

    @Key
    private Boolean canDiscoverFile;

    @Key
    private String category;

    @Key
    private Boolean deleted;

    @Key
    private String displayName;

    @Key
    private DateTime expirationTime;

    /* JADX INFO: renamed from: id */
    @Key
    private String f52358id;

    @Key
    private List<PermissionDetails> permissionDetails;

    @Key
    private String profilePhotoLink;

    @Key
    private String role;

    @Key
    private String type;

    @Key
    private String userAccount;

    public String getAccountType() {
        return this.accountType;
    }

    public Boolean getCanDiscoverFile() {
        return this.canDiscoverFile;
    }

    public String getCategory() {
        return this.category;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public DateTime getExpirationTime() {
        return this.expirationTime;
    }

    public String getId() {
        return this.f52358id;
    }

    public List<PermissionDetails> getPermissionDetails() {
        return this.permissionDetails;
    }

    public String getProfilePhotoLink() {
        return this.profilePhotoLink;
    }

    public String getRole() {
        return this.role;
    }

    public String getType() {
        return this.type;
    }

    public String getUserAccount() {
        return this.userAccount;
    }

    public Permission setAccountType(String str) {
        this.accountType = str;
        return this;
    }

    public Permission setCanDiscoverFile(Boolean bool) {
        this.canDiscoverFile = bool;
        return this;
    }

    public Permission setCategory(String str) {
        this.category = str;
        return this;
    }

    public Permission setDeleted(Boolean bool) {
        this.deleted = bool;
        return this;
    }

    public Permission setDisplayName(String str) {
        this.displayName = str;
        return this;
    }

    public Permission setExpirationTime(DateTime dateTime) {
        this.expirationTime = dateTime;
        return this;
    }

    public Permission setId(String str) {
        this.f52358id = str;
        return this;
    }

    public Permission setPermissionDetails(List<PermissionDetails> list) {
        this.permissionDetails = list;
        return this;
    }

    public Permission setProfilePhotoLink(String str) {
        this.profilePhotoLink = str;
        return this;
    }

    public Permission setRole(String str) {
        this.role = str;
        return this;
    }

    public Permission setType(String str) {
        this.type = str;
        return this;
    }

    public Permission setUserAccount(String str) {
        this.userAccount = str;
        return this;
    }

    public static final class PermissionDetails extends GenericJson {

        @Key
        private Boolean inherited;

        @Key
        private String inheritedFrom;

        @Key
        private String permissionType;

        @Key
        private String role;

        public Boolean getInherited() {
            return this.inherited;
        }

        public String getInheritedFrom() {
            return this.inheritedFrom;
        }

        public String getPermissionType() {
            return this.permissionType;
        }

        public String getRole() {
            return this.role;
        }

        public PermissionDetails setInherited(Boolean bool) {
            this.inherited = bool;
            return this;
        }

        public PermissionDetails setInheritedFrom(String str) {
            this.inheritedFrom = str;
            return this;
        }

        public PermissionDetails setPermissionType(String str) {
            this.permissionType = str;
            return this;
        }

        public PermissionDetails setRole(String str) {
            this.role = str;
            return this;
        }

        @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
        public PermissionDetails set(String str, Object obj) {
            return (PermissionDetails) super.set(str, obj);
        }

        @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
        public PermissionDetails clone() {
            return (PermissionDetails) super.clone();
        }
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
    public Permission set(String str, Object obj) {
        return (Permission) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public Permission clone() {
        return (Permission) super.clone();
    }
}
