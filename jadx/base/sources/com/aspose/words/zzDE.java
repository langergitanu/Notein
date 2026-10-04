package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzDE implements Cloneable {
    private static zzDE zzZas;
    private zzZCB zzZf9 = new zz6R();

    public static class zzZ implements zzZCA, Cloneable {
        private zzDE zzZar;

        public zzZ(zzDE zzde) {
            this.zzZar = zzde;
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
            zzDE zzde = this.zzZar;
            if (zzde != null) {
                zzz.zzZar = zzde.zzZId();
            }
            return zzz;
        }

        @Override // com.aspose.words.zzZCA
        public final zzZCB zzZOm() {
            zzDE zzde = this.zzZar;
            if (zzde != null) {
                return zzde.zzZf9;
            }
            return null;
        }
    }

    static {
        zzDE zzde = new zzDE();
        zzZas = zzde;
        zzde.zzL(0, 0);
        zzZas.zzL(1, 0);
        zzZas.zzL(2, null);
        zzDE zzde2 = zzZas;
        Boolean bool = Boolean.FALSE;
        zzde2.zzL(3, bool);
        zzDE zzde3 = zzZas;
        Boolean bool2 = Boolean.TRUE;
        zzde3.zzL(4, bool2);
        zzZas.zzL(5, bool2);
        zzZas.zzL(6, bool2);
        zzZas.zzL(7, bool);
        zzZas.zzL(8, null);
        zzZas.zzL(9, null);
        zzZas.zzL(10, 1);
        zzZas.zzL(11, null);
        zzZas.zzL(12, null);
    }

    public zzDE() {
        zzZ(zzZas);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private Object zzLv(int i) {
        return this.zzZf9.zzLv(i);
    }

    private void zzZ(zzDE zzde) {
        this.zzZf9.zzZ(new zzZ(zzde));
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

    public final zzG4 zzZI7() {
        return (zzG4) zzLv(8);
    }

    public final boolean zzZI8() {
        return ((Boolean) zzLv(7)).booleanValue();
    }

    public final int zzZI9() {
        return ((Integer) zzLv(10)).intValue();
    }

    public final boolean zzZIa() {
        return ((Boolean) zzLv(6)).booleanValue();
    }

    public final boolean zzZIb() {
        return ((Boolean) zzLv(5)).booleanValue();
    }

    public final boolean zzZIc() {
        return ((Boolean) zzLv(4)).booleanValue();
    }

    public final zzDE zzZId() {
        zzDE zzde = (zzDE) memberwiseClone();
        zzde.zzZf9 = this.zzZf9.zzZzY();
        zzG4 zzg4 = (zzG4) zzLu(8);
        if (zzg4 != null) {
            zzL(8, zzg4.zzZO7());
        }
        ArrayList<Integer> arrayList = (ArrayList) zzLu(11);
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Integer num : arrayList) {
                num.intValue();
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Integer>) arrayList2, num);
            }
            zzL(11, arrayList2);
        }
        com.aspose.words.internal.zzZYG zzzyg = (com.aspose.words.internal.zzZYG) zzLu(12);
        if (zzzyg != null) {
            zzL(12, zz80.zzN(zzzyg));
        }
        return zzde;
    }
}
