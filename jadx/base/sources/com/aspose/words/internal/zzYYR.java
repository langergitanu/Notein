package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYYR implements zzYV1 {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private zzYSI zzWji;
    private SecureRandom zzWk5;

    private static BigInteger zzV(BigInteger bigInteger, SecureRandom secureRandom) {
        return new BigInteger(bigInteger.bitLength() - 1, secureRandom);
    }

    private static zzYM0 zzX(zzYM1 zzym1, byte[] bArr) {
        return zzym1.zzP(zzX(new BigInteger(1, zzYGU.zzWF(bArr)), zzym1.getFieldSize()));
    }

    @Override // com.aspose.words.internal.zzYV1
    public final BigInteger[] zzX6(byte[] bArr) {
        zzYSJ zzysjZzXCg = this.zzWji.zzXCg();
        zzYM1 zzym1ZzXHv = zzysjZzXCg.zzXHv();
        zzYM0 zzym0ZzX = zzX(zzym1ZzXHv, bArr);
        if (zzym0ZzX.isZero()) {
            zzym0ZzX = zzym1ZzXHv.zzP(ONE);
        }
        BigInteger bigIntegerZzXIz = zzysjZzXCg.zzXIz();
        BigInteger bigIntegerZzXCf = ((zzYSE) this.zzWji).zzXCf();
        zzYLV zzylv = new zzYLV();
        while (true) {
            BigInteger bigIntegerZzV = zzV(bigIntegerZzXIz, this.zzWk5);
            zzYM0 zzym0ZzXzn = zzylv.zzZ(zzysjZzXCg.zzXHu(), bigIntegerZzV).zzXze().zzXzn();
            if (!zzym0ZzXzn.isZero()) {
                BigInteger bigIntegerZzZ = zzZ(bigIntegerZzXIz, zzym0ZzX.zzU(zzym0ZzXzn));
                if (bigIntegerZzZ.signum() != 0) {
                    BigInteger bigIntegerMod = bigIntegerZzZ.multiply(bigIntegerZzXCf).add(bigIntegerZzV).mod(bigIntegerZzXIz);
                    if (bigIntegerMod.signum() != 0) {
                        return new BigInteger[]{bigIntegerZzZ, bigIntegerMod};
                    }
                } else {
                    continue;
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
                throw new IllegalArgumentException("No SecureRandom provided when one required");
            }
            zzYS3 zzys3 = (zzYS3) zzyv3;
            this.zzWk5 = zzys3.zzXCJ();
            this.zzWji = (zzYSE) zzys3.zzXC6();
        }
    }

    private static BigInteger zzX(BigInteger bigInteger, int i) {
        return bigInteger.bitLength() > i ? bigInteger.mod(ONE.shiftLeft(i)) : bigInteger;
    }

    @Override // com.aspose.words.internal.zzYV1
    public final boolean zzZ(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.signum() > 0 && bigInteger2.signum() > 0) {
            zzYSJ zzysjZzXCg = this.zzWji.zzXCg();
            BigInteger bigIntegerZzXIz = zzysjZzXCg.zzXIz();
            if (bigInteger.compareTo(bigIntegerZzXIz) < 0 && bigInteger2.compareTo(bigIntegerZzXIz) < 0) {
                zzYM1 zzym1ZzXHv = zzysjZzXCg.zzXHv();
                zzYM0 zzym0ZzX = zzX(zzym1ZzXHv, bArr);
                if (zzym0ZzX.isZero()) {
                    zzym0ZzX = zzym1ZzXHv.zzP(ONE);
                }
                zzYLX zzylxZzXze = zzYM3.zzZ(zzysjZzXCg.zzXHu(), bigInteger2, ((zzYSD) this.zzWji).zzXCe(), bigInteger).zzXze();
                if (!zzylxZzXze.zzXzd() && zzZ(bigIntegerZzXIz, zzym0ZzX.zzU(zzylxZzXze.zzXzn())).compareTo(bigInteger) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private static BigInteger zzZ(BigInteger bigInteger, zzYM0 zzym0) {
        return zzX(zzym0.toBigInteger(), bigInteger.bitLength() - 1);
    }
}
