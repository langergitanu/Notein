package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYVV implements zzYV8 {
    private static final int[] zzWbr = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private boolean zzWkw = false;
    private int[] zzW8f = null;

    private void zzV(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[8];
        zzZ(bArr, iArr, i);
        for (int i3 = 63; i3 >= 0; i3--) {
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            int i8 = (i4 - ((((i5 >>> 2) | (i5 << (-2))) ^ ((i5 >>> 13) | (i5 << (-13)))) ^ ((i5 >>> 22) | (i5 << (-22))))) - (((i5 & i6) ^ (i5 & i7)) ^ (i6 & i7));
            iArr[0] = i5;
            iArr[1] = i6;
            iArr[2] = i7;
            iArr[3] = iArr[4] - i8;
            int i9 = iArr[5];
            iArr[4] = i9;
            int i10 = iArr[6];
            iArr[5] = i10;
            int i11 = iArr[7];
            iArr[6] = i11;
            iArr[7] = (((i8 - zzWbr[i3]) - this.zzW8f[i3]) - ((((i9 >>> 6) | (i9 << (-6))) ^ ((i9 >>> 11) | (i9 << (-11)))) ^ ((i9 >>> 25) | (i9 << (-25))))) - ((i9 & i10) ^ ((~i9) & i11));
        }
        zzZ(iArr, bArr2, i2);
    }

    private void zzW(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[8];
        zzZ(bArr, iArr, i);
        for (int i3 = 0; i3 < 64; i3++) {
            int i4 = iArr[4];
            int i5 = iArr[5];
            int i6 = ~i4;
            int i7 = iArr[6];
            int i8 = ((((i4 >>> 6) | (i4 << (-6))) ^ ((i4 >>> 11) | (i4 << (-11)))) ^ ((i4 >>> 25) | (i4 << (-25)))) + ((i4 & i5) ^ (i6 & i7)) + iArr[7] + zzWbr[i3] + this.zzW8f[i3];
            iArr[7] = i7;
            iArr[6] = i5;
            iArr[5] = i4;
            iArr[4] = iArr[3] + i8;
            int i9 = iArr[2];
            iArr[3] = i9;
            int i10 = iArr[1];
            iArr[2] = i10;
            int i11 = iArr[0];
            iArr[1] = i11;
            iArr[0] = i8 + ((((i11 >>> 2) | (i11 << (-2))) ^ ((i11 >>> 13) | (i11 << (-13)))) ^ ((i11 >>> 22) | (i11 << (-22)))) + (((i11 & i9) ^ (i11 & i10)) ^ (i10 & i9));
        }
        zzZ(iArr, bArr2, i2);
    }

    private void zzWK(byte[] bArr) {
        if (bArr.length != 0 && bArr.length <= 64) {
            if (bArr.length >= 16 && bArr.length % 8 == 0) {
                zzY(bArr, this.zzW8f, 0);
                for (int i = 16; i < 64; i++) {
                    int[] iArr = this.zzW8f;
                    int i2 = iArr[i - 2];
                    int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << (-17))) ^ ((i2 >>> 19) | (i2 << (-19))))) + iArr[i - 7];
                    int i4 = iArr[i - 15];
                    iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << (-7))) ^ ((i4 >>> 18) | (i4 << (-18))))) + iArr[i - 16];
                }
                return;
            }
        }
        throw new IllegalArgumentException("SHACAL-2 key must be 16 - 64 bytes and multiple of 8");
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int getBlockSize() {
        return 32;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void reset() {
    }

    @Override // com.aspose.words.internal.zzYV8
    public final String zzXGi() {
        return "SHACAL-2";
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int zzY(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, zzYV0 {
        if (this.zzW8f == null) {
            throw new IllegalStateException("Shacal2 not initialised");
        }
        if (i + 32 > bArr.length) {
            throw new zzYV0("input buffer too short");
        }
        if (i2 + 32 > bArr2.length) {
            throw new zzYUO("output buffer too short");
        }
        if (this.zzWkw) {
            zzW(bArr, i, bArr2, i2);
            return 32;
        }
        zzV(bArr, i, bArr2, i2);
        return 32;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void zzZ(boolean z, zzYV3 zzyv3) throws IllegalArgumentException {
        if (!(zzyv3 instanceof zzYS8)) {
            throw new IllegalArgumentException("only simple KeyParameter expected.");
        }
        this.zzWkw = z;
        this.zzW8f = new int[64];
        zzWK(((zzYS8) zzyv3).getKey());
    }

    private static void zzZ(byte[] bArr, int[] iArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i4 = i + 3;
            int i5 = ((bArr[i + 2] & 255) << 8) | i3;
            i += 4;
            iArr[i2] = i5 | (bArr[i4] & 255);
        }
    }

    private static void zzZ(int[] iArr, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = iArr[i2];
            bArr[i] = (byte) (i3 >>> 24);
            bArr[i + 1] = (byte) (i3 >>> 16);
            int i4 = i + 3;
            bArr[i + 2] = (byte) (i3 >>> 8);
            i += 4;
            bArr[i4] = (byte) i3;
        }
    }

    private static void zzY(byte[] bArr, int[] iArr, int i) {
        for (int i2 = 0; i2 < bArr.length / 4; i2++) {
            int i3 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i4 = i + 3;
            int i5 = i3 | ((bArr[i + 2] & 255) << 8);
            i += 4;
            iArr[i2] = i5 | (bArr[i4] & 255);
        }
    }
}
