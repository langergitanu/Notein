package com.huawei.cloud.base.json;

import com.huawei.cloud.base.http.HttpResponse;
import com.huawei.cloud.base.json.JsonObjectParser;
import com.huawei.cloud.base.util.Data;
import com.huawei.cloud.base.util.Key;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class JsonError extends GenericJson {

    @Key
    private int code;

    @Key
    private List<ErrorInfo> errors;

    @Key
    private String message;

    static {
        Data.nullOf(ErrorInfo.class);
    }

    public static JsonError parse(JsonFactory jsonFactory, HttpResponse httpResponse) throws IOException {
        return (JsonError) new JsonObjectParser.Builder(jsonFactory).setWrapperKeys(Collections.singleton("error")).build().parseAndClose(httpResponse.getContent(), httpResponse.getContentCharset(), JsonError.class);
    }

    public final int getCode() {
        return this.code;
    }

    public final List<ErrorInfo> getErrors() {
        return this.errors;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setErrors(List<ErrorInfo> list) {
        this.errors = list;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public static class ErrorInfo extends GenericJson {

        @Key
        private String domain;

        @Key
        private String location;

        @Key
        private String locationType;

        @Key
        private String message;

        @Key
        private String reason;

        public final String getDomain() {
            return this.domain;
        }

        public final String getLocation() {
            return this.location;
        }

        public final String getLocationType() {
            return this.locationType;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getReason() {
            return this.reason;
        }

        public final void setDomain(String str) {
            this.domain = str;
        }

        public final void setLocation(String str) {
            this.location = str;
        }

        public final void setLocationType(String str) {
            this.locationType = str;
        }

        public final void setMessage(String str) {
            this.message = str;
        }

        public final void setReason(String str) {
            this.reason = str;
        }

        @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
        public ErrorInfo set(String str, Object obj) {
            return (ErrorInfo) super.set(str, obj);
        }

        @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
        public ErrorInfo clone() {
            return (ErrorInfo) super.clone();
        }
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
    public JsonError set(String str, Object obj) {
        return (JsonError) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public JsonError clone() {
        return (JsonError) super.clone();
    }
}
