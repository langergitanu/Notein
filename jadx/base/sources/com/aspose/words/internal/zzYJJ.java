package com.aspose.words.internal;

import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYJJ extends zzYM0.zzZ {
    protected long[] zzW0L;

    public zzYJJ(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.zzW0L = zzYJK.zzD(bigInteger);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYJJ) {
            return zzYHX.zzP(this.zzW0L, ((zzYJJ) obj).zzW0L);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final int getFieldSize() {
        return 193;
    }

    public final int hashCode() {
        return zzYGU.zzP(this.zzW0L, 4) ^ 1930015;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean isZero() {
        return zzYHX.zzb(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final BigInteger toBigInteger() {
        return zzYHX.zza(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzT(zzYM0 zzym0) {
        return zzU(zzym0.zzXzx());
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzU(zzYM0 zzym0) {
        long[] jArr = new long[4];
        zzYJK.zzW(this.zzW0L, ((zzYJJ) zzym0).zzW0L, jArr);
        return new zzYJJ(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzV(zzYM0 zzym0) {
        return zzW(zzym0);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzW(zzYM0 zzym0) {
        long[] jArr = new long[4];
        zzYJK.zzY(this.zzW0L, ((zzYJJ) zzym0).zzW0L, jArr);
        return new zzYJJ(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzA() {
        long[] jArr = new long[4];
        zzYJK.zzX(this.zzW0L, jArr);
        return new zzYJJ(jArr);
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
        return zzYHX.zzc(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzw() {
        long[] jArr = new long[4];
        zzYJK.zzU(this.zzW0L, jArr);
        return new zzYJJ(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzx() {
        long[] jArr = new long[4];
        zzYJK.zzW(this.zzW0L, jArr);
        return new zzYJJ(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzy() {
        long[] jArr = new long[4];
        zzYJK.zzT(this.zzW0L, jArr);
        return new zzYJJ(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzz() {
        return this;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02, zzYM0 zzym03) {
        long[] jArr = this.zzW0L;
        long[] jArr2 = ((zzYJJ) zzym0).zzW0L;
        long[] jArr3 = ((zzYJJ) zzym02).zzW0L;
        long[] jArr4 = ((zzYJJ) zzym03).zzW0L;
        long[] jArr5 = new long[8];
        zzYJK.zzV(jArr, jArr2, jArr5);
        zzYJK.zzV(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[4];
        zzYJK.zzV(jArr5, jArr6);
        return new zzYJJ(jArr6);
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
        long[] jArr = new long[4];
        zzYJK.zzZ(this.zzW0L, i, jArr);
        return new zzYJJ(jArr);
    }

    public zzYJJ() {
        this.zzW0L = new long[4];
    }

    public zzYJJ(long[] jArr) {
        this.zzW0L = jArr;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02) {
        long[] jArr = this.zzW0L;
        long[] jArr2 = ((zzYJJ) zzym0).zzW0L;
        long[] jArr3 = ((zzYJJ) zzym02).zzW0L;
        long[] jArr4 = new long[8];
        zzYJK.zzS(jArr, jArr4);
        zzYJK.zzV(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[4];
        zzYJK.zzV(jArr4, jArr5);
        return new zzYJJ(jArr5);
    }
}
