package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ChartLegendEntry implements zzZCH, zzZD1, Cloneable {
    private int zzTL;
    private boolean zzYQ;
    private Font zzZEt;
    private com.aspose.words.internal.zzZYG<zz82> zzZEy;
    private zzEY zzZy4;
    private zzCL zzZyC;

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public Object fetchSpecialDefaultRunPropertyValue(int i) {
        return null;
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public String generateItemText() {
        return null;
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public zzCL getCollectionTxPr() {
        return this.zzZy4.getLegend().zzaR();
    }

    @Override // com.aspose.words.zzZCH
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzZYG<zz82> getExtensions() {
        return this.zzZEy;
    }

    public Font getFont() {
        if (this.zzZEt == null) {
            this.zzZEt = Font.zzZ(new zzW3(this, this.zzZy4.zzZLZ()), this.zzZy4.getDocument());
        }
        return this.zzZEt;
    }

    public final int getIndex() {
        return this.zzTL;
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public zzD9 getItemSpPr() {
        return null;
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

    public boolean isHidden() {
        return this.zzYQ;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZCH
    @ReservedForInternalUse
    @Deprecated
    public void setExtensions(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        this.zzZEy = zzzyg;
    }

    public final void setIndex(int i) {
        this.zzTL = i;
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public void setItemTxPr(zzCL zzcl) {
        this.zzZyC = zzcl;
    }

    public final ChartLegendEntry zz2U() {
        ChartLegendEntry chartLegendEntry = (ChartLegendEntry) memberwiseClone();
        zzCL zzcl = this.zzZyC;
        if (zzcl != null) {
            chartLegendEntry.zzZyC = zzcl.zzZGr();
        }
        com.aspose.words.internal.zzZYG<zz82> zzzyg = this.zzZEy;
        if (zzzyg != null) {
            chartLegendEntry.zzZEy = zz80.zzN(zzzyg);
        }
        chartLegendEntry.zzZEt = null;
        return chartLegendEntry;
    }

    public final boolean zz3n() {
        if (isHidden()) {
            return true;
        }
        zzCL zzcl = this.zzZyC;
        if (zzcl != null && !zzcl.isEmpty()) {
            return true;
        }
        com.aspose.words.internal.zzZYG<zz82> zzzyg = this.zzZEy;
        return zzzyg != null && zzzyg.getCount() > 0;
    }

    public final void zzY(zzEY zzey) {
        this.zzZy4 = zzey;
    }

    public final zzCL zzaR() {
        if (this.zzZyC == null) {
            this.zzZyC = new zzCL();
        }
        return this.zzZyC;
    }

    public void isHidden(boolean z) {
        this.zzYQ = z;
    }
}
