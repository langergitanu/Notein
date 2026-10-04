package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6I {
    private zzY6J zzX4Y;
    private zzY6J zzX4Z;

    public zzY6I() {
        this.zzX4Z = new zzY6J(0, 0);
        this.zzX4Y = new zzY6J(0, 0);
    }

    public static zzY6I zzR(zzYIC zzyic) {
        int iZzYN3;
        int iZzYN32;
        int iMax;
        int iMax2;
        zzWV zzwv = (zzWV) zzyic.zzZXZ();
        zzWV zzwv2 = (zzWV) ((zzWV) zzyic.zzZXY()).zzYTo();
        if (((zzY6N) zzyic.zza9()).zzZz()) {
            zzwv2 = zzwv;
            zzwv = zzwv2;
        }
        int iZzYN1 = ((zzZ3B) zzwv.zzYTt()).zzYN1();
        int iZzYN0 = ((zzZ3B) zzwv2.zzYTt()).zzYN0();
        int iZzZ = zzWU.zzZ(zzwv, 1);
        int iZzZ2 = zzWU.zzZ(zzwv2, 2);
        if (zzyic.zzYk4()) {
            iZzYN3 = zzyic.zza7().zzZYM() ? iZzZ / 2 : zzyic.zzYk1().zzYMV().zzwz(1).zzYN3() / 2;
            iZzYN32 = zzyic.zzYk1().zzYMV().zzwz(2).zzYN3() / 2;
            int iZzYKt = zzyic.zzYKt() * 2;
            iMax = iZzYN1 + iZzYKt + iZzZ;
            iMax2 = iZzYKt + iZzYN0 + iZzZ2;
        } else {
            iZzYN3 = iZzZ / 2;
            iZzYN32 = iZzZ2 / 2;
            iMax = Math.max(iZzYN1, iZzYN3);
            iMax2 = Math.max(iZzYN0, iZzYN32);
        }
        return new zzY6I(iZzYN3, iMax, iZzYN32, iMax2);
    }

    public final zzY6J zzXXv() {
        return this.zzX4Y;
    }

    public final zzY6J zzXXw() {
        return this.zzX4Z;
    }

    public final void zzY(zzY6J zzy6j) {
        this.zzX4Y = zzy6j;
    }

    public final void zzZ(zzY6J zzy6j) {
        this.zzX4Z = zzy6j;
    }

    private zzY6I(int i, int i2, int i3, int i4) {
        this.zzX4Z = new zzY6J(i, i2);
        this.zzX4Y = new zzY6J(i3, i4);
    }
}
