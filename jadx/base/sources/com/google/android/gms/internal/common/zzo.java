package com.google.android.gms.internal.common;

import OooOoo.C20593OooO0Oo;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes7.dex */
final class zzo extends zzn {
    private final char zza;

    public zzo(char c) {
        this.zza = c;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = IOUtils.DIR_SEPARATOR_WINDOWS;
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.zza;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        return C20593OooO0Oo.OooO0O0("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.common.zzr
    public final boolean zza(char c) {
        return c == this.zza;
    }
}
