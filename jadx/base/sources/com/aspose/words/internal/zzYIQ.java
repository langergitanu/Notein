package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYIQ extends zzYM1.zzZ {

    /* JADX INFO: renamed from: cs */
    protected zzYIP f50962cs;

    public zzYIQ() {
        super(571, 2, 5, 10);
        this.f50962cs = new zzYIP(this, null, null);
        this.f51169P = zzP(BigInteger.valueOf(0L));
        this.f51170Q = zzP(BigInteger.valueOf(1L));
        this.f51171R = new BigInteger(1, zzYGC.decode("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.f51172S = BigInteger.valueOf(4L);
        this.f51173T = 6;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final int getFieldSize() {
        return 571;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM0 zzP(BigInteger bigInteger) {
        return new zzYIR(bigInteger);
    }

    @Override // com.aspose.words.internal.zzYM1.zzZ
    public final boolean zzXzD() {
        return true;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzXzM() {
        return this.f50962cs;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLY zzXzN() {
        return new zzYLH();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM1 zzXzO() {
        return new zzYIQ();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02) {
        return new zzYIP(this, zzym0, zzym02);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final boolean zzeT(int i) {
        return i == 6;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        return new zzYIP(this, zzym0, zzym02, zzym0Arr);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLZ zzZ(zzYLX[] zzylxArr, final int i) {
        final long[] jArr = new long[i * 18];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            zzYLX zzylx = zzylxArr[i3];
            zzYHS.zzZ(((zzYIR) zzylx.zzXzj()).zzW0L, jArr, i2);
            zzYHS.zzZ(((zzYIR) zzylx.zzXzi()).zzW0L, jArr, i2 + 9);
            i2 += 18;
        }
        return new zzYLZ() { // from class: com.aspose.words.internal.zzYIQ.1
            @Override // com.aspose.words.internal.zzYLZ
            public final int getSize() {
                return i;
            }

            @Override // com.aspose.words.internal.zzYLZ
            public final zzYLX zzeS(int i4) {
                long[] jArr2 = new long[9];
                long[] jArr3 = new long[9];
                int i5 = 0;
                for (int i6 = 0; i6 < i; i6++) {
                    long j = ((i6 ^ i4) - 1) >> 31;
                    for (int i7 = 0; i7 < 9; i7++) {
                        long j2 = jArr2[i7];
                        long[] jArr4 = jArr;
                        jArr2[i7] = j2 ^ (jArr4[i5 + i7] & j);
                        jArr3[i7] = jArr3[i7] ^ (jArr4[(i5 + 9) + i7] & j);
                    }
                    i5 += 18;
                }
                return zzYIQ.this.zzZ(new zzYIR(jArr2), new zzYIR(jArr3));
            }
        };
    }
}
