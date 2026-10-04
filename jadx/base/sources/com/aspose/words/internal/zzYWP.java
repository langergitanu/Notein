package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4K;
import com.aspose.words.internal.zzZ4M;
import o000o0o.C24611OooO00o;

/* JADX INFO: loaded from: classes5.dex */
final class zzYWP<T extends zzZ4M> extends zzYUN<T> {
    private final int zzW4U;
    private final int zzW4V;
    private final zzYUX zzWkt;

    /* JADX INFO: renamed from: com.aspose.words.internal.zzYWP$1 */
    public static /* synthetic */ class C155841 {
        static final /* synthetic */ int[] zzWbK;

        static {
            int[] iArr = new int[zzZ4K.zzZ.values().length];
            zzWbK = iArr;
            try {
                iArr[zzZ4K.zzZ.CIPHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzWbK[zzZ4K.zzZ.MAC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public zzYWP(T t, zzYUX zzyux) {
        super(t);
        this.zzWkt = zzyux;
        this.zzW4V = zzyux.zzQI();
        this.zzW4U = zzyux.zzXE6();
    }

    private byte[] zzUC(int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        int i3;
        int i4 = this.zzW4U;
        byte[] bArr3 = new byte[i4];
        byte[] bArr4 = new byte[i2];
        int i5 = 0;
        for (int i6 = 0; i6 != i4; i6++) {
            bArr3[i6] = (byte) i;
        }
        byte[] bArr5 = this.zzWAR;
        int i7 = 1;
        if (bArr5 == null || bArr5.length == 0) {
            bArr = new byte[0];
        } else {
            int i8 = this.zzW4U;
            int length = (((bArr5.length + i8) - 1) / i8) * i8;
            bArr = new byte[length];
            for (int i9 = 0; i9 != length; i9++) {
                byte[] bArr6 = this.zzWAR;
                bArr[i9] = bArr6[i9 % bArr6.length];
            }
        }
        byte[] bArr7 = this.zzWfD;
        if (bArr7 == null || bArr7.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i10 = this.zzW4U;
            int length2 = (((bArr7.length + i10) - 1) / i10) * i10;
            bArr2 = new byte[length2];
            for (int i11 = 0; i11 != length2; i11++) {
                byte[] bArr8 = this.zzWfD;
                bArr2[i11] = bArr8[i11 % bArr8.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr9 = new byte[length3];
        System.arraycopy(bArr, 0, bArr9, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr9, bArr.length, bArr2.length);
        int i12 = this.zzW4U;
        byte[] bArr10 = new byte[i12];
        int i13 = this.zzW4V;
        int iOooO00o = C24611OooO00o.OooO00o(i2, i13, 1, i13);
        byte[] bArr11 = new byte[i13];
        int i14 = 1;
        while (i14 <= iOooO00o) {
            this.zzWkt.update(bArr3, i5, i4);
            this.zzWkt.update(bArr9, i5, length3);
            this.zzWkt.doFinal(bArr11, i5);
            for (int i15 = i7; i15 < this.zzWfC; i15++) {
                this.zzWkt.update(bArr11, i5, i13);
                this.zzWkt.doFinal(bArr11, i5);
            }
            for (int i16 = i5; i16 != i12; i16++) {
                bArr10[i16] = bArr11[i16 % i13];
            }
            int i17 = i5;
            while (true) {
                int i18 = this.zzW4U;
                if (i17 == length3 / i18) {
                    break;
                }
                zzX(bArr9, i18 * i17, bArr10);
                i17++;
            }
            if (i14 == iOooO00o) {
                int i19 = i14 - 1;
                int i20 = this.zzW4V;
                int i21 = i19 * i20;
                int i22 = i2 - (i19 * i20);
                i3 = 0;
                System.arraycopy(bArr11, 0, bArr4, i21, i22);
            } else {
                i3 = 0;
                System.arraycopy(bArr11, 0, bArr4, (i14 - 1) * this.zzW4V, i13);
            }
            i14++;
            i5 = i3;
            i7 = 1;
        }
        return bArr4;
    }

    private static void zzX(byte[] bArr, int i, byte[] bArr2) {
        int i2 = (bArr2[bArr2.length - 1] & 255) + (bArr[(bArr2.length + i) - 1] & 255) + 1;
        bArr[(bArr2.length + i) - 1] = (byte) i2;
        int i3 = i2 >>> 8;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            int i4 = i + length;
            int i5 = (bArr2[length] & 255) + (bArr[i4] & 255) + i3;
            bArr[i4] = (byte) i5;
            i3 = i5 >>> 8;
        }
    }

    @Override // com.aspose.words.internal.zzZ4K
    public final byte[] zzZ(zzZ4K.zzZ zzz, int i) {
        int i2 = C155841.zzWbK[zzz.ordinal()];
        if (i2 == 1) {
            return zzUC(1, i);
        }
        if (i2 == 2) {
            return zzUC(3, i);
        }
        throw new IllegalStateException("Unknown type in deriveKey: " + zzz.name());
    }

    @Override // com.aspose.words.internal.zzZ4K
    public final byte[][] zzZ(zzZ4K.zzZ zzz, int i, int i2) {
        byte[][] bArr = new byte[2][];
        int i3 = C155841.zzWbK[zzz.ordinal()];
        if (i3 == 1) {
            bArr[0] = zzUC(1, i);
        } else if (i3 == 2) {
            bArr[0] = zzUC(3, i);
        } else {
            throw new IllegalStateException("Unknown type in deriveKeyAndIV: " + zzz.name());
        }
        bArr[1] = zzUC(2, i2);
        return bArr;
    }
}
