package com.huawei.hms.api;

import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
public class HuaweiServicesRepairableException extends UserRecoverableException {

    /* JADX INFO: renamed from: b */
    private final int f52461b;

    public HuaweiServicesRepairableException(int i, String str, Intent intent) {
        super(str, intent);
        this.f52461b = i;
    }

    public int getConnectionStatusCode() {
        return this.f52461b;
    }
}
