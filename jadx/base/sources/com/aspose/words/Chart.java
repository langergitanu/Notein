package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class Chart {
    private ChartTitle zzZyZ;
    private ChartAxisCollection zzZz0;
    private zzD8 zzZz1;
    private ChartSeriesCollection zzZz2;

    public Chart(zzD8 zzd8) {
        this.zzZz1 = zzd8;
    }

    public ChartAxisCollection getAxes() {
        if (this.zzZz0 == null) {
            this.zzZz0 = new ChartAxisCollection(this.zzZz1);
        }
        return this.zzZz0;
    }

    public ChartAxis getAxisX() {
        return this.zzZz1.zzZJd().getAxisX();
    }

    public ChartAxis getAxisY() {
        return this.zzZz1.zzZJd().getAxisY();
    }

    public ChartAxis getAxisZ() {
        return this.zzZz1.zzZJd().getAxisZ();
    }

    public final zzD8 getChartSpace() {
        return this.zzZz1;
    }

    public ChartDataTable getDataTable() {
        zzDT zzdtZz45 = this.zzZz1.zzZHX().zz45();
        if (zzdtZz45.getDataTable() == null) {
            zzdtZz45.zzZ(ChartDataTable.zzY(zzdtZz45));
        }
        return zzdtZz45.getDataTable();
    }

    public ChartLegend getLegend() {
        if (this.zzZz1.zzZHX().getLegend() == null) {
            this.zzZz1.zzZHX().zzZ(new ChartLegend(this.zzZz1.zzZHX()));
        }
        return this.zzZz1.zzZHX().getLegend();
    }

    public ChartSeriesCollection getSeries() {
        if (this.zzZz2 == null) {
            this.zzZz2 = new ChartSeriesCollection(this.zzZz1);
        }
        return this.zzZz2;
    }

    public String getSourceFullName() {
        return this.zzZz1.zzZHU();
    }

    public ChartTitle getTitle() {
        if (this.zzZyZ == null) {
            this.zzZyZ = new ChartTitle(this.zzZz1.zzZHX());
        }
        return this.zzZyZ;
    }

    public void setSourceFullName(String str) {
        this.zzZz1.zzRg(str);
    }
}
