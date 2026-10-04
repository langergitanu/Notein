package com.huawei.cloud.base.json;

import com.huawei.cloud.base.util.Key;

/* JADX INFO: loaded from: classes8.dex */
public class JsonErrorContainer extends GenericJson {

    @Key
    private JsonError error;

    public final JsonError getError() {
        return this.error;
    }

    public final void setError(JsonError jsonError) {
        this.error = jsonError;
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
    public JsonErrorContainer set(String str, Object obj) {
        return (JsonErrorContainer) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public JsonErrorContainer clone() {
        return (JsonErrorContainer) super.clone();
    }
}
