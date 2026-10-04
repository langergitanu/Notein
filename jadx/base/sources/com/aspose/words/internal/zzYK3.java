package com.aspose.words.internal;

import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYK3 extends zzYM0.zzZ {
    protected long[] zzW0L;

    public zzYK3(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.zzW0L = zzYK4.zzD(bigInteger);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYK3) {
            return zzYI1.zzP(this.zzW0L, ((zzYK3) obj).zzW0L);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final int getFieldSize() {
        return 113;
    }

    public final int hashCode() {
        return zzYGU.zzP(this.zzW0L, 2) ^ 113009;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean isZero() {
        return zzYI1.zzb(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final BigInteger toBigInteger() {
        return zzYI1.zza(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzT(zzYM0 zzym0) {
        return zzU(zzym0.zzXzx());
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzU(zzYM0 zzym0) {
        long[] jArr = new long[2];
        zzYK4.zzW(this.zzW0L, ((zzYK3) zzym0).zzW0L, jArr);
        return new zzYK3(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzV(zzYM0 zzym0) {
        return zzW(zzym0);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzW(zzYM0 zzym0) {
        long[] jArr = new long[2];
        zzYK4.zzY(this.zzW0L, ((zzYK3) zzym0).zzW0L, jArr);
        return new zzYK3(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzA() {
        long[] jArr = new long[2];
        zzYK4.zzX(this.zzW0L, jArr);
        return new zzYK3(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0.zzZ
    public final int zzXzs() {
        return ((int) this.zzW0L[0]) & 1;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzu() {
        return (this.zzW0L[0] & 1) != 0;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzv() {
        return zzYI1.zzc(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzw() {
        long[] jArr = new long[2];
        zzYK4.zzU(this.zzW0L, jArr);
        return new zzYK3(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzx() {
        long[] jArr = new long[2];
        zzYK4.zzW(this.zzW0L, jArr);
        return new zzYK3(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzy() {
        long[] jArr = new long[2];
        zzYK4.zzT(this.zzW0L, jArr);
        return new zzYK3(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzz() {
        return this;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02, zzYM0 zzym03) {
        long[] jArr = this.zzW0L;
        long[] jArr2 = ((zzYK3) zzym0).zzW0L;
        long[] jArr3 = ((zzYK3) zzym02).zzW0L;
        long[] jArr4 = ((zzYK3) zzym03).zzW0L;
        long[] jArr5 = new long[4];
        zzYK4.zzV(jArr, jArr2, jArr5);
        zzYK4.zzV(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[2];
        zzYK4.zzV(jArr5, jArr6);
        return new zzYK3(jArr6);
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
        long[] jArr = new long[2];
        zzYK4.zzZ(this.zzW0L, i, jArr);
        return new zzYK3(jArr);
    }

    public zzYK3() {
        this.zzW0L = new long[2];
    }

    public zzYK3(long[] jArr) {
        this.zzW0L = jArr;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02) {
        long[] jArr = this.zzW0L;
        long[] jArr2 = ((zzYK3) zzym0).zzW0L;
        long[] jArr3 = ((zzYK3) zzym02).zzW0L;
        long[] jArr4 = new long[4];
        zzYK4.zzS(jArr, jArr4);
        zzYK4.zzV(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[2];
        zzYK4.zzV(jArr4, jArr5);
        return new zzYK3(jArr5);
    }
}
