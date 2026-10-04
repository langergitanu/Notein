package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJQ {
    private static int zzXCo = zzYlU();
    private int zzZn;

    private static int zzYlU() {
        int i = 0;
        for (int i2 = 1; i2 != 0; i2 <<= 2) {
            i |= i2;
        }
        return i;
    }

    private int zzYlV() {
        return (this.zzZn & 3) - 1;
    }

    public final int zzCQ() {
        if (this.zzZn == 0) {
            throw new IllegalStateException("The stack is empty.");
        }
        int iZzYlV = zzYlV();
        this.zzZn >>= 2;
        return iZzYlV;
    }

    public final void zzVF(int i) {
        int i2 = this.zzZn;
        if ((i2 >> 31) != 0) {
            throw new IllegalStateException("The stack is full.");
        }
        int i3 = (i & 3) + 1;
        if (i3 > 3) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: reflowState");
        }
        this.zzZn = i3 | (i2 << 2);
    }

    public final boolean zzYlW() {
        int i = this.zzZn;
        return i != 0 && (i & zzXCo) == 0;
    }
}
