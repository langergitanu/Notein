package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7M extends zzZDB {
    private zzZCG zzWpX;

    private zzZ7M(zzZCG zzzcg) {
        this.zzWpX = zzzcg;
    }

    public static zzZ7M zzX4(Object obj) {
        if (obj instanceof zzZ7M) {
            return (zzZ7M) obj;
        }
        if (obj != null) {
            return new zzZ7M(zzZCG.zzYu(obj));
        }
        return null;
    }

    public final String toString() {
        byte[] bytes = this.zzWpX.getBytes();
        if (bytes.length == 1) {
            return androidx.core.graphics.OooO0O0.OooO00o(bytes[0] & 255, new StringBuilder("KeyUsage: 0x"));
        }
        return androidx.core.graphics.OooO0O0.OooO00o((bytes[0] & 255) | ((bytes[1] & 255) << 8), new StringBuilder("KeyUsage: 0x"));
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return this.zzWpX;
    }
}
