package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzGB implements Cloneable {
    private zzZCB zzZfn;
    private static zzGB zzZfm = zzZOp();
    private static zzGB zzZfl = zzZOo();
    private static zzGB zzZfk = zzZOn();

    public static class zzZ implements zzZCA, Cloneable {
        private zzGB zzZfj;

        public zzZ(zzGB zzgb) {
            this.zzZfj = zzgb;
        }

        private Object memberwiseClone() {
            try {
                return clone();
            } catch (CloneNotSupportedException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.aspose.words.zzZCA
        public final zzZCA zzZOl() {
            zzZ zzz = (zzZ) memberwiseClone();
            zzGB zzgb = this.zzZfj;
            if (zzgb != null) {
                zzz.zzZfj = zzgb.zzZOr();
            }
            return zzz;
        }

        @Override // com.aspose.words.zzZCA
        public final zzZCB zzZOm() {
            zzGB zzgb = this.zzZfj;
            if (zzgb != null) {
                return zzgb.zzZfn;
            }
            return null;
        }
    }

    public zzGB(DocumentBase documentBase, boolean z) {
        this(zzZ(documentBase, z));
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static zzGB zzZOn() {
        zzGB zzgbZzZOp = zzZOp();
        zzgbZzZOp.zzL(16, 3);
        zzgbZzZOp.zzL(17, 3);
        return zzgbZzZOp;
    }

    private static zzGB zzZOo() {
        zzGB zzgbZzZOp = zzZOp();
        zzgbZzZOp.zzL(16, 0);
        zzgbZzZOp.zzL(17, 0);
        return zzgbZzZOp;
    }

    private static zzGB zzZOp() {
        zzGB zzgb = new zzGB();
        zzgb.zzL(0, 0);
        Boolean bool = Boolean.FALSE;
        zzgb.zzL(1, bool);
        zzgb.zzL(2, bool);
        zzgb.zzL(3, 0);
        zzgb.zzL(4, 0);
        zzgb.zzL(5, 0);
        zzgb.zzL(6, Double.valueOf(0.0d));
        zzgb.zzL(7, 0);
        zzgb.zzL(8, 0);
        zzgb.zzL(10, 0);
        zzgb.zzL(11, 100);
        zzgb.zzL(13, 0);
        zzgb.zzL(15, 0);
        zzgb.zzL(16, 2);
        zzgb.zzL(17, 3);
        zzgb.zzL(20, bool);
        zzgb.zzL(24, 2);
        zzgb.zzL(25, 1);
        zzgb.zzL(26, Boolean.TRUE);
        zzgb.zzL(28, 1);
        zzgb.zzL(32, bool);
        return zzgb;
    }

    public final void zzL(int i, Object obj) {
        this.zzZfn.zzL(i, obj);
    }

    public final Object zzLu(int i) {
        return this.zzZfn.zzLu(i);
    }

    public final Object zzLv(int i) {
        return this.zzZfn.zzLv(i);
    }

    public final boolean zzZOq() {
        return this.zzZfn.zzLh(23);
    }

    public final zzGB zzZOr() {
        zzGB zzgb = (zzGB) memberwiseClone();
        zzgb.zzZfn = this.zzZfn.zzZzY();
        zzgb.zzL(23, ((zzD9) zzLv(23)).zzZI4());
        zzgb.zzL(31, ((zzCL) zzLv(31)).zzZGr());
        zzgb.zzL(12, ((zzZVY) zzLv(12)).zzZk3());
        zzgb.zzL(14, ((zzZVY) zzLv(14)).zzZk3());
        zzgb.zzL(22, ((AxisScaling) zzLv(22)).zzaW());
        zzET zzet = (zzET) zzLu(18);
        if (zzet != null) {
            zzgb.zzL(18, zzet.zzZLN());
        }
        zzET zzet2 = (zzET) zzLu(19);
        if (zzet2 != null) {
            zzgb.zzL(19, zzet2.zzZLN());
        }
        zzZ(27, zzgb);
        zzZ(29, zzgb);
        zzZ(30, zzgb);
        AxisDisplayUnit axisDisplayUnit = (AxisDisplayUnit) zzLu(9);
        if (axisDisplayUnit != null) {
            zzgb.zzL(9, axisDisplayUnit.zzb0());
        }
        zzE8 zze8 = (zzE8) zzLu(21);
        if (zze8 != null) {
            zzgb.zzL(21, zze8.zzZLc());
        }
        return zzgb;
    }

    private zzGB() {
        this(null);
    }

    private void zzZ(int i, zzGB zzgb) {
        com.aspose.words.internal.zzZYG zzzyg = (com.aspose.words.internal.zzZYG) zzLu(i);
        if (zzzyg != null) {
            zzgb.zzL(i, zz80.zzN(zzzyg));
        }
    }

    private zzGB(zzGB zzgb) {
        zz6R zz6r = new zz6R();
        this.zzZfn = zz6r;
        if (zzgb != null) {
            zz6r.zzZ(new zzZ(zzgb));
        }
        this.zzZfn.zzL(23, new zzD9());
        this.zzZfn.zzL(31, new zzCL());
        this.zzZfn.zzL(12, zzZVY.zzXb(1.0d));
        this.zzZfn.zzL(14, zzZVY.zzXb(0.5d));
        this.zzZfn.zzL(22, new AxisScaling());
    }

    private static zzGB zzZ(DocumentBase documentBase, boolean z) {
        if (z) {
            return zzZfk;
        }
        return zzCG.zzV(documentBase) ? zzZfm : zzZfl;
    }
}
