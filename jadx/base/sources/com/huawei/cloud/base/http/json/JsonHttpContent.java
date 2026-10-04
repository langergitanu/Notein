package com.huawei.cloud.base.http.json;

import com.huawei.cloud.base.http.AbstractHttpContent;
import com.huawei.cloud.base.http.HttpMediaType;
import com.huawei.cloud.base.json.JsonFactory;
import com.huawei.cloud.base.json.JsonGenerator;
import com.huawei.cloud.base.util.Preconditions;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
public class JsonHttpContent extends AbstractHttpContent {
    private final Object data;
    private final JsonFactory jsonFactory;
    private String wrapperKey;

    public JsonHttpContent(JsonFactory jsonFactory, Object obj) {
        super("application/json; charset=UTF-8");
        this.jsonFactory = (JsonFactory) Preconditions.checkNotNull(jsonFactory);
        this.data = Preconditions.checkNotNull(obj);
    }

    public final Object getData() {
        return this.data;
    }

    public final JsonFactory getJsonFactory() {
        return this.jsonFactory;
    }

    public final String getWrapperKey() {
        return this.wrapperKey;
    }

    public JsonHttpContent setWrapperKey(String str) {
        this.wrapperKey = str;
        return this;
    }

    @Override // com.huawei.cloud.base.http.HttpContent, com.huawei.cloud.base.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        JsonGenerator jsonGeneratorCreateJsonGenerator = this.jsonFactory.createJsonGenerator(outputStream, getCharset());
        if (this.wrapperKey != null) {
            jsonGeneratorCreateJsonGenerator.writeStartObject();
            jsonGeneratorCreateJsonGenerator.writeFieldName(this.wrapperKey);
        }
        jsonGeneratorCreateJsonGenerator.serialize(this.data);
        if (this.wrapperKey != null) {
            jsonGeneratorCreateJsonGenerator.writeEndObject();
        }
        jsonGeneratorCreateJsonGenerator.flush();
    }

    @Override // com.huawei.cloud.base.http.AbstractHttpContent
    public JsonHttpContent setMediaType(HttpMediaType httpMediaType) {
        super.setMediaType(httpMediaType);
        return this;
    }
}
