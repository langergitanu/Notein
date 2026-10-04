package com.aspose.words.internal;

import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYIX extends zzYM0.zzZ {
    protected long[] zzW0L;

    public zzYIX(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.zzW0L = zzYIY.zzD(bigInteger);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYIX) {
            return zzYHU.zzP(this.zzW0L, ((zzYIX) obj).zzW0L);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final int getFieldSize() {
        return 409;
    }

    public final int hashCode() {
        return zzYGU.zzP(this.zzW0L, 7) ^ 4090087;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean isZero() {
        return zzYHU.zzb(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final BigInteger toBigInteger() {
        return zzYHU.zza(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzT(zzYM0 zzym0) {
        return zzU(zzym0.zzXzx());
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzU(zzYM0 zzym0) {
        long[] jArr = new long[7];
        zzYIY.zzW(this.zzW0L, ((zzYIX) zzym0).zzW0L, jArr);
        return new zzYIX(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzV(zzYM0 zzym0) {
        return zzW(zzym0);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzW(zzYM0 zzym0) {
        long[] jArr = new long[7];
        zzYIY.zzY(this.zzW0L, ((zzYIX) zzym0).zzW0L, jArr);
        return new zzYIX(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzA() {
        long[] jArr = new long[7];
        zzYIY.zzX(this.zzW0L, jArr);
        return new zzYIX(jArr);
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
        return zzYHU.zzc(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzw() {
        long[] jArr = new long[7];
        zzYIY.zzU(this.zzW0L, jArr);
        return new zzYIX(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzx() {
        long[] jArr = new long[7];
        zzYIY.zzW(this.zzW0L, jArr);
        return new zzYIX(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzy() {
        long[] jArr = new long[7];
        zzYIY.zzT(this.zzW0L, jArr);
        return new zzYIX(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzz() {
        return this;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02, zzYM0 zzym03) {
        long[] jArr = this.zzW0L;
        long[] jArr2 = ((zzYIX) zzym0).zzW0L;
        long[] jArr3 = ((zzYIX) zzym02).zzW0L;
        long[] jArr4 = ((zzYIX) zzym03).zzW0L;
        long[] jArr5 = new long[13];
        zzYIY.zzV(jArr, jArr2, jArr5);
        zzYIY.zzV(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[7];
        zzYIY.zzV(jArr5, jArr6);
        return new zzYIX(jArr6);
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
        long[] jArr = new long[7];
        zzYIY.zzZ(this.zzW0L, i, jArr);
        return new zzYIX(jArr);
    }

    public zzYIX() {
        this.zzW0L = new long[7];
    }

    public zzYIX(long[] jArr) {
        this.zzW0L = jArr;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02) {
        long[] jArr = this.zzW0L;
        long[] jArr2 = ((zzYIX) zzym0).zzW0L;
        long[] jArr3 = ((zzYIX) zzym02).zzW0L;
        long[] jArr4 = new long[13];
        zzYIY.zzS(jArr, jArr4);
        zzYIY.zzV(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[7];
        zzYIY.zzV(jArr4, jArr5);
        return new zzYIX(jArr5);
    }
}
