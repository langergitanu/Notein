package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz2N {
    private int zzgv;
    private byte[] zzgw;
    private byte[] zzgx;
    private int zzgy;
    private int zzgz;
    private int zzii;
    private int zzik;
    private int zzil;

    public zz2N(int i, int i2, int i3, int i4) {
        zzZG(i2, i4);
        this.zzik = i2;
        this.zzii = i3;
        this.zzgv = i4;
        this.zzil = i;
    }

    private static int zzG(int i, int i2, int i3) {
        int i4 = (i + i2) - i3;
        int iAbs = Math.abs(i4 - i);
        int iAbs2 = Math.abs(i4 - i2);
        int iAbs3 = Math.abs(i4 - i3);
        return (iAbs > iAbs2 || iAbs > iAbs3) ? iAbs2 <= iAbs3 ? i2 : i3 : i;
    }

    private byte zzH(int i, int i2, int i3) {
        if (i == 1) {
            return zzZI(i2, i3);
        }
        switch (i) {
            case 10:
                return (byte) i2;
            case 11:
                return zzZK(i2, i3);
            case 12:
                return zzZJ(i2, i3);
            case 13:
                return zzZI(i2, i3);
            case 14:
                return zzZH(i2, i3);
            default:
                throw new IllegalStateException("Please report exception.");
        }
    }

    private static byte zzTL(int i) {
        switch (i) {
            case 10:
                return (byte) 0;
            case 11:
                return (byte) 1;
            case 12:
                return (byte) 2;
            case 13:
                return (byte) 3;
            case 14:
                return (byte) 4;
            default:
                throw new IllegalArgumentException("Unsupported predictor type");
        }
    }

    private static void zzZG(int i, int i2) {
        if (i > 4 || i <= 0) {
            throw new IllegalArgumentException("Invalid color.");
        }
        if (i2 != 1 && i2 != 2 && i2 != 4 && i2 != 8) {
            throw new IllegalArgumentException("Invalid bpp.");
        }
    }

    private byte zzZH(int i, int i2) {
        int i3 = this.zzgy;
        return (byte) ((i - zzG(i2 - i3 >= 0 ? this.zzgx[i2 - i3] & 255 : 0, this.zzgw[i2] & 255, i2 - i3 >= 0 ? this.zzgw[i2 - i3] & 255 : 0)) % 256);
    }

    private byte zzZI(int i, int i2) {
        return (byte) (Math.floor(i - (((i2 - this.zzgy >= 0 ? this.zzgx[i2 - r0] & 255 : 0) + (this.zzgw[i2] & 255)) / 2)) % 256.0d);
    }

    private byte zzZJ(int i, int i2) {
        return (byte) ((i - (this.zzgw[i2] & 255)) % 256);
    }

    private byte zzZK(int i, int i2) {
        int i3 = this.zzgy;
        return (byte) ((i - (i2 - i3 >= 0 ? this.zzgx[i2 - i3] & 255 : 0)) % 256);
    }

    private int zztq() {
        int i;
        byte[] bArr = new byte[this.zzgz];
        int i2 = 1;
        double d = Double.POSITIVE_INFINITY;
        for (int i3 = 10; i3 != 15; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < this.zzgz; i5++) {
                bArr[i5] = this.zzgx[i5];
            }
            for (int i6 = 0; i6 < this.zzgz; i6++) {
                bArr[i6] = zzH(i3, bArr[i6] & 255, i6);
            }
            double d2 = 0.0d;
            while (true) {
                i = this.zzgz;
                if (i4 >= i) {
                    break;
                }
                d2 += (double) (bArr[i4] & 255);
                i4++;
            }
            double d3 = d2 / ((double) i);
            if (d3 < d) {
                i2 = i3;
                d = d3;
            }
        }
        return i2;
    }

    public final zzZOR zzU(zzZOR zzzor) throws Exception {
        int iZzRI;
        zzZOR zzzor2 = new zzZOR((int) (zzZKQ.zzZa(zzzor.getLength() / ((double) (this.zzik * this.zzii))) + zzzor.getLength()));
        zzzor.zzH(0L);
        zzzor2.zzH(0L);
        int iZzZa = (int) (zzZKQ.zzZa(((double) this.zzgv) / 8.0d) * ((double) this.zzik));
        this.zzgy = iZzZa;
        int i = iZzZa * this.zzii;
        this.zzgz = i;
        this.zzgx = new byte[i];
        this.zzgw = new byte[i];
        for (int i2 = 0; i2 < this.zzgy; i2++) {
            this.zzgw[i2] = 0;
        }
        byte[] bArr = new byte[this.zzgz];
        while (zzzor.getPosition() < zzzor.getLength()) {
            for (int i3 = 0; i3 < this.zzgz && (iZzRI = zzzor.zzRI()) != -1; i3++) {
                this.zzgx[i3] = (byte) iZzRI;
            }
            int iZztq = this.zzil;
            if (iZztq == 15) {
                iZztq = zztq();
            }
            for (int i4 = 0; i4 < this.zzgz; i4++) {
                bArr[i4] = zzH(iZztq, this.zzgx[i4] & 255, i4);
            }
            for (int i5 = 0; i5 < this.zzgz; i5++) {
                this.zzgw[i5] = this.zzgx[i5];
            }
            zzzor2.writeByte(zzTL(iZztq));
            zzzor2.write(bArr, 0, this.zzgz);
        }
        return zzzor2;
    }
}
