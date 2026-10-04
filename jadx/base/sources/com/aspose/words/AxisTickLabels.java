package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class AxisTickLabels implements zzZD1 {
    private zzW3 zzZEs;
    private Font zzZEt;
    private ChartAxis zzZEz;

    public AxisTickLabels(ChartAxis chartAxis) {
        this.zzZEz = chartAxis;
    }

    private void zzZ(zzCL zzcl) {
        this.zzZEz.zz4p().zzL(31, zzcl);
    }

    private zzD9 zzaQ() {
        return (zzD9) this.zzZEz.zz4p().zzLv(23);
    }

    private zzCL zzaR() {
        return (zzCL) this.zzZEz.zz4p().zzLv(31);
    }

    private zzW3 zzaS() {
        if (this.zzZEs == null) {
            this.zzZEs = new zzW3(this, this.zzZEz.zz3I().getChartSpace());
        }
        return this.zzZEs;
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public Object fetchSpecialDefaultRunPropertyValue(int i) {
        if (i == 190) {
            return Integer.valueOf(com.aspose.words.internal.zzSA.zzt(this.zzZEz.zz46()));
        }
        return null;
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public String generateItemText() {
        return null;
    }

    public int getAlignment() {
        return zzaR().zzZGt().zzZxp().getAlignment();
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public zzCL getCollectionTxPr() {
        return null;
    }

    public Font getFont() {
        if (this.zzZEt == null) {
            this.zzZEt = new Font(zzaS(), this.zzZEz.getDocument());
        }
        return this.zzZEt;
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public zzD9 getItemSpPr() {
        return zzaQ();
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public zzCM getItemTx() {
        return null;
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public zzCL getItemTxPr() {
        return zzaR();
    }

    public int getOffset() {
        return ((Integer) this.zzZEz.zz4p().zzLv(11)).intValue();
    }

    public int getPosition() {
        return ((Integer) this.zzZEz.zz4p().zzLv(24)).intValue();
    }

    public int getSpacing() {
        return ((Integer) this.zzZEz.zz4p().zzLv(25)).intValue();
    }

    public boolean isAutoSpacing() {
        return ((Boolean) this.zzZEz.zz4p().zzLv(26)).booleanValue();
    }

    public void setAlignment(int i) {
        zzaR().zzZGt().zzZxp().setAlignment(i);
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public void setItemTxPr(zzCL zzcl) {
        zzZ(zzcl);
    }

    public void setOffset(int i) {
        com.aspose.words.internal.zzZ4.zzZ(i, 0, 1000, "value");
        this.zzZEz.zz4p().zzL(11, Integer.valueOf(i));
    }

    public void setPosition(int i) {
        this.zzZEz.zz4p().zzL(24, Integer.valueOf(i));
    }

    public void setSpacing(int i) {
        com.aspose.words.internal.zzZ4.zzZ(i, "value");
        this.zzZEz.zz4p().zzL(25, Integer.valueOf(i));
        isAutoSpacing(false);
    }

    public void isAutoSpacing(boolean z) {
        this.zzZEz.zz4p().zzL(26, Boolean.valueOf(z));
    }
}
