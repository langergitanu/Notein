package com.huawei.hms.api;

import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
public class UserRecoverableException extends Exception {

    /* JADX INFO: renamed from: a */
    private final Intent f52471a;

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.f52471a = intent;
    }

    public Intent getIntent() {
        return new Intent(this.f52471a);
    }
}
