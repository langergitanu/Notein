package com.aspose.words;

import com.google.firebase.firestore.local.SQLitePersistence;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class ChartDataTable implements zzZD1, zzZD3, Cloneable {
    private zzW3 zzZEs;
    private Font zzZEt;
    private zzCL zzZyC;
    private ChartFormat zzZyE;
    private zzDT zzZyT;
    private boolean zzZyj;
    private zzD9 zzZyx;
    private boolean zzZyi = true;
    private boolean zzZyh = true;
    private boolean zzZyg = true;
    private boolean zzZyf = true;

    public ChartDataTable(zzDT zzdt) {
        this.zzZyT = zzdt;
    }

    private boolean zz37() {
        for (zzGK zzgk : this.zzZyT.zzZJf()) {
            if (zzgk.zzZP8() || zzgk.zzZP9() || zzgk.zzZP7() || zzgk.zzZP6() || zzgk.zzZPa() || zzgk.zz2e()) {
                return false;
            }
        }
        return true;
    }

    public static ChartDataTable zzY(zzDT zzdt) {
        ChartDataTable chartDataTable = new ChartDataTable(zzdt);
        zz4G outline = chartDataTable.zzaQ().getOutline();
        outline.setWeight(0.75d);
        zz2Q zz2q = new zz2Q();
        zz2q.setValue(12);
        zz5C zz5c = new zz5C();
        zz5c.setValue(0.15d);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz5C>) zz2q.zzZNX(), zz5c);
        zz5B zz5b = new zz5B();
        zz5b.setValue(0.85d);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz5B>) zz2q.zzZNX(), zz5b);
        outline.setFill(new zz1C(zz2q));
        zz49 zz49VarZzZxp = chartDataTable.zzaR().zzZGs().zzZxp();
        zz49VarZzZxp.zzWS(true);
        zz49VarZzZxp.zzZHc().zzX(new zz0K(SQLitePersistence.MAX_ARGS));
        zz2Q zz2q2 = new zz2Q();
        zz2q2.setValue(12);
        zz5C zz5c2 = new zz5C();
        zz5c2.setValue(0.65d);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz5C>) zz2q2.zzZNX(), zz5c2);
        zz5B zz5b2 = new zz5B();
        zz5b2.setValue(0.35d);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz5B>) zz2q2.zzZNX(), zz5b2);
        zz49VarZzZxp.zzZHc().setFill(new zz1C(zz2q2));
        return chartDataTable;
    }

    private zzW3 zzaS() {
        if (this.zzZEs == null) {
            this.zzZEs = new zzW3(this, this.zzZyT.zzZJc().zzZLZ());
        }
        return this.zzZEs;
    }

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
        return null;
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public zz7X getFill() {
        return zzaQ().getFill();
    }

    public Font getFont() {
        if (this.zzZEt == null) {
            this.zzZEt = new Font(zzaS(), this.zzZyT.zzZJc().getDocument());
        }
        return this.zzZEt;
    }

    public ChartFormat getFormat() {
        if (this.zzZyE == null) {
            this.zzZyE = new ChartFormat(this);
        }
        return this.zzZyE;
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

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public zz4G getOutline() {
        return zzaQ().getOutline();
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public int getShapeType() {
        return 0;
    }

    public boolean getShow() {
        return this.zzZyj;
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public zzZ90 getThemeProvider() {
        return this.zzZyT.zzZJc().getDocument().zzZqI();
    }

    public boolean hasHorizontalBorder() {
        return this.zzZyh;
    }

    public boolean hasLegendKeys() {
        return this.zzZyi;
    }

    public boolean hasOutlineBorder() {
        return this.zzZyf;
    }

    public boolean hasVerticalBorder() {
        return this.zzZyg;
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public boolean isFillSupported() {
        return true;
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public boolean isFormatDefined() {
        return !zzaQ().isEmpty();
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void materializeSpPr() {
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void setFill(zz7X zz7x) {
        zzaQ().setFill(zz7x);
    }

    @Override // com.aspose.words.zzZD1
    @ReservedForInternalUse
    @Deprecated
    public void setItemTxPr(zzCL zzcl) {
        this.zzZyC = zzcl;
    }

    @ReservedForInternalUse
    @Deprecated
    public void setOutline(zz4G zz4g) {
        zzaQ().setOutline(zz4g);
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void setShapeType(int i) {
    }

    public void setShow(boolean z) {
        if (z && !zz37()) {
            throw new IllegalStateException("This chart type does not support a data table.");
        }
        this.zzZyj = z;
    }

    public final ChartDataTable zz38() {
        ChartDataTable chartDataTable = (ChartDataTable) memberwiseClone();
        zzD9 zzd9 = this.zzZyx;
        if (zzd9 != null) {
            chartDataTable.zzZyx = zzd9.zzZI4();
        }
        zzCL zzcl = this.zzZyC;
        if (zzcl != null) {
            chartDataTable.zzZyC = zzcl.zzZGr();
        }
        chartDataTable.zzZEs = null;
        chartDataTable.zzZEt = null;
        chartDataTable.zzZyE = null;
        return chartDataTable;
    }

    public final void zzZ(zzDT zzdt) {
        this.zzZyT = zzdt;
    }

    public final zzD9 zzaQ() {
        if (this.zzZyx == null) {
            this.zzZyx = new zzD9();
        }
        return this.zzZyx;
    }

    public final zzCL zzaR() {
        if (this.zzZyC == null) {
            this.zzZyC = new zzCL();
        }
        return this.zzZyC;
    }

    public void hasHorizontalBorder(boolean z) {
        this.zzZyh = z;
    }

    public void hasLegendKeys(boolean z) {
        this.zzZyi = z;
    }

    public void hasOutlineBorder(boolean z) {
        this.zzZyf = z;
    }

    public void hasVerticalBorder(boolean z) {
        this.zzZyg = z;
    }
}
