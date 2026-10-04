package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz3S extends zz3W {
    private zz2N zzi2;
    private int zzi3;
    private int zzi4;
    private int zzi5;
    private byte[] zzi6;
    private int[] zzi7;
    private int[] zzi8;
    private zzZOR zzi9;

    public zz3S(zzZOP zzzop) {
        super(zzzop);
        this.zzi8 = new int[5021];
        this.zzi7 = new int[5021];
        this.zzi6 = new byte[5021];
    }

    private void zzD(boolean z) throws Exception {
        if (z) {
            this.zzi5 |= this.zzi4;
        }
        int i = this.zzi4 >> 1;
        this.zzi4 = i;
        if (i == 0) {
            zzuy().writeByte((byte) this.zzi5);
            this.zzi5 = 0;
            this.zzi4 = 128;
        }
    }

    private void zzU1(int i) throws Exception {
        for (int i2 = 1 << (this.zzi3 - 1); i2 != 0; i2 >>= 1) {
            zzD((i2 & i) != 0);
        }
    }

    private void zzVC() throws Exception {
        if (this.zzi4 != 128) {
            zzuy().writeByte((byte) this.zzi5);
        }
    }

    private int zzZR(int i, int i2) {
        int i3 = (i2 << (this.zzi3 - 8)) ^ i;
        int i4 = i3 == 0 ? 1 : 5021 - i3;
        while (this.zzi8[i3] != -1 && (this.zzi7[i3] != i || this.zzi6[i3] != ((byte) i2))) {
            i3 -= i4;
            if (i3 < 0) {
                i3 += 5021;
            }
        }
        return i3;
    }

    private void zzuv() throws Exception {
        int iZzRI = this.zzi9.zzRI();
        if (iZzRI == -1) {
            iZzRI = 257;
        }
        zzU1(256);
        int i = 258;
        while (true) {
            int iZzRI2 = this.zzi9.zzRI();
            if (iZzRI2 == -1) {
                zzU1(iZzRI);
                zzU1(257);
                zzVC();
                return;
            }
            int iZzZR = zzZR(iZzRI, iZzRI2);
            int i2 = this.zzi3;
            if (i == (1 << i2)) {
                if (i2 < 12) {
                    this.zzi3 = i2 + 1;
                } else {
                    zzuw();
                    zzU1(256);
                    this.zzi3 = 9;
                    i = 258;
                }
            }
            int[] iArr = this.zzi8;
            int i3 = iArr[iZzZR];
            if (i3 != -1) {
                iZzRI = i3;
            } else {
                iArr[iZzZR] = i;
                this.zzi7[iZzZR] = iZzRI;
                this.zzi6[iZzZR] = (byte) iZzRI2;
                zzU1(iZzRI);
                iZzRI = iZzRI2;
                i++;
            }
        }
    }

    private void zzuw() {
        int i = 0;
        while (true) {
            int[] iArr = this.zzi8;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = -1;
            i++;
        }
    }

    private void zzux() {
        this.zzi5 = 0;
        this.zzi4 = 128;
        this.zzi3 = 9;
    }

    @Override // com.aspose.words.internal.zz3W, com.aspose.words.internal.zzZOP
    public final void write(byte[] bArr, int i, int i2) throws Exception {
        zz2N zz2n = this.zzi2;
        if (zz2n != null) {
            zzZOR zzzorZzU = zz2n.zzU(new zzZOR(bArr, i, i2));
            this.zzi9 = zzzorZzU;
            zzzorZzU.zzH(0L);
        } else {
            this.zzi9 = new zzZOR(bArr, i, i2);
        }
        zzux();
        zzuw();
        zzuv();
    }

    public zz3S(zzZOP zzzop, int i, int i2, int i3, int i4) {
        this(zzzop);
        if (i != 1) {
            this.zzi2 = new zz2N(i, i2, i3, i4);
        } else {
            this.zzi2 = null;
        }
    }
}
