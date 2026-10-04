package com.huawei.cloud.services.drive;

import com.huawei.cloud.base.http.HttpHeaders;
import com.huawei.cloud.base.services.json.AbstractJsonClientRequest;
import com.huawei.cloud.base.util.Key;

/* JADX INFO: loaded from: classes8.dex */
public abstract class DriveRequest<T> extends AbstractJsonClientRequest<T> {

    @Key
    private String fields;

    @Key
    private String form;

    @Key
    private Boolean prettyPrint;

    @Key
    private String quotaId;

    public DriveRequest(Drive drive, String str, String str2, Object obj, Class<T> cls) {
        super(drive, str, str2, obj, cls);
        setDisableGZip(true);
    }

    public String getFields() {
        return this.fields;
    }

    public String getForm() {
        return this.form;
    }

    public Boolean getPrettyPrint() {
        return this.prettyPrint;
    }

    public String getQuotaId() {
        return this.quotaId;
    }

    /* JADX INFO: renamed from: setFields */
    public DriveRequest<T> setFields2(String str) {
        this.fields = str;
        return this;
    }

    /* JADX INFO: renamed from: setForm */
    public DriveRequest<T> setForm2(String str) {
        this.form = str;
        return this;
    }

    /* JADX INFO: renamed from: setPrettyPrint */
    public DriveRequest<T> setPrettyPrint2(Boolean bool) {
        this.prettyPrint = bool;
        return this;
    }

    /* JADX INFO: renamed from: setQuotaId */
    public DriveRequest<T> setQuotaId2(String str) {
        this.quotaId = str;
        return this;
    }

    @Override // com.huawei.cloud.base.services.json.AbstractJsonClientRequest, com.huawei.cloud.base.services.AbstractClientRequest
    public final Drive getAbstractClient() {
        return (Drive) super.getAbstractClient();
    }

    @Override // com.huawei.cloud.base.services.json.AbstractJsonClientRequest, com.huawei.cloud.base.services.AbstractClientRequest
    public DriveRequest<T> setDisableGZip(boolean z) {
        return (DriveRequest) super.setDisableGZip(z);
    }

    @Override // com.huawei.cloud.base.services.json.AbstractJsonClientRequest, com.huawei.cloud.base.services.AbstractClientRequest
    public DriveRequest<T> setHeaders(HttpHeaders httpHeaders) {
        return (DriveRequest) super.setHeaders(httpHeaders);
    }

    @Override // com.huawei.cloud.base.services.json.AbstractJsonClientRequest, com.huawei.cloud.base.services.AbstractClientRequest, com.huawei.cloud.base.util.GenericData
    public DriveRequest<T> set(String str, Object obj) {
        return (DriveRequest) super.set(str, obj);
    }
}
