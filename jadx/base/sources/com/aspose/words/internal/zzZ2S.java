package com.aspose.words.internal;

import com.aspose.words.internal.zzZ0P;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2S extends zzYZK {
    private final byte[] zzWkm;
    private static final byte[] zzWko = new byte[1];
    private static final byte[] zzWkn = new byte[100];

    public static class zzZ<T extends zzYUX> implements zzYRV<T> {
        private static final byte[] zzWkl = zzYGI.zzwb("abc");
        private final byte[] zzWkk;

        public zzZ(byte[] bArr) {
            this.zzWkk = bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYRV
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public boolean zzWO(zzYUX zzyux) {
            byte[] bArr = zzWkl;
            zzyux.update(bArr, 0, bArr.length);
            byte[] bArr2 = new byte[zzyux.zzQI()];
            zzyux.doFinal(bArr2, 0);
            zzyux.reset();
            return zzYGU.zzp(bArr2, this.zzWkk);
        }
    }

    public zzZ2S(int i, byte[] bArr, byte[] bArr2) {
        super(i);
        if (i == 128) {
            zzYZG.zzZ(zzZ0P.zzZ.zzWdn, this, new zzZ(zzYGC.decode("5881092dd818bf5cf8a3ddb793fbcba7")));
        } else {
            zzYZG.zzZ(zzZ0P.zzZ.zzWdm, this, new zzZ(zzYGC.decode("483366601360a8771c6863080cc4114d8db44530f8f1e1ee4f94ea37e78b5739")));
        }
        if ((bArr == null || bArr.length == 0) && (bArr2 == null || bArr2.length == 0)) {
            this.zzWkm = null;
        } else {
            this.zzWkm = zzYGU.zzV(zzX7(this.zzWcb / 8), zzXe(bArr), zzXe(bArr2));
            zzXGg();
        }
    }

    private static byte[] zzX7(long j) {
        long j2 = j;
        byte b = 1;
        while (true) {
            j2 >>= 8;
            if (j2 == 0) {
                break;
            }
            b = (byte) (b + 1);
        }
        byte[] bArr = new byte[b + 1];
        bArr[0] = b;
        for (int i = 1; i <= b; i++) {
            bArr[i] = (byte) (j >> ((b - i) * 8));
        }
        return bArr;
    }

    private void zzXGg() {
        int i = this.zzWcb / 8;
        zzZ(this.zzWkm, 0, r1.length * 8);
        int length = (i - (this.zzWkm.length % i)) % i;
        while (true) {
            byte[] bArr = zzWkn;
            if (length <= bArr.length) {
                zzZ(bArr, 0, length * 8);
                return;
            } else {
                zzZ(bArr, 0, bArr.length * 8);
                length -= bArr.length;
            }
        }
    }

    private static byte[] zzXe(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? zzX7(0L) : zzYGU.zzn(zzX7(((long) bArr.length) * 8), bArr);
    }

    @Override // com.aspose.words.internal.zzZ08, com.aspose.words.internal.zzYUX
    public final void reset() {
        super.reset();
        if (this.zzWkm != null) {
            zzXGg();
        }
    }

    @Override // com.aspose.words.internal.zzYZK, com.aspose.words.internal.zzYUB
    public final int zzB(byte[] bArr, int i, int i2) {
        if (this.zzWkm == null) {
            return super.zzB(bArr, i, i2);
        }
        if (!this.zzWc8) {
            zzZ(zzWko, 0, 2L);
        }
        zzY(bArr, i, ((long) i2) * 8);
        return i2;
    }
}
