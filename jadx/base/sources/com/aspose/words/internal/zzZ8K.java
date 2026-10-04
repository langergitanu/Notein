package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ8K extends zzZDB {
    zzZDD zzWEn;
    BigInteger zzWGz;
    zzZD9 zzWtj;
    zzZDD zzWtk;
    zzZD9 zzWtl;
    zzZ8L zzWtm;

    public zzZ8K(zzZ33 zzz33) {
        this.zzWGz = BigInteger.valueOf(0L);
        zzYM1 zzym1ZzXHv = zzz33.zzXHv();
        if (!zzYM3.zzY(zzym1ZzXHv.zzXzL())) {
            throw new IllegalArgumentException("only binary domain is possible");
        }
        int[] iArrZzXyC = ((zzYI6) zzym1ZzXHv.zzXzL()).zzXyB().zzXyC();
        if (iArrZzXyC.length == 3) {
            this.zzWtm = new zzZ8L(iArrZzXyC[2], iArrZzXyC[1]);
        } else {
            if (iArrZzXyC.length != 5) {
                throw new IllegalArgumentException("curve must have a trinomial or pentanomial basis");
            }
            this.zzWtm = new zzZ8L(iArrZzXyC[4], iArrZzXyC[1], iArrZzXyC[2], iArrZzXyC[3]);
        }
        this.zzWEn = new zzZDD(zzym1ZzXHv.zzXzK().toBigInteger());
        this.zzWtl = new zzZC6(zzym1ZzXHv.zzXzJ().getEncoded());
        this.zzWtk = new zzZDD(zzz33.zzXIz());
        this.zzWtj = new zzZC6(zzZ8H.zzZ(zzz33.zzXHu()));
    }

    public static zzZ8K zzXt(Object obj) {
        if (obj instanceof zzZ8K) {
            return (zzZ8K) obj;
        }
        if (obj != null) {
            return new zzZ8K(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final BigInteger getA() {
        return this.zzWEn.zzXKZ();
    }

    public final byte[] zzN7() {
        return zzYGU.zzVI(this.zzWtj.zzXL5());
    }

    public final byte[] zzXIA() {
        return zzYGU.zzVI(this.zzWtl.zzXL5());
    }

    public final zzZ8L zzXIB() {
        return this.zzWtm;
    }

    public final BigInteger zzXIz() {
        return this.zzWtk.zzXKZ();
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        if (this.zzWGz.compareTo(BigInteger.valueOf(0L)) != 0) {
            zzzdj.zzZ(new zzZBX(true, 0, new zzZDD(this.zzWGz)));
        }
        zzzdj.zzZ(this.zzWtm);
        zzzdj.zzZ(this.zzWEn);
        zzzdj.zzZ(this.zzWtl);
        zzzdj.zzZ(this.zzWtk);
        zzzdj.zzZ(this.zzWtj);
        return new zzZC2(zzzdj);
    }

    private zzZ8K(zzZD4 zzzd4) {
        this.zzWGz = BigInteger.valueOf(0L);
        int i = 0;
        if (zzzd4.zzg6(0) instanceof zzZCY) {
            zzZCY zzzcy = (zzZCY) zzzd4.zzg6(0);
            if (zzzcy.zzXKx() && zzzcy.zzXKy() == 0) {
                this.zzWGz = zzZDD.zzYB(zzzcy.zzXKI()).zzXKZ();
                i = 1;
            } else {
                throw new IllegalArgumentException("object parse error");
            }
        }
        this.zzWtm = zzZ8L.zzXu(zzzd4.zzg6(i));
        this.zzWEn = zzZDD.zzYB(zzzd4.zzg6(i + 1));
        this.zzWtl = zzZD9.zzYz(zzzd4.zzg6(i + 2));
        this.zzWtk = zzZDD.zzYB(zzzd4.zzg6(i + 3));
        this.zzWtj = zzZD9.zzYz(zzzd4.zzg6(i + 4));
    }
}
