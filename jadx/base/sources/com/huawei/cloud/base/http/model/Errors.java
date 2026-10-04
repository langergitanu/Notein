package com.huawei.cloud.base.http.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.Key;

/* JADX INFO: loaded from: classes8.dex */
public final class Errors extends GenericJson {

    @Key
    private String domain;

    @Key
    private String errorCode;

    @Key
    private String location;

    @Key
    private String locationType;

    @Key
    private String message;

    @Key
    private String reason;

    public String getDomain() {
        return this.domain;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getLocation() {
        return this.location;
    }

    public String getLocationType() {
        return this.locationType;
    }

    public String getMessage() {
        return this.message;
    }

    public String getReason() {
        return this.reason;
    }

    public Errors setDomain(String str) {
        this.domain = str;
        return this;
    }

    public Errors setErrorCode(String str) {
        this.errorCode = str;
        return this;
    }

    public Errors setLocation(String str) {
        this.location = str;
        return this;
    }

    public Errors setLocationType(String str) {
        this.locationType = str;
        return this;
    }

    public Errors setMessage(String str) {
        this.message = str;
        return this;
    }

    public Errors setReason(String str) {
        this.reason = str;
        return this;
    }
}
