package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.agconnect.common.api.BaseRequest;
import com.huawei.agconnect.https.annotation.Field;
import com.huawei.agconnect.https.annotation.Header;
import com.huawei.agconnect.https.annotation.Url;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.identity.common.java.providers.oauth2.TokenRequest;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.aj */
/* JADX INFO: loaded from: classes8.dex */
public class C17608aj extends BaseRequest {

    @Url
    private static final String REQUEST_URL = "http://localhost/agc/apigw/oauth2/v1/token";

    @Header(HiAnalyticsConstant.BI_KEY_APP_ID)
    private String appId;

    @Field("client_id")
    private String clientId;

    @Field("client_secret")
    private String clientSecret;

    @Field("grant_type")
    private String grantType;

    @Field("useJwt")
    private int useJwt;

    public C17608aj(AGConnectInstance aGConnectInstance) {
        super(aGConnectInstance);
        this.grantType = TokenRequest.GrantTypes.CLIENT_CREDENTIALS;
        this.useJwt = 1;
        setSdkServiceName("agconnect-credential");
        setSdkVersion("1.9.0.300");
        AGConnectOptions options = aGConnectInstance.getOptions();
        this.appId = options.getString("client/app_id");
        this.clientId = options.getString("client/client_id");
        this.clientSecret = options.getString("client/client_secret");
    }

    public String getAppId() {
        return this.appId;
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public String getGrantType() {
        return this.grantType;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public void setClientSecret(String str) {
        this.clientSecret = str;
    }
}
