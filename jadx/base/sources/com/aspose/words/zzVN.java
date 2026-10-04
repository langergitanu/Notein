package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVN {
    private long zzZwq;
    private int zzZwr;
    private int zzZws;
    private long zzZx8;

    private zzVN(int i, int i2, long j, long j2) {
        this.zzZws = i;
        this.zzZwr = i2;
        this.zzZwq = j;
        this.zzZx8 = j2;
    }

    public static zzVN zzM(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzzox.zzq().zzH(zzzox.zzq().getPosition() + 4);
        int iZzXc = zzzox.zzXc();
        zzzox.zzq().zzH(zzzox.zzq().getPosition() + 4);
        int iZzXc2 = zzzox.zzXc();
        zzzox.zzq().zzH(zzzox.zzq().getPosition() + 8);
        return new zzVN(iZzXc, iZzXc2, zzzox.zzX8(), zzzox.zzX8());
    }

    public final int getBlockCount() {
        return this.zzZws;
    }

    public final long zz1f() {
        return this.zzZx8;
    }

    public final long zz1g() {
        return this.zzZwq;
    }

    public final int zz1h() {
        return this.zzZwr;
    }
}
