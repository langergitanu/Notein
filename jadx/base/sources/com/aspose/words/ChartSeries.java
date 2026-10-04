package com.aspose.words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class ChartSeries implements IChartDataPoint, zzZCH, Cloneable {
    private int zzL3;
    private boolean zzSe;
    private int zzTL;
    private com.aspose.words.internal.zzZYG<zz82> zzZEy;
    private zzCD zzZxA;
    private zzF7 zzZxB;
    private zzF7 zzZxC;
    private ChartDataPoint zzZxE;
    private ChartDataLabelCollection zzZxG;
    private BubbleSizeCollection zzZxH;
    private ChartYValueCollection zzZxI;
    private ChartXValueCollection zzZxJ;
    private zzFD zzZxK;
    private zzFD zzZxL;
    private zzFD zzZxM;
    private zzFD zzZxN;
    private zzFD zzZxO;
    private boolean zzZxQ;
    private zzCF[] zzZxR;
    private boolean zzZxS;
    private zzW1 zzZxq;
    private zzDE zzZxs;
    private String zzZxw;
    private ChartSeries zzZxx;
    private boolean zzZxy;
    private int zzZxz;
    private zzGK zzZyX;
    private zzCM zzZyy;
    private int zzZxP = 6;
    private ArrayList<zzCR> zzZxF = new ArrayList<>();
    private int zzZxv = -1;
    private int zzZxu = -1;
    private int zzZxt = -1;
    private zzFU zzZxr = new zzFU();
    private ChartDataPointCollection zzZxD = new ChartDataPointCollection(this);

    public ChartSeries(zzGK zzgk) {
        this.zzZyX = zzgk;
    }

    private zzFD zz2B() {
        zzZCR zzzcr = (zzZCR) com.aspose.words.internal.zzZKW.zzZ(this.zzZyX, zzZCR.class);
        if (zzzcr == null) {
            return null;
        }
        for (zzGK zzgk : this.zzZyX.zz45().zzZJe()) {
            zzZCR zzzcr2 = (zzZCR) com.aspose.words.internal.zzZKW.zzZ(zzgk, zzZCR.class);
            if (zzzcr2 != null && zzzcr2.zzZPt().zz4n() == zzzcr.zzZPt().zz4n()) {
                zzFD zzfdZz2z = zzgk.zzZPk().zz2z();
                if (!zzfdZz2z.isEmpty() && (zzfdZz2z.zzZN4().zz2w() == zz2y().zzZN4().zz2w() || zzfdZz2z.zzZN4().getValueCount() == zz2y().zzZN4().getValueCount())) {
                    return zzfdZz2z;
                }
            }
        }
        return null;
    }

    private zzFD zz2C() {
        zzFD zzfdZz2B;
        if (zz2j()) {
            return zz2z();
        }
        zzFD zzfdZz2z = zz2z().isEmpty() ? this.zzZyX.zzZPk().zz2z() : zz2z();
        return ((zzfdZz2z.isEmpty() || zzfdZz2z.zzZMv().getValueCount() != zz2y().zzZMv().getValueCount()) && (zzfdZz2B = zz2B()) != null) ? zzfdZz2B : zzfdZz2z;
    }

    private zzCF[] zz2G() {
        zzCF[] zzcfArr = this.zzZxR;
        if (zzcfArr != null) {
            return zzcfArr;
        }
        ArrayList arrayList = new ArrayList();
        if (zz2E().zzZMv() == null) {
            int i = 0;
            while (i <= zz2w()) {
                int i2 = i + 1;
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzFA>) arrayList, new zzFA(i, i2));
                i = i2;
            }
        } else {
            for (int i3 = 0; i3 < getValueCount(); i3++) {
                zzCF zzcfZzL0 = zz2E().zzL0(i3);
                if (!zzCF.zzR(zzcfZzL0)) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzCF>) arrayList, zzcfZzL0);
                }
            }
        }
        Collections.sort(arrayList, new zzCC());
        zzCF[] zzcfArr2 = (zzCF[]) arrayList.toArray(new zzCF[0]);
        this.zzZxR = zzcfArr2;
        return zzcfArr2;
    }

    private void zz2I() {
        if (!zz2c().zz24() && !zz2c().zz23() && !zz2c().zz22()) {
            throw new IllegalStateException("This series type cannot have data.");
        }
    }

    private zzW1 zz2c() {
        if (this.zzZxq == null) {
            this.zzZxq = new zzW1(this);
        }
        return this.zzZxq;
    }

    private boolean zz2d() {
        return zz2e() && this.zzZxz == 1 && !zz2k().zzZI8();
    }

    private boolean zz2e() {
        return this.zzZyX.zzZQO() == 16;
    }

    private int zzYq(int i, int i2) {
        return (!zz2j() || i <= 0 || i2 <= 0) ? i >= 0 ? i : i2 : Math.min(i, i2);
    }

    public void add(ChartXValue chartXValue) {
        zz2I();
        zz2c().zzZ(chartXValue, (ChartYValue) null, Double.NaN);
    }

    public void clear() {
        clearValues();
        getDataPoints().clearFormat();
        getDataLabels().clearFormat();
    }

    public void clearValues() {
        zz2c().zz25();
    }

    public void copyFormatFrom(int i) {
        com.aspose.words.internal.zzZ4.zzY(i, "dataPointIndex");
        zz2H().zzY(getDataPoints().get(i));
    }

    @Override // com.aspose.words.IChartDataPoint
    public boolean getBubble3D() {
        return zz2H().getBubble3D();
    }

    public BubbleSizeCollection getBubbleSizes() {
        if (this.zzZxH == null) {
            if (zz2c().zz22() && zz2x().zzZN4() == null) {
                zz2x().zzV(new zzCE(2));
            }
            this.zzZxH = new BubbleSizeCollection(zz2c());
        }
        return this.zzZxH;
    }

    public ChartDataLabelCollection getDataLabels() {
        if (this.zzZxG == null) {
            this.zzZxG = new ChartDataLabelCollection(this.zzZyX, this);
        }
        return this.zzZxG;
    }

    public ChartDataPointCollection getDataPoints() {
        return this.zzZxD;
    }

    @Override // com.aspose.words.IChartDataPoint
    public int getExplosion() {
        return zz2H().getExplosion();
    }

    @Override // com.aspose.words.zzZCH
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzZYG<zz82> getExtensions() {
        return this.zzZEy;
    }

    public ChartFormat getFormat() {
        return zz2H().getFormat();
    }

    public final boolean getHidden() {
        return this.zzZxy;
    }

    public final int getIndex() {
        return this.zzTL;
    }

    @Override // com.aspose.words.IChartDataPoint
    public boolean getInvertIfNegative() {
        return zz2H().getInvertIfNegative();
    }

    public ChartLegendEntry getLegendEntry() {
        zzEY zzeyZzZJc = this.zzZyX.zz45().zzZJc();
        if (zzeyZzZJc.getLegend() == null) {
            zzeyZzZJc.zzZ(new ChartLegend(zzeyZzZJc));
        }
        return zzeyZzZJc.getLegend().getLegendEntries().zzR(this);
    }

    @Override // com.aspose.words.IChartDataPoint
    public ChartMarker getMarker() {
        return zz2H().getMarker();
    }

    public String getName() {
        zzCM zzcm = this.zzZyy;
        return zzcm == null ? com.aspose.words.internal.zzZKN.format("Series{0}", Integer.valueOf(this.zzTL + 1)) : zzcm.getText();
    }

    public final int getOrder() {
        return this.zzL3;
    }

    public int getSeriesType() {
        zzDO zzdoZzZPg = this.zzZyX.zzZPg();
        switch (this.zzZyX.zzZQO()) {
            case 0:
                int iZzZIT = zzdoZzZPg.zzZIT();
                if (iZzZIT != 1) {
                    return iZzZIT != 2 ? 0 : 1;
                }
                return 2;
            case 1:
                int iZzZIT2 = zzdoZzZPg.zzZIT();
                if (iZzZIT2 != 1) {
                    return iZzZIT2 != 2 ? 3 : 4;
                }
                return 5;
            case 2:
                int iZzZIT3 = zzdoZzZPg.zzZIT();
                if (iZzZIT3 != 1) {
                    return iZzZIT3 != 2 ? 22 : 23;
                }
                return 24;
            case 3:
                return 25;
            case 4:
                return 32;
            case 5:
                return 30;
            case 6:
                return 31;
            case 7:
                return 26;
            case 8:
                return 27;
            case 9:
                return 21;
            case 10:
                int iZzZIR = zzdoZzZPg.zzZIR();
                if (iZzZIR == 0) {
                    int iZzZIT4 = zzdoZzZPg.zzZIT();
                    if (iZzZIT4 != 1) {
                        return iZzZIT4 != 2 ? 6 : 7;
                    }
                    return 8;
                }
                if (iZzZIR != 1) {
                    throw new IllegalStateException("Unknown bar or column chart.");
                }
                int iZzZIT5 = zzdoZzZPg.zzZIT();
                if (iZzZIT5 != 1) {
                    return iZzZIT5 != 2 ? 14 : 15;
                }
                return 16;
            case 11:
                int iZzZIR2 = zzdoZzZPg.zzZIR();
                if (iZzZIR2 == 0) {
                    int iZzZIT6 = zzdoZzZPg.zzZIT();
                    if (iZzZIT6 != 1) {
                        return iZzZIT6 != 2 ? 9 : 10;
                    }
                    return 11;
                }
                if (iZzZIR2 != 1) {
                    throw new IllegalStateException();
                }
                int iZzZIT7 = zzdoZzZPg.zzZIT();
                if (iZzZIT7 == 0) {
                    return 20;
                }
                if (iZzZIT7 != 1) {
                    return iZzZIT7 != 2 ? 17 : 18;
                }
                return 19;
            case 12:
                return zzdoZzZPg.zzZIS() != 0 ? 29 : 28;
            case 13:
                return 33;
            case 14:
                return 34;
            case 15:
                return this.zzZyX.zzZPe() ? 13 : 12;
            case 16:
                switch (this.zzZxz) {
                    case 0:
                        return 40;
                    case 1:
                        return zz2k().zzZI8() ? 38 : 37;
                    case 2:
                        return 42;
                    case 3:
                        return 39;
                    case 4:
                        return 43;
                    case 5:
                        return 36;
                    case 6:
                        return 35;
                    case 7:
                        return 41;
                    default:
                        throw new IllegalStateException("Unknown chart of Word 2016 or later.");
                }
            default:
                throw new IllegalStateException("Unknown chart type.");
        }
    }

    public final int getShape() {
        return this.zzZxP;
    }

    public boolean getSmooth() {
        return this.zzSe;
    }

    public final String getUniqueId() {
        return this.zzZxw;
    }

    public final int getValueCount() {
        return Math.max(zzYq(zzZ(zz2y(), false), zzZ(zz2z(), this.zzZyX.zzZPa())), 0);
    }

    public ChartXValueCollection getXValues() {
        if (this.zzZxJ == null) {
            if (zz2c().zz24() && zz2z().zzZN4() == null) {
                zz2z().zzV(new zzCE(2));
            }
            this.zzZxJ = new ChartXValueCollection(zz2c());
        }
        return this.zzZxJ;
    }

    public ChartYValueCollection getYValues() {
        if (this.zzZxI == null) {
            if (zz2c().zz23() && zz2y().zzZN4() == null) {
                zz2y().zzV(new zzCE(2));
            }
            this.zzZxI = new ChartYValueCollection(zz2c());
        }
        return this.zzZxI;
    }

    public boolean hasDataLabels() {
        return this.zzZxS;
    }

    public void insert(int i, ChartXValue chartXValue) {
        zz2I();
        zzZ(i, chartXValue, null, Double.NaN);
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void remove(int i) {
        if (i < 0 || i >= zz2c().getValueCount()) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        zz2c().zzNF(i);
    }

    @Override // com.aspose.words.IChartDataPoint
    public void setBubble3D(boolean z) {
        zz2H().setBubble3D(z);
    }

    @Override // com.aspose.words.IChartDataPoint
    public void setExplosion(int i) {
        zz2H().setExplosion(i);
    }

    @Override // com.aspose.words.zzZCH
    @ReservedForInternalUse
    @Deprecated
    public void setExtensions(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        this.zzZEy = zzzyg;
    }

    public final void setHidden(boolean z) {
        this.zzZxy = z;
    }

    public final void setIndex(int i) {
        this.zzTL = i;
    }

    @Override // com.aspose.words.IChartDataPoint
    public void setInvertIfNegative(boolean z) {
        zz2H().setInvertIfNegative(z);
    }

    public void setName(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzZyy = null;
            this.zzZyX.zzT(1, "Series name cannot be empty, name as Series plus one based index will be generated.");
        } else {
            if (this.zzZyy == null) {
                this.zzZyy = new zzCM();
            }
            this.zzZyy.zzRd(str);
        }
    }

    public final void setOrder(int i) {
        this.zzL3 = i;
    }

    public final void setShape(int i) {
        this.zzZxP = i;
    }

    public void setSmooth(boolean z) {
        this.zzSe = z;
        this.zzZxQ = true;
    }

    public final zzFV zz2A() {
        if (!zz2e() || this.zzZxu < 0 || this.zzZyX.getChartSpace() == null) {
            return null;
        }
        return this.zzZyX.getChartSpace().zzZHI().zzLf(this.zzZxu);
    }

    public final zzCF[] zz2D() {
        return zz2G();
    }

    public final zzFD zz2E() {
        if (this.zzZxN == null) {
            this.zzZxN = zz2C();
        }
        return this.zzZxN;
    }

    public final void zz2F() {
        if (zz2e() || zz2z().isEmpty()) {
            return;
        }
        zz2z().zzZMv().zzKw(zz2w() + 1);
    }

    public final ChartDataPoint zz2H() {
        if (this.zzZxE == null) {
            this.zzZxE = new ChartDataPoint(this.zzZyX);
        }
        return this.zzZxE;
    }

    public final ChartSeries zz2J() {
        ChartSeries chartSeries = (ChartSeries) memberwiseClone();
        ChartDataPoint chartDataPoint = this.zzZxE;
        if (chartDataPoint != null) {
            chartSeries.zzZxE = chartDataPoint.zz3g();
        }
        if (zz2e()) {
            chartSeries.zzZxO = null;
            chartSeries.zzZxM = null;
            chartSeries.zzZxL = null;
        } else {
            zzFD zzfd = this.zzZxO;
            if (zzfd != null) {
                chartSeries.zzZxO = zzfd.zzZMw();
            }
            zzFD zzfd2 = this.zzZxM;
            if (zzfd2 != null) {
                chartSeries.zzZxM = zzfd2.zzZMw();
            }
            zzFD zzfd3 = this.zzZxL;
            if (zzfd3 != null) {
                chartSeries.zzZxL = zzfd3.zzZMw();
            }
        }
        zzF7 zzf7 = this.zzZxC;
        if (zzf7 != null) {
            zzF7 zzf7ZzZMp = zzf7.zzZMp();
            chartSeries.zzZxC = zzf7ZzZMp;
            zzf7ZzZMp.zzZ(chartSeries);
        }
        zzF7 zzf72 = this.zzZxB;
        if (zzf72 != null) {
            zzF7 zzf7ZzZMp2 = zzf72.zzZMp();
            chartSeries.zzZxB = zzf7ZzZMp2;
            zzf7ZzZMp2.zzZ(chartSeries);
        }
        zzCM zzcm = this.zzZyy;
        if (zzcm != null) {
            chartSeries.zzZyy = zzcm.zzZGB();
        }
        ChartDataLabelCollection chartDataLabelCollection = this.zzZxG;
        if (chartDataLabelCollection != null) {
            chartSeries.zzZxG = chartDataLabelCollection.zz3l();
        }
        if (chartSeries.hasDataLabels() != hasDataLabels()) {
            chartSeries.hasDataLabels(hasDataLabels());
        }
        chartSeries.zzZxF = new ArrayList<>();
        Iterator<zzCR> it = this.zzZxF.iterator();
        while (it.hasNext()) {
            zzCR zzcrZzZH9 = it.next().zzZH9();
            zzcrZzZH9.zzZ(chartSeries);
            com.aspose.words.internal.zzZQG.zzZ(chartSeries.zzZxF, zzcrZzZH9);
        }
        ChartDataPointCollection chartDataPointCollectionZz3c = this.zzZxD.zz3c();
        chartSeries.zzZxD = chartDataPointCollectionZz3c;
        chartDataPointCollectionZz3c.zzZ(chartSeries);
        zzDE zzde = this.zzZxs;
        if (zzde != null) {
            chartSeries.zzZxs = zzde.zzZId();
        }
        zzCD zzcd = this.zzZxA;
        if (zzcd != null) {
            chartSeries.zzZxA = zzcd.zzZG6();
        }
        com.aspose.words.internal.zzZYG<zz82> zzzyg = this.zzZEy;
        if (zzzyg != null) {
            chartSeries.zzZEy = zz80.zzN(zzzyg);
        }
        chartSeries.zzZxN = null;
        chartSeries.zzZxJ = null;
        chartSeries.zzZxI = null;
        chartSeries.zzZxH = null;
        chartSeries.zzZxq = null;
        return chartSeries;
    }

    public final zzFU zz2f() {
        return this.zzZxr;
    }

    public final boolean zz2g() {
        return zz2e() && this.zzZxz == 0;
    }

    public final boolean zz2h() {
        return this.zzZyX.zzZP9();
    }

    public final boolean zz2i() {
        return this.zzZyX.zzZP5();
    }

    public final boolean zz2j() {
        if (this.zzZyX.zzZQO() != 6) {
            return this.zzZyX.zzZP5();
        }
        return true;
    }

    public final zzDE zz2k() {
        if (this.zzZxs == null) {
            this.zzZxs = new zzDE();
        }
        return this.zzZxs;
    }

    public final int zz2l() {
        return this.zzZxt;
    }

    public final int zz2m() {
        return this.zzZxu;
    }

    public final int zz2n() {
        return this.zzZxv;
    }

    public final ChartSeries zz2o() {
        return this.zzZxx;
    }

    public final zzCD zz2p() {
        return this.zzZxA;
    }

    public final zzFD zz2q() {
        if (this.zzZxK == null) {
            if (this.zzZEy == null) {
                this.zzZEy = new com.aspose.words.internal.zzZYG<>();
            }
            this.zzZxK = new zzFD(zz82.zzZ(this.zzZEy, "{02D57815-91ED-43cb-92C2-25804820EDAC}").zzZBR());
        }
        return this.zzZxK;
    }

    public final boolean zz2r() {
        zz82 zz82Var;
        zzFD zzfd = this.zzZxK;
        if (zzfd != null) {
            return zzfd.zzZMv() != null;
        }
        com.aspose.words.internal.zzZYG<zz82> zzzyg = this.zzZEy;
        return (zzzyg == null || (zz82Var = zzzyg.get("{02D57815-91ED-43cb-92C2-25804820EDAC}")) == null || zz82Var.zzZBR().zzZN4() == null) ? false : true;
    }

    public final boolean zz2s() {
        zzFD zzfd = this.zzZxM;
        return (zzfd == null || zzfd.isEmpty() || this.zzZxM.zzZN4().getValueCount() <= 0) ? false : true;
    }

    public final ArrayList<zzCR> zz2t() {
        return this.zzZxF;
    }

    public final zzF7 zz2u() {
        return this.zzZxB;
    }

    public final zzF7 zz2v() {
        return this.zzZxC;
    }

    public final int zz2w() {
        return zzYq(zz2y().isEmpty() ? -1 : zz2y().zzZMv().zz2w(), zz2z().isEmpty() ? -1 : zz2z().zzZMv().zz2w());
    }

    public final zzFD zz2x() {
        if (this.zzZxL == null) {
            this.zzZxL = new zzFD(new zzFK());
        }
        return this.zzZxL;
    }

    public final zzFD zz2y() {
        zzFK zzfk;
        if (this.zzZxM == null) {
            if (zz2A() == null || zz2d()) {
                zzfk = new zzFK();
            } else {
                int i = this.zzZxz;
                zzfk = zz2A().zzLo(i != 4 ? (i == 5 || i == 6) ? 3 : 0 : 5);
            }
            this.zzZxM = new zzFD(zzfk);
        }
        return this.zzZxM;
    }

    public final zzFD zz2z() {
        zzFK zzfk;
        if (this.zzZxO == null) {
            if (zz2A() != null) {
                zzfk = zz2A().zzLo(zz2d() ? 0 : 4);
            } else {
                zzfk = new zzFK();
            }
            this.zzZxO = new zzFD(zzfk);
        }
        return this.zzZxO;
    }

    public final zzGK zz3I() {
        return this.zzZyX;
    }

    public final zzCM zz3u() {
        return this.zzZyy;
    }

    public final int zz6y() {
        return this.zzZxz;
    }

    public final void zzNI(int i) {
        this.zzZxt = i;
    }

    public final void zzNJ(int i) {
        this.zzZxu = i;
    }

    public final void zzNK(int i) {
        this.zzZxv = i;
    }

    public final void zzNL(int i) {
        this.zzZxz = i;
    }

    public final ChartDataPoint zzNM(int i) {
        ChartDataPoint chartDataPointZz2H = (i < 0 || getDataPoints().hasDefaultFormat(i)) ? zz2H() : getDataPoints().get(i);
        if (!this.zzZyX.zzZP3()) {
            return chartDataPointZz2H;
        }
        zzCF zzcfZzL0 = zz2y().zzL0(i);
        if (!zz2H().getInvertIfNegative() || zzCF.zzR(zzcfZzL0) || zzcfZzL0.getValue() >= 0.0d) {
            return chartDataPointZz2H;
        }
        zzD9 zzd9ZzZBX = getExtensions().get("{6F2FDCE9-48DA-4B69-8628-5D25D57E5C99}").zzZBX();
        ChartDataPoint chartDataPointZz3g = chartDataPointZz2H.zz3g();
        chartDataPointZz3g.zzZ(zzd9ZzZBX);
        return chartDataPointZz3g;
    }

    public final zzCF zzNN(int i) {
        if (!zz2z().isDate() || zz2j()) {
            return zz2E().zzL0(i);
        }
        if (i < zz2G().length) {
            return zz2G()[i];
        }
        return null;
    }

    public final void zzP(ChartSeries chartSeries) {
        this.zzZxx = chartSeries;
    }

    public final void zzT6(String str) {
        this.zzZxw = str;
    }

    public final int zzW(zzCF zzcf) {
        if (zzcf == null) {
            return -1;
        }
        return zz2z().isDate() ? Arrays.binarySearch(zz2G(), zzcf) : zzcf.getIndex();
    }

    public final void zzX(ChartDataLabelCollection chartDataLabelCollection) {
        this.zzZxG = chartDataLabelCollection;
    }

    public final void zzZ(zzGK zzgk) {
        this.zzZyX = zzgk;
        ChartDataPoint chartDataPoint = this.zzZxE;
        if (chartDataPoint != null) {
            chartDataPoint.zzZ(zzgk);
        }
        Iterator<ChartDataPoint> it = this.zzZxD.zz3a().iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzgk);
        }
        ChartDataLabelCollection chartDataLabelCollection = this.zzZxG;
        if (chartDataLabelCollection != null) {
            chartDataLabelCollection.zzZ(zzgk, this);
        }
    }

    public void hasDataLabels(boolean z) {
        this.zzZxS = z;
    }

    public void add(ChartXValue chartXValue, ChartYValue chartYValue) {
        zz2I();
        if (!zz2c().zz23()) {
            this.zzZyX.zzT(1, "Please make sure you are using correct chart type. There is no way to set Y value for this chart type.");
        }
        zz2c().zzZ(chartXValue, chartYValue, Double.NaN);
    }

    public void insert(int i, ChartXValue chartXValue, ChartYValue chartYValue) {
        zz2I();
        if (!zz2c().zz23()) {
            this.zzZyX.zzT(1, "Please make sure you are using correct chart type. There is no way to set Y value for this chart type.");
        }
        zzZ(i, chartXValue, chartYValue, Double.NaN);
    }

    public void add(ChartXValue chartXValue, ChartYValue chartYValue, double d) {
        zz2I();
        if (!zz2c().zz23()) {
            this.zzZyX.zzT(1, "Please make sure you are using correct chart type. There is no way to set Y value for this chart type.");
        }
        if (!zz2c().zz22()) {
            this.zzZyX.zzT(1, "Please make sure you are using correct chart type. There is no way to set bubble size for non-bubble chart.");
        }
        zz2c().zzZ(chartXValue, chartYValue, d);
    }

    public void insert(int i, ChartXValue chartXValue, ChartYValue chartYValue, double d) {
        zz2I();
        if (!zz2c().zz23()) {
            this.zzZyX.zzT(1, "Please make sure you are using correct chart type. There is no way to set Y value for this chart type.");
        }
        if (!zz2c().zz22()) {
            this.zzZyX.zzT(1, "Please make sure you are using correct chart type. There is no way to set bubble size for non-bubble chart.");
        }
        zzZ(i, chartXValue, chartYValue, d);
    }

    private void zzZ(int i, ChartXValue chartXValue, ChartYValue chartYValue, double d) {
        if (i >= 0 && i <= zz2c().getValueCount()) {
            zz2c().zzY(i, chartXValue, chartYValue, d);
            return;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
    }

    public final void zzZ(zzF7 zzf7) {
        zzf7.zzZ(this);
        if (zzf7.zzZMl() != 0) {
            this.zzZxB = zzf7;
        } else {
            this.zzZxC = zzf7;
        }
    }

    public final void zzZ(zzCR zzcr) {
        zzcr.zzZ(this);
        com.aspose.words.internal.zzZQG.zzZ(this.zzZxF, zzcr);
    }

    private static int zzZ(zzFD zzfd, boolean z) {
        if (zzfd.isEmpty()) {
            return -1;
        }
        zzDH zzdhZzZMv = zzfd.zzZMv();
        int iZzZIh = z ? zzdhZzZMv.zzZIh() : zzdhZzZMv.getValueCount();
        if (iZzZIh > 0) {
            return iZzZIh;
        }
        return -1;
    }

    public final void zzZ(zzCM zzcm) {
        this.zzZyy = zzcm;
    }

    public final void zzZ(zzCD zzcd) {
        this.zzZxA = zzcd;
    }
}
