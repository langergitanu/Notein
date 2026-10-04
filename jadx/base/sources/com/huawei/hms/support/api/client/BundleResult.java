package com.huawei.hms.support.api.client;

import android.os.Bundle;

/* JADX INFO: loaded from: classes9.dex */
public class BundleResult {

    /* JADX INFO: renamed from: a */
    private int f56905a;

    /* JADX INFO: renamed from: b */
    private Bundle f56906b;

    public BundleResult(int i, Bundle bundle) {
        this.f56905a = i;
        this.f56906b = bundle;
    }

    public int getResultCode() {
        return this.f56905a;
    }

    public Bundle getRspBody() {
        return this.f56906b;
    }

    public void setResultCode(int i) {
        this.f56905a = i;
    }

    public void setRspBody(Bundle bundle) {
        this.f56906b = bundle;
    }
}
