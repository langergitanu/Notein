package com.huawei.cloud.services.drive.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.json.JsonString;
import com.huawei.cloud.base.util.Key;

/* JADX INFO: loaded from: classes8.dex */
public final class About extends GenericJson {

    @Key
    private String category;

    @JsonString
    @Key
    private Long maxFileUploadSize;

    @Key
    private Long maxThumbnailSize;

    @Key
    private Boolean needUpdate;

    @Key
    private StorageQuota storageQuota;

    @Key
    private String updateUrl;

    @Key
    private User user;

    public String getCategory() {
        return this.category;
    }

    public Long getMaxFileUploadSize() {
        return this.maxFileUploadSize;
    }

    public Long getMaxThumbnailSize() {
        return this.maxThumbnailSize;
    }

    public StorageQuota getStorageQuota() {
        return this.storageQuota;
    }

    public String getUpdateUrl() {
        return this.updateUrl;
    }

    public User getUser() {
        return this.user;
    }

    public boolean isNeedUpdate() {
        return this.needUpdate.booleanValue();
    }

    public About setCategory(String str) {
        this.category = str;
        return this;
    }

    public About setMaxFileUploadSize(Long l) {
        this.maxFileUploadSize = l;
        return this;
    }

    public About setMaxThumbnailSize(Long l) {
        this.maxThumbnailSize = l;
        return this;
    }

    public About setNeedUpdate(boolean z) {
        this.needUpdate = Boolean.valueOf(z);
        return this;
    }

    public About setStorageQuota(StorageQuota storageQuota) {
        this.storageQuota = storageQuota;
        return this;
    }

    public About setUpdateUrl(String str) {
        this.updateUrl = str;
        return this;
    }

    public About setUser(User user) {
        this.user = user;
        return this;
    }

    public static final class StorageQuota extends GenericJson {

        @JsonString
        @Key
        private Long usedSpace;

        @JsonString
        @Key
        private Long userCapacity;

        public Long getUsedSpace() {
            return this.usedSpace;
        }

        public Long getUserCapacity() {
            return this.userCapacity;
        }

        public StorageQuota setUsedSpace(Long l) {
            this.usedSpace = l;
            return this;
        }

        public StorageQuota setUserCapacity(Long l) {
            this.userCapacity = l;
            return this;
        }

        @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
        public StorageQuota set(String str, Object obj) {
            return (StorageQuota) super.set(str, obj);
        }

        @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
        public StorageQuota clone() {
            return (StorageQuota) super.clone();
        }
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
    public About set(String str, Object obj) {
        return (About) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public About clone() {
        return (About) super.clone();
    }
}
