package com.aspose.words;

import com.aspose.slides.OooOOOO;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class ChartAxis implements zzZ9V, zzZCH, zzZCO, zzZD3, Cloneable {
    private com.aspose.words.internal.zzPM zzYX;
    private com.aspose.words.internal.zzOU zzYs;
    private com.aspose.words.internal.zzZYG<zz82> zzZEy;
    private ChartFormat zzZyE;
    private AxisTickLabels zzZyF;
    private ChartNumberFormat zzZyG;
    private ChartAxisTitle zzZyI;
    private zzCU zzZyJ;
    private String zzZyL;
    private boolean zzZyM;
    private boolean zzZyN;
    private boolean zzZyO;
    private boolean zzZyP;
    private zzDI zzZyQ;
    private com.aspose.words.internal.zzZQ4 zzZyR;
    private zzDT zzZyT;
    private zzGG zzZyU;
    private int zzZyV;
    private ChartAxis zzZyW;
    private zzGK zzZyX;
    private zzGB zzZyY;
    private ArrayList<ChartSeries> zzZyS = new ArrayList<>();
    private float zzZyK = Float.NaN;
    private boolean zzZyH = true;

    public ChartAxis(int i, zzGK zzgk, DocumentBase documentBase, boolean z) {
        this.zzZyV = i;
        this.zzZyX = zzgk;
        this.zzZyY = new zzGB(documentBase, z);
    }

    private static zzET zzO9(int i) {
        zz4G zz4g = new zz4G();
        zz4g.zzXK(9525.0d);
        zz4g.setEndCap(2);
        zz4g.zzHo(0);
        zz4g.zzWX(false);
        ArrayList<zzZCM> arrayList = new ArrayList<>();
        zz5C zz5c = new zz5C();
        zz5c.setValue(i == 1 ? 0.15d : 0.05d);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz5C>) arrayList, zz5c);
        zz5B zz5b = new zz5B();
        zz5b.setValue(i == 1 ? 0.85d : 0.95d);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz5B>) arrayList, zz5b);
        zz2Q zz2q = new zz2Q();
        zz2q.setValue(12);
        zz2q.zze(arrayList);
        zz1C zz1c = new zz1C();
        zz1c.zzZ(zz2q);
        zz4g.setFill(zz1c);
        zzET zzet = new zzET();
        zzet.zzaQ().setOutline(zz4g);
        return zzet;
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public zzCM generateAutoTitle(zzDI zzdi) {
        zzCU zzcu = this.zzZyJ;
        if (zzcu != null) {
            return zzcu.zz3u() == null ? zzDG.zzRk("Axis Title") : this.zzZyJ.zz3u();
        }
        return null;
    }

    public boolean getAxisBetweenCategories() {
        return zz4k() == 0;
    }

    public int getBaseTimeUnit() {
        return ((Integer) this.zzZyY.zzLv(4)).intValue();
    }

    public int getCategoryType() {
        if (((Boolean) this.zzZyY.zzLv(1)).booleanValue()) {
            return 0;
        }
        return ((Boolean) this.zzZyY.zzLv(2)).booleanValue() ? 2 : 1;
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public zzD8 getChartSpace() {
        return this.zzZyX.getChartSpace();
    }

    public int getCrosses() {
        return ((Integer) this.zzZyY.zzLv(5)).intValue();
    }

    public double getCrossesAt() {
        return ((Double) this.zzZyY.zzLv(6)).doubleValue();
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public zzCU getDCTitle() {
        return this.zzZyJ;
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public double getDefaultFontSize() {
        return zz46();
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public String getDefaultTitleText() {
        return zzK7.getTitle();
    }

    public AxisDisplayUnit getDisplayUnit() {
        AxisDisplayUnit axisDisplayUnit = (AxisDisplayUnit) this.zzZyY.zzLv(9);
        if (axisDisplayUnit != null) {
            return axisDisplayUnit;
        }
        AxisDisplayUnit axisDisplayUnit2 = new AxisDisplayUnit();
        axisDisplayUnit2.zzZ(this);
        this.zzZyY.zzL(9, axisDisplayUnit2);
        return axisDisplayUnit2;
    }

    public DocumentBase getDocument() {
        return this.zzZyX.getChartSpace().zzZyb().getDocument();
    }

    @Override // com.aspose.words.zzZCH
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzZYG<zz82> getExtensions() {
        return this.zzZEy;
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public zz7X getFill() {
        return zzaQ().getFill();
    }

    public ChartFormat getFormat() {
        if (this.zzZyE == null) {
            this.zzZyE = new ChartFormat(this);
        }
        return this.zzZyE;
    }

    public final String getFormatCode() {
        if (this.zzZyL == null) {
            this.zzZyL = zz4d() != null ? zz4d().getFormatCode() : "";
        }
        return this.zzZyL;
    }

    public boolean getHidden() {
        return ((Boolean) this.zzZyY.zzLv(32)).booleanValue();
    }

    public int getMajorTickMark() {
        return ((Integer) this.zzZyY.zzLv(16)).intValue();
    }

    public double getMajorUnit() {
        return zz4g().getValue();
    }

    public boolean getMajorUnitIsAuto() {
        return zz4g().zzZk0();
    }

    public int getMajorUnitScale() {
        return ((Integer) this.zzZyY.zzLv(13)).intValue();
    }

    public int getMinorTickMark() {
        return ((Integer) this.zzZyY.zzLv(17)).intValue();
    }

    public double getMinorUnit() {
        return zz4f().getValue();
    }

    public boolean getMinorUnitIsAuto() {
        return zz4f().zzZk0();
    }

    public int getMinorUnitScale() {
        return ((Integer) this.zzZyY.zzLv(15)).intValue();
    }

    @Override // com.aspose.words.zzZ9V
    @ReservedForInternalUse
    @Deprecated
    public zzE8 getNumFmt_INumberFormatProvider() {
        return zz4d();
    }

    public ChartNumberFormat getNumberFormat() {
        if (this.zzZyG == null) {
            this.zzZyG = new ChartNumberFormat(this, this.zzZyX);
        }
        return this.zzZyG;
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public zz4G getOutline() {
        return zzaQ().getOutline();
    }

    public boolean getReverseOrder() {
        return getScaling().getOrientation() == 0;
    }

    public AxisScaling getScaling() {
        return (AxisScaling) this.zzZyY.zzLv(22);
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public int getShapeType() {
        return 0;
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public zzZ90 getThemeProvider() {
        return getDocument().zzZqI();
    }

    @Deprecated
    public int getTickLabelAlignment() {
        return getTickLabels().getAlignment();
    }

    @Deprecated
    public int getTickLabelOffset() {
        return getTickLabels().getOffset();
    }

    @Deprecated
    public int getTickLabelPosition() {
        return getTickLabels().getPosition();
    }

    @Deprecated
    public int getTickLabelSpacing() {
        return getTickLabels().getSpacing();
    }

    @Deprecated
    public boolean getTickLabelSpacingIsAuto() {
        return getTickLabels().isAutoSpacing();
    }

    public AxisTickLabels getTickLabels() {
        if (this.zzZyF == null) {
            this.zzZyF = new AxisTickLabels(this);
        }
        return this.zzZyF;
    }

    public int getTickMarkSpacing() {
        return ((Integer) this.zzZyY.zzLv(28)).intValue();
    }

    public ChartAxisTitle getTitle() {
        if (this.zzZyI == null) {
            this.zzZyI = new ChartAxisTitle(this);
        }
        return this.zzZyI;
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public boolean getTitleDeleted() {
        return !this.zzZyH || this.zzZyJ == null;
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public int getTitlePosition() {
        int iZz3U = zz3U();
        if (iZz3U == 0) {
            return 1;
        }
        if (iZz3U != 1) {
            return iZz3U != 2 ? 0 : 3;
        }
        return 2;
    }

    public int getType() {
        return this.zzZyV;
    }

    public boolean hasMajorGridlines() {
        return zz4j() != null;
    }

    public boolean hasMinorGridlines() {
        return zz4i() != null;
    }

    public final boolean isDate() throws Exception {
        return zz4q() && zz41().zzZOQ() && zz41().zzZOV()[0].isDate();
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public boolean isFillSupported() {
        return !this.zzZyX.getChartSpace().zz33();
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public boolean isFormatDefined() {
        return this.zzZyY.zzZOq() && !zzaQ().isEmpty();
    }

    @Override // com.aspose.words.zzZ9V
    @ReservedForInternalUse
    @Deprecated
    public boolean isInherited() {
        return false;
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public boolean isVisible() {
        return !getTitleDeleted();
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void materializeSpPr() {
        if (this.zzZyY.zzZOq()) {
            return;
        }
        this.zzZyY.zzL(23, new zzD9());
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setAxisBetweenCategories(boolean z) {
        zzOa(!z ? 1 : 0);
    }

    public void setBaseTimeUnit(int i) {
        this.zzZyY.zzL(4, Integer.valueOf(i));
    }

    public void setCategoryType(int i) {
        if (i == 0) {
            this.zzZyY.zzL(1, Boolean.TRUE);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalArgumentException(com.aspose.words.internal.zzZKN.format("Wrong value is specified: {0}.", Integer.valueOf(i)));
            }
            this.zzZyY.zzL(1, Boolean.FALSE);
            this.zzZyY.zzL(2, Boolean.TRUE);
            return;
        }
        zzGB zzgb = this.zzZyY;
        Boolean bool = Boolean.FALSE;
        zzgb.zzL(1, bool);
        this.zzZyY.zzL(2, bool);
    }

    public void setCrosses(int i) {
        this.zzZyY.zzL(5, Integer.valueOf(i));
    }

    public void setCrossesAt(double d) {
        this.zzZyY.zzL(6, Double.valueOf(d));
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public void setDCTitle(zzCU zzcu) {
        this.zzZyJ = zzcu;
    }

    @Override // com.aspose.words.zzZCH
    @ReservedForInternalUse
    @Deprecated
    public void setExtensions(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        this.zzZEy = zzzyg;
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void setFill(zz7X zz7x) {
        zzaQ().setFill(zz7x);
    }

    public final void setFormatCode(String str) {
        this.zzZyL = str;
    }

    public void setHidden(boolean z) {
        this.zzZyY.zzL(32, Boolean.valueOf(z));
    }

    public void setMajorTickMark(int i) {
        this.zzZyY.zzL(16, Integer.valueOf(i));
    }

    public void setMajorUnit(double d) {
        com.aspose.words.internal.zzZ4.zzZ(d, "value");
        zz4g().setValue(d);
    }

    public void setMajorUnitIsAuto(boolean z) {
        zz4g().isAuto(z);
    }

    public void setMajorUnitScale(int i) {
        this.zzZyY.zzL(13, Integer.valueOf(i));
    }

    public void setMinorTickMark(int i) {
        this.zzZyY.zzL(17, Integer.valueOf(i));
    }

    public void setMinorUnit(double d) {
        com.aspose.words.internal.zzZ4.zzZ(d, "value");
        zz4f().setValue(d);
    }

    public void setMinorUnitIsAuto(boolean z) {
        zz4f().isAuto(z);
    }

    public void setMinorUnitScale(int i) {
        this.zzZyY.zzL(15, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZ9V
    @ReservedForInternalUse
    @Deprecated
    public void setNumFmt_INumberFormatProvider(zzE8 zze8) {
        zzZ(zze8);
    }

    @ReservedForInternalUse
    @Deprecated
    public void setOutline(zz4G zz4g) {
        zzaQ().setOutline(zz4g);
    }

    public void setReverseOrder(boolean z) {
        getScaling().setOrientation(!z ? 1 : 0);
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void setShapeType(int i) {
    }

    @Deprecated
    public void setTickLabelAlignment(int i) {
        getTickLabels().setAlignment(i);
    }

    @Deprecated
    public void setTickLabelOffset(int i) {
        getTickLabels().setOffset(i);
    }

    @Deprecated
    public void setTickLabelPosition(int i) {
        getTickLabels().setPosition(i);
    }

    @Deprecated
    public void setTickLabelSpacing(int i) {
        getTickLabels().setSpacing(i);
    }

    @Deprecated
    public void setTickLabelSpacingIsAuto(boolean z) {
        getTickLabels().isAutoSpacing(z);
    }

    public void setTickMarkSpacing(int i) {
        com.aspose.words.internal.zzZ4.zzZ(i, "value");
        this.zzZyY.zzL(28, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public void setTitleDeleted(boolean z) {
        this.zzZyH = !z;
    }

    public final void setType(int i) {
        this.zzZyV = i;
    }

    public final void zz0(com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzZyR = zzzq4;
    }

    public final ArrayList<ChartSeries> zz3H() {
        return this.zzZyS;
    }

    public final zzGK zz3I() {
        return this.zzZyX;
    }

    public final boolean zz3J() {
        return this.zzZyO;
    }

    public final boolean zz3K() {
        return getScaling().getType() == 1;
    }

    public final boolean zz3L() {
        return zzaR().zzZHh().zzZtA() && zz3Z() && !zz4q();
    }

    public final double zz3M() {
        return zzaR().zzZHh().zzZCC().getValue() / 60000.0d;
    }

    public final float zz3N() throws Exception {
        zzGK zzgk;
        return OooOOOO.OooO00o(getTickLabels().getOffset(), 200.0f, zz3P(), (zz40() || ((zzgk = this.zzZyX) != null && zzgk.zz3R()) || !zz3W()) ? zz3O() : 0.0f);
    }

    public final float zz3O() throws Exception {
        return (zzZr().getLineSpacingPoints() - zzZr().getDescentPoints()) / 3.0f;
    }

    public final float zz3P() throws Exception {
        if (Float.isNaN(this.zzZyK)) {
            this.zzZyK = zzZr().getLineSpacingPoints();
        }
        return this.zzZyK;
    }

    public final boolean zz3Q() {
        return this.zzZyM;
    }

    public final boolean zz3R() {
        return this.zzZyN;
    }

    public final boolean zz3S() {
        return this.zzZyP;
    }

    public final boolean zz3T() {
        Object objZzLu = this.zzZyY.zzLu(24);
        return objZzLu != null && ((Integer) objZzLu).intValue() == 2;
    }

    public final int zz3U() {
        if ((getCrosses() == 1 && zz3Y().getScaling().getOrientation() == 1) || (getCrosses() == 2 && zz3Y().getScaling().getOrientation() == 0)) {
            if (zz4m() == 1) {
                return 2;
            }
            if (zz4m() == 0) {
                return 3;
            }
        }
        if ((getCrosses() == 2 && zz3Y().getScaling().getOrientation() == 1) || (getCrosses() == 1 && zz3Y().getScaling().getOrientation() == 0)) {
            if (zz4m() == 2) {
                return 1;
            }
            if (zz4m() == 3) {
                return 0;
            }
        }
        if (getCrosses() == 0 && zz4m() == 2 && zz3Y().getScaling().getOrientation() == 1) {
            return 1;
        }
        return zz4m();
    }

    public final boolean zz3V() throws Exception {
        return zz3U() == 0 && (((zz3Y().zz41().zzZON() > zz3Y().zz41().zzZOR() ? 1 : (zz3Y().zz41().zzZON() == zz3Y().zz41().zzZOR() ? 0 : -1)) == 0 && zz3Y().getScaling().getOrientation() == 1) || ((zz3Y().zz41().zzZON() > zz3Y().zz41().zzZOS() ? 1 : (zz3Y().zz41().zzZON() == zz3Y().zz41().zzZOS() ? 0 : -1)) == 0 && zz3Y().getScaling().getOrientation() == 0));
    }

    public final boolean zz3W() {
        return ((zz3U() == 1 || zz3U() == 0) && !(!zz3Y().getReverseOrder() ? getTickLabels().getPosition() == 0 : getTickLabels().getPosition() == 1)) || (!zz3Y().getReverseOrder() ? getTickLabels().getPosition() == 1 : getTickLabels().getPosition() == 0);
    }

    public final boolean zz3X() {
        return zz3Y().getAxisBetweenCategories() && zz3Z();
    }

    public final ChartAxis zz3Y() {
        if (this.zzZyW == null) {
            this.zzZyW = this.zzZyT.zzKE(zz4l());
        }
        return this.zzZyW;
    }

    public final boolean zz3Z() {
        return getType() == 0;
    }

    public final boolean zz40() {
        return zz4m() == 1 || zz4m() == 2;
    }

    public final zzGG zz41() {
        if (this.zzZyU == null) {
            this.zzZyU = zzGG.zzQ(this);
        }
        return this.zzZyU;
    }

    public final float zz42() throws Exception {
        return zzDG.zzU(new zzCL(), this.zzZyQ);
    }

    public final zzDI zz43() {
        return this.zzZyQ;
    }

    public final com.aspose.words.internal.zzZQ4 zz44() {
        return this.zzZyR;
    }

    public final zzDT zz45() {
        return this.zzZyT;
    }

    public final int zz46() {
        return this.zzZyX.getChartSpace().zz33() ? 9 : 10;
    }

    public final ChartAxis zz47() {
        ChartAxis chartAxis = (ChartAxis) memberwiseClone();
        chartAxis.zzZyU = null;
        zz41().zzY(chartAxis.zz41());
        zzGB zzgb = this.zzZyY;
        if (zzgb != null) {
            zzGB zzgbZzZOr = zzgb.zzZOr();
            chartAxis.zzZyY = zzgbZzZOr;
            AxisDisplayUnit axisDisplayUnit = (AxisDisplayUnit) zzgbZzZOr.zzLu(9);
            if (axisDisplayUnit != null) {
                axisDisplayUnit.zzZ(chartAxis);
            }
        }
        zzCU zzcu = this.zzZyJ;
        if (zzcu != null) {
            zzCU zzcuZzZMt = zzcu.zzZMt();
            chartAxis.zzZyJ = zzcuZzZMt;
            zzcuZzZMt.zzY(chartAxis);
        }
        zzDI zzdi = this.zzZyQ;
        if (zzdi != null) {
            chartAxis.zzZyQ = zzdi;
        }
        chartAxis.zzZyW = null;
        chartAxis.zzZyG = null;
        chartAxis.zzZyF = null;
        chartAxis.zzZyE = null;
        com.aspose.words.internal.zzZYG<zz82> zzzyg = this.zzZEy;
        if (zzzyg != null) {
            chartAxis.zzZEy = zz80.zzN(zzzyg);
        }
        return chartAxis;
    }

    public final zzCU zz48() {
        return this.zzZyJ;
    }

    public final com.aspose.words.internal.zzZYG<zz82> zz49() {
        return (com.aspose.words.internal.zzZYG) this.zzZyY.zzLv(30);
    }

    public final com.aspose.words.internal.zzZYG<zz82> zz4a() {
        return (com.aspose.words.internal.zzZYG) this.zzZyY.zzLv(29);
    }

    public final com.aspose.words.internal.zzZYG<zz82> zz4b() {
        return (com.aspose.words.internal.zzZYG) this.zzZyY.zzLv(27);
    }

    public final boolean zz4c() {
        return getTickLabels().getPosition() != 3;
    }

    public final zzE8 zz4d() {
        Object objZzLv = this.zzZyY.zzLv(21);
        if (objZzLv != null) {
            return (zzE8) objZzLv;
        }
        return null;
    }

    public final boolean zz4e() {
        return this.zzZyY.zzLu(28) == null;
    }

    public final zzZVY zz4f() {
        return (zzZVY) this.zzZyY.zzLv(14);
    }

    public final zzZVY zz4g() {
        return (zzZVY) this.zzZyY.zzLv(12);
    }

    public final boolean zz4h() {
        return ((Boolean) this.zzZyY.zzLv(20)).booleanValue();
    }

    public final zzET zz4i() {
        Object objZzLv = this.zzZyY.zzLv(19);
        if (objZzLv != null) {
            return (zzET) objZzLv;
        }
        return null;
    }

    public final zzET zz4j() {
        Object objZzLv = this.zzZyY.zzLv(18);
        if (objZzLv != null) {
            return (zzET) objZzLv;
        }
        return null;
    }

    public final int zz4k() {
        return ((Integer) this.zzZyY.zzLv(8)).intValue();
    }

    public final int zz4l() {
        return ((Integer) this.zzZyY.zzLv(7)).intValue();
    }

    public final int zz4m() {
        return ((Integer) this.zzZyY.zzLv(3)).intValue();
    }

    public final int zz4n() {
        return ((Integer) this.zzZyY.zzLv(0)).intValue();
    }

    public final int zz4o() {
        return ((Integer) this.zzZyY.zzLv(10)).intValue();
    }

    public final zzGB zz4p() {
        return this.zzZyY;
    }

    public final boolean zz4q() {
        return zz3Z() && ((Boolean) this.zzZyY.zzLv(2)).booleanValue();
    }

    public final void zzOa(int i) {
        this.zzZyY.zzL(8, Integer.valueOf(i));
    }

    public final void zzOb(int i) {
        this.zzZyY.zzL(7, Integer.valueOf(i));
    }

    public final void zzOc(int i) {
        this.zzZyY.zzL(3, Integer.valueOf(i));
    }

    public final void zzOd(int i) {
        this.zzZyY.zzL(0, Integer.valueOf(i));
    }

    public final void zzOe(int i) {
        this.zzZyY.zzL(10, Integer.valueOf(i));
    }

    public final void zzS(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        this.zzZyY.zzL(27, zzzyg);
    }

    public final void zzY(ChartAxis chartAxis) {
        this.zzZyW = chartAxis;
    }

    public final void zzYp(boolean z) {
        this.zzZyO = z;
    }

    public final void zzYq(boolean z) {
        this.zzZyM = z;
    }

    public final void zzYr(boolean z) {
        this.zzZyN = z;
    }

    public final void zzYs(boolean z) {
        this.zzZyP = z;
    }

    public final void zzYt(boolean z) {
        getTickLabels().setPosition(z ? 2 : 3);
    }

    public final void zzYu(boolean z) {
        this.zzZyY.zzL(20, Boolean.valueOf(z));
    }

    public final void zzZ(zzCU zzcu) {
        this.zzZyJ = zzcu;
    }

    public final com.aspose.words.internal.zzOU zzZ2() throws Exception {
        if (this.zzYs == null) {
            this.zzYs = zzDG.zzZ(zzaQ(), this.zzZyQ.zzZIC().zzZMP(), 0);
        }
        return this.zzYs;
    }

    public final com.aspose.words.internal.zzPM zzZr() throws Exception {
        if (this.zzYX == null) {
            this.zzYX = zzDG.zzT(zzaR(), this.zzZyQ);
        }
        return this.zzYX;
    }

    public final zzD9 zzaQ() {
        return (zzD9) this.zzZyY.zzLv(23);
    }

    public final zzCL zzaR() {
        return (zzCL) this.zzZyY.zzLv(31);
    }

    public void hasMajorGridlines(boolean z) {
        if (hasMajorGridlines() == z) {
            return;
        }
        zzZ(z ? zzO9(1) : null);
    }

    public void hasMinorGridlines(boolean z) {
        if (hasMinorGridlines() == z) {
            return;
        }
        zzY(z ? zzO9(0) : null);
    }

    public final void zzY(zzET zzet) {
        this.zzZyY.zzL(19, zzet);
    }

    public final void zzZ(AxisDisplayUnit axisDisplayUnit) {
        if (axisDisplayUnit != null) {
            axisDisplayUnit.zzZ(this);
        }
        this.zzZyY.zzL(9, axisDisplayUnit);
    }

    public final void zzZ(zzGK zzgk) {
        this.zzZyX = zzgk;
        Iterator<ChartSeries> it = zzgk.zzZPj().iterator();
        while (it.hasNext()) {
            this.zzZyS.add(it.next());
        }
    }

    public final void zzZ(zzDT zzdt) {
        this.zzZyT = zzdt;
    }

    public final void zzZ(zzDI zzdi) {
        this.zzZyQ = zzdi;
    }

    public final void zzZ(zzGG zzgg) {
        this.zzZyU = zzgg;
    }

    public final void zzZ(zzET zzet) {
        this.zzZyY.zzL(18, zzet);
    }

    public final void zzZ(zzE8 zze8) {
        this.zzZyY.zzL(21, zze8);
    }
}
