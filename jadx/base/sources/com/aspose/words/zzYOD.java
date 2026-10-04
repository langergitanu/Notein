package com.aspose.words;

import android.graphics.Color;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOD {
    private int zzXJh;
    private int zzXJi;
    private int zzXJj;
    private int zzXJk;

    private zzYOD(int i, int i2, int i3, int i4) {
        this.zzXJk = i;
        this.zzXJj = i2;
        this.zzXJi = i3;
        this.zzXJh = i4;
    }

    private boolean zzZ(zzYOD zzyod) {
        return this.zzXJh == zzyod.zzXJh && this.zzXJk == zzyod.zzXJk && this.zzXJj == zzyod.zzXJj && this.zzXJi == zzyod.zzXJi;
    }

    public static zzYOD zzqZ(int i) {
        long j = i;
        return new zzYOD((int) (255 & j), (int) ((65280 & j) >> 8), (int) ((16711680 & j) >> 16), (int) ((j & 4278190080L) >> 24));
    }

    public final boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzYOD.class) {
            return false;
        }
        return zzZ((zzYOD) obj);
    }

    public final int getColor() {
        return Color.rgb(this.zzXJk, this.zzXJj, this.zzXJi);
    }

    public final int hashCode() {
        return (((((this.zzXJh * 397) ^ this.zzXJk) * 397) ^ this.zzXJj) * 397) ^ this.zzXJi;
    }

    public final String toString() {
        return com.aspose.words.internal.zzZKN.format("Raw:0x{0:X8}, RGB:({1}, R:0x{2:x2}, G:0x{3:x2}, B:0x{4:x2})", Integer.valueOf(zzYrE()), Integer.valueOf(this.zzXJh), Integer.valueOf(this.zzXJk & 255), Integer.valueOf(this.zzXJj & 255), Integer.valueOf(this.zzXJi & 255));
    }

    public final int zzYrE() {
        return (int) (((long) (this.zzXJk & 255)) | (((long) ((this.zzXJj & 255) << 8)) & 4294967295L) | (((long) ((this.zzXJi & 255) << 16)) & 4294967295L) | (((long) ((((byte) this.zzXJh) & 255) << 24)) & 4294967295L));
    }
}
