package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYJQ extends zzYM1.zzZ {

    /* JADX INFO: renamed from: bU */
    protected zzYJP f51012bU;

    public zzYJQ() {
        super(163, 3, 6, 7);
        this.f51012bU = new zzYJP(this, null, null);
        zzYM0 zzym0ZzP = zzP(BigInteger.valueOf(1L));
        this.f51169P = zzym0ZzP;
        this.f51170Q = zzym0ZzP;
        this.f51171R = new BigInteger(1, zzYGC.decode("04000000000000000000020108A2E0CC0D99F8A5EF"));
        this.f51172S = BigInteger.valueOf(2L);
        this.f51173T = 6;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final int getFieldSize() {
        return 163;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM0 zzP(BigInteger bigInteger) {
        return new zzYJR(bigInteger);
    }

    @Override // com.aspose.words.internal.zzYM1.zzZ
    public final boolean zzXzD() {
        return true;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzXzM() {
        return this.f51012bU;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLY zzXzN() {
        return new zzYLH();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM1 zzXzO() {
        return new zzYJQ();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02) {
        return new zzYJP(this, zzym0, zzym02);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final boolean zzeT(int i) {
        return i == 6;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        return new zzYJP(this, zzym0, zzym02, zzym0Arr);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLZ zzZ(zzYLX[] zzylxArr, final int i) {
        final long[] jArr = new long[i * 6];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            zzYLX zzylx = zzylxArr[i3];
            zzYHZ.zzZ(((zzYJR) zzylx.zzXzj()).zzW0L, jArr, i2);
            zzYHZ.zzZ(((zzYJR) zzylx.zzXzi()).zzW0L, jArr, i2 + 3);
            i2 += 6;
        }
        return new zzYLZ() { // from class: com.aspose.words.internal.zzYJQ.1
            @Override // com.aspose.words.internal.zzYLZ
            public final int getSize() {
                return i;
            }

            @Override // com.aspose.words.internal.zzYLZ
            public final zzYLX zzeS(int i4) {
                long[] jArr2 = new long[3];
                long[] jArr3 = new long[3];
                int i5 = 0;
                for (int i6 = 0; i6 < i; i6++) {
                    long j = ((i6 ^ i4) - 1) >> 31;
                    for (int i7 = 0; i7 < 3; i7++) {
                        long j2 = jArr2[i7];
                        long[] jArr4 = jArr;
                        jArr2[i7] = j2 ^ (jArr4[i5 + i7] & j);
                        jArr3[i7] = jArr3[i7] ^ (jArr4[(i5 + 3) + i7] & j);
                    }
                    i5 += 6;
                }
                return zzYJQ.this.zzZ(new zzYJR(jArr2), new zzYJR(jArr3));
            }
        };
    }
}
