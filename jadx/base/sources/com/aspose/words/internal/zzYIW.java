package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYIW extends zzYM1.zzZ {

    /* JADX INFO: renamed from: co */
    protected zzYIV f50971co;

    public zzYIW() {
        super(409, 87, 0, 0);
        this.f50971co = new zzYIV(this, null, null);
        this.f51169P = zzP(BigInteger.valueOf(0L));
        this.f51170Q = zzP(BigInteger.valueOf(1L));
        this.f51171R = new BigInteger(1, zzYGC.decode("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF"));
        this.f51172S = BigInteger.valueOf(4L);
        this.f51173T = 6;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final int getFieldSize() {
        return 409;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM0 zzP(BigInteger bigInteger) {
        return new zzYIX(bigInteger);
    }

    @Override // com.aspose.words.internal.zzYM1.zzZ
    public final boolean zzXzD() {
        return true;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzXzM() {
        return this.f50971co;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLY zzXzN() {
        return new zzYLH();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM1 zzXzO() {
        return new zzYIW();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02) {
        return new zzYIV(this, zzym0, zzym02);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final boolean zzeT(int i) {
        return i == 6;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        return new zzYIV(this, zzym0, zzym02, zzym0Arr);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLZ zzZ(zzYLX[] zzylxArr, final int i) {
        final long[] jArr = new long[i * 14];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            zzYLX zzylx = zzylxArr[i3];
            zzYHU.zzZ(((zzYIX) zzylx.zzXzj()).zzW0L, jArr, i2);
            zzYHU.zzZ(((zzYIX) zzylx.zzXzi()).zzW0L, jArr, i2 + 7);
            i2 += 14;
        }
        return new zzYLZ() { // from class: com.aspose.words.internal.zzYIW.1
            @Override // com.aspose.words.internal.zzYLZ
            public final int getSize() {
                return i;
            }

            @Override // com.aspose.words.internal.zzYLZ
            public final zzYLX zzeS(int i4) {
                long[] jArr2 = new long[7];
                long[] jArr3 = new long[7];
                int i5 = 0;
                for (int i6 = 0; i6 < i; i6++) {
                    long j = ((i6 ^ i4) - 1) >> 31;
                    for (int i7 = 0; i7 < 7; i7++) {
                        long j2 = jArr2[i7];
                        long[] jArr4 = jArr;
                        jArr2[i7] = j2 ^ (jArr4[i5 + i7] & j);
                        jArr3[i7] = jArr3[i7] ^ (jArr4[(i5 + 7) + i7] & j);
                    }
                    i5 += 14;
                }
                return zzYIW.this.zzZ(new zzYIX(jArr2), new zzYIX(jArr3));
            }
        };
    }
}
