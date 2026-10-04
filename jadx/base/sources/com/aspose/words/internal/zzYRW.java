package com.aspose.words.internal;

import com.google.common.primitives.SignedBytes;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class zzYRW implements zzYUI {
    private int zzVXI;
    private zzYS1 zzVXx;
    private zzYVC zzWbH;
    private int zzWeI;
    private zzYUX zzWkt;
    private byte[] zzZNn;

    public zzYRW(zzYVC zzyvc, zzYUX zzyux, boolean z) {
        this.zzWbH = zzyvc;
        this.zzWkt = zzyux;
        if (z) {
            this.zzWeI = 188;
            return;
        }
        Integer numZzV = zzYRT.zzV(zzyux);
        if (numZzV != null) {
            this.zzWeI = numZzV.intValue();
        } else {
            throw new IllegalArgumentException("no valid trailer for digest: " + zzyux.zzXGi());
        }
    }

    private void reset() {
        this.zzWkt.reset();
    }

    private static void zzWM(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    private void zzf0(int i) {
        int length;
        int iZzQI = this.zzWkt.zzQI();
        if (i == 188) {
            byte[] bArr = this.zzZNn;
            length = (bArr.length - iZzQI) - 1;
            this.zzWkt.doFinal(bArr, length);
            this.zzZNn[r5.length - 1] = -68;
        } else {
            byte[] bArr2 = this.zzZNn;
            int length2 = (bArr2.length - iZzQI) - 2;
            this.zzWkt.doFinal(bArr2, length2);
            byte[] bArr3 = this.zzZNn;
            bArr3[bArr3.length - 2] = (byte) (i >>> 8);
            bArr3[bArr3.length - 1] = (byte) i;
            length = length2;
        }
        this.zzZNn[0] = 107;
        for (int i2 = length - 2; i2 != 0; i2--) {
            this.zzZNn[i2] = -69;
        }
        this.zzZNn[length - 1] = -70;
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void update(byte b) {
        this.zzWkt.update(b);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r4
      0x002f: PHI (r4v3 java.math.BigInteger) = (r4v2 java.math.BigInteger), (r4v5 java.math.BigInteger) binds: [B:5:0x001a, B:8:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.aspose.words.internal.zzYUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzWX(byte[] bArr) {
        boolean zZzo = false;
        try {
            this.zzZNn = this.zzWbH.zzy(bArr, 0, bArr.length);
            BigInteger bigInteger = new BigInteger(1, this.zzZNn);
            if ((bigInteger.intValue() & 15) == 12) {
                zzf0(this.zzWeI);
                byte[] bArrZzU = zzYGT.zzU(this.zzZNn.length, bigInteger);
                zZzo = zzYGU.zzo(this.zzZNn, bArrZzU);
                if (this.zzWeI == 15052 && !zZzo) {
                    byte[] bArr2 = this.zzZNn;
                    bArr2[bArr2.length - 2] = SignedBytes.MAX_POWER_OF_TWO;
                    zZzo = zzYGU.zzo(bArr2, bArrZzU);
                }
                zzWM(this.zzZNn);
                zzWM(bArrZzU);
            } else {
                bigInteger = this.zzVXx.getModulus().subtract(bigInteger);
                if ((bigInteger.intValue() & 15) == 12) {
                }
            }
        } catch (Exception unused) {
        }
        return zZzo;
    }

    @Override // com.aspose.words.internal.zzYUI
    public final byte[] zzXEp() throws zzYV2 {
        zzf0(this.zzWeI);
        zzYVC zzyvc = this.zzWbH;
        byte[] bArr = this.zzZNn;
        BigInteger bigInteger = new BigInteger(1, zzyvc.zzy(bArr, 0, bArr.length));
        zzWM(this.zzZNn);
        return zzYGT.zzU((this.zzVXx.getModulus().bitLength() + 7) / 8, bigInteger.min(this.zzVXx.getModulus().subtract(bigInteger)));
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        if (zzyv3 instanceof zzYS3) {
            this.zzVXx = (zzYS1) ((zzYS3) zzyv3).zzXC6();
        } else {
            this.zzVXx = (zzYS1) zzyv3;
        }
        this.zzWbH.zzZ(z, zzyv3);
        int iBitLength = this.zzVXx.getModulus().bitLength();
        this.zzVXI = iBitLength;
        this.zzZNn = new byte[(iBitLength + 7) / 8];
        reset();
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void update(byte[] bArr, int i, int i2) {
        this.zzWkt.update(bArr, i, i2);
    }
}
