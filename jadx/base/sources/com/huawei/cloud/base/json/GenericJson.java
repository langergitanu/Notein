package com.huawei.cloud.base.json;

import com.huawei.cloud.base.util.GenericData;
import com.huawei.cloud.base.util.Throwables;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class GenericJson extends GenericData implements Cloneable {
    private JsonFactory jsonFactory;

    public final JsonFactory getFactory() {
        return this.jsonFactory;
    }

    public final void setFactory(JsonFactory jsonFactory) {
        this.jsonFactory = jsonFactory;
    }

    public String toPrettyString() throws IOException {
        JsonFactory jsonFactory = this.jsonFactory;
        return jsonFactory != null ? jsonFactory.toPrettyString(this) : super.toString();
    }

    @Override // java.util.AbstractMap
    public String toString() {
        JsonFactory jsonFactory = this.jsonFactory;
        if (jsonFactory == null) {
            return super.toString();
        }
        try {
            return jsonFactory.toString(this);
        } catch (IOException e) {
            throw Throwables.propagate(e);
        }
    }

    @Override // com.huawei.cloud.base.util.GenericData
    public GenericJson set(String str, Object obj) {
        return (GenericJson) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public GenericJson clone() {
        return (GenericJson) super.clone();
    }
}
