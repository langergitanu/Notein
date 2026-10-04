package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYY3 implements zzYVC {
    private int zzW74;
    private zzYY2 zzW75;
    private SecureRandom zzWk5;
    private boolean zzWkw;
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger zzWkF = BigInteger.valueOf(2);

    @Override // com.aspose.words.internal.zzYVC
    public final int zzXDX() {
        return this.zzWkw ? ((this.zzW74 + 7) / 8) * 2 : (this.zzW74 - 1) / 8;
    }

    @Override // com.aspose.words.internal.zzYVC
    public final int zzXDY() {
        return this.zzWkw ? (this.zzW74 - 1) / 8 : ((this.zzW74 + 7) / 8) * 2;
    }

    @Override // com.aspose.words.internal.zzYVC
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        if (zzyv3 instanceof zzYS3) {
            zzYS3 zzys3 = (zzYS3) zzyv3;
            this.zzW75 = (zzYY2) zzys3.zzXC6();
            this.zzWk5 = zzys3.zzXCJ();
        } else {
            zzYY2 zzyy2 = (zzYY2) zzyv3;
            this.zzW75 = zzyy2;
            if (!zzyy2.isPrivate()) {
                throw new IllegalArgumentException("No random provided where one required.");
            }
        }
        this.zzWkw = z;
        this.zzW74 = this.zzW75.zzXDq().getP().bitLength();
        if (z) {
            if (!(this.zzW75 instanceof zzYXZ)) {
                throw new IllegalArgumentException("ElGamalPublicKeyParameters are required for encryption.");
            }
        } else if (!(this.zzW75 instanceof zzYY0)) {
            throw new IllegalArgumentException("ElGamalPrivateKeyParameters are required for decryption.");
        }
    }

    @Override // com.aspose.words.internal.zzYVC
    public final byte[] zzy(byte[] bArr, int i, int i2) {
        if (this.zzW75 == null) {
            throw new IllegalStateException("ElGamal engine not initialised");
        }
        if (i2 > (this.zzWkw ? (this.zzW74 + 6) / 8 : zzXDY())) {
            throw new zzYV0("input too large for ElGamal cipher.\n");
        }
        BigInteger p = this.zzW75.zzXDq().getP();
        if (this.zzW75 instanceof zzYY0) {
            int i3 = i2 / 2;
            byte[] bArr2 = new byte[i3];
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, i3);
            System.arraycopy(bArr, i + i3, bArr3, 0, i3);
            return zzYGT.zzv(new BigInteger(1, bArr2).modPow(p.subtract(ONE).subtract(((zzYY0) this.zzW75).getX()), p).multiply(new BigInteger(1, bArr3)).mod(p));
        }
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr4 = new byte[i2];
            System.arraycopy(bArr, i, bArr4, 0, i2);
            bArr = bArr4;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(p) >= 0) {
            throw new zzYV0("input too large for ElGamal cipher.\n");
        }
        zzYXZ zzyxz = (zzYXZ) this.zzW75;
        int iBitLength = p.bitLength();
        BigInteger bigInteger2 = new BigInteger(iBitLength, this.zzWk5);
        while (true) {
            if (!bigInteger2.equals(ZERO) && bigInteger2.compareTo(p.subtract(zzWkF)) <= 0) {
                break;
            }
            bigInteger2 = new BigInteger(iBitLength, this.zzWk5);
        }
        BigInteger bigIntegerModPow = this.zzW75.zzXDq().getG().modPow(bigInteger2, p);
        BigInteger bigIntegerMod = bigInteger.multiply(zzyxz.getY().modPow(bigInteger2, p)).mod(p);
        byte[] byteArray = bigIntegerModPow.toByteArray();
        byte[] byteArray2 = bigIntegerMod.toByteArray();
        int iZzXDX = zzXDX();
        byte[] bArr5 = new byte[iZzXDX];
        int i4 = iZzXDX / 2;
        if (byteArray.length > i4) {
            System.arraycopy(byteArray, 1, bArr5, i4 - (byteArray.length - 1), byteArray.length - 1);
        } else {
            System.arraycopy(byteArray, 0, bArr5, i4 - byteArray.length, byteArray.length);
        }
        if (byteArray2.length > i4) {
            System.arraycopy(byteArray2, 1, bArr5, iZzXDX - (byteArray2.length - 1), byteArray2.length - 1);
            return bArr5;
        }
        System.arraycopy(byteArray2, 0, bArr5, iZzXDX - byteArray2.length, byteArray2.length);
        return bArr5;
    }
}
