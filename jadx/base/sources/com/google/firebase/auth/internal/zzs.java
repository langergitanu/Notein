package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class zzs extends ActionCodeInfo {
    public zzs(String str) {
        this.email = Preconditions.checkNotEmpty(str);
    }
}
