package com.aspose.words.internal;

import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: loaded from: classes5.dex */
final class zzYVT implements zzYUR {
    protected int zzW0U;
    protected int zzW0V;
    protected long zzW0W;
    protected long zzW0X;
    protected long zzW0Y;
    protected long zzW0Z;
    protected long zzW10;
    protected long zzW11;
    protected long zzW12;
    protected final int zzW13;
    protected final int zzW14;

    public zzYVT() {
        this.zzW0W = 0L;
        this.zzW0V = 0;
        this.zzW0U = 0;
        this.zzW14 = 2;
        this.zzW13 = 4;
    }

    private static long rotateLeft(long j, int i) {
        return (j >>> (-i)) | (j << i);
    }

    private void zzXCX() {
        this.zzW0U++;
        this.zzW0X ^= this.zzW0W;
        zzfg(this.zzW14);
        this.zzW10 ^= this.zzW0W;
    }

    private long zzXCY() throws IllegalStateException, zzYV0 {
        long j = this.zzW0W;
        int i = this.zzW0V;
        this.zzW0W = ((j >>> ((7 - i) << 3)) >>> 8) | ((((long) ((this.zzW0U << 3) + i)) & 255) << 56);
        zzXCX();
        this.zzW0Y ^= 255;
        zzfg(this.zzW13);
        long j2 = ((this.zzW10 ^ this.zzW0Z) ^ this.zzW0Y) ^ this.zzW0X;
        reset();
        return j2;
    }

    private void zzfg(int i) {
        long jRotateLeft = this.zzW10;
        long jRotateLeft2 = this.zzW0Z;
        long jRotateLeft3 = this.zzW0Y;
        long jRotateLeft4 = this.zzW0X;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jRotateLeft + jRotateLeft2;
            long j2 = jRotateLeft3 + jRotateLeft4;
            long jRotateLeft5 = rotateLeft(jRotateLeft2, 13) ^ j;
            long jRotateLeft6 = rotateLeft(jRotateLeft4, 16) ^ j2;
            long j3 = j2 + jRotateLeft5;
            jRotateLeft = rotateLeft(j, 32) + jRotateLeft6;
            jRotateLeft2 = rotateLeft(jRotateLeft5, 17) ^ j3;
            jRotateLeft4 = rotateLeft(jRotateLeft6, 21) ^ jRotateLeft;
            jRotateLeft3 = rotateLeft(j3, 32);
        }
        this.zzW10 = jRotateLeft;
        this.zzW0Z = jRotateLeft2;
        this.zzW0Y = jRotateLeft3;
        this.zzW0X = jRotateLeft4;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int doFinal(byte[] bArr, int i) throws IllegalStateException, zzYV0 {
        zzYGN.zzV(zzXCY(), bArr, 0);
        return 8;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void reset() {
        long j = this.zzW12;
        this.zzW10 = 8317987319222330741L ^ j;
        long j2 = this.zzW11;
        this.zzW0Z = 7237128888997146477L ^ j2;
        this.zzW0Y = j ^ 7816392313619706465L;
        this.zzW0X = 8387220255154660723L ^ j2;
        this.zzW0W = 0L;
        this.zzW0V = 0;
        this.zzW0U = 0;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte b) throws IllegalStateException {
        this.zzW0W = (this.zzW0W >>> 8) | ((((long) b) & 255) << 56);
        int i = this.zzW0V + 1;
        this.zzW0V = i;
        if (i == 8) {
            zzXCX();
            this.zzW0V = 0;
        }
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int zzXDn() {
        return 8;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final String zzXGi() {
        return "SipHash-" + this.zzW14 + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + this.zzW13;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void zzZ(zzYV3 zzyv3) throws IllegalArgumentException {
        if (!(zzyv3 instanceof zzYS8)) {
            throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
        }
        byte[] key = ((zzYS8) zzyv3).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        this.zzW12 = zzYGN.zzZJ(key, 0);
        this.zzW11 = zzYGN.zzZJ(key, 8);
        reset();
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte[] bArr, int i, int i2) throws IllegalStateException, zzYV0 {
        int i3 = i2 & (-8);
        int i4 = this.zzW0V;
        char c = '8';
        long j = 255;
        int i5 = 0;
        if (i4 == 0) {
            while (i5 < i3) {
                this.zzW0W = zzYGN.zzZJ(bArr, i + i5);
                zzXCX();
                i5 += 8;
            }
            while (i5 < i2) {
                long j2 = this.zzW0W >>> 8;
                this.zzW0W = j2;
                this.zzW0W = j2 | ((((long) bArr[i + i5]) & 255) << 56);
                i5++;
            }
            this.zzW0V = i2 - i3;
            return;
        }
        int i6 = i4 << 3;
        int i7 = 0;
        while (i7 < i3) {
            long jZzZJ = zzYGN.zzZJ(bArr, i + i7);
            this.zzW0W = (this.zzW0W >>> (-i6)) | (jZzZJ << i6);
            zzXCX();
            this.zzW0W = jZzZJ;
            i7 += 8;
            c = c;
            j = j;
        }
        char c2 = c;
        long j3 = j;
        while (i7 < i2) {
            long j4 = this.zzW0W >>> 8;
            this.zzW0W = j4;
            this.zzW0W = j4 | ((((long) bArr[i + i7]) & j3) << c2);
            int i8 = this.zzW0V + 1;
            this.zzW0V = i8;
            if (i8 == 8) {
                zzXCX();
                this.zzW0V = 0;
            }
            i7++;
        }
    }

    public zzYVT(int i, int i2) {
        this.zzW0W = 0L;
        this.zzW0V = 0;
        this.zzW0U = 0;
        this.zzW14 = i;
        this.zzW13 = i2;
    }
}
