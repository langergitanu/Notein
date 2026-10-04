package com.huawei.cloud.services.drive.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.DateTime;
import com.huawei.cloud.base.util.Key;

/* JADX INFO: loaded from: classes8.dex */
public final class Change extends GenericJson {

    @Key
    private String category;

    @Key
    private String changeType;

    @Key
    private Boolean deleted;

    @Key
    private File file;

    @Key
    private String fileId;

    @Key
    private DateTime time;

    public String getCategory() {
        return this.category;
    }

    public String getChangeType() {
        return this.changeType;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public File getFile() {
        return this.file;
    }

    public String getFileId() {
        return this.fileId;
    }

    public DateTime getTime() {
        return this.time;
    }

    public Change setCategory(String str) {
        this.category = str;
        return this;
    }

    public Change setChangeType(String str) {
        this.changeType = str;
        return this;
    }

    public Change setDeleted(Boolean bool) {
        this.deleted = bool;
        return this;
    }

    public Change setFile(File file) {
        this.file = file;
        return this;
    }

    public Change setFileId(String str) {
        this.fileId = str;
        return this;
    }

    public Change setTime(DateTime dateTime) {
        this.time = dateTime;
        return this;
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
    public Change set(String str, Object obj) {
        return (Change) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public Change clone() {
        return (Change) super.clone();
    }
}
