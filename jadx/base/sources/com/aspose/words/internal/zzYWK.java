package com.aspose.words.internal;

import androidx.core.view.accessibility.AccessibilityEventCompat;

/* JADX INFO: loaded from: classes5.dex */
final class zzYWK implements zzYUR {
    private int zzW4A;
    private int zzW4B;
    private int zzW4C;
    private final byte[] zzW4D;
    private int zzW4j;
    private int zzW4k;
    private int zzW4l;
    private int zzW4m;
    private int zzW4n;
    private int zzW4o;
    private final byte[] zzW4p;
    private int zzW4q;
    private int zzW4r;
    private int zzW4s;
    private int zzW4t;
    private int zzW4u;
    private int zzW4v;
    private int zzW4w;
    private int zzW4x;
    private int zzW4y;
    private int zzW4z;
    private final zzYV8 zzW67;

    public zzYWK() {
        this.zzW4D = new byte[1];
        this.zzW4p = new byte[16];
        this.zzW4o = 0;
        this.zzW67 = null;
    }

    private void zzA(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits");
        }
        int i = 16;
        if (this.zzW67 != null && (bArr2 == null || bArr2.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV");
        }
        int iZzZL = zzYGN.zzZL(bArr, 0);
        int iZzZL2 = zzYGN.zzZL(bArr, 4);
        int iZzZL3 = zzYGN.zzZL(bArr, 8);
        int iZzZL4 = zzYGN.zzZL(bArr, 12);
        this.zzW4C = 67108863 & iZzZL;
        int i2 = ((iZzZL >>> 26) | (iZzZL2 << 6)) & 67108611;
        this.zzW4B = i2;
        int i3 = ((iZzZL2 >>> 20) | (iZzZL3 << 12)) & 67092735;
        this.zzW4A = i3;
        int i4 = ((iZzZL3 >>> 14) | (iZzZL4 << 18)) & 66076671;
        this.zzW4z = i4;
        int i5 = (iZzZL4 >>> 8) & 1048575;
        this.zzW4y = i5;
        this.zzW4x = i2 * 5;
        this.zzW4w = i3 * 5;
        this.zzW4v = i4 * 5;
        this.zzW4u = i5 * 5;
        zzYV8 zzyv8 = this.zzW67;
        if (zzyv8 != null) {
            byte[] bArr3 = new byte[16];
            zzyv8.zzZ(true, new zzYS7(bArr, 16, 16));
            this.zzW67.zzY(bArr2, 0, bArr3, 0);
            i = 0;
            bArr = bArr3;
        }
        this.zzW4t = zzYGN.zzZL(bArr, i);
        this.zzW4s = zzYGN.zzZL(bArr, i + 4);
        this.zzW4r = zzYGN.zzZL(bArr, i + 8);
        this.zzW4q = zzYGN.zzZL(bArr, i + 12);
    }

    private static final long zzUA(int i, int i2) {
        return (((long) i) & 4294967295L) * ((long) i2);
    }

