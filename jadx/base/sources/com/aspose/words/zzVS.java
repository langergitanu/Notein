package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVS {
    private com.aspose.words.internal.zzZO0 zzMW;
    private long zzZwY;
    private long zzZwZ;

    private zzVS(long j, long j2, com.aspose.words.internal.zzZO0 zzzo0) {
        this.zzZwZ = j;
        this.zzZwY = j2;
        this.zzMW = zzzo0;
    }

    public static zzVS zzO(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (!"ITSF".equals(new String(zzzox.zzQG(4)))) {
            throw new IllegalStateException("Expected initial header start signature 'ITSF' here but got something else.");
        }
        int iZzXb = zzzox.zzXb();
        zzzox.zzq().zzH(zzzox.zzq().getPosition() + 12);
        com.aspose.words.internal.zzZO0 zzzo0ZzQz = zzQz(zzzox.zzXc());
        zzzox.zzq().zzH(zzzox.zzq().getPosition() + 48);
        long jZzX8 = zzzox.zzX8();
        return new zzVS(jZzX8, (((long) iZzXb) & 4294967295L) >= 3 ? zzzox.zzX8() : jZzX8 + zzzox.zzX8(), zzzo0ZzQz);
    }

    private static com.aspose.words.internal.zzZO0 zzQz(int i) {
        try {
            return com.aspose.words.internal.zzZO0.zzQz(com.aspose.words.internal.zzZP1.zzQQ(i).zzj5().zzjY());
        } catch (IllegalArgumentException | UnsupportedOperationException unused) {
            return com.aspose.words.internal.zzZO0.zzhV();
        }
    }

    public final long zz1v() {
        return this.zzZwY;
    }

    public final long zz1w() {
        return this.zzZwZ;
    }

    public final com.aspose.words.internal.zzZO0 zzQZ() {
        return this.zzMW;
    }
}
