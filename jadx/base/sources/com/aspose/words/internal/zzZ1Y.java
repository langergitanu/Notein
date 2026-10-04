package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ1Y implements zzYM2, zzYV1 {
    private zzYSI zzWji;
    private final zzZ27 zzWjp = new zzYZY();
    private SecureRandom zzWk5;

    @Override // com.aspose.words.internal.zzYV1
    public final BigInteger[] zzX6(byte[] bArr) {
        zzYSJ zzysjZzXCg = this.zzWji.zzXCg();
        BigInteger bigIntegerZzXIz = zzysjZzXCg.zzXIz();
        BigInteger bigIntegerZzZ = zzZ(bigIntegerZzXIz, bArr);
        BigInteger bigIntegerZzXCf = ((zzYSE) this.zzWji).zzXCf();
        this.zzWjp.zzY(bigIntegerZzXIz, this.zzWk5);
        zzYLV zzylv = new zzYLV();
        while (true) {
            BigInteger bigIntegerZzXG4 = this.zzWjp.zzXG4();
            BigInteger bigIntegerMod = zzylv.zzZ(zzysjZzXCg.zzXHu(), bigIntegerZzXG4).zzXze().zzXzn().toBigInteger().mod(bigIntegerZzXIz);
            BigInteger bigInteger = zzYM2.ZERO;
            if (!bigIntegerMod.equals(bigInteger)) {
                BigInteger bigIntegerMod2 = bigIntegerZzXG4.modInverse(bigIntegerZzXIz).multiply(bigIntegerZzZ.add(bigIntegerZzXCf.multiply(bigIntegerMod))).mod(bigIntegerZzXIz);
                if (!bigIntegerMod2.equals(bigInteger)) {
                    return new BigInteger[]{bigIntegerMod, bigIntegerMod2};
                }
            }
        }
    }

    @Override // com.aspose.words.internal.zzYV1
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        if (!z) {
            this.zzWji = (zzYSD) zzyv3;
            return;
        }
        if (zzyv3 instanceof zzYS3) {
            zzYS3 zzys3 = (zzYS3) zzyv3;
            this.zzWk5 = zzys3.zzXCJ();
            this.zzWji = (zzYSE) zzys3.zzXC6();
        } else {
            if (this.zzWjp instanceof zzYZY) {
                throw new IllegalArgumentException("No random provided where one required.");
            }
            this.zzWji = (zzYSE) zzyv3;
        }
    }

    @Override // com.aspose.words.internal.zzYV1
    public final boolean zzZ(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        zzYSJ zzysjZzXCg = this.zzWji.zzXCg();
        BigInteger bigIntegerZzXIz = zzysjZzXCg.zzXIz();
        BigInteger bigIntegerZzZ = zzZ(bigIntegerZzXIz, bArr);
        BigInteger bigInteger3 = zzYM2.ONE;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(bigIntegerZzXIz) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(bigIntegerZzXIz) >= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger2.modInverse(bigIntegerZzXIz);
        zzYLX zzylxZzXze = zzYM3.zzZ(zzysjZzXCg.zzXHu(), bigIntegerZzZ.multiply(bigIntegerModInverse).mod(bigIntegerZzXIz), ((zzYSD) this.zzWji).zzXCe(), bigInteger.multiply(bigIntegerModInverse).mod(bigIntegerZzXIz)).zzXze();
        if (zzylxZzXze.zzXzd()) {
            return false;
        }
        return zzylxZzXze.zzXzn().toBigInteger().mod(bigIntegerZzXIz).equals(bigInteger);
    }

    private static BigInteger zzZ(BigInteger bigInteger, byte[] bArr) {
        int iBitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        return iBitLength < length ? bigInteger2.shiftRight(length - iBitLength) : bigInteger2;
    }
}
