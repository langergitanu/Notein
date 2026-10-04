package com.google.android.gms.internal.p624firebaseauthapi;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzage implements OnFailureListener {
    public zzage(zzagc zzagcVar) {
        Objects.requireNonNull(zzagcVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        zzagc.zza.m74920e(OooO00o.OooO00o("SmsRetrieverClient failed to start: ", exc.getMessage()), new Object[0]);
    }
}
