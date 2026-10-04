package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ72 extends zzZDB implements zzZ6W {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private byte[] zzWoA;
    private zzYM1 zzWoB;
    private BigInteger zzWov;
    private BigInteger zzWow;
    private zzZ70 zzWox;
    private zzZ6Y zzWoy;

    private zzZ72(zzZD4 zzzd4) {
        if (!(zzzd4.zzg6(0) instanceof zzZDD) || !((zzZDD) zzzd4.zzg6(0)).zzXKZ().equals(ONE)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        this.zzWow = ((zzZDD) zzzd4.zzg6(4)).zzXKZ();
        if (zzzd4.size() == 6) {
            this.zzWov = ((zzZDD) zzzd4.zzg6(5)).zzXKZ();
        }
        zzZ73 zzz73 = new zzZ73(zzZ6Y.zzWQ(zzzd4.zzg6(1)), this.zzWow, this.zzWov, zzZD4.zzYy(zzzd4.zzg6(2)));
        this.zzWoB = zzz73.zzXHv();
        zzZDK zzzdkZzg6 = zzzd4.zzg6(3);
        if (zzzdkZzg6 instanceof zzZ70) {
            this.zzWox = (zzZ70) zzzdkZzg6;
        } else {
            this.zzWox = new zzZ70(this.zzWoB, (zzZD9) zzzdkZzg6);
        }
        this.zzWoA = zzz73.getSeed();
    }

    public static zzZ72 zzWR(Object obj) {
        if (obj instanceof zzZ72) {
            return (zzZ72) obj;
        }
        if (obj != null) {
            return new zzZ72(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final byte[] getSeed() {
        return zzYGU.zzVI(this.zzWoA);
    }

    public final BigInteger zzXHt() {
        return this.zzWov;
    }

    public final zzYLX zzXHu() {
        return this.zzWox.zzXHr();
    }

    public final zzYM1 zzXHv() {
        return this.zzWoB;
    }

    public final BigInteger zzXIz() {
        return this.zzWow;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(new zzZDD(ONE));
        zzzdj.zzZ(this.zzWoy);
        zzzdj.zzZ(new zzZ73(this.zzWoB, this.zzWoA));
        zzzdj.zzZ(this.zzWox);
        zzzdj.zzZ(new zzZDD(this.zzWow));
        BigInteger bigInteger = this.zzWov;
        if (bigInteger != null) {
            zzzdj.zzZ(new zzZDD(bigInteger));
        }
        return new zzZC2(zzzdj);
    }

    public zzZ72(zzYM1 zzym1, zzZ70 zzz70, BigInteger bigInteger, BigInteger bigInteger2) {
        this(zzym1, zzz70, bigInteger, bigInteger2, (byte[]) null);
    }

    public zzZ72(zzYM1 zzym1, zzYLX zzylx, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this(zzym1, new zzZ70(zzylx), bigInteger, bigInteger2, bArr);
    }

    public zzZ72(zzYM1 zzym1, zzZ70 zzz70, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.zzWoB = zzym1;
        this.zzWox = zzz70;
        this.zzWow = bigInteger;
        this.zzWov = bigInteger2;
        this.zzWoA = zzYGU.zzVI(bArr);
        if (zzYM3.zzX(zzym1.zzXzL())) {
            this.zzWoy = new zzZ6Y(zzym1.zzXzL().zzXyD());
            return;
        }
        if (zzYM3.zzY(zzym1.zzXzL())) {
            int[] iArrZzXyC = ((zzYI6) zzym1.zzXzL()).zzXyB().zzXyC();
            if (iArrZzXyC.length == 3) {
                this.zzWoy = new zzZ6Y(iArrZzXyC[2], iArrZzXyC[1]);
                return;
            } else {
                if (iArrZzXyC.length == 5) {
                    this.zzWoy = new zzZ6Y(iArrZzXyC[4], iArrZzXyC[1], iArrZzXyC[2], iArrZzXyC[3]);
                    return;
                }
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
        }
        throw new IllegalArgumentException("'curve' is of an unsupported type");
    }
}
