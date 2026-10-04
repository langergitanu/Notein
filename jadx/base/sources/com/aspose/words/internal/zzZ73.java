package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ73 extends zzZDB implements zzZ6W {
    private byte[] zzWoA;
    private zzYM1 zzWoB;
    private zzZDA zzWoz;

    public zzZ73(zzYM1 zzym1, byte[] bArr) {
        this.zzWoz = null;
        this.zzWoB = zzym1;
        this.zzWoA = zzYGU.zzVI(bArr);
        zzXHw();
    }

    private void zzXHw() {
        if (zzYM3.zzX(this.zzWoB.zzXzL())) {
            this.zzWoz = zzZ6W.zzWok;
        } else {
            if (!zzYM3.zzY(this.zzWoB.zzXzL())) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            this.zzWoz = zzZ6W.zzWoj;
        }
    }

    public final byte[] getSeed() {
        return zzYGU.zzVI(this.zzWoA);
    }

    public final zzYM1 zzXHv() {
        return this.zzWoB;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        if (this.zzWoz.equals(zzZ6W.zzWok) || this.zzWoz.equals(zzZ6W.zzWoj)) {
            zzzdj.zzZ(new zzZ6Z(this.zzWoB.zzXzK()).zzXL0());
            zzzdj.zzZ(new zzZ6Z(this.zzWoB.zzXzJ()).zzXL0());
        }
        byte[] bArr = this.zzWoA;
        if (bArr != null) {
            zzzdj.zzZ(new zzZCG(bArr));
        }
        return new zzZC2(zzzdj);
    }

    public zzZ73(zzZ6Y zzz6y, BigInteger bigInteger, BigInteger bigInteger2, zzZD4 zzzd4) {
        int iIntValue;
        int iIntValue2;
        int i;
        this.zzWoz = null;
        zzZDA zzzdaZzXHq = zzz6y.zzXHq();
        this.zzWoz = zzzdaZzXHq;
        if (zzzdaZzXHq.equals(zzZ6W.zzWok)) {
            this.zzWoB = new zzYM1.zzV(((zzZDD) zzz6y.zzXHx()).zzXKZ(), new BigInteger(1, zzZD9.zzYz(zzzd4.zzg6(0)).zzXL5()), new BigInteger(1, zzZD9.zzYz(zzzd4.zzg6(1)).zzXL5()), bigInteger, bigInteger2);
        } else if (this.zzWoz.equals(zzZ6W.zzWoj)) {
            zzZD4 zzzd4ZzYy = zzZD4.zzYy(zzz6y.zzXHx());
            int iIntValue3 = ((zzZDD) zzzd4ZzYy.zzg6(0)).zzXKZ().intValue();
            zzZDA zzzda = (zzZDA) zzzd4ZzYy.zzg6(1);
            if (zzzda.equals(zzZ6W.zzWoh)) {
                iIntValue2 = zzZDD.zzYB(zzzd4ZzYy.zzg6(2)).zzXKZ().intValue();
                i = 0;
                iIntValue = 0;
            } else if (zzzda.equals(zzZ6W.zzWog)) {
                zzZD4 zzzd4ZzYy2 = zzZD4.zzYy(zzzd4ZzYy.zzg6(2));
                int iIntValue4 = zzZDD.zzYB(zzzd4ZzYy2.zzg6(0)).zzXKZ().intValue();
                int iIntValue5 = zzZDD.zzYB(zzzd4ZzYy2.zzg6(1)).zzXKZ().intValue();
                iIntValue = zzZDD.zzYB(zzzd4ZzYy2.zzg6(2)).zzXKZ().intValue();
                iIntValue2 = iIntValue4;
                i = iIntValue5;
            } else {
                throw new IllegalArgumentException("This type of EC basis is not implemented");
            }
            this.zzWoB = new zzYM1.zzW(iIntValue3, iIntValue2, i, iIntValue, new BigInteger(1, zzZD9.zzYz(zzzd4.zzg6(0)).zzXL5()), new BigInteger(1, zzZD9.zzYz(zzzd4.zzg6(1)).zzXL5()), bigInteger, bigInteger2);
        } else {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
        if (zzzd4.size() == 3) {
            this.zzWoA = zzYGU.zzVI(((zzZCG) zzzd4.zzg6(2)).getBytes());
        }
    }
}
