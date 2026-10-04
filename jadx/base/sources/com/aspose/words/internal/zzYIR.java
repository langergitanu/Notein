package com.aspose.words.internal;

import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYIR extends zzYM0.zzZ {
    protected long[] zzW0L;

    public zzYIR(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.zzW0L = zzYIS.zzD(bigInteger);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYIR) {
            return zzYHS.zzP(this.zzW0L, ((zzYIR) obj).zzW0L);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final int getFieldSize() {
        return 571;
    }

    public final int hashCode() {
        return zzYGU.zzP(this.zzW0L, 9) ^ 5711052;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean isZero() {
        return zzYHS.zzb(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final BigInteger toBigInteger() {
        return zzYHS.zza(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzT(zzYM0 zzym0) {
        return zzU(zzym0.zzXzx());
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzU(zzYM0 zzym0) {
        long[] jArr = new long[9];
        zzYIS.zzW(this.zzW0L, ((zzYIR) zzym0).zzW0L, jArr);
        return new zzYIR(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzV(zzYM0 zzym0) {
        return zzW(zzym0);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzW(zzYM0 zzym0) {
        long[] jArr = new long[9];
        zzYIS.zzY(this.zzW0L, ((zzYIR) zzym0).zzW0L, jArr);
        return new zzYIR(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzA() {
        long[] jArr = new long[9];
        zzYIS.zzX(this.zzW0L, jArr);
        return new zzYIR(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0.zzZ
    public final int zzXzs() {
        return zzYIS.zzm(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzu() {
        return (this.zzW0L[0] & 1) != 0;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzv() {
        return zzYHS.zzc(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzw() {
        long[] jArr = new long[9];
        zzYIS.zzU(this.zzW0L, jArr);
        return new zzYIR(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzx() {
        long[] jArr = new long[9];
        zzYIS.zzW(this.zzW0L, jArr);
        return new zzYIR(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzy() {
        long[] jArr = new long[9];
        zzYIS.zzT(this.zzW0L, jArr);
        return new zzYIR(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzz() {
        return this;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02, zzYM0 zzym03) {
        long[] jArr = this.zzW0L;
        long[] jArr2 = ((zzYIR) zzym0).zzW0L;
        long[] jArr3 = ((zzYIR) zzym02).zzW0L;
        long[] jArr4 = ((zzYIR) zzym03).zzW0L;
        long[] jArr5 = new long[18];
        zzYIS.zzV(jArr, jArr2, jArr5);
        zzYIS.zzV(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[9];
        zzYIS.zzV(jArr5, jArr6);
        return new zzYIR(jArr6);
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
        long[] jArr = new long[9];
        zzYIS.zzZ(this.zzW0L, i, jArr);
        return new zzYIR(jArr);
    }

    public zzYIR() {
        this.zzW0L = new long[9];
    }

    public zzYIR(long[] jArr) {
        this.zzW0L = jArr;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02) {
        long[] jArr = this.zzW0L;
        long[] jArr2 = ((zzYIR) zzym0).zzW0L;
        long[] jArr3 = ((zzYIR) zzym02).zzW0L;
        long[] jArr4 = new long[18];
        zzYIS.zzS(jArr, jArr4);
        zzYIS.zzV(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[9];
        zzYIS.zzV(jArr4, jArr5);
        return new zzYIR(jArr5);
    }
}
