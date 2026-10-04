package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYKK extends zzYM1.zzY {
    public static final BigInteger zzWl0 = new BigInteger(1, zzYGC.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));

    /* JADX INFO: renamed from: bD */
    protected zzYKH f51055bD;

    public zzYKK() {
        super(zzWl0);
        this.f51055bD = new zzYKH(this, null, null);
        this.f51169P = zzP(zzYM2.ZERO);
        this.f51170Q = zzP(BigInteger.valueOf(7L));
        this.f51171R = new BigInteger(1, zzYGC.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
        this.f51172S = BigInteger.valueOf(1L);
        this.f51173T = 2;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final int getFieldSize() {
        return zzWl0.bitLength();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM0 zzP(BigInteger bigInteger) {
        return new zzYKI(bigInteger);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzXzM() {
        return this.f51055bD;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYM1 zzXzO() {
        return new zzYKK();
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02) {
        return new zzYKH(this, zzym0, zzym02);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final boolean zzeT(int i) {
        return i == 2;
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        return new zzYKH(this, zzym0, zzym02, zzym0Arr);
    }

    @Override // com.aspose.words.internal.zzYM1
    public final zzYLZ zzZ(zzYLX[] zzylxArr, final int i) {
        final int[] iArr = new int[i * 16];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            zzYLX zzylx = zzylxArr[i3];
            zzYHX.zzX(((zzYKI) zzylx.zzXzj()).zzW2i, iArr, i2);
            zzYHX.zzX(((zzYKI) zzylx.zzXzi()).zzW2i, iArr, i2 + 8);
            i2 += 16;
        }
        return new zzYLZ() { // from class: com.aspose.words.internal.zzYKK.1
            @Override // com.aspose.words.internal.zzYLZ
            public final int getSize() {
                return i;
            }

            @Override // com.aspose.words.internal.zzYLZ
            public final zzYLX zzeS(int i4) {
                int[] iArr2 = new int[8];
                int[] iArr3 = new int[8];
                int i5 = 0;
                for (int i6 = 0; i6 < i; i6++) {
                    int i7 = ((i6 ^ i4) - 1) >> 31;
                    for (int i8 = 0; i8 < 8; i8++) {
                        int i9 = iArr2[i8];
                        int[] iArr4 = iArr;
                        iArr2[i8] = i9 ^ (iArr4[i5 + i8] & i7);
                        iArr3[i8] = iArr3[i8] ^ (iArr4[(i5 + 8) + i8] & i7);
                    }
                    i5 += 16;
                }
                return zzYKK.this.zzZ(new zzYKI(iArr2), new zzYKI(iArr3));
            }
        };
    }
}
