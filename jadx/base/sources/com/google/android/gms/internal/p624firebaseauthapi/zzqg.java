package com.google.android.gms.internal.p624firebaseauthapi;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes7.dex */
final class zzqg extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ SecureRandom initialValue() {
        return zzqd.zza();
    }
}
