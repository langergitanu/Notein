package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4K;
import com.aspose.words.internal.zzZ4M;
import o000o0o.C24611OooO00o;

/* JADX INFO: loaded from: classes5.dex */
final class zzYWN<T extends zzZ4M> extends zzYUN<T> {
    private byte[] zzWcd;
    private zzYUR zzWhe;

    /* JADX INFO: renamed from: com.aspose.words.internal.zzYWN$1 */
    public static /* synthetic */ class C155831 {
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

    public zzYWN(T t, zzYUR zzyur) {
        super(t);
        this.zzWhe = zzyur;
        this.zzWcd = new byte[zzyur.zzXDn()];
    }

    private void zzZ(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2) {
        if (i == 0) {
            throw new IllegalArgumentException("iteration count must be at least 1.");
        }
        if (bArr != null) {
            this.zzWhe.update(bArr, 0, bArr.length);
        }
        this.zzWhe.update(bArr2, 0, 4);
        this.zzWhe.doFinal(this.zzWcd, 0);
        byte[] bArr4 = this.zzWcd;
        System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
        for (int i3 = 1; i3 < i; i3++) {
            zzYUR zzyur = this.zzWhe;
            byte[] bArr5 = this.zzWcd;
            zzyur.update(bArr5, 0, bArr5.length);
            this.zzWhe.doFinal(this.zzWcd, 0);
            int i4 = 0;
            while (true) {
                byte[] bArr6 = this.zzWcd;
                if (i4 != bArr6.length) {
                    int i5 = i2 + i4;
                    bArr3[i5] = (byte) (bArr6[i4] ^ bArr3[i5]);
                    i4++;
                }
            }
        }
    }

    private byte[] zzfF(int i) {
        int i2;
        int iZzXDn = this.zzWhe.zzXDn();
        int iOooO00o = C24611OooO00o.OooO00o(i, iZzXDn, 1, iZzXDn);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[iOooO00o * iZzXDn];
        this.zzWhe.zzZ(new zzYS7(this.zzWfD));
        int i3 = 0;
        for (int i4 = 1; i4 <= iOooO00o; i4++) {
            while (true) {
                byte b = (byte) (bArr[i2] + 1);
                bArr[i2] = b;
                i2 = b == 0 ? i2 - 1 : 3;
            }
            zzZ(this.zzWAR, this.zzWfC, bArr, bArr2, i3);
            i3 += iZzXDn;
        }
        return bArr2;
    }

    @Override // com.aspose.words.internal.zzZ4K
    public final byte[] zzZ(zzZ4K.zzZ zzz, int i) {
        int i2 = C155831.zzWbK[zzz.ordinal()];
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException("Unknown type in deriveKey: " + zzz.name());
        }
        return zzYGU.copyOfRange(zzfF(i), 0, i);
    }

    @Override // com.aspose.words.internal.zzZ4K
    public final byte[][] zzZ(zzZ4K.zzZ zzz, int i, int i2) {
        int i3 = i2 + i;
        byte[] bArrZzfF = zzfF(i3);
        int i4 = C155831.zzWbK[zzz.ordinal()];
        if (i4 != 1 && i4 != 2) {
            throw new IllegalStateException("Unknown type in deriveKeyAndIV: " + zzz.name());
        }
        return new byte[][]{zzYGU.copyOfRange(bArrZzfF, 0, i), zzYGU.copyOfRange(bArrZzfF, i, i3)};
    }
}
