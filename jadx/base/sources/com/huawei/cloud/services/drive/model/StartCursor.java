package com.huawei.cloud.services.drive.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.Key;

/* JADX INFO: loaded from: classes8.dex */
public final class StartCursor extends GenericJson {

    @Key
    private String category;

    @Key
    private String startCursor;

    public String getCategory() {
        return this.category;
    }

    public String getStartCursor() {
        return this.startCursor;
    }

    public StartCursor setCategory(String str) {
        this.category = str;
        return this;
    }

    public StartCursor setStartCursor(String str) {
        this.startCursor = str;
        return this;
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
    public StartCursor set(String str, Object obj) {
        return (StartCursor) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public StartCursor clone() {
        return (StartCursor) super.clone();
    }
}
