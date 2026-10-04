package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYK0 extends zzYM1.zzZ {

    /* JADX INFO: renamed from: bN */
    protected zzYJZ f51026bN;

    public zzYK0() {
        super(113, 9, 0, 0);
        this.f51026bN = new zzYJZ(this, null, null);
        this.f51169P = zzP(new BigInteger(1, zzYGC.decode("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.f51170Q = zzP(new BigInteger(1, zzYGC.decode("0095E9A9EC9B297BD4BF36E059184F")));
        this.f51171R = new BigInteger(1, zzYGC.decode("010000000000000108789B2496AF93"));
        this.f51172S = BigInteger.valueOf(2L);
        this.f51173T = 6;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final int getFieldSize() {
        return 113;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM0 zzP(BigInteger bigInteger) {
        return new zzYK3(bigInteger);
    }

    @Override // com.aspose.words.internal.zzYM1.zzZ
    public final boolean zzXzD() {
        return false;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzXzM() {
        return this.f51026bN;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM1 zzXzO() {
        return new zzYK0();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02) {
        return new zzYJZ(this, zzym0, zzym02);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final boolean zzeT(int i) {
        return i == 6;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        return new zzYJZ(this, zzym0, zzym02, zzym0Arr);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLZ zzZ(zzYLX[] zzylxArr, final int i) {
        final long[] jArr = new long[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            zzYLX zzylx = zzylxArr[i3];
            zzYI1.zzZ(((zzYK3) zzylx.zzXzj()).zzW0L, jArr, i2);
            zzYI1.zzZ(((zzYK3) zzylx.zzXzi()).zzW0L, jArr, i2 + 2);
            i2 += 4;
        }
        return new zzYLZ() { // from class: com.aspose.words.internal.zzYK0.1
            @Override // com.aspose.words.internal.zzYLZ
            public final int getSize() {
                return i;
            }

            @Override // com.aspose.words.internal.zzYLZ
            public final zzYLX zzeS(int i4) {
                long[] jArr2 = new long[2];
                long[] jArr3 = new long[2];
                int i5 = 0;
                for (int i6 = 0; i6 < i; i6++) {
                    long j = ((i6 ^ i4) - 1) >> 31;
                    for (int i7 = 0; i7 < 2; i7++) {
                        long j2 = jArr2[i7];
                        long[] jArr4 = jArr;
                        jArr2[i7] = j2 ^ (jArr4[i5 + i7] & j);
                        jArr3[i7] = jArr3[i7] ^ (jArr4[(i5 + 2) + i7] & j);
                    }
                    i5 += 4;
                }
                return zzYK0.this.zzZ(new zzYK3(jArr2), new zzYK3(jArr3));
            }
        };
    }
}
