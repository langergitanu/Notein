package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ0B {
    private static final BigInteger zzWcr = BigInteger.valueOf(2147483647L);
    private static final BigInteger zzWkF = BigInteger.valueOf(2);
    private final int zz4p;
    private byte[] zzWck;
    private int zzWcl;
    private byte[] zzWcm;
    private int zzWcn;
    private byte[] zzWco;
    private byte[] zzWcp;
    private final zzYUR zzWcq;

    public zzZ0B(zzYUR zzyur) {
        this.zzWcq = zzyur;
        int iZzXDn = zzyur.zzXDn();
        this.zz4p = iZzXDn;
        this.zzWck = new byte[iZzXDn];
    }

    private void zzXE9() {
        int i = (this.zzWcl / this.zz4p) + 1;
        byte[] bArr = this.zzWcm;
        int length = bArr.length;
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    if (length != 4) {
                        throw new IllegalStateException("Unsupported size of counter i");
                    }
                    bArr[0] = (byte) (i >>> 24);
                }
                bArr[bArr.length - 3] = (byte) (i >>> 16);
            }
            bArr[bArr.length - 2] = (byte) (i >>> 8);
        }
        bArr[bArr.length - 1] = (byte) i;
        zzYUR zzyur = this.zzWcq;
        byte[] bArr2 = this.zzWcp;
        zzyur.update(bArr2, 0, bArr2.length);
        zzYUR zzyur2 = this.zzWcq;
        byte[] bArr3 = this.zzWcm;
        zzyur2.update(bArr3, 0, bArr3.length);
        zzYUR zzyur3 = this.zzWcq;
        byte[] bArr4 = this.zzWco;
        zzyur3.update(bArr4, 0, bArr4.length);
        this.zzWcq.doFinal(this.zzWck, 0);
    }

    public final int zzWP(byte[] bArr) throws zzYV0, IllegalArgumentException {
        int i = this.zzWcl;
        int i2 = i + 10;
        if (i2 < 0 || i2 >= this.zzWcn) {
            throw new zzYV0(C21023OooO0Oo.OooO0OO(" bytes", this.zzWcn, new StringBuilder("Current KDFCTR may only be used for ")));
        }
        if (i % this.zz4p == 0) {
            zzXE9();
        }
        int i3 = this.zzWcl;
        int i4 = this.zz4p;
        int i5 = i3 % i4;
        int iMin = Math.min(i4 - (i3 % i4), 10);
        System.arraycopy(this.zzWck, i5, bArr, 0, iMin);
        this.zzWcl += iMin;
        int i6 = 10 - iMin;
        while (i6 > 0) {
            zzXE9();
            int iMin2 = Math.min(this.zz4p, i6);
            System.arraycopy(this.zzWck, 0, bArr, iMin, iMin2);
            this.zzWcl += iMin2;
            i6 -= iMin2;
            iMin += iMin2;
        }
        return 10;
    }

    public final void zzZ(zzYUY zzyuy) {
        zzYSC zzysc = (zzYSC) zzyuy;
        this.zzWcq.zzZ(new zzYS7(zzysc.zzXCd()));
        this.zzWcp = zzysc.zzXCc();
        this.zzWco = zzysc.zzXCb();
        int iZzPC = zzysc.zzPC();
        this.zzWcm = new byte[iZzPC / 8];
        BigInteger bigIntegerMultiply = zzWkF.pow(iZzPC).multiply(BigInteger.valueOf(this.zz4p));
        this.zzWcn = bigIntegerMultiply.compareTo(zzWcr) == 1 ? Integer.MAX_VALUE : bigIntegerMultiply.intValue();
        this.zzWcl = 0;
    }
}
