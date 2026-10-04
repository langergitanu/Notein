package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzWJ {
    private zzXZ zzTy;

    public zzWJ(zzXZ zzxz) {
        this.zzTy = zzxz;
    }

    public final void writeBytes(byte[] bArr) throws Exception {
        this.zzTy.writeBytes(bArr);
    }

    public final void zzT(short s) throws Exception {
        if (s < 0 || s > 4) {
            throw new IllegalStateException("Invalid offset.");
        }
        this.zzTy.writeByte((byte) s);
    }

    public final void zzU(short s) throws Exception {
        this.zzTy.zzi(s & 65535);
    }

    public final void zzV(short s) throws Exception {
        this.zzTy.writeByte((byte) s);
    }

    public final void zzZ(int[] iArr, short s) throws Exception {
        for (int i : iArr) {
            if (s == 1) {
                this.zzTy.writeByte((byte) i);
            } else if (s == 2) {
                this.zzTy.zzi(i);
            } else if (s == 3) {
                this.zzTy.zzh(i);
            } else {
                if (s != 4) {
                    throw new IllegalStateException("Unexpected offset size.");
                }
                this.zzTy.zzk(i);
            }
        }
    }
}
