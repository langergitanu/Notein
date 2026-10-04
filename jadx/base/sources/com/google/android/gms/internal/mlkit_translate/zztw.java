package com.google.android.gms.internal.mlkit_translate;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes7.dex */
public final class zztw {
    private final String zza;

    public zztw(String str) {
        Preconditions.checkNotNull(str, "Null FID");
        int length = str.length();
        Preconditions.checkArgument(length == 22, "Invalid FID: must be exactly 22 characters: ".concat(str));
        char cCharAt = str.charAt(0);
        Preconditions.checkArgument(cCharAt >= 'c' && cCharAt <= 'f', "Invalid FID: must start with [c-f]: ".concat(str));
        for (int i = 0; i < length; i++) {
            char cCharAt2 = str.charAt(i);
            Preconditions.checkArgument((cCharAt2 >= '0' && cCharAt2 <= '9') || (cCharAt2 >= 'a' && cCharAt2 <= 'z') || ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || cCharAt2 == '-' || cCharAt2 == '_'), "Invalid FID: must contain only URL-safe base-64 characters: ".concat(str));
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zztw) {
            return this.zza.equals(((zztw) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String zza() {
        return this.zza;
    }
}
