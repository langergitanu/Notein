package com.google.android.gms.internal.p624firebaseauthapi;

import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes7.dex */
public enum zzahg {
    ACCESS_TOKEN("ACCESS_TOKEN"),
    ID_TOKEN(CommonConstant.KEY_ID_TOKEN);

    private final String zzd;

    zzahg(String str) {
        this.zzd = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
