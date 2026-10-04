package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ09 implements zzYUQ {
    private static final BigInteger zzWcr = BigInteger.valueOf(2147483647L);
    private static final BigInteger zzWkF = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: iv */
    private byte[] f51294iv;
    private final int zz4p;
    private int zzWcg;
    private boolean zzWci;
    private byte[] zzWcj;
    private byte[] zzWck;
    private int zzWcl;
    private byte[] zzWcm;
    private int zzWcn;
    private final zzYUR zzWcq;

    public zzZ09(zzYUR zzyur) {
        this.zzWcq = zzyur;
        int iZzXDn = zzyur.zzXDn();
        this.zz4p = iZzXDn;
        this.zzWck = new byte[iZzXDn];
    }

    private void zzXE9() {
        int i = this.zzWcg;
        if (i == 1 || i == 2) {
            if (this.zzWcl == 0) {
                zzYUR zzyur = this.zzWcq;
                byte[] bArr = this.f51294iv;
                zzyur.update(bArr, 0, bArr.length);
            } else {
                zzYUR zzyur2 = this.zzWcq;
                byte[] bArr2 = this.zzWck;
                zzyur2.update(bArr2, 0, bArr2.length);
            }
        }
        if (this.zzWcg == 2) {
            zzYUR zzyur3 = this.zzWcq;
            byte[] bArr3 = this.zzWcj;
            zzyur3.update(bArr3, 0, bArr3.length);
        }
        if (this.zzWci) {
            int i2 = (this.zzWcl / this.zz4p) + 1;
            byte[] bArr4 = this.zzWcm;
            int length = bArr4.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            throw new IllegalStateException("Unsupported size of counter i");
                        }
                        bArr4[0] = (byte) (i2 >>> 24);
                    }
                    bArr4[bArr4.length - 3] = (byte) (i2 >>> 16);
                }
                bArr4[bArr4.length - 2] = (byte) (i2 >>> 8);
            }
            bArr4[bArr4.length - 1] = (byte) i2;
            this.zzWcq.update(bArr4, 0, bArr4.length);
        }
        if (this.zzWcg == 0) {
            if (this.zzWcl == 0) {
                zzYUR zzyur4 = this.zzWcq;
                byte[] bArr5 = this.f51294iv;
                zzyur4.update(bArr5, 0, bArr5.length);
            } else {
                zzYUR zzyur5 = this.zzWcq;
                byte[] bArr6 = this.zzWck;
                zzyur5.update(bArr6, 0, bArr6.length);
            }
        }
        if (this.zzWcg != 2) {
            zzYUR zzyur6 = this.zzWcq;
            byte[] bArr7 = this.zzWcj;
            zzyur6.update(bArr7, 0, bArr7.length);
        }
        this.zzWcq.doFinal(this.zzWck, 0);
    }

    @Override // com.aspose.words.internal.zzYUZ
    public final int zzC(byte[] bArr, int i, int i2) throws zzYV0, IllegalArgumentException {
        int i3 = this.zzWcl;
        int i4 = i3 + i2;
        if (i4 < 0 || i4 >= this.zzWcn) {
            throw new zzYV0(C21023OooO0Oo.OooO0OO(" bytes", this.zzWcn, new StringBuilder("Current KDFCTR may only be used for ")));
        }
        if (i3 % this.zz4p == 0) {
            zzXE9();
        }
        int i5 = this.zzWcl;
        int i6 = this.zz4p;
        int i7 = i5 % i6;
        int iMin = Math.min(i6 - (i5 % i6), i2);
        System.arraycopy(this.zzWck, i7, bArr, i, iMin);
        this.zzWcl += iMin;
        int i8 = i2 - iMin;
        while (true) {
            i += iMin;
            if (i8 <= 0) {
                return i2;
            }
            zzXE9();
            iMin = Math.min(this.zz4p, i8);
            System.arraycopy(this.zzWck, 0, bArr, i, iMin);
            this.zzWcl += iMin;
            i8 -= iMin;
        }
    }

    @Override // com.aspose.words.internal.zzYUZ
    public final void zzZ(zzYUY zzyuy) {
        if (!(zzyuy instanceof zzYSA)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        zzYSA zzysa = (zzYSA) zzyuy;
        this.zzWcg = zzysa.zzXCa();
        this.zzWcq.zzZ(new zzYS7(zzysa.zzXCd()));
        this.zzWcj = zzysa.zzXC8();
        int iZzPC = zzysa.zzPC();
        this.zzWcm = new byte[iZzPC / 8];
        if (zzysa.zzXC9()) {
            BigInteger bigIntegerMultiply = zzWkF.pow(iZzPC).multiply(BigInteger.valueOf(this.zz4p));
            this.zzWcn = bigIntegerMultiply.compareTo(zzWcr) != 1 ? bigIntegerMultiply.intValue() : Integer.MAX_VALUE;
        } else {
            this.zzWcn = Integer.MAX_VALUE;
        }
        this.f51294iv = zzysa.getIV();
        this.zzWci = zzysa.zzXC9();
        this.zzWcl = 0;
    }
}
