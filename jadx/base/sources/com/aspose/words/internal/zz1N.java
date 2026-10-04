package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz1N extends zz4I {
    private static zzD4 zzfR = new zzD4();

    static {
        for (int i = 32; i <= 126; i++) {
            zzfR.add(i, i);
            zzfR.add(61440 + i, i);
        }
        for (int i2 = 161; i2 <= 254; i2++) {
            if (i2 != 240) {
                zzfR.add(i2, i2);
                zzfR.add(i2 + 61440, i2);
            }
        }
        zzfR.add(8226, 183);
    }

    private static byte zzTF(int i) {
        int i2 = zzfR.get(i);
        if (zzD4.zzWm(i2)) {
            return (byte) 63;
        }
        return (byte) i2;
    }

    @Override // com.aspose.words.internal.zz4I
    public final void zzI(zzFY zzfy) {
    }

    @Override // com.aspose.words.internal.zz4I
    public final void zzX(zz4X zz4x) throws Exception {
        zz4x.zzsZ();
    }

    @Override // com.aspose.words.internal.zz4I
    public final void zzY(zz4X zz4x) throws Exception {
        zz4x.zzt0();
    }

    @Override // com.aspose.words.internal.zz4I
    public final void zzZ(int i, int i2, zz4X zz4x) throws Exception {
        zz4x.zzJ(zzTF(i2));
    }
}
