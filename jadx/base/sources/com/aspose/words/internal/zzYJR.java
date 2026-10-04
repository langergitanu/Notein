package com.aspose.words.internal;

import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYJR extends zzYM0.zzZ {
    protected long[] zzW0L;

    public zzYJR(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.zzW0L = zzYJS.zzD(bigInteger);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYJR) {
            return zzYHZ.zzP(this.zzW0L, ((zzYJR) obj).zzW0L);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final int getFieldSize() {
        return 163;
    }

    public final int hashCode() {
        return zzYGU.zzP(this.zzW0L, 3) ^ 163763;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean isZero() {
        return zzYHZ.zzb(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final BigInteger toBigInteger() {
        return zzYHZ.zza(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzT(zzYM0 zzym0) {
        return zzU(zzym0.zzXzx());
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzU(zzYM0 zzym0) {
        long[] jArr = new long[3];
        zzYJS.zzW(this.zzW0L, ((zzYJR) zzym0).zzW0L, jArr);
        return new zzYJR(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzV(zzYM0 zzym0) {
        return zzW(zzym0);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzW(zzYM0 zzym0) {
        long[] jArr = new long[3];
        zzYJS.zzY(this.zzW0L, ((zzYJR) zzym0).zzW0L, jArr);
        return new zzYJR(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzA() {
        long[] jArr = new long[3];
        zzYJS.zzX(this.zzW0L, jArr);
        return new zzYJR(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0.zzZ
    public final int zzXzs() {
        return zzYJS.zzm(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzu() {
        return (this.zzW0L[0] & 1) != 0;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzv() {
        return zzYHZ.zzc(this.zzW0L);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzw() {
        long[] jArr = new long[3];
        zzYJS.zzU(this.zzW0L, jArr);
        return new zzYJR(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzx() {
        long[] jArr = new long[3];
        zzYJS.zzW(this.zzW0L, jArr);
        return new zzYJR(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzy() {
        long[] jArr = new long[3];
        zzYJS.zzT(this.zzW0L, jArr);
        return new zzYJR(jArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzz() {
        return this;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02, zzYM0 zzym03) {
        long[] jArr = this.zzW0L;
        long[] jArr2 = ((zzYJR) zzym0).zzW0L;
        long[] jArr3 = ((zzYJR) zzym02).zzW0L;
        long[] jArr4 = ((zzYJR) zzym03).zzW0L;
        long[] jArr5 = new long[6];
        zzYJS.zzV(jArr, jArr2, jArr5);
        zzYJS.zzV(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[3];
        zzYJS.zzV(jArr5, jArr6);
        return new zzYJR(jArr6);
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
        long[] jArr = new long[3];
        zzYJS.zzZ(this.zzW0L, i, jArr);
        return new zzYJR(jArr);
    }

    public zzYJR() {
        this.zzW0L = new long[3];
    }

    public zzYJR(long[] jArr) {
        this.zzW0L = jArr;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02) {
        long[] jArr = this.zzW0L;
        long[] jArr2 = ((zzYJR) zzym0).zzW0L;
        long[] jArr3 = ((zzYJR) zzym02).zzW0L;
        long[] jArr4 = new long[6];
        zzYJS.zzS(jArr, jArr4);
        zzYJS.zzV(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[3];
        zzYJS.zzV(jArr4, jArr5);
        return new zzYJR(jArr5);
    }
}
