package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzDF implements Iterable<ChartSeries> {
    private zzGK zzZat;

    public zzDF(zzGK zzgk) {
        this.zzZat = zzgk;
    }

    private ChartLegendEntryCollection getLegendEntries() {
        zzEY zzeyZzZJc = this.zzZat.zz45().zzZJc();
        if (zzeyZzZJc.getLegend() == null) {
            return null;
        }
        return zzeyZzZJc.getLegend().getLegendEntries();
    }

    private ArrayList<ChartSeries> zzZIe() {
        return (ArrayList) this.zzZat.zzZPg().zzLv(13);
    }

    public final void clear() {
        if (getLegendEntries() != null) {
            getLegendEntries().clear();
        }
        zzZIe().clear();
    }

    public final ChartSeries get(int i) {
        return zzZIe().get(i);
    }

    public final int getCount() {
        return zzZIe().size();
    }

    @Override // java.lang.Iterable
    public final Iterator<ChartSeries> iterator() {
        return zzZIe().iterator();
    }

    public final void removeAt(int i) {
        ChartSeries chartSeries = zzZIe().get(i);
        if (getLegendEntries() != null) {
            getLegendEntries().zzS(chartSeries);
        }
        if (this.zzZat.zzZQO() == 16 && chartSeries.zz2m() >= 0) {
            this.zzZat.getChartSpace().zzZHI().remove(chartSeries.zz2m());
        }
        zzZIe().remove(i);
    }

    public final int zzC(ChartSeries chartSeries) {
        return zzZIe().indexOf(chartSeries);
    }

    public final void zzD(ChartSeries chartSeries) {
        removeAt(zzZIe().indexOf(chartSeries));
    }

    public final void zzE(ChartSeries chartSeries) {
        zzZIe().add(chartSeries);
    }

    public final void zzF(ChartSeries chartSeries) {
        zzZIe().add(chartSeries);
        if (getLegendEntries() != null) {
            getLegendEntries().zzT(chartSeries);
        }
    }
}
