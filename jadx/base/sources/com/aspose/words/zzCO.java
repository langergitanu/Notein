package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzCO implements Cloneable {
    private static zzCO zzZ9y;
    private zzZCB zzZf9;

    public static class zzZ implements zzZCA, Cloneable {
        private zzCO zzZ9x;

        public zzZ(zzCO zzco) {
            this.zzZ9x = zzco;
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
            zzCO zzco = this.zzZ9x;
            if (zzco != null) {
                zzz.zzZ9x = zzco.zzZGE();
            }
            return zzz;
        }

        @Override // com.aspose.words.zzZCA
        public final zzZCB zzZOm() {
            zzCO zzco = this.zzZ9x;
            if (zzco != null) {
                return zzco.zzZf9;
            }
            return null;
        }
    }

    static {
        zzCO zzco = new zzCO();
        zzZ9y = zzco;
        Double dValueOf = Double.valueOf(0.0d);
        zzco.zzL(0, dValueOf);
        zzCO zzco2 = zzZ9y;
        Boolean bool = Boolean.FALSE;
        zzco2.zzL(1, bool);
        zzZ9y.zzL(2, bool);
        zzZ9y.zzL(3, dValueOf);
        zzZ9y.zzL(4, Double.valueOf(Double.NaN));
        zzZ9y.zzL(5, null);
        zzZ9y.zzL(6, 2);
        zzZ9y.zzL(7, 2);
        zzZ9y.zzL(9, null);
        zzZ9y.zzL(10, 1);
    }

    public zzCO() {
        this(zzZ9y);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzL(int i, Object obj) {
        this.zzZf9.zzL(i, obj);
    }

    public final Object zzLu(int i) {
        return this.zzZf9.zzLu(i);
    }

    public final Object zzLv(int i) {
        return this.zzZf9.zzLv(i);
    }

    public final zzCO zzZGE() {
        zzCO zzco = (zzCO) memberwiseClone();
        zzco.zzZf9 = this.zzZf9.zzZzY();
        zzD9 zzd9 = (zzD9) zzLu(8);
        if (zzd9 != null) {
            zzco.zzL(8, zzd9.zzZI4());
        }
        zzCQ zzcq = (zzCQ) zzLu(9);
        if (zzcq != null) {
            zzco.zzL(9, zzcq.zzZGJ());
        }
        com.aspose.words.internal.zzZYG zzzyg = (com.aspose.words.internal.zzZYG) zzLu(11);
        if (zzzyg != null) {
            zzco.zzL(11, zz80.zzN(zzzyg));
        }
        return zzco;
    }

    private zzCO(zzCO zzco) {
        zz6R zz6r = new zz6R();
        this.zzZf9 = zz6r;
        zz6r.zzZ(new zzZ(zzco == null ? zzZ9y : zzco));
    }
}
