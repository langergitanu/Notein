package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.https.annotation.Result;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.ak */
/* JADX INFO: loaded from: classes8.dex */
public class C17609ak {

    @Result("access_token")
    private String accessToken;

    @Result("expires_in")
    private long expiresIn;

    @Result("ret")
    private C17610al ret;

    public String getAccessToken() {
        return this.accessToken;
    }

    public long getExpiresIn() {
        return this.expiresIn;
    }

    public C17610al getRet() {
        return this.ret;
    }
}
