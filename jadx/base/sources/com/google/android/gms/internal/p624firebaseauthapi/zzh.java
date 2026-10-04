package com.google.android.gms.internal.p624firebaseauthapi;

import OooOoo.C20593OooO0Oo;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes7.dex */
final class zzh extends zzi {
    private final char zza;

    public zzh(char c) {
        this.zza = c;
    }

    public final String toString() {
        char c = this.zza;
        char[] cArr = new char[6];
        cArr[0] = IOUtils.DIR_SEPARATOR_WINDOWS;
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return C20593OooO0Oo.OooO0O0("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzf
    public final boolean zza(char c) {
        return c == this.zza;
    }
}
