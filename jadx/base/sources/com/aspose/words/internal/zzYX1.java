package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYX1 implements zzYYN {
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private final zzYTV zzW5K;
    private final byte[] zzW62;
    private final byte[] zzW66;
    private BigInteger zzWow;

    public zzYX1(zzYUX zzyux) {
        zzYTV zzytv = new zzYTV(zzyux);
        this.zzW5K = zzytv;
        this.zzW62 = new byte[zzytv.zzXDn()];
        this.zzW66 = new byte[zzytv.zzXDn()];
    }

    private BigInteger zzWq(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return bArr.length * 8 > this.zzWow.bitLength() ? bigInteger.shiftRight((bArr.length * 8) - this.zzWow.bitLength()) : bigInteger;
    }

    @Override // com.aspose.words.internal.zzYYN
    public final boolean zzXDE() {
        return true;
    }

    @Override // com.aspose.words.internal.zzYYN
    public final BigInteger zzXG4() {
        int iBitLength = (this.zzWow.bitLength() + 7) / 8;
        byte[] bArr = new byte[iBitLength];
        while (true) {
            int i = 0;
            while (i < iBitLength) {
                zzYTV zzytv = this.zzW5K;
                byte[] bArr2 = this.zzW62;
                zzytv.update(bArr2, 0, bArr2.length);
                this.zzW5K.doFinal(this.zzW62, 0);
                int iMin = Math.min(iBitLength - i, this.zzW62.length);
                System.arraycopy(this.zzW62, 0, bArr, i, iMin);
                i += iMin;
            }
            BigInteger bigIntegerZzWq = zzWq(bArr);
            if (bigIntegerZzWq.compareTo(ZERO) > 0 && bigIntegerZzWq.compareTo(this.zzWow) < 0) {
                return bigIntegerZzWq;
            }
            zzYTV zzytv2 = this.zzW5K;
            byte[] bArr3 = this.zzW62;
            zzytv2.update(bArr3, 0, bArr3.length);
            this.zzW5K.update((byte) 0);
            this.zzW5K.doFinal(this.zzW66, 0);
            this.zzW5K.zzZ(new zzYS7(this.zzW66));
            zzYTV zzytv3 = this.zzW5K;
            byte[] bArr4 = this.zzW62;
            zzytv3.update(bArr4, 0, bArr4.length);
            this.zzW5K.doFinal(this.zzW62, 0);
        }
    }

    @Override // com.aspose.words.internal.zzYYN
    public final void zzY(BigInteger bigInteger, SecureRandom secureRandom) {
        throw new IllegalStateException("Operation not supported");
    }

    @Override // com.aspose.words.internal.zzYYN
    public final void zzZ(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.zzWow = bigInteger;
        zzYGU.fill(this.zzW62, (byte) 1);
        zzYGU.fill(this.zzW66, (byte) 0);
        int iBitLength = (bigInteger.bitLength() + 7) / 8;
        byte[] bArr2 = new byte[iBitLength];
        byte[] bArrZzv = zzYGT.zzv(bigInteger2);
        System.arraycopy(bArrZzv, 0, bArr2, iBitLength - bArrZzv.length, bArrZzv.length);
        int iBitLength2 = (bigInteger.bitLength() + 7) / 8;
        byte[] bArr3 = new byte[iBitLength2];
        BigInteger bigIntegerZzWq = zzWq(bArr);
        if (bigIntegerZzWq.compareTo(bigInteger) >= 0) {
            bigIntegerZzWq = bigIntegerZzWq.subtract(bigInteger);
        }
        byte[] bArrZzv2 = zzYGT.zzv(bigIntegerZzWq);
        System.arraycopy(bArrZzv2, 0, bArr3, iBitLength2 - bArrZzv2.length, bArrZzv2.length);
        this.zzW5K.zzZ(new zzYS7(this.zzW66));
        zzYTV zzytv = this.zzW5K;
        byte[] bArr4 = this.zzW62;
        zzytv.update(bArr4, 0, bArr4.length);
        this.zzW5K.update((byte) 0);
        this.zzW5K.update(bArr2, 0, iBitLength);
        this.zzW5K.update(bArr3, 0, iBitLength2);
        this.zzW5K.doFinal(this.zzW66, 0);
        this.zzW5K.zzZ(new zzYS7(this.zzW66));
        zzYTV zzytv2 = this.zzW5K;
        byte[] bArr5 = this.zzW62;
        zzytv2.update(bArr5, 0, bArr5.length);
        this.zzW5K.doFinal(this.zzW62, 0);
        zzYTV zzytv3 = this.zzW5K;
        byte[] bArr6 = this.zzW62;
        zzytv3.update(bArr6, 0, bArr6.length);
        this.zzW5K.update((byte) 1);
        this.zzW5K.update(bArr2, 0, iBitLength);
        this.zzW5K.update(bArr3, 0, iBitLength2);
        this.zzW5K.doFinal(this.zzW66, 0);
        this.zzW5K.zzZ(new zzYS7(this.zzW66));
        zzYTV zzytv4 = this.zzW5K;
        byte[] bArr7 = this.zzW62;
        zzytv4.update(bArr7, 0, bArr7.length);
        this.zzW5K.doFinal(this.zzW62, 0);
    }
}
