package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;
import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYJ0 extends zzYM1.zzZ {

    /* JADX INFO: renamed from: cm */
    protected zzYIZ f50975cm;

    public zzYJ0() {
        super(StyleIdentifier.GRID_TABLE_4_ACCENT_1, 5, 7, 12);
        this.f50975cm = new zzYIZ(this, null, null);
        this.f51169P = zzP(BigInteger.valueOf(1L));
        this.f51170Q = zzP(new BigInteger(1, zzYGC.decode("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5")));
        this.f51171R = new BigInteger(1, zzYGC.decode("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307"));
        this.f51172S = BigInteger.valueOf(2L);
        this.f51173T = 6;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final int getFieldSize() {
        return StyleIdentifier.GRID_TABLE_4_ACCENT_1;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM0 zzP(BigInteger bigInteger) {
        return new zzYJ3(bigInteger);
    }

    @Override // com.aspose.words.internal.zzYM1.zzZ
    public final boolean zzXzD() {
        return false;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzXzM() {
        return this.f50975cm;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM1 zzXzO() {
        return new zzYJ0();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02) {
        return new zzYIZ(this, zzym0, zzym02);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final boolean zzeT(int i) {
        return i == 6;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        return new zzYIZ(this, zzym0, zzym02, zzym0Arr);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLZ zzZ(zzYLX[] zzylxArr, final int i) {
        final long[] jArr = new long[i * 10];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            zzYLX zzylx = zzylxArr[i3];
            zzYHW.zzZ(((zzYJ3) zzylx.zzXzj()).zzW0L, jArr, i2);
            zzYHW.zzZ(((zzYJ3) zzylx.zzXzi()).zzW0L, jArr, i2 + 5);
            i2 += 10;
        }
        return new zzYLZ() { // from class: com.aspose.words.internal.zzYJ0.1
            @Override // com.aspose.words.internal.zzYLZ
            public final int getSize() {
                return i;
            }

            @Override // com.aspose.words.internal.zzYLZ
            public final zzYLX zzeS(int i4) {
                long[] jArr2 = new long[5];
                long[] jArr3 = new long[5];
                int i5 = 0;
                for (int i6 = 0; i6 < i; i6++) {
                    long j = ((i6 ^ i4) - 1) >> 31;
                    for (int i7 = 0; i7 < 5; i7++) {
                        long j2 = jArr2[i7];
                        long[] jArr4 = jArr;
                        jArr2[i7] = j2 ^ (jArr4[i5 + i7] & j);
                        jArr3[i7] = jArr3[i7] ^ (jArr4[(i5 + 5) + i7] & j);
                    }
                    i5 += 10;
                }
                return zzYJ0.this.zzZ(new zzYJ3(jArr2), new zzYJ3(jArr3));
            }
        };
    }
}
