package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class AxisDisplayUnit implements zzZCH, zzZCO, Cloneable {
    private zzFC zzZEA;
    private com.aspose.words.internal.zzZYG<zz82> zzZEy;
    private ChartAxis zzZEz;
    private int zzZEC = 0;
    private double zzZEB = 1.0d;

    private String zzaY() {
        double dZzaX = zzaX();
        return (dZzaX < 1.0E-9d || dZzaX > 9.9999999999E10d) ? com.aspose.words.internal.zzJB.zzZV(dZzaX) : com.aspose.words.internal.zzJB.zzZT(dZzaX);
    }

    private String zzaZ() {
        int i = this.zzZEC;
        return i != 2 ? i != 4 ? i != 6 ? i != 9 ? i != 10 ? com.aspose.words.internal.zzZKN.format("x {0}", zzaY()) : "Trillions" : "Thousands" : "Millions" : "Hundreds" : "Billions";
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public zzCM generateAutoTitle(zzDI zzdi) {
        zzFC zzfc = this.zzZEA;
        if (zzfc != null) {
            return zzfc.zz3u() == null ? zzDG.zzRk(zzaZ()) : this.zzZEA.zz3u();
        }
        return null;
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public zzD8 getChartSpace() {
        return this.zzZEz.zz3I().getChartSpace();
    }

    public double getCustomUnit() {
        return this.zzZEB;
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public zzCU getDCTitle() {
        return this.zzZEA;
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public double getDefaultFontSize() {
        return this.zzZEz.zz3I().getChartSpace().zz33() ? 9.0d : 10.0d;
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public String getDefaultTitleText() {
        return null;
    }

    public DocumentBase getDocument() {
        return this.zzZEz.getDocument();
    }

    @Override // com.aspose.words.zzZCH
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzZYG<zz82> getExtensions() {
        return this.zzZEy;
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public boolean getTitleDeleted() {
        return false;
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public int getTitlePosition() {
        boolean z = false;
        boolean z2 = this.zzZEz.getCrosses() == 1;
        boolean z3 = this.zzZEz.getTickLabels().getPosition() == 1 && z2;
        if (this.zzZEz.getTickLabels().getPosition() == 0 && !z2) {
            z = true;
        }
        int iZz3U = this.zzZEz.zz3U();
        return iZz3U != 0 ? iZz3U != 1 ? iZz3U != 2 ? (iZz3U == 3 && z3) ? 5 : 4 : z3 ? 6 : 7 : z ? 7 : 6 : z ? 4 : 5;
    }

    public int getUnit() {
        return this.zzZEC;
    }

    public final boolean isDefined() {
        if (this.zzZEC != 0 || this.zzZEA != null) {
            return true;
        }
        com.aspose.words.internal.zzZYG<zz82> zzzyg = this.zzZEy;
        return zzzyg != null && zzzyg.getCount() > 0;
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public boolean isVisible() {
        return this.zzZEA != null;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setCustomUnit(double d) {
        this.zzZEC = 1;
        this.zzZEB = d;
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public void setDCTitle(zzCU zzcu) {
    }

    @Override // com.aspose.words.zzZCH
    @ReservedForInternalUse
    @Deprecated
    public void setExtensions(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        this.zzZEy = zzzyg;
    }

    @Override // com.aspose.words.zzZCO
    @ReservedForInternalUse
    @Deprecated
    public void setTitleDeleted(boolean z) {
    }

    public void setUnit(int i) {
        ChartAxis chartAxis = this.zzZEz;
        if (chartAxis != null && chartAxis.zz3I() != null) {
            int iZzZQO = this.zzZEz.zz3I().zzZQO();
            if (i == 1 && iZzZQO == 16) {
                throw new IllegalArgumentException("The AxisBuiltInUnit.Custom value is not allowed in MS Office 2016 new charts.");
            }
            if (i == 11 && iZzZQO != 16) {
                throw new IllegalArgumentException(com.aspose.words.internal.zzZKN.format("The AxisBuiltInUnit.Percentage value is not supported by the {0} chart type.", Integer.valueOf(iZzZQO)));
            }
        }
        this.zzZEC = i;
    }

    public final void zzZ(ChartAxis chartAxis) {
        this.zzZEz = chartAxis;
    }

    public final double zzaX() {
        switch (this.zzZEC) {
            case 1:
                return this.zzZEB;
            case 2:
                return 1.0E9d;
            case 3:
                return 1.0E8d;
            case 4:
                return 100.0d;
            case 5:
                return 100000.0d;
            case 6:
                return 1000000.0d;
            case 7:
                return 1.0E7d;
            case 8:
                return 10000.0d;
            case 9:
                return 1000.0d;
            case 10:
                return 1.0E12d;
            default:
                return 1.0d;
        }
    }

    public final AxisDisplayUnit zzb0() {
        AxisDisplayUnit axisDisplayUnit = (AxisDisplayUnit) memberwiseClone();
        zzFC zzfc = this.zzZEA;
        if (zzfc != null) {
            zzFC zzfc2 = (zzFC) zzfc.zzZMt();
            axisDisplayUnit.zzZEA = zzfc2;
            zzfc2.zzY(axisDisplayUnit);
        }
        com.aspose.words.internal.zzZYG<zz82> zzzyg = this.zzZEy;
        if (zzzyg != null) {
            axisDisplayUnit.zzZEy = zz80.zzN(zzzyg);
        }
        return axisDisplayUnit;
    }

    public final boolean zzb1() {
        int iZz3U = this.zzZEz.zz3U();
        return getTitlePosition() != (iZz3U != 0 ? iZz3U != 1 ? iZz3U != 2 ? 4 : 7 : 6 : 5);
    }

    public final zzCU zzb2() {
        return this.zzZEA;
    }

    public final void zzZ(zzFC zzfc) {
        this.zzZEA = zzfc;
    }
}
