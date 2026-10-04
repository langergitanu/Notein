package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzX4 {
    public short zzUg;
    public short zzUh;
    public short zzUi;

    public zzX4() {
    }

    public static zzX4 zzZ(short[] sArr, int i) {
        int i2 = i * 3;
        return new zzX4(sArr[i2], sArr[i2 + 1], sArr[i2 + 2]);
    }

    private zzX4(short s, short s2, short s3) {
        this.zzUh = s;
        this.zzUi = s2;
        this.zzUg = s3;
    }

    public zzX4(int i, int i2) {
        this((short) i, (short) i2, (short) 0);
    }
}
