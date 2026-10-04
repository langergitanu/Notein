package com.huawei.cloud.services.drive.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.Key;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class Channel extends GenericJson {

    @Key
    private String category;

    @Key
    private Long expirationTime;

    /* JADX INFO: renamed from: id */
    @Key
    private String f52354id;

    @Key
    private Map<String, String> params;

    @Key
    private Boolean payload;

    @Key
    private String resourceId;

    @Key
    private String resourceUri;

    @Key
    private String type;

    @Key
    private String url;

    @Key
    private String userToken;

    public String getCategory() {
        return this.category;
    }

    public Long getExpirationTime() {
        return this.expirationTime;
    }

    public String getId() {
        return this.f52354id;
    }

    public Map<String, String> getParams() {
        return this.params;
    }

    public Boolean getPayload() {
        return this.payload;
    }

    public String getResourceId() {
        return this.resourceId;
    }

    public String getResourceUri() {
        return this.resourceUri;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUserToken() {
        return this.userToken;
    }

    public Channel setCategory(String str) {
        this.category = str;
        return this;
    }

    public Channel setExpirationTime(Long l) {
        this.expirationTime = l;
        return this;
    }

    public Channel setId(String str) {
        this.f52354id = str;
        return this;
    }

    public Channel setParams(Map<String, String> map) {
        this.params = map;
        return this;
    }

    public Channel setPayload(Boolean bool) {
        this.payload = bool;
        return this;
    }

    public Channel setResourceId(String str) {
        this.resourceId = str;
        return this;
    }

    public Channel setResourceUri(String str) {
        this.resourceUri = str;
        return this;
    }

    public Channel setType(String str) {
        this.type = str;
        return this;
    }

    public Channel setUrl(String str) {
        this.url = str;
        return this;
    }

    public Channel setUserToken(String str) {
        this.userToken = str;
        return this;
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
    public Channel set(String str, Object obj) {
        return (Channel) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public Channel clone() {
        return (Channel) super.clone();
    }
}
