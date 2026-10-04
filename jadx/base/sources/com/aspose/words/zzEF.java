package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzEF implements Cloneable {
    private static zzEF zzZbW;
    private zzZCB zzZf9 = new zz6R();

    public static class zzZ implements zzZCA, Cloneable {
        private zzEF zzZbV;

        public zzZ(zzEF zzef) {
            this.zzZbV = zzef;
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
            zzEF zzef = this.zzZbV;
            if (zzef != null) {
                zzz.zzZbV = zzef.zzZLg();
            }
            return zzz;
        }

        @Override // com.aspose.words.zzZCA
        public final zzZCB zzZOm() {
            zzEF zzef = this.zzZbV;
            if (zzef != null) {
                return zzef.zzZf9;
            }
            return null;
        }
    }

    static {
        zzEF zzef = new zzEF();
        zzZbW = zzef;
        zzef.zzL(0, 0);
        zzZbW.zzL(1, 7);
        zzZbW.zzL(2, new zzD9());
        zzZbW.zzL(3, null);
    }

    public zzEF() {
        zzZ(zzZbW);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void clear() {
        this.zzZf9.removeAll();
        this.zzZf9.zzZ((zzZCB) null);
    }

    public final int getCount() {
        return this.zzZf9.getCount();
    }

    public final boolean zz3n() {
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB();
        zzD9 zzd9 = (zzD9) zzLu(2);
        if (zzd9 == null || zzd9.isEmpty()) {
            zzdb.add(15);
        }
        return this.zzZf9.zzZ(zzdb.toArray(), null);
    }

    public final void zzL(int i, Object obj) {
        this.zzZf9.zzL(i, obj);
    }

    public final boolean zzLh(int i) {
        return this.zzZf9.zzLh(i);
    }

    public final Object zzLu(int i) {
        return this.zzZf9.zzLu(i);
    }

    public final Object zzLv(int i) {
        return this.zzZf9.zzLv(i);
    }

    public final void zzZ(zzEF zzef) {
        this.zzZf9.zzZ(new zzZ(zzef));
    }

    public final zzEF zzZLg() {
        zzEF zzef = (zzEF) memberwiseClone();
        zzef.zzZf9 = this.zzZf9.zzZzY();
        zzD9 zzd9 = (zzD9) zzLu(2);
        if (zzd9 != null) {
            zzef.zzL(2, zzd9.zzZI4());
        }
        com.aspose.words.internal.zzZYG zzzyg = (com.aspose.words.internal.zzZYG) zzLu(3);
        if (zzzyg != null) {
            zzef.zzL(3, zz80.zzN(zzzyg));
        }
        return zzef;
    }

    public final void zzZNG() {
        this.zzZf9.remove(1);
    }
}
