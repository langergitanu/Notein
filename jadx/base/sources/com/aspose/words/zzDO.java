package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzDO implements Cloneable {
    private zzZCB zzZfn;
    private static zzDO zzZb0 = zzZIV();
    private static zzDO zzZaZ = zzZIU();

    public static class zzZ implements zzZCA, Cloneable {
        private zzDO zzZaY;

        public zzZ(zzDO zzdo) {
            this.zzZaY = zzdo;
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
            zzDO zzdo = this.zzZaY;
            if (zzdo != null) {
                zzz.zzZaY = zzdo.zzZIW();
            }
            return zzz;
        }

        @Override // com.aspose.words.zzZCA
        public final zzZCB zzZOm() {
            zzDO zzdo = this.zzZaY;
            if (zzdo != null) {
                return zzdo.zzZfn;
            }
            return null;
        }
    }

    public zzDO() {
        this(null);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static zzDO zzZIU() {
        zzDO zzdoZzZIV = zzZIV();
        zzdoZzZIV.zzL(14, Boolean.TRUE);
        return zzdoZzZIV;
    }

    private static zzDO zzZIV() {
        zzDO zzdo = new zzDO();
        zzdo.zzL(0, 0);
        zzdo.zzL(1, 0);
        zzdo.zzL(2, 0);
        zzdo.zzL(3, null);
        Boolean bool = Boolean.FALSE;
        zzdo.zzL(5, bool);
        zzdo.zzL(7, bool);
        zzdo.zzL(10, 150);
        zzdo.zzL(11, 150);
        zzdo.zzL(12, 3);
        zzdo.zzL(14, bool);
        zzdo.zzL(15, 0);
        zzdo.zzL(16, 0);
        zzdo.zzL(17, 0);
        zzdo.zzL(18, bool);
        zzdo.zzL(19, 0);
        zzdo.zzL(20, bool);
        zzdo.zzL(9, bool);
        zzdo.zzL(21, 0);
        zzdo.zzL(22, 0);
        zzdo.zzL(23, 10);
        zzdo.zzL(24, bool);
        zzdo.zzL(25, bool);
        zzdo.zzL(27, new int[0]);
        zzdo.zzL(28, 1);
        zzdo.zzL(29, 75);
        zzdo.zzL(30, Double.valueOf(Double.NaN));
        zzdo.zzL(31, 0);
        zzdo.zzL(32, 2);
        zzdo.zzL(33, 3);
        zzdo.zzL(35, bool);
        zzdo.zzL(36, null);
        return zzdo;
    }

    public final void zzKA(int i) {
        zzL(28, Integer.valueOf(i));
    }

    public final void zzKB(int i) {
        zzL(12, Integer.valueOf(i));
    }

    public final void zzL(int i, Object obj) {
        this.zzZfn.zzL(i, obj);
    }

    public final boolean zzLh(int i) {
        return this.zzZfn.zzLh(i);
    }

    public final Object zzLu(int i) {
        return this.zzZfn.zzLu(i);
    }

    public final Object zzLv(int i) {
        return this.zzZfn.zzLv(i);
    }

    public final int zzZIR() {
        return ((Integer) zzLv(15)).intValue();
    }

    public final int zzZIS() {
        return ((Integer) zzLv(28)).intValue();
    }

    public final int zzZIT() {
        return ((Integer) zzLv(12)).intValue();
    }

    public final zzDO zzZIW() {
        zzDO zzdo = (zzDO) memberwiseClone();
        zzdo.zzZfn = this.zzZfn.zzZzY();
        ArrayList arrayList = (ArrayList) zzLu(13);
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ChartSeries) it.next()).zz2J());
            }
            zzdo.zzL(13, arrayList2);
            for (int i = 0; i < arrayList.size(); i++) {
                ChartSeries chartSeries = (ChartSeries) arrayList.get(i);
                if (chartSeries.zz2o() != null) {
                    ((ChartSeries) arrayList2.get(i)).zzP((ChartSeries) arrayList2.get(arrayList.indexOf(chartSeries.zz2o())));
                }
            }
        }
        ChartDataLabelCollection chartDataLabelCollection = (ChartDataLabelCollection) zzLu(3);
        if (chartDataLabelCollection != null) {
            zzdo.zzL(3, chartDataLabelCollection.zz3l());
        }
        zzD9 zzd9 = (zzD9) zzLu(4);
        if (zzd9 != null) {
            zzdo.zzL(4, zzd9.zzZI4());
        }
        zzD9 zzd92 = (zzD9) zzLu(6);
        if (zzd92 != null) {
            zzdo.zzL(6, zzd92.zzZI4());
        }
        zzD9 zzd93 = (zzD9) zzLu(8);
        if (zzd93 != null) {
            zzdo.zzL(8, zzd93.zzZI4());
        }
        zzCH zzch = (zzCH) zzLu(26);
        if (zzch != null) {
            zzdo.zzL(26, zzch.zzZGj());
        }
        int[] iArr = (int[]) zzLu(27);
        if (iArr != null) {
            zzdo.zzL(27, iArr.clone());
        }
        zzG7 zzg7 = (zzG7) zzLu(34);
        if (zzg7 != null) {
            zzdo.zzL(34, zzg7.zzZOj());
        }
        com.aspose.words.internal.zzZYG zzzyg = (com.aspose.words.internal.zzZYG) zzLu(36);
        if (zzzyg != null) {
            zzdo.zzL(36, zz80.zzN(zzzyg));
        }
        return zzdo;
    }

    public zzDO(DocumentBase documentBase) {
        this.zzZfn = new zz6R();
        this.zzZfn.zzZ(new zzZ(zzCG.zzV(documentBase) ? zzZb0 : zzZaZ));
        this.zzZfn.zzL(13, new ArrayList());
        this.zzZfn.zzL(4, new zzD9());
        this.zzZfn.zzL(6, new zzD9());
        this.zzZfn.zzL(8, new zzD9());
        this.zzZfn.zzL(34, new zzG7());
    }
}