    private void zzXHo() {
        int i = this.zzW4o;
        if (i < 16) {
            this.zzW4p[i] = 1;
            for (int i2 = i + 1; i2 < 16; i2++) {
                this.zzW4p[i2] = 0;
            }
        }
        long jZzZL = zzYGN.zzZL(this.zzW4p, 0);
        long j = jZzZL & 4294967295L;
        long jZzZL2 = ((long) zzYGN.zzZL(this.zzW4p, 4)) & 4294967295L;
        long jZzZL3 = ((long) zzYGN.zzZL(this.zzW4p, 8)) & 4294967295L;
        long jZzZL4 = 4294967295L & ((long) zzYGN.zzZL(this.zzW4p, 12));
        int i3 = (int) (((long) this.zzW4n) + (jZzZL & 67108863));
        this.zzW4n = i3;
        this.zzW4m = (int) (((long) this.zzW4m) + ((((jZzZL2 << 32) | j) >>> 26) & 67108863));
        this.zzW4l = (int) (((long) this.zzW4l) + (((jZzZL2 | (jZzZL3 << 32)) >>> 20) & 67108863));
        this.zzW4k = (int) (((long) this.zzW4k) + ((((jZzZL4 << 32) | jZzZL3) >>> 14) & 67108863));
        int i4 = (int) (((long) this.zzW4j) + (jZzZL4 >>> 8));
        this.zzW4j = i4;
        if (this.zzW4o == 16) {
            this.zzW4j = i4 + 16777216;
        }
        long jZzUA = zzUA(i3, this.zzW4C) + zzUA(this.zzW4m, this.zzW4u) + zzUA(this.zzW4l, this.zzW4v) + zzUA(this.zzW4k, this.zzW4w) + zzUA(this.zzW4j, this.zzW4x);
        long jZzUA2 = zzUA(this.zzW4n, this.zzW4B) + zzUA(this.zzW4m, this.zzW4C) + zzUA(this.zzW4l, this.zzW4u) + zzUA(this.zzW4k, this.zzW4v) + zzUA(this.zzW4j, this.zzW4w);
        long jZzUA3 = zzUA(this.zzW4n, this.zzW4A) + zzUA(this.zzW4m, this.zzW4B) + zzUA(this.zzW4l, this.zzW4C) + zzUA(this.zzW4k, this.zzW4u) + zzUA(this.zzW4j, this.zzW4v);
        long jZzUA4 = zzUA(this.zzW4n, this.zzW4z) + zzUA(this.zzW4m, this.zzW4A) + zzUA(this.zzW4l, this.zzW4B) + zzUA(this.zzW4k, this.zzW4C) + zzUA(this.zzW4j, this.zzW4u);
        long jZzUA5 = zzUA(this.zzW4n, this.zzW4y) + zzUA(this.zzW4m, this.zzW4z) + zzUA(this.zzW4l, this.zzW4A) + zzUA(this.zzW4k, this.zzW4B) + zzUA(this.zzW4j, this.zzW4C);
        long j2 = jZzUA2 + (jZzUA >>> 26);
        long j3 = jZzUA3 + (j2 >>> 26);
        this.zzW4l = ((int) j3) & 67108863;
        long j4 = jZzUA4 + (j3 >>> 26);
        this.zzW4k = ((int) j4) & 67108863;
        long j5 = jZzUA5 + (j4 >>> 26);
        this.zzW4j = ((int) j5) & 67108863;
        int i5 = (((int) (j5 >>> 26)) * 5) + (((int) jZzUA) & 67108863);
        this.zzW4m = (((int) j2) & 67108863) + (i5 >>> 26);
        this.zzW4n = i5 & 67108863;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int doFinal(byte[] bArr, int i) throws IllegalStateException, zzYV0 {
        if (16 > bArr.length) {
            throw new zzYUO("Output buffer is too short.");
        }
        if (this.zzW4o > 0) {
            zzXHo();
        }
        int i2 = this.zzW4m;
        int i3 = this.zzW4n;
        int i4 = i2 + (i3 >>> 26);
        int i5 = this.zzW4l + (i4 >>> 26);
        int i6 = this.zzW4k + (i5 >>> 26);
        int i7 = i5 & 67108863;
        int i8 = this.zzW4j + (i6 >>> 26);
        int i9 = i6 & 67108863;
        int i10 = ((i8 >>> 26) * 5) + (i3 & 67108863);
        int i11 = i8 & 67108863;
        int i12 = (i4 & 67108863) + (i10 >>> 26);
        int i13 = i10 & 67108863;
        int i14 = i13 + 5;
        int i15 = (i14 >>> 26) + i12;
        int i16 = (i15 >>> 26) + i7;
        int i17 = (i16 >>> 26) + i9;
        int i18 = 67108863 & i17;
        int i19 = ((i17 >>> 26) + i11) - AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        int i20 = (i19 >>> 31) - 1;
        int i21 = ~i20;
        int i22 = (i13 & i21) | (i14 & 67108863 & i20);
        this.zzW4n = i22;
        int i23 = (i12 & i21) | (i15 & 67108863 & i20);
        this.zzW4m = i23;
        int i24 = (i7 & i21) | (i16 & 67108863 & i20);
        this.zzW4l = i24;
        int i25 = (i18 & i20) | (i9 & i21);
        this.zzW4k = i25;
        int i26 = (i11 & i21) | (i19 & i20);
        this.zzW4j = i26;
        long j = (((long) ((i23 << 26) | i22)) & 4294967295L) + (((long) this.zzW4t) & 4294967295L);
        long j2 = (((long) ((i23 >>> 6) | (i24 << 20))) & 4294967295L) + (((long) this.zzW4s) & 4294967295L);
        long j3 = (((long) ((i24 >>> 12) | (i25 << 14))) & 4294967295L) + (((long) this.zzW4r) & 4294967295L);
        long j4 = (((long) ((i25 >>> 18) | (i26 << 8))) & 4294967295L) + (((long) this.zzW4q) & 4294967295L);
        zzYGN.zzM((int) j, bArr, 0);
        long j5 = j2 + (j >>> 32);
        zzYGN.zzM((int) j5, bArr, 4);
        long j6 = j3 + (j5 >>> 32);
        zzYGN.zzM((int) j6, bArr, 8);
        zzYGN.zzM((int) (j4 + (j6 >>> 32)), bArr, 12);
        reset();
        return 16;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void reset() {
        this.zzW4o = 0;
        this.zzW4j = 0;
        this.zzW4k = 0;
        this.zzW4l = 0;
        this.zzW4m = 0;
        this.zzW4n = 0;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte b) throws IllegalStateException {
        byte[] bArr = this.zzW4D;
        bArr[0] = b;
        update(bArr, 0, 1);
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int zzXDn() {
        return 16;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final String zzXGi() {
        if (this.zzW67 == null) {
            return "Poly1305";
        }
        return "Poly1305-" + this.zzW67.zzXGi();
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void zzZ(zzYV3 zzyv3) throws IllegalArgumentException {
        byte[] iv;
        if (this.zzW67 == null) {
            iv = null;
        } else {
            if (!(zzyv3 instanceof zzYS4)) {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher");
            }
            zzYS4 zzys4 = (zzYS4) zzyv3;
            iv = zzys4.getIV();
            zzyv3 = zzys4.zzXC6();
        }
        if (!(zzyv3 instanceof zzYS7)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        zzA(((zzYS7) zzyv3).getKey(), iv);
        reset();
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte[] bArr, int i, int i2) throws IllegalStateException, zzYV0 {
        int i3 = 0;
        while (i2 > i3) {
            if (this.zzW4o == 16) {
                zzXHo();
                this.zzW4o = 0;
            }
            int iMin = Math.min(i2 - i3, 16 - this.zzW4o);
            System.arraycopy(bArr, i3 + i, this.zzW4p, this.zzW4o, iMin);
            i3 += iMin;
            this.zzW4o += iMin;
        }
    }

    public zzYWK(zzYV8 zzyv8) {
        this.zzW4D = new byte[1];
        this.zzW4p = new byte[16];
        this.zzW4o = 0;
        if (zzyv8.getBlockSize() == 16) {
            this.zzW67 = zzyv8;
            return;
        }
        throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
    }
}
