package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYXF implements zzYV1 {
    zzYXJ zzW5Y;
    SecureRandom zzWk5;

    @Override // com.aspose.words.internal.zzYV1
    public final BigInteger[] zzX6(byte[] bArr) {
        BigInteger bigInteger;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr2[i] = bArr[(length - 1) - i];
        }
        BigInteger bigInteger2 = new BigInteger(1, bArr2);
        zzYXI zzyxiZzXDl = this.zzW5Y.zzXDl();
        do {
            bigInteger = new BigInteger(zzyxiZzXDl.getQ().bitLength(), this.zzWk5);
        } while (bigInteger.compareTo(zzyxiZzXDl.getQ()) >= 0);
        BigInteger bigIntegerMod = zzyxiZzXDl.getA().modPow(bigInteger, zzyxiZzXDl.getP()).mod(zzyxiZzXDl.getQ());
        return new BigInteger[]{bigIntegerMod, bigInteger.multiply(bigInteger2).add(((zzYXH) this.zzW5Y).getX().multiply(bigIntegerMod)).mod(zzyxiZzXDl.getQ())};
    }

    @Override // com.aspose.words.internal.zzYV1
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        if (!z) {
            this.zzW5Y = (zzYXG) zzyv3;
        } else {
            if (!(zzyv3 instanceof zzYS3)) {
                throw new IllegalArgumentException("No random provided where one required.");
            }
            zzYS3 zzys3 = (zzYS3) zzyv3;
            this.zzWk5 = zzys3.zzXCJ();
            this.zzW5Y = (zzYXH) zzys3.zzXC6();
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
        zzYXI zzyxiZzXDl = this.zzW5Y.zzXDl();
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        if (bigIntegerValueOf.compareTo(bigInteger) >= 0 || zzyxiZzXDl.getQ().compareTo(bigInteger) <= 0 || bigIntegerValueOf.compareTo(bigInteger2) >= 0 || zzyxiZzXDl.getQ().compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger bigIntegerModPow = bigInteger3.modPow(zzyxiZzXDl.getQ().subtract(new BigInteger("2")), zzyxiZzXDl.getQ());
        return zzyxiZzXDl.getA().modPow(bigInteger2.multiply(bigIntegerModPow).mod(zzyxiZzXDl.getQ()), zzyxiZzXDl.getP()).multiply(((zzYXG) this.zzW5Y).getY().modPow(zzyxiZzXDl.getQ().subtract(bigInteger).multiply(bigIntegerModPow).mod(zzyxiZzXDl.getQ()), zzyxiZzXDl.getP())).mod(zzyxiZzXDl.getP()).mod(zzyxiZzXDl.getQ()).equals(bigInteger);
    }
}
