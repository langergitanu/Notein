package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYJ6 extends zzYM1.zzZ {

    /* JADX INFO: renamed from: ci */
    protected zzYJ5 f50984ci;

    public zzYJ6() {
        super(239, 158, 0, 0);
        this.f50984ci = new zzYJ5(this, null, null);
        this.f51169P = zzP(BigInteger.valueOf(0L));
        this.f51170Q = zzP(BigInteger.valueOf(1L));
        this.f51171R = new BigInteger(1, zzYGC.decode("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.f51172S = BigInteger.valueOf(4L);
        this.f51173T = 6;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final int getFieldSize() {
        return 239;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM0 zzP(BigInteger bigInteger) {
        return new zzYJ7(bigInteger);
    }

    @Override // com.aspose.words.internal.zzYM1.zzZ
    public final boolean zzXzD() {
        return true;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzXzM() {
        return this.f50984ci;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLY zzXzN() {
        return new zzYLH();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM1 zzXzO() {
        return new zzYJ6();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02) {
        return new zzYJ5(this, zzym0, zzym02);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final boolean zzeT(int i) {
        return i == 6;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        return new zzYJ5(this, zzym0, zzym02, zzym0Arr);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLZ zzZ(zzYLX[] zzylxArr, final int i) {
        final long[] jArr = new long[i * 8];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            zzYLX zzylx = zzylxArr[i3];
            zzYHX.zzZ(((zzYJ7) zzylx.zzXzj()).zzW0L, jArr, i2);
            zzYHX.zzZ(((zzYJ7) zzylx.zzXzi()).zzW0L, jArr, i2 + 4);
            i2 += 8;
        }
        return new zzYLZ() { // from class: com.aspose.words.internal.zzYJ6.1
            @Override // com.aspose.words.internal.zzYLZ
            public final int getSize() {
                return i;
            }

            @Override // com.aspose.words.internal.zzYLZ
            public final zzYLX zzeS(int i4) {
                long[] jArr2 = new long[4];
                long[] jArr3 = new long[4];
                int i5 = 0;
                for (int i6 = 0; i6 < i; i6++) {
                    long j = ((i6 ^ i4) - 1) >> 31;
                    for (int i7 = 0; i7 < 4; i7++) {
                        long j2 = jArr2[i7];
                        long[] jArr4 = jArr;
                        jArr2[i7] = j2 ^ (jArr4[i5 + i7] & j);
                        jArr3[i7] = jArr3[i7] ^ (jArr4[(i5 + 4) + i7] & j);
                    }
                    i5 += 8;
                }
                return zzYJ6.this.zzZ(new zzYJ7(jArr2), new zzYJ7(jArr3));
            }
        };
    }
}
