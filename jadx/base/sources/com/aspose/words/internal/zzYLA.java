package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYLA extends zzYM1.zzY {
    public static final BigInteger zzWl0 = zzYL4.zzWl0;

    /* JADX INFO: renamed from: bo */
    protected zzYL9 f51102bo;

    public zzYLA() {
        super(zzWl0);
        this.f51102bo = new zzYL9(this, null, null);
        this.f51169P = zzP(zzYM2.ZERO);
        this.f51170Q = zzP(BigInteger.valueOf(7L));
        this.f51171R = new BigInteger(1, zzYGC.decode("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.f51172S = BigInteger.valueOf(1L);
        this.f51173T = 2;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final int getFieldSize() {
        return zzWl0.bitLength();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM0 zzP(BigInteger bigInteger) {
        return new zzYL2(bigInteger);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzXzM() {
        return this.f51102bo;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM1 zzXzO() {
        return new zzYLA();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02) {
        return new zzYL9(this, zzym0, zzym02);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final boolean zzeT(int i) {
        return i == 2;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        return new zzYL9(this, zzym0, zzym02, zzym0Arr);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLZ zzZ(zzYLX[] zzylxArr, final int i) {
        final int[] iArr = new int[i * 10];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            zzYLX zzylx = zzylxArr[i3];
            zzYI0.zzX(((zzYL2) zzylx.zzXzj()).zzW2i, iArr, i2);
            zzYI0.zzX(((zzYL2) zzylx.zzXzi()).zzW2i, iArr, i2 + 5);
            i2 += 10;
        }
        return new zzYLZ() { // from class: com.aspose.words.internal.zzYLA.1
            @Override // com.aspose.words.internal.zzYLZ
            public final int getSize() {
                return i;
            }

            @Override // com.aspose.words.internal.zzYLZ
            public final zzYLX zzeS(int i4) {
                int[] iArr2 = new int[5];
                int[] iArr3 = new int[5];
                int i5 = 0;
                for (int i6 = 0; i6 < i; i6++) {
                    int i7 = ((i6 ^ i4) - 1) >> 31;
                    for (int i8 = 0; i8 < 5; i8++) {
                        int i9 = iArr2[i8];
                        int[] iArr4 = iArr;
                        iArr2[i8] = i9 ^ (iArr4[i5 + i8] & i7);
                        iArr3[i8] = iArr3[i8] ^ (iArr4[(i5 + 5) + i8] & i7);
                    }
                    i5 += 10;
                }
                return zzYLA.this.zzZ(new zzYL2(iArr2), new zzYL2(iArr3));
            }
        };
    }
}
