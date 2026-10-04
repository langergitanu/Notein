package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTE {
    private int mLength;
    private int zzL4;
    private int zzV7;
    private int zzYJT;

    public zzZTE() {
    }

    private void zzZ(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (!com.aspose.words.internal.zzZYQ.zzT(zzzox, 8)) {
            zzzox.zzq().zzU(0L, 2);
            return;
        }
        int iZzXc = zzzox.zzXc();
        this.zzV7 = iZzXc & 15;
        this.zzYJT = (65520 & iZzXc) >> 4;
        this.zzL4 = (int) ((((long) iZzXc) & 4294901760L) >> 16);
        this.mLength = zzzox.zzXc();
    }

    public final int getLength() {
        return this.mLength;
    }

    public final int getType() {
        return this.zzL4;
    }

    public final void setLength(int i) {
        this.mLength = i;
    }

    public final void setType(int i) {
        this.zzL4 = i;
    }

    public final void setVersion(int i) {
        this.zzV7 = i;
    }

    public final String toString() {
        return com.aspose.words.internal.zzZKN.format("EsHeader, Type:{0:X}, Version:{1}, Instance:{2}, Length:{3}", Integer.valueOf(this.zzL4), Integer.valueOf(this.zzV7), Integer.valueOf(this.zzYJT), Integer.valueOf(this.mLength));
    }

    public final void zzE7(int i) {
        this.zzYJT = i;
    }

    public final void zzT(zzZSP zzzsp) throws Exception {
        zzzsp.write(this.zzV7 | (this.zzYJT << 4) | (this.zzL4 << 16));
        zzzsp.write(this.mLength);
    }

    public final int zzZim() {
        return this.zzYJT;
    }

    public final void zzZin() {
        this.zzV7 = 15;
    }

    public zzZTE(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzZ(zzzox);
    }
}
