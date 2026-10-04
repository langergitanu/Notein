package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYU8 implements zzYVC {
    private byte[] zzVZq;
    private boolean zzVZr = zzXCI();
    private boolean zzVZs;
    private zzYVC zzWeQ;
    private SecureRandom zzWk5;
    private boolean zzWkw;

    public zzYU8(zzYVC zzyvc) {
        this.zzWeQ = zzyvc;
    }

    private static boolean zzXCI() {
        return zzZ5L.zzXH0() || !zzYGM.zzwd("org.bouncycastle.pkcs1.not_strict");
    }

    private byte[] zzs(byte[] bArr, int i, int i2) throws zzYUT {
        byte[] bArrZzy = this.zzWeQ.zzy(bArr, i, i2);
        if (bArrZzy.length < zzXDX()) {
            bArrZzy = this.zzVZq;
        }
        byte b = bArrZzy[0];
        boolean z = !this.zzVZs ? b == 1 : b == 2;
        boolean z2 = this.zzVZr & (bArrZzy.length != this.zzWeQ.zzXDX());
        int iZzZ = zzZ(b, bArrZzy) + 1;
        if (z || (iZzZ < 10)) {
            zzYGU.fill(bArrZzy, (byte) 0);
            throw new zzYUT("block incorrect");
        }
        if (z2) {
            zzYGU.fill(bArrZzy, (byte) 0);
            throw new zzYUT("block incorrect size");
        }
        int length = bArrZzy.length - iZzZ;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrZzy, iZzZ, bArr2, 0, length);
        return bArr2;
    }

    private byte[] zzt(byte[] bArr, int i, int i2) throws zzYUT {
        if (i2 > zzXDY()) {
            throw new IllegalArgumentException("input data too large");
        }
        int iZzXDY = this.zzWeQ.zzXDY();
        byte[] bArr2 = new byte[iZzXDY];
        if (this.zzVZs) {
            bArr2[0] = 1;
            for (int i3 = 1; i3 != (iZzXDY - i2) - 1; i3++) {
                bArr2[i3] = -1;
            }
        } else {
            this.zzWk5.nextBytes(bArr2);
            bArr2[0] = 2;
            for (int i4 = 1; i4 != (iZzXDY - i2) - 1; i4++) {
                while (bArr2[i4] == 0) {
                    bArr2[i4] = (byte) this.zzWk5.nextInt();
                }
            }
        }
        int i5 = iZzXDY - i2;
        bArr2[i5 - 1] = 0;
        System.arraycopy(bArr, i, bArr2, i5, i2);
        return this.zzWeQ.zzy(bArr2, 0, iZzXDY);
    }

    @Override // com.aspose.words.internal.zzYVC
    public final int zzXDX() {
        int iZzXDX = this.zzWeQ.zzXDX();
        return this.zzWkw ? iZzXDX : iZzXDX - 10;
    }

    @Override // com.aspose.words.internal.zzYVC
    public final int zzXDY() {
        int iZzXDY = this.zzWeQ.zzXDY();
        return this.zzWkw ? iZzXDY - 10 : iZzXDY;
    }

    @Override // com.aspose.words.internal.zzYVC
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        zzYT2 zzyt2;
        if (zzyv3 instanceof zzYS3) {
            zzYS3 zzys3 = (zzYS3) zzyv3;
            this.zzWk5 = zzys3.zzXCJ();
            zzyt2 = (zzYT2) zzys3.zzXC6();
        } else {
            zzyt2 = (zzYT2) zzyv3;
            if (!zzyt2.isPrivate() && z) {
                throw new IllegalArgumentException("No SecureRandom specified.");
            }
        }
        this.zzWeQ.zzZ(z, zzyv3);
        this.zzVZs = zzyt2.isPrivate();
        this.zzWkw = z;
        this.zzVZq = new byte[this.zzWeQ.zzXDX()];
    }

    @Override // com.aspose.words.internal.zzYVC
    public final byte[] zzy(byte[] bArr, int i, int i2) throws zzYUT {
        return this.zzWkw ? zzt(bArr, i, i2) : zzs(bArr, i, i2);
    }

    private static int zzZ(byte b, byte[] bArr) throws zzYUT {
        int i = -1;
        boolean z = false;
        for (int i2 = 1; i2 != bArr.length; i2++) {
            byte b2 = bArr[i2];
            if ((b2 == 0) & (i < 0)) {
                i = i2;
            }
            z |= (b2 != -1) & (b == 1) & (i < 0);
        }
        if (z) {
            return -1;
        }
        return i;
    }
}
