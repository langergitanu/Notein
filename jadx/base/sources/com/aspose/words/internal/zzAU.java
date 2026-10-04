package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;

/* JADX INFO: loaded from: classes5.dex */
class zzAU {
    private int zzsk;
    private byte[] zzsl;
    private int zzsm;
    private int zzsn;
    private int zzso;
    private int zzsp;
    private zzZ zzsq;
    private zzZ zzsr;
    private zzZ zzss;
    private int zzst;

    public zzAU(int i, zzXX zzxx) {
        this.zzst = i;
        zzB1();
        zzZ(zzxx);
        zzY(zzxx);
        zzX(zzxx);
        zzB0();
    }

    private void zzB0() {
        this.zzsl = new byte[7168];
        int i = 0;
        for (byte b = 0; (b & 255) < 32; b = (byte) (b + 1)) {
            for (byte b2 = 0; (b2 & 255) < 96; b2 = (byte) (b2 + 1)) {
                byte[] bArr = this.zzsl;
                int i2 = i + 1;
                bArr[i] = b;
                i += 2;
                bArr[i2] = b2;
            }
        }
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.zzsl;
            byte b3 = (byte) i3;
            bArr2[i] = b3;
            bArr2[i + 1] = b3;
            int i4 = i + 3;
            bArr2[i + 2] = b3;
            i += 4;
            bArr2[i4] = b3;
        }
    }

    private void zzB1() {
        this.zzsk = 8;
        int i = 1;
        while (this.zzsk < this.zzst) {
            i++;
            this.zzsk = 1 << (i * 3);
        }
        int i2 = i * 8;
        this.zzsp = i2 + 256;
        this.zzso = i2 + 257;
        this.zzsn = i2 + StyleIdentifier.COLORFUL_LIST_ACCENT_6;
        this.zzsm = i2 + StyleIdentifier.COLORFUL_GRID_ACCENT_6;
    }

    private void zzX(zzXX zzxx) {
        zzZ zzz = new zzZ(this.zzsm, zzxx);
        this.zzsq = zzz;
        zzz.zzZ(256);
        this.zzsq.zzZ(257);
        for (int i = 0; i < 12; i++) {
            this.zzsq.zzZ(this.zzsp);
        }
        for (int i2 = 0; i2 < 6; i2++) {
            this.zzsq.zzZ(this.zzso);
        }
    }

    private void zzY(zzXX zzxx) {
        this.zzsr = new zzZ(8, zzxx);
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                this.zzsr.zzZ(i2);
            }
        }
    }

    private void zzZ(zzXX zzxx) {
        this.zzss = new zzZ(8, zzxx);
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                this.zzss.zzZ(i2);
            }
        }
    }

    public final int zzAR() {
        return this.zzst + 7168;
    }

    public final long zzAS() {
        return this.zzsk;
    }

    public final int zzAT() {
        return this.zzsn;
    }

    public final int zzAU() {
        return this.zzso;
    }

    public final int zzAV() {
        return this.zzsp;
    }

    public final zzZ zzAW() {
        return this.zzsq;
    }

    public final zzZ zzAX() {
        return this.zzsr;
    }

    public final zzZ zzAY() {
        return this.zzss;
    }

    public final byte[] zzAZ() {
        return this.zzsl;
    }
}
