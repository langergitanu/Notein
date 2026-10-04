package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.PatternStyle;
import com.aspose.words.internal.zzZ0P;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYYQ implements zzYUC {
    private static final byte[] zzW8h = {74, -35, -94, PatternStyle.Weave, 121, -24, 33, 5};

    /* JADX INFO: renamed from: iv */
    private byte[] f51280iv;
    private boolean zzW8i;
    private zzYS4 zzW8j;
    private zzYS8 zzW8k;
    private zzYTR zzW8l;
    zzYUX zzW8g = (zzYUX) zzYXY.zzS(zzZ0P.zzZ.zzWdL).zzXFZ();
    byte[] zzWqQ = new byte[20];

    private static byte[] zzWF(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        while (i < bArr.length) {
            int i2 = i + 1;
            bArr2[i] = bArr[bArr.length - i2];
            i = i2;
        }
        return bArr2;
    }

    private byte[] zzWG(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.zzW8g.update(bArr, 0, bArr.length);
        this.zzW8g.doFinal(this.zzWqQ, 0);
        System.arraycopy(this.zzWqQ, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean zzz(byte[] bArr, byte[] bArr2) {
        return zzYGU.zzo(zzWG(bArr), bArr2);
    }

    @Override // com.aspose.words.internal.zzYUC
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        SecureRandom secureRandom;
        this.zzW8i = z;
        this.zzW8l = new zzYTR((zzYV8) zzYXY.zzS(zzZ0I.zzWjd).zzXFZ());
        if (zzyv3 instanceof zzYS3) {
            zzYS3 zzys3 = (zzYS3) zzyv3;
            zzYV3 zzyv3ZzXC6 = zzys3.zzXC6();
            SecureRandom secureRandomZzXCJ = zzys3.zzXCJ();
            zzyv3 = zzyv3ZzXC6;
            secureRandom = secureRandomZzXCJ;
        } else {
            secureRandom = null;
        }
        if (zzyv3 instanceof zzYS8) {
            this.zzW8k = (zzYS8) zzyv3;
            if (this.zzW8i) {
                if (secureRandom == null) {
                    throw new IllegalArgumentException("No SecureRandom provided when one required");
                }
                byte[] bArr = new byte[8];
                this.f51280iv = bArr;
                secureRandom.nextBytes(bArr);
                this.zzW8j = new zzYS4(this.zzW8k, this.f51280iv);
                return;
            }
            return;
        }
        if (zzyv3 instanceof zzYS4) {
            zzYS4 zzys4 = (zzYS4) zzyv3;
            this.zzW8j = zzys4;
            this.f51280iv = zzys4.getIV();
            this.zzW8k = (zzYS8) this.zzW8j.zzXC6();
            if (!this.zzW8i) {
                throw new IllegalArgumentException("You should not supply an IV for unwrapping");
            }
            byte[] bArr2 = this.f51280iv;
            if (bArr2 == null || bArr2.length != 8) {
                throw new IllegalArgumentException("IV is not 8 octets");
            }
        }
    }

    @Override // com.aspose.words.internal.zzYUC
    public final byte[] zzu(byte[] bArr, int i, int i2) throws zzYUT {
        if (this.zzW8i) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new zzYUT("Null pointer as ciphertext");
        }
        int blockSize = this.zzW8l.getBlockSize();
        if (i2 % blockSize != 0) {
            throw new zzYUT(C21532OooOOo.OooO0OO(blockSize, "Ciphertext not multiple of "));
        }
        if (i2 != 40) {
            throw new zzYUT("Ciphertext must be 40 bytes");
        }
        this.zzW8l.zzZ(false, new zzYS4(this.zzW8k, zzW8h));
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 != i2; i3 += blockSize) {
            this.zzW8l.zzY(bArr, i3, bArr2, i3);
        }
        byte[] bArrZzWF = zzWF(bArr2);
        byte[] bArr3 = new byte[8];
        this.f51280iv = bArr3;
        int length = bArrZzWF.length;
        int i4 = length - 8;
        byte[] bArr4 = new byte[i4];
        System.arraycopy(bArrZzWF, 0, bArr3, 0, 8);
        System.arraycopy(bArrZzWF, 8, bArr4, 0, bArrZzWF.length - 8);
        zzYS4 zzys4 = new zzYS4(this.zzW8k, this.f51280iv);
        this.zzW8j = zzys4;
        this.zzW8l.zzZ(false, zzys4);
        byte[] bArr5 = new byte[i4];
        for (int i5 = 0; i5 != i4; i5 += blockSize) {
            this.zzW8l.zzY(bArr4, i5, bArr5, i5);
        }
        int i6 = length - 16;
        byte[] bArr6 = new byte[i6];
        byte[] bArr7 = new byte[8];
        System.arraycopy(bArr5, 0, bArr6, 0, i6);
        System.arraycopy(bArr5, i6, bArr7, 0, 8);
        if (zzz(bArr6, bArr7)) {
            return bArr6;
        }
        throw new zzYUT("Checksum inside ciphertext is corrupted");
    }

    @Override // com.aspose.words.internal.zzYUC
    public final byte[] zzv(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        if (!this.zzW8i) {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        if (i2 == 16) {
            bArr2 = new byte[24];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            System.arraycopy(bArr, 0, bArr2, 16, 8);
        } else {
            bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
        }
        zzYT0.zzW0(bArr2);
        byte[] bArrZzWG = zzWG(bArr2);
        int length = bArr2.length + 8;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArrZzWG, 0, bArr3, bArr2.length, 8);
        int blockSize = this.zzW8l.getBlockSize();
        if (length % blockSize != 0) {
            throw new IllegalStateException("Not multiple of block length");
        }
        this.zzW8l.zzZ(true, this.zzW8j);
        byte[] bArr4 = new byte[length];
        for (int i3 = 0; i3 != length; i3 += blockSize) {
            this.zzW8l.zzY(bArr3, i3, bArr4, i3);
        }
        byte[] bArr5 = this.f51280iv;
        byte[] bArr6 = new byte[bArr5.length + length];
        System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
        System.arraycopy(bArr4, 0, bArr6, this.f51280iv.length, length);
        byte[] bArrZzWF = zzWF(bArr6);
        this.zzW8l.zzZ(true, new zzYS4(this.zzW8k, zzW8h));
        for (int i4 = 0; i4 != bArrZzWF.length; i4 += blockSize) {
            this.zzW8l.zzY(bArrZzWF, i4, bArrZzWF, i4);
        }
        return bArrZzWF;
    }
}
