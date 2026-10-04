package com.huawei.cloud.services.drive.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.Key;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class HistoryVersionList extends GenericJson {

    @Key
    public String category;

    @Key
    public List<HistoryVersion> historyVersions;

    @Key
    public String nextCursor;

    public String getCategory() {
        return this.category;
    }

    public List<HistoryVersion> getHistoryVersions() {
        return this.historyVersions;
    }

    public String getNextCursor() {
        return this.nextCursor;
    }

    public HistoryVersionList setCategory(String str) {
        this.category = str;
        return this;
    }

    public HistoryVersionList setHistoryVersions(List<HistoryVersion> list) {
        this.historyVersions = list;
        return this;
    }

    public HistoryVersionList setNextCursor(String str) {
        this.nextCursor = str;
        return this;
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
    public HistoryVersionList set(String str, Object obj) {
        return (HistoryVersionList) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public HistoryVersionList clone() {
        return (HistoryVersionList) super.clone();
    }
}
