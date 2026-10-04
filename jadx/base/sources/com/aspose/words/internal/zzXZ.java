package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzXZ {
    private zzZOW zzW5;

    public zzXZ(zzZOP zzzop) throws Exception {
        this.zzW5 = new zzZOW(zzzop);
    }

    public final void writeByte(byte b) throws Exception {
        this.zzW5.writeByte(b);
    }

    public final void writeBytes(byte[] bArr) throws Exception {
        this.zzW5.zzV(bArr, 0, bArr.length);
    }

    public final void zzQ(long j) throws Exception {
        this.zzW5.zzQ(zzXU.zzP(j));
    }

    public final void zzW(byte[] bArr, int i) throws Exception {
        this.zzW5.zzV(bArr, 0, i);
    }

    public final void zzh(int i) throws Exception {
        this.zzW5.writeByte((byte) ((16711680 & i) >> 16));
        this.zzW5.writeByte((byte) ((65280 & i) >> 8));
        this.zzW5.writeByte((byte) (i & 255));
    }

    public final void zzi(int i) throws Exception {
        this.zzW5.zzK(zzXU.zzY((short) i));
    }

    public final void zzj(int i) throws Exception {
        this.zzW5.zzK(zzXU.zzZ((short) i));
    }

    public final void zzk(int i) throws Exception {
        this.zzW5.zzl((int) (((long) zzXU.zz8(i)) & 4294967295L));
    }

    public final void zzl(int i) throws Exception {
        this.zzW5.zzl(zzXU.zz9(i));
    }

    public final zzZOP zzq() throws Exception {
        return this.zzW5.zzq();
    }
}
