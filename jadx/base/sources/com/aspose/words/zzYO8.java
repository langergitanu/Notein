package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYO8 {
    private int zzVL;
    private int zzVN;

    public zzYO8(int i, int i2) {
        this.zzVL = i;
        this.zzVN = i2;
    }

    public static zzYO8 zzXU(byte[] bArr) {
        return new zzYO8(com.aspose.words.internal.zzZQK.zzA(bArr, 0), com.aspose.words.internal.zzZQK.zzA(bArr, 4));
    }

    private boolean zzY(zzYO8 zzyo8) {
        return this.zzVL == zzyo8.zzVL && this.zzVN == zzyo8.zzVN;
    }

    public static zzYO8 zzh(double d, double d2) {
        return new zzYO8(com.aspose.words.internal.zzSA.zzx(d), com.aspose.words.internal.zzSA.zzx(d2));
    }

    public final boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzYO8.class) {
            return false;
        }
        return zzY((zzYO8) obj);
    }

    public final int getHeight() {
        return this.zzVN;
    }

    public final int getWidth() {
        return this.zzVL;
    }

    public final int hashCode() {
        return (this.zzVL * 397) ^ this.zzVN;
    }

    public final String toString() {
        return com.aspose.words.internal.zzZKN.format("Raw:0x{0:X8}, (W:{1}hm, H:{2}hm)", Long.valueOf(((long) this.zzVL) | (((long) this.zzVN) << 32)), Integer.valueOf(this.zzVL), Integer.valueOf(this.zzVN));
    }

    public final byte[] zzYro() {
        return com.aspose.words.internal.zzZQK.zzYN(((long) this.zzVL) | (((long) this.zzVN) << 32));
    }
}
