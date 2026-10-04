package com.huawei.agconnect.remoteconfig.internal.p570a;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.agconnect.common.api.BaseRequest;
import com.huawei.agconnect.https.annotation.Field;
import com.huawei.agconnect.https.annotation.Header;
import com.huawei.agconnect.https.annotation.Url;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.agconnect.remoteconfig.internal.a.d */
/* JADX INFO: loaded from: classes8.dex */
public class C17675d extends BaseRequest {

    @Url
    private static final String URL = "http://localhost/agc/apigw/rcs/remote-configuration-service/v2/usage/config";

    @Field("aaId")
    private String aaId;

    @Field("country")
    private String country;

    @Field("customAttributes")
    private List<Map<String, String>> customProperties;

    @Field("dateTime")
    private long dateTime;

    @Field("deviceChip")
    private String deviceChip;

    @Field("language")
    private String language;

    @Field(RemoteConfigConstants.RequestFieldKey.PLATFORM_VERSION)
    private String platformVersion;

    @Field("script")
    private String script;

    @Header("tag")
    private String tag;

    @Field("userAttributes")
    private List<Map<String, String>> userProperties;

    @Field("versionName")
    private String versionName;

    public C17675d() {
        setSdkServiceName("agconnect-remoteconfig");
        setSdkVersion("1.9.0.300");
    }

    public String getAaId() {
        return this.aaId;
    }

    public String getCountry() {
        return this.country;
    }

    public List<Map<String, String>> getCustomProperties() {
        return this.customProperties;
    }

    public long getDateTime() {
        return this.dateTime;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    public String getScript() {
        return this.script;
    }

    public String getTag() {
        return this.tag;
    }

    public List<Map<String, String>> getUserProperties() {
        return this.userProperties;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setAaId(String str) {
        this.aaId = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setCustomProperties(List<Map<String, String>> list) {
        this.customProperties = list;
    }

    public void setDateTime(long j) {
        this.dateTime = j;
    }

    public void setDeviceChip(String str) {
        this.deviceChip = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setPlatformVersion(String str) {
        this.platformVersion = str;
    }

    public void setScript(String str) {
        this.script = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setUserProperties(List<Map<String, String>> list) {
        this.userProperties = list;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }
}
