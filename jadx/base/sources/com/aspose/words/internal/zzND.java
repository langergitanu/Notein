package com.aspose.words.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes5.dex */
final class zzND {
    private zzO8 zzFs;
    private zzN6 zzFz;

    public zzND(zzN6 zzn6) {
        this(zzn6.zzKl(), zzn6);
    }

    private void zzLt() {
        this.zzFz.zz1("RLE compression is not supported.");
    }

    private long zzLu() throws Exception {
        return zzZPW.zzG(zzY(this.zzFs), zzY(this.zzFs));
    }

    private long[] zzXg(int i) throws Exception {
        long[] jArr = new long[i];
        long jZzC = 0;
        for (int i2 = 0; i2 < i; i2++) {
            jZzC = zzZPY.zzC(jZzC, zzLu());
            jArr[i2] = jZzC;
        }
        return jArr;
    }

    private long[] zzXh(int i) throws Exception {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = zzZPY.zzG(this.zzFs.zzXa(), this.zzFs.zzXa());
        }
        return jArr;
    }

    private long[] zzXi(int i) throws Exception {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = this.zzFs.zzN0();
        }
        return jArr;
    }

    private byte[] zzXj(int i) throws Exception {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = this.zzFs.zzX6();
        }
        return bArr;
    }

    private static int zzY(zzO8 zzo8) throws Exception {
        byte bZzX6 = zzo8.zzX6();
        int i = bZzX6 & 255;
        if ((bZzX6 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
            int iZzX6 = (zzo8.zzX6() & 255) + (i << 8);
            return iZzX6 > 16383 ? 16383 - iZzX6 : iZzX6;
        }
        int i2 = bZzX6 & Ascii.DEL;
        return i2 > 63 ? 63 - i2 : i2;
    }

    public final zzP8 zzLS() throws Exception {
        this.zzFs.zzXc();
        int iZzXc = this.zzFs.zzXc();
        if (iZzXc <= 1) {
            return new zzP8();
        }
        zzNO zzno = new zzNO();
        zzno.zzZ(this.zzFs);
        boolean zZzXu = zzno.zzXu(2);
        if (zzno.zzM3()) {
            zzLt();
            return new zzP8();
        }
        this.zzFs.zzXa();
        long[] jArrZzV = zzV(iZzXc, zzno.zzM2(), zzno.zzM1());
        byte[] bArrZzXj = zzXj(iZzXc);
        if (this.zzFs.zzq().getPosition() % 4 != 0) {
            this.zzFs.zzq().zzH((4 - (this.zzFs.zzq().getPosition() % 4)) + this.zzFs.zzq().getPosition());
        }
        zzP8 zzp8ZzZ = zz6E.zzZ(jArrZzV, bArrZzXj);
        zzp8ZzZ.zzY1(zZzXu ? 1 : 0);
        return zzp8ZzZ;
    }

    public final zzP8 zzLv() throws Exception {
        int iZzXc = this.zzFs.zzXc();
        zz0Q zz0q = new zz0Q(iZzXc);
        for (int i = 0; i < iZzXc; i++) {
            zz0q.add(this.zzFs.zzN0());
        }
        zzP8 zzp8 = new zzP8();
        zzZQG.zzZ(zzp8.zzO7(), zzP5.zzX(zz0q, false, true));
        return zzp8;
    }

    public final long[] zzV(int i, boolean z, boolean z2) throws Exception {
        return z ? zzXg(i) : z2 ? zzXh(i) : zzXi(i);
    }

    public zzND(zzO8 zzo8, zzN6 zzn6) {
        this.zzFs = zzo8;
        this.zzFz = zzn6;
    }
}
