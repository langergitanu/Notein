package com.huawei.cloud.services.drive.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.DateTime;
import com.huawei.cloud.base.util.Key;

/* JADX INFO: loaded from: classes8.dex */
public final class HistoryVersion extends GenericJson {

    @Key
    private String category;

    @Key
    public DateTime editedTime;

    /* JADX INFO: renamed from: id */
    @Key
    private String f52357id;

    @Key
    private Boolean keepPermanent;

    @Key
    public User lastEditor;

    @Key
    public String mimeType;

    @Key
    public String originalFilename;

    @Key
    public String sha256;

    @Key
    public Long size;

    public String getCategory() {
        return this.category;
    }

    public DateTime getEditedTime() {
        return this.editedTime;
    }

    public String getId() {
        return this.f52357id;
    }

    public Boolean getKeepPermanent() {
        return this.keepPermanent;
    }

    public User getLastEditor() {
        return this.lastEditor;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getOriginalFilename() {
        return this.originalFilename;
    }

    public String getSha256() {
        return this.sha256;
    }

    public Long getSize() {
        return this.size;
    }

    public HistoryVersion setCategory(String str) {
        this.category = str;
        return this;
    }

    public HistoryVersion setEditedTime(DateTime dateTime) {
        this.editedTime = dateTime;
        return this;
    }

    public HistoryVersion setId(String str) {
        this.f52357id = str;
        return this;
    }

    public HistoryVersion setKeepPermanent(Boolean bool) {
        this.keepPermanent = bool;
        return this;
    }

    public HistoryVersion setLastEditor(User user) {
        this.lastEditor = user;
        return this;
    }

    public HistoryVersion setMimeType(String str) {
        this.mimeType = str;
        return this;
    }

    public HistoryVersion setOriginalFilename(String str) {
        this.originalFilename = str;
        return this;
    }

    public HistoryVersion setSha256(String str) {
        this.sha256 = str;
        return this;
    }

    public HistoryVersion setSize(Long l) {
        this.size = l;
        return this;
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
    public HistoryVersion set(String str, Object obj) {
        return (HistoryVersion) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public HistoryVersion clone() {
        return (HistoryVersion) super.clone();
    }
}
