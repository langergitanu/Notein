package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzkl {
    public static void zza(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(j);
        throw new ArithmeticException(com.facebook.soloader.OooO0OO.OooO00o(j2, ", ", ")", sb));
    }

    public static void zzb(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
