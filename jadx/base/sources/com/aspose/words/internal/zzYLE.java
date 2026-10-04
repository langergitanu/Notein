package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYLE extends zzYM1.zzY {
    public static final BigInteger zzWl0 = new BigInteger(1, zzYGC.decode("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* JADX INFO: renamed from: bi */
    protected zzYLB f51109bi;

    public zzYLE() {
        super(zzWl0);
        this.f51109bi = new zzYLB(this, null, null);
        this.f51169P = zzP(new BigInteger(1, zzYGC.decode("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f51170Q = zzP(new BigInteger(1, zzYGC.decode("E87579C11079F43DD824993C2CEE5ED3")));
        this.f51171R = new BigInteger(1, zzYGC.decode("FFFFFFFE0000000075A30D1B9038A115"));
        this.f51172S = BigInteger.valueOf(1L);
        this.f51173T = 2;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final int getFieldSize() {
        return zzWl0.bitLength();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM0 zzP(BigInteger bigInteger) {
        return new zzYLC(bigInteger);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzXzM() {
        return this.f51109bi;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM1 zzXzO() {
        return new zzYLE();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02) {
        return new zzYLB(this, zzym0, zzym02);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final boolean zzeT(int i) {
        return i == 2;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        return new zzYLB(this, zzym0, zzym02, zzym0Arr);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLZ zzZ(zzYLX[] zzylxArr, final int i) {
        final int[] iArr = new int[i * 8];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            zzYLX zzylx = zzylxArr[i3];
            zzYI1.zzX(((zzYLC) zzylx.zzXzj()).zzW2i, iArr, i2);
            zzYI1.zzX(((zzYLC) zzylx.zzXzi()).zzW2i, iArr, i2 + 4);
            i2 += 8;
        }
        return new zzYLZ() { // from class: com.aspose.words.internal.zzYLE.1
            @Override // com.aspose.words.internal.zzYLZ
            public final int getSize() {
                return i;
            }

            @Override // com.aspose.words.internal.zzYLZ
            public final zzYLX zzeS(int i4) {
                int[] iArr2 = new int[4];
                int[] iArr3 = new int[4];
                int i5 = 0;
                for (int i6 = 0; i6 < i; i6++) {
                    int i7 = ((i6 ^ i4) - 1) >> 31;
                    for (int i8 = 0; i8 < 4; i8++) {
                        int i9 = iArr2[i8];
                        int[] iArr4 = iArr;
                        iArr2[i8] = i9 ^ (iArr4[i5 + i8] & i7);
                        iArr3[i8] = iArr3[i8] ^ (iArr4[(i5 + 4) + i8] & i7);
                    }
                    i5 += 8;
                }
                return zzYLE.this.zzZ(new zzYLC(iArr2), new zzYLC(iArr3));
            }
        };
    }
}
