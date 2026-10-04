package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYZX implements zzYVC {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private zzYS1 zzWbx;
    private zzYZV zzWby = new zzYZV();
    private SecureRandom zzWk5;

    @Override // com.aspose.words.internal.zzYVC
    public final int zzXDX() {
        return this.zzWby.zzXDX();
    }

    @Override // com.aspose.words.internal.zzYVC
    public final int zzXDY() {
        return this.zzWby.zzXDY();
    }

    @Override // com.aspose.words.internal.zzYVC
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        this.zzWby.zzZ(z, zzyv3);
        if (zzyv3 instanceof zzYS3) {
            zzYS3 zzys3 = (zzYS3) zzyv3;
            this.zzWbx = (zzYS1) zzys3.zzXC6();
            this.zzWk5 = zzys3.zzXCJ();
        } else {
            zzYS1 zzys1 = (zzYS1) zzyv3;
            this.zzWbx = zzys1;
            if (zzys1.isPrivate()) {
                throw new IllegalArgumentException("No random provided where one required.");
            }
        }
    }

    @Override // com.aspose.words.internal.zzYVC
    public final byte[] zzy(byte[] bArr, int i, int i2) {
        BigInteger bigIntegerZzT;
        zzYS0 zzys0;
        BigInteger publicExponent;
        if (this.zzWbx == null) {
            throw new IllegalStateException("RSA engine not initialised");
        }
        BigInteger bigIntegerZzx = this.zzWby.zzx(bArr, i, i2);
        if (bigIntegerZzx.compareTo(this.zzWbx.getModulus()) >= 0) {
            throw new zzYV0("input to RSA engine out of range");
        }
        zzYS1 zzys1 = this.zzWbx;
        if (!(zzys1 instanceof zzYS0) || (publicExponent = (zzys0 = (zzYS0) zzys1).getPublicExponent()) == null) {
            bigIntegerZzT = this.zzWby.zzT(bigIntegerZzx);
        } else {
            BigInteger modulus = zzys0.getModulus();
            BigInteger bigInteger = ONE;
            BigInteger bigIntegerZzX = zzYGT.zzX(bigInteger, modulus.subtract(bigInteger), this.zzWk5);
            bigIntegerZzT = this.zzWby.zzT(bigIntegerZzX.modPow(publicExponent, modulus).multiply(bigIntegerZzx).mod(modulus)).multiply(bigIntegerZzX.modInverse(modulus)).mod(modulus);
            if (!bigIntegerZzx.equals(bigIntegerZzT.modPow(publicExponent, modulus))) {
                throw new IllegalStateException("RSA engine faulty decryption/signing detected");
            }
        }
        return this.zzWby.zzU(bigIntegerZzT);
    }
}
