package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzNO {
    private short zzF7;

    public final int getValue() {
        return this.zzF7 & 65535;
    }

    public final boolean zzM1() {
        return zzXu(1);
    }

    public final boolean zzM2() {
        return zzXu(4);
    }

    public final boolean zzM3() {
        return zzXu(3);
    }

    public final int zzM4() {
        return zzn(8, 15);
    }

    public final boolean zzXu(int i) {
        return zzXU.zzZ(this.zzF7, (short) (1 << (15 - i)));
    }

    public final void zzZ(zzO8 zzo8) throws Exception {
        this.zzF7 = zzo8.zzXa();
    }

    public final int zzn(int i, int i2) {
        return (((this.zzF7 & 65535) << i) & 65535) >> (15 - (i2 - i));
    }
}
