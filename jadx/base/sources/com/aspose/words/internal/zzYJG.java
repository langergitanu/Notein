package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYJG extends zzYM1.zzZ {

    /* JADX INFO: renamed from: cc */
    protected zzYJF f50996cc;

    public zzYJG() {
        super(193, 15, 0, 0);
        this.f50996cc = new zzYJF(this, null, null);
        this.f51169P = zzP(new BigInteger(1, zzYGC.decode("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.f51170Q = zzP(new BigInteger(1, zzYGC.decode("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.f51171R = new BigInteger(1, zzYGC.decode("010000000000000000000000015AAB561B005413CCD4EE99D5"));
        this.f51172S = BigInteger.valueOf(2L);
        this.f51173T = 6;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final int getFieldSize() {
        return 193;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM0 zzP(BigInteger bigInteger) {
        return new zzYJJ(bigInteger);
    }

    @Override // com.aspose.words.internal.zzYM1.zzZ
    public final boolean zzXzD() {
        return false;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzXzM() {
        return this.f50996cc;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM1 zzXzO() {
        return new zzYJG();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02) {
        return new zzYJF(this, zzym0, zzym02);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final boolean zzeT(int i) {
        return i == 6;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        return new zzYJF(this, zzym0, zzym02, zzym0Arr);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLZ zzZ(zzYLX[] zzylxArr, final int i) {
        final long[] jArr = new long[i * 8];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            zzYLX zzylx = zzylxArr[i3];
            zzYHX.zzZ(((zzYJJ) zzylx.zzXzj()).zzW0L, jArr, i2);
            zzYHX.zzZ(((zzYJJ) zzylx.zzXzi()).zzW0L, jArr, i2 + 4);
            i2 += 8;
        }
        return new zzYLZ() { // from class: com.aspose.words.internal.zzYJG.1
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
                return zzYJG.this.zzZ(new zzYJJ(jArr2), new zzYJJ(jArr3));
            }
        };
    }
}
