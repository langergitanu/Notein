package com.aspose.words;

import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class ChartSeriesCollection implements Iterable<ChartSeries> {
    private zzD8 zzZz1;

    public ChartSeriesCollection(zzD8 zzd8) {
        this.zzZz1 = zzd8;
    }

    private zzDT zz45() {
        return this.zzZz1.zzZHX().zz45();
    }

    private static zzCE zzK(String[] strArr) {
        zzCE zzce = new zzCE(1);
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            zzce.zzP(new zzD4(i2, strArr[i]));
            i++;
            i2++;
        }
        zzce.zzNy(strArr.length);
        return zzce;
    }

    private static void zzM(ChartSeries chartSeries) {
        zzD9 zzd9 = new zzD9();
        zzd9.setOutline(new zz4G());
        zzd9.getOutline().setFill(new zz54());
        zzd9.getOutline().setEndCap(0);
        zzd9.getOutline().zzXK(19050.0d);
        chartSeries.zz2H().zz3d().zzL(5, zzd9);
    }

    private static void zzN(ChartSeries chartSeries) {
        zzD9 zzd9 = new zzD9();
        zzd9.setOutline(new zz4G());
        zz2Q zz2q = new zz2Q();
        zz2q.setValue(1);
        zzd9.getOutline().setFill(new zz1C(zz2q));
        zzd9.getOutline().zzXK(19050.0d);
        chartSeries.zz2H().zz3d().zzL(5, zzd9);
    }

    private static void zzO(ChartSeries chartSeries) {
        chartSeries.zz2H().zz3d().zzL(5, new zzD9());
        if (ChartDataPointCollection.zzO2(chartSeries.zz3I().zzZQO())) {
            chartSeries.setInvertIfNegative(false);
        }
        int iZzZQO = chartSeries.zz3I().zzZQO();
        if (iZzZQO != 2) {
            if (iZzZQO != 12) {
                switch (iZzZQO) {
                    case 4:
                        zzZ(chartSeries, 5);
                        zzM(chartSeries);
                        break;
                    case 6:
                        zzZ(chartSeries, 1);
                        zzM(chartSeries);
                        break;
                }
                return;
            }
            zzN(chartSeries);
            return;
        }
        zzZ(chartSeries, 5);
    }

    private static zzCE zzT(double[] dArr) {
        zzCE zzce = new zzCE(2);
        int i = 0;
        for (double d : dArr) {
            if (!Double.isNaN(d)) {
                zzce.zzP(new zzE7(i, d, "General"));
            }
            i++;
        }
        zzce.zzNy(dArr.length);
        return zzce;
    }

    public ChartSeries add(String str, Date[] dateArr, double[] dArr) {
        return zzZ(str, com.aspose.words.internal.zzZQ9.zzZ(dateArr), dArr);
    }

    public void clear() {
        zz45().zzZJg();
        Iterator<zzGK> it = this.zzZz1.zzZJf().iterator();
        while (it.hasNext()) {
            it.next().zzY3(false);
        }
    }

    public ChartSeries get(int i) {
        return zz45().zz3H().get(i);
    }

    public int getCount() {
        return zz45().zz3H().size();
    }

    @Override // java.lang.Iterable
    public Iterator<ChartSeries> iterator() {
        return zz45().zz3H().iterator();
    }

    public void removeAt(int i) {
        zz45().zzKD(i);
    }

    public final ChartSeries zzZ(zzGK zzgk, String str, String[] strArr, double[] dArr) {
        if (strArr == null || dArr == null) {
            throw new IllegalArgumentException("Data arrays must not be null.");
        }
        if (strArr.length <= 0 || dArr.length <= 0) {
            throw new IllegalArgumentException("Data arrays must not be empty.");
        }
        if (strArr.length != dArr.length) {
            throw new IllegalArgumentException("Data arrays must be of the same size.");
        }
        ChartSeries chartSeriesZzZ = zzZ(zzgk, str, dArr);
        chartSeriesZzZ.zz2z().zzV(zzK(strArr));
        return chartSeriesZzZ;
    }

    public ChartSeries add(String str, String[] strArr, double[] dArr) {
        return zzZ(zz45().zzZJd(), str, strArr, dArr);
    }

    public ChartSeries add(String str, double[] dArr, double[] dArr2) {
        return zzZ(zz45().zzZJd(), str, dArr, dArr2);
    }

    public ChartSeries add(String str, double[] dArr, double[] dArr2, double[] dArr3) {
        return zzZ(zz45().zzZJd(), str, dArr, dArr2, dArr3);
    }

    public final ChartSeries zzZ(zzGK zzgk, String str, double[] dArr, double[] dArr2) {
        if (dArr != null && dArr2 != null) {
            if (dArr.length > 0 && dArr2.length > 0) {
                if (dArr.length == dArr2.length) {
                    ChartSeries chartSeriesZzZ = zzZ(zzgk, str, dArr2);
                    chartSeriesZzZ.zz2z().zzV(zzT(dArr));
                    return chartSeriesZzZ;
                }
                throw new IllegalArgumentException("Data arrays must be of the same size.");
            }
            throw new IllegalArgumentException("Data arrays must not be empty.");
        }
        throw new IllegalArgumentException("Data arrays must not be null.");
    }

    private ChartSeries zzZ(zzGK zzgk, String str, com.aspose.words.internal.zzZQ9[] zzzq9Arr, double[] dArr) {
        if (zzzq9Arr != null && dArr != null) {
            if (zzzq9Arr.length > 0 && dArr.length > 0) {
                if (zzzq9Arr.length == dArr.length) {
                    ChartSeries chartSeriesZzZ = zzZ(zzgk, str, dArr);
                    chartSeriesZzZ.zz2z().zzV(zzZ(zzzq9Arr));
                    if (!zzgk.zzZPa()) {
                        zzgk.zzY3(true);
                    }
                    return chartSeriesZzZ;
                }
                throw new IllegalArgumentException("Data arrays must be of the same size.");
            }
            throw new IllegalArgumentException("Data arrays must not be empty.");
        }
        throw new IllegalArgumentException("Data arrays must not be null.");
    }

    public final ChartSeries zzZ(zzGK zzgk, String str, double[] dArr, double[] dArr2, double[] dArr3) {
        if (dArr != null && dArr2 != null) {
            if (dArr.length > 0 && dArr2.length > 0) {
                if (dArr.length == dArr2.length) {
                    if (zzgk.zzZQO() != 15) {
                        zzgk.zzT(1, "Please make sure you are using correct chart type. There is no way to set bubble size for non-bubble chart.");
                    }
                    ChartSeries chartSeriesZzZ = zzZ(zzgk, str, dArr2);
                    chartSeriesZzZ.zz2H().zz3d().zzL(3, Boolean.valueOf(chartSeriesZzZ.zz3I().zzZPe()));
                    chartSeriesZzZ.zz2z().zzV(zzT(dArr));
                    if (dArr3 != null) {
                        chartSeriesZzZ.zz2x().zzV(zzT(dArr3));
                    }
                    return chartSeriesZzZ;
                }
                throw new IllegalArgumentException("Data arrays must be of the same size.");
            }
            throw new IllegalArgumentException("Data arrays must not be empty.");
        }
        throw new IllegalArgumentException("Data arrays must not be null.");
    }

    private ChartSeries zzZ(zzGK zzgk, String str, double[] dArr) {
        ChartSeries chartSeries = new ChartSeries(zzgk);
        chartSeries.setName(str);
        zzO(chartSeries);
        chartSeries.zz2y().zzV(zzT(dArr));
        this.zzZz1.zzZHZ();
        zz45().zzH(chartSeries);
        return chartSeries;
    }

    private static void zzZ(ChartSeries chartSeries, int i) {
        ChartMarker chartMarker = new ChartMarker(chartSeries.zz3I());
        chartMarker.zz2O().zzL(0, Integer.valueOf(i));
        chartSeries.zz2H().zz3d().zzL(4, chartMarker);
    }

    private static zzCE zzZ(com.aspose.words.internal.zzZQ9[] zzzq9Arr) {
        zzCE zzce = new zzCE(2);
        int length = zzzq9Arr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            zzce.zzP(new zzE7(i2, zzCG.zzp(zzzq9Arr[i]), "m/d/yyyy"));
            i++;
            i2++;
        }
        zzce.zzNy(zzzq9Arr.length);
        return zzce;
    }

    private ChartSeries zzZ(String str, com.aspose.words.internal.zzZQ9[] zzzq9Arr, double[] dArr) {
        return zzZ(zz45().zzZJd(), str, zzzq9Arr, dArr);
    }
}
