package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzW2 {
    private static ArrayList<zzZCM> zzZxk = new ArrayList<>();
    private HashMap<Integer, Integer> zzZxl = new HashMap<>();
    private zzW5 zzZxm;
    private boolean zzZxn;
    private ChartDataPoint zzZxo;
    private int zzZxp;
    private ChartSeries zzZyw;

    private zzW2(ChartSeries chartSeries, int i) {
        this.zzZyw = chartSeries;
        this.zzZxp = i;
    }

    private void zz27() {
        if (this.zzZyw.zz2h() && this.zzZyw.zz2H().zzaQ().isEmpty() && !this.zzZyw.getDataPoints().hasDefaultFormat(0)) {
            zzD9 zzd9ZzZI4 = this.zzZyw.getDataPoints().get(0).zzaQ().zzZI4();
            zzd9ZzZI4.setFill(null);
            this.zzZyw.zz2H().zzZ(zzd9ZzZI4);
        }
    }

    private int zz28() {
        return this.zzZyw.zz3I().zzZQO() == 16 ? 4 : 2;
    }

    private int zz29() {
        if (this.zzZyw.zz3I().zzZQO() == 16) {
            return this.zzZyw.getSeriesType() == 37 ? 4 : 3;
        }
        int i = this.zzZxp;
        if ((i & 4) != 0) {
            return 3;
        }
        boolean z = (i & 2) != 0;
        boolean z2 = (i & 1) != 0;
        if (z && !z2) {
            return 2;
        }
        if (!z2 || z) {
            throw new IllegalStateException();
        }
        return 1;
    }

    private ChartDataPoint zz2a() {
        if (this.zzZyw.zz3I().zzZQO() != 12) {
            return null;
        }
        if (this.zzZyw.getDataPoints().hasDefaultFormat(this.zzZyw.zz2z().zzZN4().getValueCount())) {
            return null;
        }
        ChartSeries chartSeries = this.zzZyw;
        return chartSeries.zzNM(chartSeries.zz2z().zzZN4().getValueCount()).zz3g();
    }

    private int zzNH(int i) {
        if (this.zzZxm == null) {
            this.zzZxm = new zzW5(this.zzZyw, false);
        }
        for (zzKJ zzkj : this.zzZxm.zzs(i, false)) {
            if (zzkj.zzZTC() == i && zzkj.zzZTB() == 0) {
                return zzkj.getIndex();
            }
        }
        return -1;
    }

    private static zzBW zzY(ChartDataPoint chartDataPoint, int i) {
        if (i == 0) {
            return zzY(chartDataPoint.zzaQ().zzZI3());
        }
        if (i == 1) {
            return zzZ(chartDataPoint.zzaQ().zzZI2());
        }
        if (i == 2) {
            if (chartDataPoint.zz3f()) {
                return zzY(chartDataPoint.getMarker().zzaQ().zzZI3());
            }
            return null;
        }
        if (i != 3) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: element");
        }
        if (chartDataPoint.zz3f()) {
            return zzZ(chartDataPoint.getMarker().zzaQ().zzZI2());
        }
        return null;
    }

    private void zzYp(int i, int i2) {
        if (this.zzZyw.zz3I().zzZQO() == 16) {
            i = zzNH(i);
        }
        if (i < 0) {
            return;
        }
        boolean zZz2h = this.zzZyw.zz2h();
        ChartDataPoint chartDataPointZz3g = (zZz2h ? this.zzZyw.zzNM(0) : this.zzZyw.zz2H()).zz3g();
        chartDataPointZz3g.setIndex(i);
        zzZ(chartDataPointZz3g, i2);
        this.zzZyw.getDataPoints().zzW(chartDataPointZz3g);
        if (!zZz2h && chartDataPointZz3g.getIndex() == 0) {
            zzZ(this.zzZyw.zz2H(), i2);
        }
        this.zzZxn = true;
    }

    public static zzW2[] zzZ(Shape shape, int[] iArr) {
        zzW2[] zzw2Arr = new zzW2[iArr.length];
        int i = 0;
        for (ChartSeries chartSeries : zzYJL.zzZQ(shape)) {
            int i2 = iArr[i];
            if (i2 != 0) {
                zzw2Arr[i] = new zzW2(chartSeries, i2);
            }
            i++;
        }
        return zzw2Arr;
    }

    public final void zz26() {
        ChartDataPoint chartDataPoint;
        for (Map.Entry<Integer, Integer> entry : this.zzZxl.entrySet()) {
            zzYp(entry.getKey().intValue(), entry.getValue().intValue());
        }
        if (this.zzZxn && (chartDataPoint = this.zzZxo) != null) {
            chartDataPoint.setIndex(this.zzZyw.zz2z().zzZN4().getValueCount());
            this.zzZyw.getDataPoints().zzW(this.zzZxo);
        }
        this.zzZxo = null;
        this.zzZxn = false;
        if (this.zzZyw.zz3I().getChartSpace().zzZHT()) {
            this.zzZyw.zz3I().getChartSpace().zzZHZ();
        }
    }

    public final void zz2b() {
        this.zzZxo = zz2a();
        zzZ(this.zzZyw.zz2z(), zz29());
        if (this.zzZyw.zz2y().zzZN4() != null) {
            zzZ(this.zzZyw.zz2y(), zz28());
        }
        if (this.zzZyw.zz2i()) {
            zzZ(this.zzZyw.zz2x(), 2);
        }
        zz27();
    }

    public final void zzNG(int i) {
        if (com.aspose.words.internal.zzZQ1.zzRh(i) == 0) {
            return;
        }
        if (this.zzZyw.zz2h() && this.zzZyw.zz2H().zzaQ().zzZI3() == null && !this.zzZyw.getDataPoints().hasDefaultFormat(0)) {
            ChartDataPoint chartDataPoint = this.zzZyw.getDataPoints().get(0);
            if (chartDataPoint.zzaQ().zzZI3() != null) {
                this.zzZyw.zz2H().zzaQ().setFill(chartDataPoint.zzaQ().zzZI3().zzZQ6());
            }
        }
        this.zzZyw.getDataPoints().clearFormat();
        zzZ(this.zzZyw.zz2H(), i);
        this.zzZxn = true;
    }

    private static void zzZ(zzFD zzfd, int i) {
        if (zzfd.zzZMu() == null) {
            return;
        }
        String strZzZ = zzZ(zzfd);
        zzCB zzcbZzZN3 = zzfd.zzZMu().zzZN3();
        int iZzZFY = zzcbZzZN3 != null ? zzcbZzZN3.zzZFY() : 0;
        zzfd.zzV(new zzCE(i));
        zzfd.zzZN4().setFormatCode(strZzZ);
        if (zzcbZzZN3 != null) {
            zzfd.zzZMu().zzZN3().zzKd(iZzZFY);
        }
    }

    private static zzBW zzY(zz7X zz7x) {
        if (zz7x == null) {
            return null;
        }
        return zz7x.zzZBn();
    }

    private static String zzZ(zzFD zzfd) {
        if (zzfd.zzZN4() != null) {
            return zzfd.zzZN4().getFormatCode();
        }
        return "";
    }

    public final void zzZ(Object obj, Object obj2, Object obj3, int i) {
        zzZ(this.zzZyw.zz2z(), zz29(), obj);
        if (this.zzZyw.zz2y().zzZN4() != null) {
            zzZ(this.zzZyw.zz2y(), zz28(), obj2);
        }
        if (this.zzZyw.zz2i()) {
            zzZ(this.zzZyw.zz2x(), 2, obj3);
        }
        if (com.aspose.words.internal.zzZQ1.zzRh(i) != 0) {
            com.aspose.words.internal.zzZQF.zzY(this.zzZxl, Integer.valueOf(this.zzZyw.zz2z().zzZN4().getValueCount() - 1), Integer.valueOf(i));
        }
    }

    private static void zzZ(zzFD zzfd, int i, Object obj) {
        zzCE zzceZzZN4 = zzfd.zzZN4();
        int valueCount = zzceZzZN4.getValueCount();
        zzceZzZN4.zzNy(valueCount + 1);
        if (obj == null) {
            return;
        }
        if (i == 1) {
            zzceZzZN4.zzP(new zzD4(valueCount, (String) obj));
            return;
        }
        if (i == 2) {
            zzceZzZN4.zzP(new zzE7(valueCount, ((Double) obj).doubleValue(), zzceZzZN4.getFormatCode()));
            return;
        }
        if (i != 3) {
            if (i == 4) {
                zzZ(zzceZzZN4, 1);
                zzEB zzeb = new zzEB(valueCount, zzceZzZN4.zzZG8());
                zzeb.zzK((Double) obj, 0);
                zzceZzZN4.zzP(zzeb);
                return;
            }
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: valueType");
        }
        String str = (String) com.aspose.words.internal.zzZKW.zzZ(obj, String.class);
        String[] strArr = str != null ? new String[]{str} : (String[]) obj;
        zzZ(zzceZzZN4, strArr.length);
        zzEA zzea = new zzEA(valueCount);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            zzea.zzK(strArr[i2], i2);
        }
        zzceZzZN4.zzP(zzea);
    }

    private static void zzZ(zzCE zzce, int i) {
        while (zzce.zzZG8().size() < i) {
            zzce.zzZG8().add(new zzFP());
        }
    }

    private static void zzZ(ChartDataPoint chartDataPoint, int i) {
        zzBW zzbwZzj = zzBW.zzj(com.aspose.words.internal.zzPV.zzYR(i));
        zzBW zzbw = null;
        for (int i2 = 0; i2 <= 3; i2++) {
            zzBW zzbwZzY = zzY(chartDataPoint, i2);
            if (zzbwZzY != null && (zzbw == null || zzZ(zzbw, zzbwZzY))) {
                zzZ(chartDataPoint, i2, zzbwZzj);
                zzbw = zzbwZzY;
            }
        }
    }

    private static zzBW zzZ(zz4G zz4g) {
        if (zz4g != null) {
            return zzY((zz7X) zz4g.zzLu(9));
        }
        return null;
    }

    private static void zzZ(ChartDataPoint chartDataPoint, int i, zzBW zzbw) {
        if (i == 0) {
            zzZ(chartDataPoint.zzaQ().getFill(), zzbw);
            return;
        }
        if (i == 1) {
            zzZ(chartDataPoint.zzaQ().getOutline().getFill(), zzbw);
        } else if (i == 2) {
            zzZ(chartDataPoint.getMarker().zzaQ().getFill(), zzbw);
        } else {
            if (i == 3) {
                zzZ(chartDataPoint.getMarker().zzaQ().getOutline().getFill(), zzbw);
                return;
            }
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: element");
        }
    }

    private static void zzZ(zz7X zz7x, zzBW zzbw) {
        if (zz7x.zzZQ4() == 1) {
            zzBW zzbwZzZQX = null;
            for (zz7B zz7b : ((zz7C) zz7x).zzZAA()) {
                if (zzbwZzZQX == null || zzZ(zzbwZzZQX, zz7b.zzZQX())) {
                    zzbwZzZQX = zz7b.zzZQX();
                    zz7b.zzZ(zzbw);
                }
            }
            return;
        }
        zz7x.zzP(zzbw);
    }

    private static boolean zzZ(zzBW zzbw, zzBW zzbw2) {
        ArrayList<zzZCM> arrayListZzZNX = zzbw.zzZNX();
        ArrayList<zzZCM> arrayListZzZNX2 = zzbw2.zzZNX();
        zzbw.zze(zzZxk);
        zzbw2.zze(zzZxk);
        boolean zEquals = zzbw.equals(zzbw2);
        zzbw.zze(arrayListZzZNX);
        zzbw2.zze(arrayListZzZNX2);
        return zEquals;
    }
}
