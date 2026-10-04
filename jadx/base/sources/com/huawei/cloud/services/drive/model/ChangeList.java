package com.huawei.cloud.services.drive.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.Key;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ChangeList extends GenericJson {

    @Key
    private String category;

    @Key
    private List<Change> changes;

    @Key
    private String newStartCursor;

    @Key
    private String nextCursor;

    public String getCategory() {
        return this.category;
    }

    public List<Change> getChanges() {
        return this.changes;
    }

    public String getNewStartCursor() {
        return this.newStartCursor;
    }

    public String getNextCursor() {
        return this.nextCursor;
    }

    public ChangeList setCategory(String str) {
        this.category = str;
        return this;
    }

    public ChangeList setChanges(List<Change> list) {
        this.changes = list;
        return this;
    }

    public ChangeList setNewStartCursor(String str) {
        this.newStartCursor = str;
        return this;
    }

    public ChangeList setNextCursor(String str) {
        this.nextCursor = str;
        return this;
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
    public ChangeList set(String str, Object obj) {
        return (ChangeList) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public ChangeList clone() {
        return (ChangeList) super.clone();
    }
}
