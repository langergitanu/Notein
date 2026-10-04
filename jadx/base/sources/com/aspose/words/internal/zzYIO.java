package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYIO extends zzYM1.zzZ {

    /* JADX INFO: renamed from: cv */
    static final zzYIR f50956cv;

    /* JADX INFO: renamed from: cw */
    static final zzYIR f50957cw;

    /* JADX INFO: renamed from: cu */
    protected zzYIN f50958cu;

    static {
        zzYIR zzyir = new zzYIR(new BigInteger(1, zzYGC.decode("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        f50956cv = zzyir;
        f50957cw = (zzYIR) zzyir.zzXzw();
    }

    public zzYIO() {
        super(571, 2, 5, 10);
        this.f50958cu = new zzYIN(this, null, null);
        this.f51169P = zzP(BigInteger.valueOf(1L));
        this.f51170Q = f50956cv;
        this.f51171R = new BigInteger(1, zzYGC.decode("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        this.f51172S = BigInteger.valueOf(2L);
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
        return false;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzXzM() {
        return this.f50958cu;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM1 zzXzO() {
        return new zzYIO();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02) {
        return new zzYIN(this, zzym0, zzym02);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final boolean zzeT(int i) {
        return i == 6;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        return new zzYIN(this, zzym0, zzym02, zzym0Arr);
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
        return new zzYLZ() { // from class: com.aspose.words.internal.zzYIO.1
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
                return zzYIO.this.zzZ(new zzYIR(jArr2), new zzYIR(jArr3));
            }
        };
    }
}
