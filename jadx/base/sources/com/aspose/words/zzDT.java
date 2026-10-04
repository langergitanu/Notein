package com.aspose.words;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzDT extends zz80 implements Cloneable {
    private com.aspose.words.internal.zzZYG<zz82> zzZb3;
    private zzCW zzZb4;
    private zzEY zzZb5;
    private ChartDataTable zzZb6;
    private ArrayList<zzGK> zzZb9;
    private zzEH zzZyA;
    private ArrayList<ChartSeries> zzZyS;
    private zzD9 zzZyx;
    private ArrayList<zzGK> zzZba = new ArrayList<>();
    private com.aspose.words.internal.zzD3<ChartAxis> zzZb8 = new com.aspose.words.internal.zzD3<>();
    private ArrayList<ChartAxis> zzZb7 = new ArrayList<>();

    public static class zzZ implements Comparator<ChartSeries> {
        private zzZ() {
        }

        private static int zzZ(ChartSeries chartSeries, ChartSeries chartSeries2) {
            return chartSeries.getIndex() - chartSeries2.getIndex();
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(ChartSeries chartSeries, ChartSeries chartSeries2) {
            return zzZ(chartSeries, chartSeries2);
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public zzDT(zzEY zzey) {
        this.zzZb5 = zzey;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static float zzY(zzGK zzgk, float f) {
        return zzgk.zzZPj().getCount() == 1 ? ((double) f) < 0.85d ? 0.67f : 0.45f : ((double) f) < 0.83d ? 0.85f : 0.55f;
    }

    private int zzZJ6() {
        Iterator<zzGK> it = this.zzZba.iterator();
        int order = -1;
        while (it.hasNext()) {
            for (ChartSeries chartSeries : it.next().zzZPj()) {
                if (order < chartSeries.getOrder()) {
                    order = chartSeries.getOrder();
                }
            }
        }
        return order;
    }

    private int zzZJ7() {
        Iterator<zzGK> it = this.zzZba.iterator();
        int index = -1;
        while (it.hasNext()) {
            for (ChartSeries chartSeries : it.next().zzZPj()) {
                if (index < chartSeries.getIndex()) {
                    index = chartSeries.getIndex();
                }
            }
        }
        return index;
    }

    public final ChartDataTable getDataTable() {
        return this.zzZb6;
    }

    public final ArrayList<ChartAxis> zz3G() {
        return this.zzZb7;
    }

    public final ArrayList<ChartSeries> zz3H() {
        if (this.zzZyS == null) {
            this.zzZyS = new ArrayList<>();
            Iterator<zzGK> it = this.zzZba.iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList) this.zzZyS, (Iterable) it.next().zzZPj());
            }
            Collections.sort(this.zzZyS, new zzZ((byte) 0));
        }
        return this.zzZyS;
    }

    public final zzEH zz3y() {
        return this.zzZyA;
    }

    public final void zzH(ChartSeries chartSeries) {
        chartSeries.setIndex(zzZJ7() + 1);
        chartSeries.setOrder(zzZJ6() + 1);
        ArrayList<ChartSeries> arrayList = this.zzZyS;
        if (arrayList != null) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, chartSeries);
        }
        chartSeries.zz3I().zzZPj().zzF(chartSeries);
    }

    public final void zzKD(int i) {
        ChartSeries chartSeries = zz3H().get(i);
        this.zzZyS.remove(i);
        chartSeries.zz3I().zzZPj().zzD(chartSeries);
    }

    public final ChartAxis zzKE(int i) {
        return this.zzZb8.get(i);
    }

    public final void zzKF(int i) {
        ChartAxis chartAxis = this.zzZb8.get(i);
        if (chartAxis == null) {
            return;
        }
        this.zzZb8.zzVG(i);
        this.zzZb7.remove(chartAxis);
    }

    public final void zzN(ChartAxis chartAxis) {
        chartAxis.zzZ(this);
        com.aspose.words.internal.zzZQG.zzZ(this.zzZb7, chartAxis);
        this.zzZb8.set(chartAxis.zz4n(), chartAxis);
    }

    public final void zzP(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        this.zzZb3 = zzzyg;
    }

    public final void zzT(int i, String str) {
        this.zzZb5.zzT(i, str);
    }

    public final void zzU(zzGK zzgk) {
        zzgk.zzZ(this);
        com.aspose.words.internal.zzZQG.zzZ(this.zzZba, zzgk);
    }

    public final void zzW(zzEY zzey) {
        this.zzZb5 = zzey;
        ChartDataTable chartDataTable = this.zzZb6;
        if (chartDataTable != null) {
            chartDataTable.zzZ(zzey.zz45());
        }
    }

    public final ChartAxis zzY5(int i, int i2) {
        ChartAxis chartAxisZzKE = zzKE(i2);
        if (chartAxisZzKE != null && chartAxisZzKE.zz4l() != i) {
            for (ChartAxis chartAxis : this.zzZb7) {
                if (chartAxis.zz4l() == i) {
                    return chartAxis;
                }
            }
        }
        return chartAxisZzKE;
    }

    public final com.aspose.words.internal.zzZQ4 zzZ(zzGK zzgk, com.aspose.words.internal.zzZQ4 zzzq4, zzDI zzdi, boolean z) {
        if (zzgk.zzZPa()) {
            float fMin = (Math.min(zzzq4.getWidth(), zzzq4.getHeight()) * 2.0f) / 3.0f;
            return new com.aspose.words.internal.zzZQ4(zzzq4.getX(), zzzq4.getY(), fMin, fMin);
        }
        if (!zzgk.zz3R()) {
            return zzzq4;
        }
        float fZzZ = zzDG.zzZ(zzgk, (zzdi.zzZIC().zzZdM * 2.0f) + ((z ? zzzq4.getWidth() : zzzq4.getHeight()) / zzgk.zzZPb()), this.zzZb5.zzZLQ().zzZFW());
        float fSin = ((float) Math.sin(com.aspose.words.internal.zzAN.zzZL(this.zzZb5.zzZLQ().zzZFS()))) * fZzZ;
        float fSin2 = fZzZ * ((float) Math.sin(com.aspose.words.internal.zzAN.zzZL(this.zzZb5.zzZLQ().zzZJF())));
        int iZzZIT = zzgk.zzZPg().zzZIT();
        if (!zzgk.zzZQj() && (zzgk.zzZQO() != 11 || iZzZIT != 0)) {
            float count = zzgk.zzZPj().getCount() - ((zzgk.zzZP7() || zzgk.zzZP6()) ? 1 : 0);
            fSin *= count;
            fSin2 *= count;
        }
        float height = zzzq4.getHeight() / (Math.abs(fSin2) + zzzq4.getHeight());
        return new com.aspose.words.internal.zzZQ4(zzzq4.getX(), zzzq4.getY(), (zzzq4.getWidth() / (Math.abs(fSin) + zzzq4.getWidth())) * zzzq4.getWidth(), zzzq4.getHeight() * height * zzZ(zzgk, height));
    }

    public final com.aspose.words.internal.zzZYG<zz82> zzZJ8() {
        return this.zzZb3;
    }

    public final zzCW zzZJ9() {
        return this.zzZb4;
    }

    public final boolean zzZJa() {
        for (zzGK zzgk : this.zzZba) {
            if (!zzgk.isEmpty() && zzgk.zzZP9() && zzgk.zzZQO() != 12) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzZJb() {
        return zzZJd() != null && zzZJd().zzZP6();
    }

    public final zzEY zzZJc() {
        return this.zzZb5;
    }

    public final zzGK zzZJd() {
        if (this.zzZba.size() > 0) {
            return this.zzZba.get(0);
        }
        return null;
    }

    public final ArrayList<zzGK> zzZJe() {
        if (this.zzZb9 == null) {
            this.zzZb9 = new ArrayList<>();
            for (zzGK zzgk : this.zzZba) {
                if (!zzgk.isEmpty()) {
                    com.aspose.words.internal.zzZQG.zzZ(this.zzZb9, zzgk);
                }
            }
        }
        return this.zzZb9;
    }

    public final ArrayList<zzGK> zzZJf() {
        return this.zzZba;
    }

    public final void zzZJg() {
        ArrayList<ChartSeries> arrayList = this.zzZyS;
        if (arrayList != null) {
            arrayList.clear();
        }
        Iterator<zzGK> it = this.zzZba.iterator();
        while (it.hasNext()) {
            it.next().zzZPj().clear();
        }
    }

    public final zzDT zzZJh() {
        zzDT zzdt = (zzDT) memberwiseClone();
        ChartDataTable chartDataTable = this.zzZb6;
        if (chartDataTable != null) {
            zzdt.zzZb6 = chartDataTable.zz38();
        }
        zzEH zzeh = this.zzZyA;
        if (zzeh != null) {
            zzdt.zzZyA = zzeh.zzZLr();
        }
        zzD9 zzd9 = this.zzZyx;
        if (zzd9 != null) {
            zzdt.zzZyx = zzd9.zzZI4();
        }
        if (this.zzZba != null) {
            ArrayList<zzGK> arrayList = new ArrayList<>();
            Iterator<zzGK> it = this.zzZba.iterator();
            while (it.hasNext()) {
                zzGK zzgkZzZPm = it.next().zzZPm();
                zzgkZzZPm.zzZ(zzdt);
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzgkZzZPm);
                zzdt.zzZba = arrayList;
            }
        }
        zzCW zzcw = this.zzZb4;
        if (zzcw != null) {
            zzdt.zzZb4 = zzcw.zzZHl();
        }
        zzdt.zzZb3 = zz80.zzN(this.zzZb3);
        zzdt.zzZb7 = new ArrayList<>(this.zzZb7.size());
        zzdt.zzZb8 = new com.aspose.words.internal.zzD3<>();
        Iterator<ChartAxis> it2 = this.zzZb7.iterator();
        while (true) {
            zzGK zzgk = null;
            if (!it2.hasNext()) {
                zzdt.setExtensions(zzZBz());
                zzdt.zzZyS = null;
                return zzdt;
            }
            ChartAxis next = it2.next();
            ChartAxis chartAxisZz47 = next.zz47();
            zzdt.zzN(chartAxisZz47);
            int iIndexOf = this.zzZba.indexOf(next.zz3I());
            if (iIndexOf >= 0) {
                zzgk = zzdt.zzZba.get(iIndexOf);
            }
            chartAxisZz47.zzZ(zzgk);
        }
    }

    public final void zzZJi() {
        this.zzZb7.clear();
        this.zzZb8.clear();
    }

    public final boolean zzZPc() {
        return this.zzZb7.size() > 0;
    }

    public final boolean zzZPl() {
        if (this.zzZba.size() == 1) {
            return zzZJd().zzZPl();
        }
        return false;
    }

    public final boolean zzZQD() {
        zzEH zzeh = this.zzZyA;
        return zzeh != null && zzeh.zzZLp() == 0;
    }

    public final zzD9 zzaQ() {
        if (this.zzZyx == null) {
            this.zzZyx = new zzD9();
        }
        return this.zzZyx;
    }

    public final void zzW(zzCW zzcw) {
        this.zzZb4 = zzcw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private float zzZ(zzGK zzgk, float f) {
        int valueCount = 0;
        if (!zzgk.isEmpty()) {
            for (ChartSeries chartSeries : zzgk.zzZPj()) {
                if (valueCount < chartSeries.getValueCount()) {
                    valueCount = chartSeries.getValueCount();
                }
            }
        }
        if (valueCount == 1) {
            return 1.0f / (f * 2.0f);
        }
        if (((zzZCQ) zzgk).zzZQM() == null || zzgk.zzZP6()) {
            return 1.0f;
        }
        if (zzgk.zzZQO() == 1) {
            return zzY(zzgk, f);
        }
        return zzZ(zzgk, f, 1.0f);
    }

    private float zzZ(zzGK zzgk, float f, float f2) {
        return this.zzZb5.zzZLQ().zzZJF() != 0 ? zzgk.zzZPj().getCount() == 1 ? ((double) f) < 0.85d ? 0.67f : 0.49f : ((double) f) < 0.84d ? 0.86f : 0.55f : f2;
    }

    public final void zzZ(ChartDataTable chartDataTable) {
        this.zzZb6 = chartDataTable;
    }

    public final void zzZ(zzEH zzeh) {
        this.zzZyA = zzeh;
    }
}
