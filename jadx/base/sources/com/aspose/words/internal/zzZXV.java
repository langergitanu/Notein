package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZXV extends zzZWY {
    private static zzD4 zzOm = new zzD4();

    static {
        for (int i = 32; i <= 255; i++) {
            int i2 = 61440 + i;
            zzOm.add(i, i2);
            zzOm.add(i2, i);
        }
    }

    public zzZXV() {
        super(zzOm);
    }
}
