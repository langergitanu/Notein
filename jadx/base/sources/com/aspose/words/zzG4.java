package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzG4 implements Cloneable {
    private static zzG4 zzZf8;
    private zzZCB zzZf9 = new zz6R();

    public static class zzZ implements zzZCA, Cloneable {
        private zzG4 zzZf7;

        public zzZ(zzG4 zzg4) {
            this.zzZf7 = zzg4;
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
            zzG4 zzg4 = this.zzZf7;
            if (zzg4 != null) {
                zzz.zzZf7 = zzg4.zzZO7();
            }
            return zzz;
        }

        @Override // com.aspose.words.zzZCA
        public final zzZCB zzZOm() {
            zzG4 zzg4 = this.zzZf7;
            if (zzg4 != null) {
                return zzg4.zzZf9;
            }
            return null;
        }
    }

    static {
        zzG4 zzg4 = new zzG4();
        zzZf8 = zzg4;
        zzg4.zzL(0, Double.valueOf(Double.NaN));
        zzZf8.zzL(1, -1);
        zzZf8.zzL(2, null);
    }

    public zzG4() {
        zzZ(zzZf8);
        zzL(3, zzZVY.zzXb(0.0d));
        zzL(4, zzZVY.zzXb(0.0d));
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private void zzZ(zzG4 zzg4) {
        this.zzZf9.zzZ(new zzZ(zzg4));
    }

    public final int getCount() {
        return this.zzZf9.getCount();
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

    public final zzZVY zzZO3() {
        return (zzZVY) zzLv(4);
    }

    public final zzZVY zzZO4() {
        return (zzZVY) zzLv(3);
    }

    public final double zzZO5() {
        return ((Double) zzLv(0)).doubleValue();
    }

    public final int zzZO6() {
        return ((Integer) zzLv(1)).intValue();
    }

    public final zzG4 zzZO7() {
        zzG4 zzg4 = (zzG4) memberwiseClone();
        zzg4.zzZf9 = this.zzZf9.zzZzY();
        zzg4.zzL(3, ((zzZVY) zzLv(3)).zzZk3());
        zzg4.zzL(4, ((zzZVY) zzLv(4)).zzZk3());
        return zzg4;
    }
}
