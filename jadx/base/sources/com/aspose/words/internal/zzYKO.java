package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYKO extends zzYM1.zzY {
    public static final BigInteger zzWl0 = new BigInteger(1, zzYGC.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));

    /* JADX INFO: renamed from: bB */
    protected zzYKL f51062bB;

    public zzYKO() {
        super(zzWl0);
        this.f51062bB = new zzYKL(this, null, null);
        this.f51169P = zzP(new BigInteger(1, zzYGC.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.f51170Q = zzP(new BigInteger(1, zzYGC.decode("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.f51171R = new BigInteger(1, zzYGC.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.f51172S = BigInteger.valueOf(1L);
        this.f51173T = 2;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final int getFieldSize() {
        return zzWl0.bitLength();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM0 zzP(BigInteger bigInteger) {
        return new zzYKM(bigInteger);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzXzM() {
        return this.f51062bB;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM1 zzXzO() {
        return new zzYKO();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02) {
        return new zzYKL(this, zzym0, zzym02);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final boolean zzeT(int i) {
        return i == 2;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        return new zzYKL(this, zzym0, zzym02, zzym0Arr);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLZ zzZ(zzYLX[] zzylxArr, final int i) {
        final int[] iArr = new int[i * 14];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            zzYLX zzylx = zzylxArr[i3];
            zzYHY.zzX(((zzYKM) zzylx.zzXzj()).zzW2i, iArr, i2);
            zzYHY.zzX(((zzYKM) zzylx.zzXzi()).zzW2i, iArr, i2 + 7);
            i2 += 14;
        }
        return new zzYLZ() { // from class: com.aspose.words.internal.zzYKO.1
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
                return zzYKO.this.zzZ(new zzYKM(iArr2), new zzYKM(iArr3));
            }
        };
    }
}
