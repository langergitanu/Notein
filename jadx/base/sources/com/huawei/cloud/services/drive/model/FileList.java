package com.huawei.cloud.services.drive.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.Key;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class FileList extends GenericJson {

    @Key
    private String category;

    @Key
    private List<File> files;

    @Key
    private String nextCursor;

    @Key
    private Boolean searchCompleted;

    public String getCategory() {
        return this.category;
    }

    public List<File> getFiles() {
        return this.files;
    }

    public String getNextCursor() {
        return this.nextCursor;
    }

    public Boolean getSearchCompleted() {
        return this.searchCompleted;
    }

    public FileList setCategory(String str) {
        this.category = str;
        return this;
    }

    public FileList setFiles(List<File> list) {
        this.files = list;
        return this;
    }

    public FileList setNextCursor(String str) {
        this.nextCursor = str;
        return this;
    }

    public FileList setSearchCompleted(Boolean bool) {
        this.searchCompleted = bool;
        return this;
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
    public FileList set(String str, Object obj) {
        return (FileList) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public FileList clone() {
        return (FileList) super.clone();
    }
}
