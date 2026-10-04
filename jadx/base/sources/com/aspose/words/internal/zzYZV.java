package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYZV {
    private zzYS1 zzWbx;
    private boolean zzWkw;

    public final BigInteger zzT(BigInteger bigInteger) {
        zzYS1 zzys1 = this.zzWbx;
        if (!(zzys1 instanceof zzYS0)) {
            return bigInteger.modPow(zzys1.getExponent(), this.zzWbx.getModulus());
        }
        zzYS0 zzys0 = (zzYS0) zzys1;
        BigInteger p = zzys0.getP();
        BigInteger q = zzys0.getQ();
        BigInteger bigIntegerZzXGu = zzys0.zzXGu();
        BigInteger bigIntegerZzXGt = zzys0.zzXGt();
        BigInteger bigIntegerZzXGs = zzys0.zzXGs();
        BigInteger bigIntegerModPow = bigInteger.remainder(p).modPow(bigIntegerZzXGu, p);
        BigInteger bigIntegerModPow2 = bigInteger.remainder(q).modPow(bigIntegerZzXGt, q);
        return bigIntegerModPow.subtract(bigIntegerModPow2).multiply(bigIntegerZzXGs).mod(p).multiply(q).add(bigIntegerModPow2);
    }

    public final byte[] zzU(BigInteger bigInteger) {
        byte[] bArr;
        byte[] byteArray = bigInteger.toByteArray();
        if (!this.zzWkw) {
            if (byteArray[0] == 0) {
                int length = byteArray.length - 1;
                bArr = new byte[length];
                System.arraycopy(byteArray, 1, bArr, 0, length);
            } else {
                int length2 = byteArray.length;
                bArr = new byte[length2];
                System.arraycopy(byteArray, 0, bArr, 0, length2);
            }
            zzYGU.fill(byteArray, (byte) 0);
            return bArr;
        }
        if (byteArray[0] == 0 && byteArray.length > zzXDX()) {
            int length3 = byteArray.length - 1;
            byte[] bArr2 = new byte[length3];
            System.arraycopy(byteArray, 1, bArr2, 0, length3);
            return bArr2;
        }
        if (byteArray.length >= zzXDX()) {
            return byteArray;
        }
        int iZzXDX = zzXDX();
        byte[] bArr3 = new byte[iZzXDX];
        System.arraycopy(byteArray, 0, bArr3, iZzXDX - byteArray.length, byteArray.length);
        return bArr3;
    }

    public final int zzXDX() {
        return this.zzWkw ? (this.zzWbx.getModulus().bitLength() + 7) / 8 : ((r0 + 7) / 8) - 1;
    }

    public final int zzXDY() {
        return this.zzWkw ? ((r0 + 7) / 8) - 1 : (this.zzWbx.getModulus().bitLength() + 7) / 8;
    }

    public final void zzZ(boolean z, zzYV3 zzyv3) {
        if (zzyv3 instanceof zzYS3) {
            this.zzWbx = (zzYS1) ((zzYS3) zzyv3).zzXC6();
        } else {
            this.zzWbx = (zzYS1) zzyv3;
        }
        this.zzWkw = z;
    }

    public final BigInteger zzx(byte[] bArr, int i, int i2) {
        if (i2 > zzXDY() + 1) {
            throw new zzYV0("input too large for RSA cipher.");
        }
        if (i2 == zzXDY() + 1 && !this.zzWkw) {
            throw new zzYV0("input too large for RSA cipher.");
        }
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(this.zzWbx.getModulus()) < 0) {
            return bigInteger;
        }
        throw new zzYV0("input too large for RSA cipher.");
    }
}
