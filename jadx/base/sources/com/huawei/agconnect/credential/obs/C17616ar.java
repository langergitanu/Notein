package com.huawei.agconnect.credential.obs;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.BaseRequest;
import com.huawei.agconnect.https.annotation.Field;
import com.huawei.agconnect.https.annotation.Url;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.ar */
/* JADX INFO: loaded from: classes8.dex */
public class C17616ar extends BaseRequest {

    @Url
    private static final String REQUEST_URL = "http://localhost/agc/apigw/router";

    @Field(RemoteConfigConstants.RequestFieldKey.APP_ID)
    private String appId;

    @Field(RemoteConfigConstants.RequestFieldKey.APP_VERSION)
    private String appVersion;

    @Field("clientId")
    private String clientId;

    @Field("packageName")
    private String packageName;

    @Field("productId")
    private String productId;

    @Field("serviceName")
    String serviceName;

    public C17616ar(AGConnectInstance aGConnectInstance) {
        super(aGConnectInstance);
        this.productId = getHeaderProductId();
        this.appId = getHeaderAppId();
        this.appVersion = getAppVersion();
        this.packageName = getPackageName();
        this.clientId = getHeaderClientId();
        this.serviceName = "agconnect-credential";
    }

    /* JADX INFO: renamed from: a */
    public void m75500a(String str) {
        if (str != null) {
            this.serviceName = str;
        }
    }
}
