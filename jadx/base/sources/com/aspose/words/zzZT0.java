package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZT0 extends zzZT7 {
    private long zzYJy;
    private long zzYJz;

    public zzZT0() {
        super(61449, 1);
        this.zzYJz = 0L;
        this.zzYJy = 0L;
    }

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        int iZzXc = zzzox.zzXc();
        int iZzXc2 = zzzox.zzXc();
        int iZzXc3 = zzzox.zzXc();
        int iZzXc4 = zzzox.zzXc();
        this.zzYJz = com.aspose.words.internal.zzZPZ.zzZm(iZzXc, iZzXc2);
        this.zzYJy = com.aspose.words.internal.zzZPX.zzZm(iZzXc3 - iZzXc, iZzXc4 - iZzXc2);
    }

    public final void zzXO(long j) {
        this.zzYJy = j;
    }

    public final void zzXP(long j) {
        this.zzYJz = j;
    }

    @Override // com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        zzzsp.write((int) this.zzYJz);
        zzzsp.write((int) (this.zzYJz >> 32));
        zzzsp.write(((int) this.zzYJz) + ((int) this.zzYJy));
        zzzsp.write(((int) (this.zzYJz >> 32)) + ((int) (this.zzYJy >>> 32)));
    }

    public final long zzZi5() {
        return this.zzYJy;
    }

    public final long zzZi6() {
        return this.zzYJz;
    }
}
