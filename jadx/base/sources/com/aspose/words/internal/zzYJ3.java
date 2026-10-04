package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;
import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYJ3 extends zzYM0.zzZ {
    protected long[] zzW0L;

    public zzYJ3(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.zzW0L = zzYJ4.zzD(bigInteger);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYJ3) {
            return zzYHW.zzP(this.zzW0L, ((zzYJ3) obj).zzW0L);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final int getFieldSize() {
        return StyleIdentifier.GRID_TABLE_4_ACCENT_1;
    }

    public final int hashCode() {
        return zzYGU.zzP(this.zzW0L, 5) ^ 2831275;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean isZero() {
        return zzYHW.zzb(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final BigInteger toBigInteger() {
        return zzYHW.zza(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzT(zzYM0 zzym0) {
        return zzU(zzym0.zzXzx());
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzU(zzYM0 zzym0) {
        long[] jArr = new long[5];
        zzYJ4.zzW(this.zzW0L, ((zzYJ3) zzym0).zzW0L, jArr);
        return new zzYJ3(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzV(zzYM0 zzym0) {
        return zzW(zzym0);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzW(zzYM0 zzym0) {
        long[] jArr = new long[5];
        zzYJ4.zzY(this.zzW0L, ((zzYJ3) zzym0).zzW0L, jArr);
        return new zzYJ3(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzA() {
        long[] jArr = new long[5];
        zzYJ4.zzX(this.zzW0L, jArr);
        return new zzYJ3(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0.zzZ
    public final int zzXzs() {
        return zzYJ4.zzm(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzu() {
        return (this.zzW0L[0] & 1) != 0;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzv() {
        return zzYHW.zzc(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzw() {
        long[] jArr = new long[5];
        zzYJ4.zzU(this.zzW0L, jArr);
        return new zzYJ3(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzx() {
        long[] jArr = new long[5];
        zzYJ4.zzW(this.zzW0L, jArr);
        return new zzYJ3(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzy() {
        long[] jArr = new long[5];
        zzYJ4.zzT(this.zzW0L, jArr);
        return new zzYJ3(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzz() {
        return this;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02, zzYM0 zzym03) {
        long[] jArr = this.zzW0L;
        long[] jArr2 = ((zzYJ3) zzym0).zzW0L;
        long[] jArr3 = ((zzYJ3) zzym02).zzW0L;
        long[] jArr4 = ((zzYJ3) zzym03).zzW0L;
        long[] jArr5 = new long[9];
        zzYJ4.zzV(jArr, jArr2, jArr5);
        zzYJ4.zzV(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[5];
        zzYJ4.zzV(jArr5, jArr6);
        return new zzYJ3(jArr6);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0 zzym03) {
        return zzY(zzym0, zzym02, zzym03);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzeR(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[5];
        zzYJ4.zzZ(this.zzW0L, i, jArr);
        return new zzYJ3(jArr);
    }

    public zzYJ3() {
        this.zzW0L = new long[5];
    }

    public zzYJ3(long[] jArr) {
        this.zzW0L = jArr;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02) {
        long[] jArr = this.zzW0L;
        long[] jArr2 = ((zzYJ3) zzym0).zzW0L;
        long[] jArr3 = ((zzYJ3) zzym02).zzW0L;
        long[] jArr4 = new long[9];
        zzYJ4.zzS(jArr, jArr4);
        zzYJ4.zzV(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[5];
        zzYJ4.zzV(jArr4, jArr5);
        return new zzYJ3(jArr5);
    }
}
