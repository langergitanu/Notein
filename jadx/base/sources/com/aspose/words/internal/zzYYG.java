package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYYG implements zzYV1 {
    zzYSI zzWji;
    SecureRandom zzWk5;

    @Override // com.aspose.words.internal.zzYV1
    public final BigInteger[] zzX6(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr2[i] = bArr[(length - 1) - i];
        }
        BigInteger bigInteger = new BigInteger(1, bArr2);
        zzYSJ zzysjZzXCg = this.zzWji.zzXCg();
        BigInteger bigIntegerZzXIz = zzysjZzXCg.zzXIz();
        BigInteger bigIntegerZzXCf = ((zzYSE) this.zzWji).zzXCf();
        zzYLV zzylv = new zzYLV();
        while (true) {
            BigInteger bigInteger2 = new BigInteger(bigIntegerZzXIz.bitLength(), this.zzWk5);
            BigInteger bigInteger3 = zzYM2.ZERO;
            if (!bigInteger2.equals(bigInteger3)) {
                BigInteger bigIntegerMod = zzylv.zzZ(zzysjZzXCg.zzXHu(), bigInteger2).zzXze().zzXzn().toBigInteger().mod(bigIntegerZzXIz);
                if (bigIntegerMod.equals(bigInteger3)) {
                    continue;
                } else {
                    BigInteger bigIntegerMod2 = bigInteger2.multiply(bigInteger).add(bigIntegerZzXCf.multiply(bigIntegerMod)).mod(bigIntegerZzXIz);
                    if (!bigIntegerMod2.equals(bigInteger3)) {
                        return new BigInteger[]{bigIntegerMod, bigIntegerMod2};
                    }
                }
            }
        }
    }

    @Override // com.aspose.words.internal.zzYV1
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        if (!z) {
            this.zzWji = (zzYSD) zzyv3;
        } else {
            if (!(zzyv3 instanceof zzYS3)) {
                throw new IllegalArgumentException("No random provided where one required.");
            }
            zzYS3 zzys3 = (zzYS3) zzyv3;
            this.zzWk5 = zzys3.zzXCJ();
            this.zzWji = (zzYSE) zzys3.zzXC6();
        }
    }

    @Override // com.aspose.words.internal.zzYV1
    public final boolean zzZ(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr2[i] = bArr[(length - 1) - i];
        }
        BigInteger bigInteger3 = new BigInteger(1, bArr2);
        BigInteger bigIntegerZzXIz = this.zzWji.zzXCg().zzXIz();
        BigInteger bigInteger4 = zzYM2.ONE;
        if (bigInteger.compareTo(bigInteger4) < 0 || bigInteger.compareTo(bigIntegerZzXIz) >= 0 || bigInteger2.compareTo(bigInteger4) < 0 || bigInteger2.compareTo(bigIntegerZzXIz) >= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger3.modInverse(bigIntegerZzXIz);
        zzYLX zzylxZzXze = zzYM3.zzZ(this.zzWji.zzXCg().zzXHu(), bigInteger2.multiply(bigIntegerModInverse).mod(bigIntegerZzXIz), ((zzYSD) this.zzWji).zzXCe(), bigIntegerZzXIz.subtract(bigInteger).multiply(bigIntegerModInverse).mod(bigIntegerZzXIz)).zzXze();
        if (zzylxZzXze.zzXzd()) {
            return false;
        }
        return zzylxZzXze.zzXzn().toBigInteger().mod(bigIntegerZzXIz).equals(bigInteger);
    }
}
