package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzXT {
    private byte[] zzVO;
    private int zzVP;
    private int zzVQ;
    private int zzVR;

    public zzXT(byte[] bArr) {
        this.zzVO = bArr;
        zzWV();
    }

    private boolean zzWT() {
        return this.zzVR == 1;
    }

    private void zzWU() {
        this.zzVO[this.zzVQ] = (byte) this.zzVP;
    }

    private void zzWV() {
        this.zzVR = 128;
        this.zzVP = 0;
    }

    public final void flush() {
        if (this.zzVR == 128 || this.zzVQ >= this.zzVO.length) {
            return;
        }
        zzWU();
    }

    public final void zz5(int i) {
        flush();
        zzWV();
        this.zzVQ = i;
    }

    public final void zzWW() {
        if (!zzWT()) {
            this.zzVR >>= 1;
        } else {
            zzWU();
            zz5(this.zzVQ + 1);
        }
    }

    public final void zzWX() {
        this.zzVP += ((byte) this.zzVR) & 255;
    }
}
