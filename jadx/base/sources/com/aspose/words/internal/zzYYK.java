package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYYK implements zzYV1 {
    private final zzYYN zzW8d;
    private zzYSR zzWjo;
    private SecureRandom zzWk5;

    public zzYYK(zzYYN zzyyn) {
        this.zzW8d = zzyyn;
    }

    private static BigInteger zzW(BigInteger bigInteger, SecureRandom secureRandom) {
        return new BigInteger(7, secureRandom).add(BigInteger.valueOf(128L)).multiply(bigInteger);
    }

    @Override // com.aspose.words.internal.zzYV1
    public final BigInteger[] zzX6(byte[] bArr) {
        zzYSP zzyspZzXCo = this.zzWjo.zzXCo();
        BigInteger bigIntegerZzZ = zzZ(zzyspZzXCo.getQ(), bArr);
        if (this.zzW8d.zzXDE()) {
            this.zzW8d.zzZ(zzyspZzXCo.getQ(), ((zzYSO) this.zzWjo).getX(), bArr);
        } else {
            this.zzW8d.zzY(zzyspZzXCo.getQ(), this.zzWk5);
        }
        BigInteger bigIntegerZzXG4 = this.zzW8d.zzXG4();
        BigInteger bigIntegerMod = zzyspZzXCo.getG().modPow(bigIntegerZzXG4.add(zzW(zzyspZzXCo.getQ(), this.zzWk5)), zzyspZzXCo.getP()).mod(zzyspZzXCo.getQ());
        return new BigInteger[]{bigIntegerMod, bigIntegerZzXG4.modInverse(zzyspZzXCo.getQ()).multiply(bigIntegerZzZ.add(((zzYSO) this.zzWjo).getX().multiply(bigIntegerMod))).mod(zzyspZzXCo.getQ())};
    }

    @Override // com.aspose.words.internal.zzYV1
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        if (!z) {
            this.zzWjo = (zzYSN) zzyv3;
        } else {
            if (!(zzyv3 instanceof zzYS3)) {
                throw new IllegalArgumentException("No random provided where one required.");
            }
            zzYS3 zzys3 = (zzYS3) zzyv3;
            this.zzWk5 = zzys3.zzXCJ();
            this.zzWjo = (zzYSO) zzys3.zzXC6();
        }
    }

    @Override // com.aspose.words.internal.zzYV1
    public final boolean zzZ(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        zzYSP zzyspZzXCo = this.zzWjo.zzXCo();
        BigInteger bigIntegerZzZ = zzZ(zzyspZzXCo.getQ(), bArr);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        if (bigIntegerValueOf.compareTo(bigInteger) >= 0 || zzyspZzXCo.getQ().compareTo(bigInteger) <= 0 || bigIntegerValueOf.compareTo(bigInteger2) >= 0 || zzyspZzXCo.getQ().compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger2.modInverse(zzyspZzXCo.getQ());
        return zzyspZzXCo.getG().modPow(bigIntegerZzZ.multiply(bigIntegerModInverse).mod(zzyspZzXCo.getQ()), zzyspZzXCo.getP()).multiply(((zzYSN) this.zzWjo).getY().modPow(bigInteger.multiply(bigIntegerModInverse).mod(zzyspZzXCo.getQ()), zzyspZzXCo.getP())).mod(zzyspZzXCo.getP()).mod(zzyspZzXCo.getQ()).equals(bigInteger);
    }

    private static BigInteger zzZ(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int iBitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[iBitLength];
        System.arraycopy(bArr, 0, bArr2, 0, iBitLength);
        return new BigInteger(1, bArr2);
    }
}
