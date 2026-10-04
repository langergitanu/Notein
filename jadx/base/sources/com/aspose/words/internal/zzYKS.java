package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYKS extends zzYM1.zzY {
    public static final BigInteger zzWl0 = new BigInteger(1, zzYGC.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));

    /* JADX INFO: renamed from: by */
    protected zzYKP f51070by;

    public zzYKS() {
        super(zzWl0);
        this.f51070by = new zzYKP(this, null, null);
        this.f51169P = zzP(zzYM2.ZERO);
        this.f51170Q = zzP(BigInteger.valueOf(5L));
        this.f51171R = new BigInteger(1, zzYGC.decode("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.f51172S = BigInteger.valueOf(1L);
        this.f51173T = 2;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final int getFieldSize() {
        return zzWl0.bitLength();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM0 zzP(BigInteger bigInteger) {
        return new zzYKQ(bigInteger);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzXzM() {
        return this.f51070by;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM1 zzXzO() {
        return new zzYKS();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02) {
        return new zzYKP(this, zzym0, zzym02);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final boolean zzeT(int i) {
        return i == 2;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        return new zzYKP(this, zzym0, zzym02, zzym0Arr);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLZ zzZ(zzYLX[] zzylxArr, final int i) {
        final int[] iArr = new int[i * 14];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            zzYLX zzylx = zzylxArr[i3];
            zzYHY.zzX(((zzYKQ) zzylx.zzXzj()).zzW2i, iArr, i2);
            zzYHY.zzX(((zzYKQ) zzylx.zzXzi()).zzW2i, iArr, i2 + 7);
            i2 += 14;
        }
        return new zzYLZ() { // from class: com.aspose.words.internal.zzYKS.1
            @Override // com.aspose.words.internal.zzYLZ
            public final int getSize() {
                return i;
            }

            @Override // com.aspose.words.internal.zzYLZ
            public final zzYLX zzeS(int i4) {
                int[] iArr2 = new int[7];
                int[] iArr3 = new int[7];
                int i5 = 0;
                for (int i6 = 0; i6 < i; i6++) {
                    int i7 = ((i6 ^ i4) - 1) >> 31;
                    for (int i8 = 0; i8 < 7; i8++) {
                        int i9 = iArr2[i8];
                        int[] iArr4 = iArr;
                        iArr2[i8] = i9 ^ (iArr4[i5 + i8] & i7);
                        iArr3[i8] = iArr3[i8] ^ (iArr4[(i5 + 7) + i8] & i7);
                    }
                    i5 += 14;
                }
                return zzYKS.this.zzZ(new zzYKQ(iArr2), new zzYKQ(iArr3));
            }
        };
    }
}
