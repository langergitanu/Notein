package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzFN implements Cloneable {
    private zzFN zzZe6;
    private zzZCB zzZf9 = new zz6R();

    public static class zzZ implements zzZCA, Cloneable {
        private zzFN zzZe6;

        public zzZ(zzFN zzfn) {
            this.zzZe6 = zzfn;
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
            zzFN zzfn = this.zzZe6;
            if (zzfn != null) {
                zzz.zzZe6 = zzfn.zzZNa();
            }
            return zzz;
        }

        @Override // com.aspose.words.zzZCA
        public final zzZCB zzZOm() {
            zzFN zzfn = this.zzZe6;
            if (zzfn != null) {
                return zzfn.zzZf9;
            }
            return null;
        }
    }

    private zzFN() {
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private void zzQ(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        if (zzzyg == null) {
            return;
        }
        com.aspose.words.internal.zzZYG zzzyg2 = (com.aspose.words.internal.zzZYG) zzLu(7);
        boolean z = false;
        if (zzzyg2 == null) {
            zzzyg2 = new com.aspose.words.internal.zzZYG(false);
        }
        for (zz82 zz82Var : zzzyg.zzCJ()) {
            if (!com.aspose.words.internal.zzZYD.zzh(zz82Var.getUri(), "{C3380CC4-5D6E-409C-BE32-E72D297353CC}")) {
                zzzyg2.set(zz82Var.getUri(), zz82Var.zzZC0());
                z = true;
            }
        }
        if (z) {
            zzL(7, zzzyg2);
        }
    }

    public final void clear() {
        this.zzZf9.removeAll();
        this.zzZf9.zzZ((zzZCB) null);
    }

    public final boolean zz3n() {
        ChartMarker chartMarker = (ChartMarker) zzLu(4);
        if (chartMarker != null && chartMarker.zz3n()) {
            return true;
        }
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB();
        zzdb.add(0);
        zzdb.add(4);
        zzdb.add(7);
        zzD9 zzd9 = (zzD9) zzLu(5);
        if (zzd9 == null || zzd9.isEmpty()) {
            zzdb.add(5);
        }
        if (this.zzZf9.zzZ(zzdb.toArray(), null)) {
            return true;
        }
        com.aspose.words.internal.zzZYG zzzyg = (com.aspose.words.internal.zzZYG) zzLu(7);
        if (zzzyg != null) {
            Iterator<String> it = zzzyg.zzxs().iterator();
            while (it.hasNext()) {
                if (!com.aspose.words.internal.zzZYD.zzh(it.next(), "{C3380CC4-5D6E-409C-BE32-E72D297353CC}")) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void zzL(int i, Object obj) {
        this.zzZf9.zzL(i, obj);
        if (i == 4) {
            zzY((ChartMarker) obj);
        }
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

    public final void zzY(zzFN zzfn) {
        int[] values = zzFO.getValues();
        for (int i = 0; i < 8; i++) {
            int i2 = values[i];
            if (zzfn.zzLh(i2) && i2 != 0) {
                Object objZzLu = zzfn.zzLu(i2);
                if (i2 != 4) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            if (i2 == 7) {
                                zzQ((com.aspose.words.internal.zzZYG) objZzLu);
                            }
                        } else if (objZzLu != null) {
                            objZzLu = ((zzE3) objZzLu).zzZL2();
                        }
                    } else if (objZzLu != null) {
                        objZzLu = ((zzD9) objZzLu).zzZI4();
                    }
                } else if (objZzLu != null) {
                    objZzLu = ((ChartMarker) objZzLu).zz2P();
                }
                zzL(i2, objZzLu);
            }
        }
    }

    public final void zzZ(zzFN zzfn) {
        this.zzZf9.zzZ(new zzZ(zzfn));
        this.zzZe6 = zzfn;
        zzY((ChartMarker) zzLu(4));
    }

    public final Object zzZN9() {
        return this.zzZf9.zzZzX().zzZOm().zzLv(2);
    }

    public final void zzZNG() {
        this.zzZf9.remove(2);
    }

    public final zzFN zzZNa() {
        zzFN zzfn = (zzFN) memberwiseClone();
        zzfn.zzZf9 = this.zzZf9.zzZzY();
        ChartMarker chartMarker = (ChartMarker) zzLu(4);
        if (chartMarker != null) {
            zzfn.zzL(4, chartMarker.zz2P());
        }
        zzD9 zzd9 = (zzD9) zzLu(5);
        if (zzd9 != null) {
            zzfn.zzL(5, zzd9.zzZI4());
        }
        zzE3 zze3 = (zzE3) zzLu(6);
        if (zze3 != null) {
            zzfn.zzL(6, zze3.zzZL2());
        }
        com.aspose.words.internal.zzZYG zzzyg = (com.aspose.words.internal.zzZYG) zzLu(7);
        if (zzzyg != null) {
            zzfn.zzL(7, zz80.zzN(zzzyg));
        }
        return zzfn;
    }

    private static zzFN zzX(DocumentBase documentBase) {
        boolean zZzV = zzCG.zzV(documentBase);
        zzFN zzfn = new zzFN();
        zzfn.zzL(0, 0);
        zzfn.zzL(1, -1);
        zzfn.zzL(2, Boolean.valueOf(!zZzV));
        zzfn.zzL(3, Boolean.FALSE);
        zzfn.zzL(4, null);
        zzfn.zzL(5, null);
        zzfn.zzL(6, null);
        zzfn.zzL(7, null);
        return zzfn;
    }

    public zzFN(DocumentBase documentBase) {
        zzZ(zzX(documentBase));
    }

    private void zzY(ChartMarker chartMarker) {
        ChartMarker chartMarker2;
        if (chartMarker == null || (chartMarker2 = (ChartMarker) this.zzZe6.zzLu(4)) == null) {
            return;
        }
        chartMarker.zz2O().zzZ(chartMarker2.zz2O());
    }
}
