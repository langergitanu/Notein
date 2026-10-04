package com.aspose.words;

import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class JsonDataSource implements zzZCV {
    private com.aspose.words.internal.zzCM zzYht;

    public JsonDataSource(String str) throws Exception {
        this(str, (JsonDataLoadOptions) null);
    }

    private static com.aspose.words.internal.zzCN zzZ(JsonDataLoadOptions jsonDataLoadOptions) {
        if (jsonDataLoadOptions != null) {
            return jsonDataLoadOptions.zzYUH();
        }
        return null;
    }

    @Override // com.aspose.words.zzZCV
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzH8 toCore() {
        return this.zzYht;
    }

    private JsonDataSource(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        this(zzzop, (JsonDataLoadOptions) null);
    }

    public JsonDataSource(InputStream inputStream) throws Exception {
        this(com.aspose.words.internal.zzZOP.zzY(inputStream));
    }

    public JsonDataSource(String str, JsonDataLoadOptions jsonDataLoadOptions) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "jsonPath");
        this.zzYht = new com.aspose.words.internal.zzCM(str, zzZ(jsonDataLoadOptions));
    }

    private JsonDataSource(com.aspose.words.internal.zzZOP zzzop, JsonDataLoadOptions jsonDataLoadOptions) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) zzzop, "jsonStream");
        this.zzYht = new com.aspose.words.internal.zzCM(zzzop, zzZ(jsonDataLoadOptions));
    }

    public JsonDataSource(InputStream inputStream, JsonDataLoadOptions jsonDataLoadOptions) throws Exception {
        this(com.aspose.words.internal.zzZOP.zzY(inputStream), jsonDataLoadOptions);
    }
}
