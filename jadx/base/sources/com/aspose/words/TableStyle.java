package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class TableStyle extends Style implements zzZ9C, zzZ9J, zzZD5, zzZD6 {
    private ConditionalStyleCollection zzX4M;
    private zzWP zzZAg;
    private BorderCollection zzZCb;
    private zzY6G zzZsN;
    private zzY6G zzZsO;
    private static int[] zzX4L = {12, 11, 10, 9, 3, 1, 4, 2, 5, 7, 6, 8};
    private static int[] zzX4K = {8, 6, 7, 5, 2, 4, 1, 3, 9, 10, 11, 12};

    public TableStyle() {
        super(3);
        this.zzZsO = new zzY6G();
        this.zzZsN = new zzY6G();
        this.zzZAg = new zzWP();
    }

    private void zzB(zzY6G zzy6g) {
        TableStyle tableStyle = (TableStyle) zzY3j();
        if (tableStyle != null) {
            tableStyle.zzB(zzy6g);
        }
        zzY6G zzy6g2 = this.zzZsN;
        if (zzy6g2 != null) {
            zzy6g2.zzY(zzy6g);
        }
    }

    private void zzC(zzY6G zzy6g) {
        TableStyle tableStyle = (TableStyle) zzY3j();
        if (tableStyle != null) {
            tableStyle.zzC(zzy6g);
        }
        zzY6G zzy6g2 = this.zzZsO;
        if (zzy6g2 != null) {
            zzy6g2.zzY(zzy6g);
        }
    }

    private WordAttrCollection zzMN(int i) {
        if (i == 0) {
            return zzZYh();
        }
        if (i == 1) {
            return zzZYj();
        }
        if (i == 2) {
            return this.zzZAg;
        }
        throw new IllegalStateException("Unexpected AttrCollectionType value.");
    }

    private void zzO(zzWP zzwp) {
        TableStyle tableStyle = (TableStyle) zzY3j();
        if (tableStyle != null) {
            tableStyle.zzO(zzwp);
        }
        zzWP zzwp2 = this.zzZAg;
        if (zzwp2 != null) {
            zzwp2.zzY((zzZS) zzwp);
        }
    }

    private ConditionalStyle zzV(ConditionalStyle conditionalStyle) {
        for (int iZzZ = conditionalStyle != null ? com.aspose.words.internal.zzZKV.zzZ(zzX4L, conditionalStyle.zzZYk(), 0, zzX4L.length) + 1 : 0; iZzZ < zzX4L.length; iZzZ++) {
            if (getConditionalStyles().zzMM(zzX4L[iZzZ])) {
                return getConditionalStyles().zzMJ(zzX4L[iZzZ]);
            }
        }
        return null;
    }

    private double zzV8(int i, int i2) {
        return ((double) (((Integer) fetchRowAttr(i)).intValue() != 0 ? ((Integer) fetchRowAttr(i)).intValue() : ((Integer) fetchCellAttr(i2)).intValue())) / 20.0d;
    }

    private ConditionalStyle zzW(ConditionalStyle conditionalStyle) {
        for (int iZzZ = conditionalStyle != null ? com.aspose.words.internal.zzZKV.zzZ(zzX4K, conditionalStyle.zzZYk(), 0, zzX4K.length) + 1 : 0; iZzZ < zzX4K.length; iZzZ++) {
            if (getConditionalStyles().zzMM(zzX4K[iZzZ])) {
                return getConditionalStyles().zzMJ(zzX4K[iZzZ]);
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzZD5
    @ReservedForInternalUse
    @Deprecated
    public void clearCellAttrs() {
        this.zzZAg.clear();
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public void clearRowAttrs() {
        this.zzZsN.clear();
        this.zzZsO.clear();
    }

    @Override // com.aspose.words.zzZD5
    @ReservedForInternalUse
    @Deprecated
    public Object fetchCellAttr(int i) {
        Object obj = this.zzZAg.get(i);
        return obj != null ? obj : fetchInheritedCellAttr(i);
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedBorderAttr(int i) {
        TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(zzY3j(), TableStyle.class);
        if (tableStyle == null) {
            return zzY6G.zzOt(i);
        }
        Object directBorderAttr = tableStyle.getDirectBorderAttr(i);
        return directBorderAttr != null ? directBorderAttr : tableStyle.fetchInheritedBorderAttr(i);
    }

    @Override // com.aspose.words.zzZD5
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedCellAttr(int i) {
        TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(zzY3j(), TableStyle.class);
        return tableStyle != null ? tableStyle.fetchCellAttr(i) : zzWP.zzOt(i);
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedRowAttr(int i) {
        TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(zzY3j(), TableStyle.class);
        return tableStyle != null ? tableStyle.fetchRowAttr(i) : zzY6G.zzOt(i);
    }

    @Override // com.aspose.words.zzZ9C
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedShadingAttr(int i) {
        TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(zzY3j(), TableStyle.class);
        if (tableStyle == null) {
            return zzWP.zzOt(i);
        }
        Object obj = tableStyle.zzZAg.get(i);
        return obj != null ? obj : tableStyle.fetchInheritedShadingAttr(i);
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public Object fetchRowAttr(int i) {
        Object directRowAttr = getDirectRowAttr(i);
        return directRowAttr != null ? directRowAttr : fetchInheritedRowAttr(i);
    }

    public int getAlignment() {
        return ((Integer) fetchRowAttr(4010)).intValue();
    }

    public boolean getAllowBreakAcrossPages() {
        return ((Boolean) fetchRowAttr(4360)).booleanValue();
    }

    public boolean getBidi() {
        return ((Boolean) fetchRowAttr(4380)).booleanValue();
    }

    public BorderCollection getBorders() {
        if (this.zzZCb == null) {
            this.zzZCb = new BorderCollection(this);
        }
        return this.zzZCb;
    }

    public double getBottomPadding() {
        return zzV8(4310, 3080);
    }

    public double getCellSpacing() {
        return ((double) ((PreferredWidth) fetchRowAttr(4290)).zzYmE()) / 20.0d;
    }

    public int getColumnStripe() {
        return ((Integer) fetchRowAttr(4510)).intValue();
    }

    public ConditionalStyleCollection getConditionalStyles() {
        if (this.zzX4M == null) {
            this.zzX4M = new ConditionalStyleCollection(this);
        }
        return this.zzX4M;
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectBorderAttr(int i) {
        return this.zzZsO.get(i);
    }

    @Override // com.aspose.words.zzZD5
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectCellAttr(int i) {
        if (zzWP.zzZzU.containsValue(Integer.valueOf(i))) {
            return null;
        }
        return this.zzZAg.get(i);
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRowAttr(int i) {
        Object obj = this.zzZsN.get(i);
        return obj != null ? obj : this.zzZsO.get(i);
    }

    public double getLeftIndent() {
        return ((double) ((Integer) fetchRowAttr(4340)).intValue()) / 20.0d;
    }

    public double getLeftPadding() {
        return zzV8(4020, 3090);
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzZQH<Integer, Integer> getPossibleBorderKeys() {
        return zzY6G.zzZzU;
    }

    public double getRightPadding() {
        return zzV8(4320, 3100);
    }

    public int getRowStripe() {
        return ((Integer) fetchRowAttr(4500)).intValue();
    }

    public Shading getShading() {
        Shading shading = (Shading) this.zzZAg.get(3170);
        if (shading != null) {
            return shading;
        }
        Shading shading2 = new Shading(this, 3170);
        this.zzZAg.zzQ(3170, shading2);
        return shading2;
    }

    public double getTopPadding() {
        return zzV8(4300, 3070);
    }

    public int getVerticalAlignment() {
        return ((Integer) fetchCellAttr(3060)).intValue();
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public void resetToDefaultAttrs() {
        this.zzZsN.clear();
        this.zzZsO.clear();
    }

    public void setAlignment(int i) {
        this.zzZsN.zzQ(4010, Integer.valueOf(i));
        this.zzZsO.zzQ(4010, Integer.valueOf(i));
    }

    public void setAllowBreakAcrossPages(boolean z) {
        this.zzZsN.zzQ(4360, Boolean.valueOf(z));
        this.zzZsO.remove(4360);
    }

    public void setBidi(boolean z) {
        this.zzZsO.zzQ(4380, Boolean.valueOf(z));
        this.zzZsN.remove(4380);
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public void setBorderAttr(int i, Object obj) {
        this.zzZsO.zzQ(i, obj);
    }

    public void setBottomPadding(double d) {
        this.zzZsO.zzQ(4310, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    @Override // com.aspose.words.zzZD5
    @ReservedForInternalUse
    @Deprecated
    public void setCellAttr(int i, Object obj) {
        this.zzZAg.zzQ(i, obj);
    }

    public void setCellSpacing(double d) {
        this.zzZsN.zzQ(4290, PreferredWidth.zzWl(d));
        this.zzZsO.zzQ(4290, PreferredWidth.zzWl(d));
    }

    public void setColumnStripe(int i) {
        this.zzZsO.zzQ(4510, Integer.valueOf(i));
        this.zzZsN.remove(4510);
    }

    public void setLeftIndent(double d) {
        this.zzZsO.zzQ(4340, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
        this.zzZsN.remove(4340);
    }

    public void setLeftPadding(double d) {
        this.zzZsO.zzQ(4020, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setRightPadding(double d) {
        this.zzZsO.zzQ(4320, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    @Override // com.aspose.words.zzZ9J
    @ReservedForInternalUse
    @Deprecated
    public void setRowAttr(int i, Object obj) {
        this.zzZsO.set(i, obj);
    }

    public void setRowStripe(int i) {
        this.zzZsO.zzQ(4500, Integer.valueOf(i));
        this.zzZsN.remove(4500);
    }

    public void setTopPadding(double d) {
        this.zzZsO.zzQ(4300, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setVerticalAlignment(int i) {
        this.zzZAg.zzQ(3060, Integer.valueOf(i));
    }

    public final zzWP zz6G() {
        return this.zzZAg;
    }

    public final WordAttrCollection zzV7(int i, int i2) {
        ConditionalStyle conditionalStyleZzMJ = getConditionalStyles().zzMJ(i);
        if (i2 == 0) {
            return conditionalStyleZzMJ.zzZYh();
        }
        if (i2 == 1) {
            return conditionalStyleZzMJ.zzZYj();
        }
        if (i2 == 2) {
            return conditionalStyleZzMJ.zz6G();
        }
        throw new IllegalStateException("Unknown AttrCollectionType value.");
    }

    public final void zzX(ConditionalStyle conditionalStyle) {
        if (getConditionalStyles().zzMM(conditionalStyle.zzZYk())) {
            return;
        }
        getConditionalStyles().zzY(conditionalStyle);
    }

    public final boolean zzXWR() {
        ConditionalStyleCollection conditionalStyleCollection = this.zzX4M;
        if (conditionalStyleCollection == null) {
            return false;
        }
        Iterator<ConditionalStyle> it = conditionalStyleCollection.zzZY9().iterator();
        while (it.hasNext()) {
            if (it.next().zzZYa()) {
                return true;
            }
        }
        return false;
    }

    public final zzWP zzXWS() {
        zzWP zzwp = new zzWP();
        zzO(zzwp);
        return zzwp;
    }

    public final zzY6G zzXWT() {
        zzY6G zzy6g = new zzY6G();
        zzB(zzy6g);
        return zzy6g;
    }

    public final zzY6G zzXWU() {
        zzY6G zzy6g = new zzY6G();
        zzC(zzy6g);
        return zzy6g;
    }

    public final void zzXWV() {
        ConditionalStyleCollection conditionalStyleCollection = this.zzX4M;
        if (conditionalStyleCollection != null) {
            conditionalStyleCollection.clear();
        }
    }

    public final void zzY(Cell cell, zzWP zzwp) {
        zzO(zzwp);
        ConditionalStyle conditionalStyleZzW = zzW((ConditionalStyle) null);
        while (conditionalStyleZzW != null) {
            if (conditionalStyleZzW.zz6G() != null && zzZ(cell, conditionalStyleZzW)) {
                conditionalStyleZzW.zz6G().zzY((zzZS) zzwp);
            }
            conditionalStyleZzW = zzW(conditionalStyleZzW);
        }
    }

    @Override // com.aspose.words.Style
    public final Style zzY3l() {
        TableStyle tableStyle = (TableStyle) super.zzY3l();
        zzY(this, tableStyle);
        return tableStyle;
    }

    public final void zzZ(Cell cell, zzYMX zzymx) {
        TableStyle tableStyle = (TableStyle) zzY3j();
        if (tableStyle != null) {
            tableStyle.zzZ(cell, zzymx);
        }
        zzZYj().zzY(zzymx);
        ConditionalStyle conditionalStyleZzW = zzW((ConditionalStyle) null);
        while (conditionalStyleZzW != null) {
            if (conditionalStyleZzW.zzZYj() != null && zzZ(cell, conditionalStyleZzW)) {
                conditionalStyleZzW.zzZYj().zzY(zzymx);
            }
            conditionalStyleZzW = zzW(conditionalStyleZzW);
        }
    }

    @Override // com.aspose.words.Style
    public final boolean zzZYa() {
        return super.zzZYa() || this.zzZsO.getCount() > 0 || this.zzZsN.getCount() > 0 || this.zzZAg.getCount() > 0 || zzXWR();
    }

    public final zzY6G zzZYd() {
        return this.zzZsN;
    }

    public final zzY6G zzZYf() {
        return this.zzZsO;
    }

    public final ConditionalStyle zzjP(int i) {
        TableStyle tableStyle = (TableStyle) zzY3j();
        ConditionalStyle conditionalStyleZzjP = tableStyle != null ? tableStyle.zzjP(i) : null;
        if (conditionalStyleZzjP == null) {
            conditionalStyleZzjP = new ConditionalStyle(i);
        }
        if (getConditionalStyles().zzMM(i)) {
            ConditionalStyle conditionalStyleZzMJ = getConditionalStyles().zzMJ(i);
            if (conditionalStyleZzMJ.zzZYg()) {
                conditionalStyleZzMJ.zzZYh().zzY(conditionalStyleZzjP.zzZYh());
                conditionalStyleZzMJ.zzZYh().zzI(conditionalStyleZzjP.zzZYh());
            }
            if (conditionalStyleZzMJ.zzZYb()) {
                conditionalStyleZzMJ.zz6G().zzY((zzZS) conditionalStyleZzjP.zz6G());
            }
            if (conditionalStyleZzMJ.zzZYi()) {
                conditionalStyleZzMJ.zzZYj().zzY(conditionalStyleZzjP.zzZYj());
            }
            if (conditionalStyleZzMJ.zzZYe()) {
                conditionalStyleZzMJ.zzZYf().zzY(conditionalStyleZzjP.zzZYf());
            }
            if (conditionalStyleZzMJ.zzZYc()) {
                conditionalStyleZzMJ.zzZYd().zzY(conditionalStyleZzjP.zzZYd());
            }
        }
        return conditionalStyleZzjP;
    }

    public final Object zzX(int i, Cell cell) {
        return zzZ(i, cell, 1);
    }

    public final void zzY(zzY6G zzy6g) {
        this.zzZsN = zzy6g;
    }

    public final Object zzY(int i, Cell cell) {
        return zzZ(i, cell, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzY(int i, Cell cell, int i2) {
        switch (i) {
            case 1:
            case 3:
            case 5:
            case 7:
                if (i2 == 3140 && !cell.isLastCell()) {
                    return 3200;
                }
                if (i2 != 3120 || cell.isFirstCell()) {
                    return i2;
                }
                return 3200;
            case 2:
            case 4:
            case 6:
            case 8:
                if (i2 == 3130 && !cell.getParentRow().isLastRow()) {
                    return 3210;
                }
                if (i2 == 3110 && !cell.getParentRow().isFirstRow()) {
                    return 3210;
                }
                break;
        }
    }

    public final void zzZ(Cell cell, zzYEF zzyef) {
        TableStyle tableStyle = (TableStyle) zzY3j();
        if (tableStyle != null) {
            tableStyle.zzZ(cell, zzyef);
        }
        zzZYh().zzY(zzyef);
        ConditionalStyle conditionalStyleZzW = zzW((ConditionalStyle) null);
        while (conditionalStyleZzW != null) {
            if (conditionalStyleZzW.zzZYh() != null && zzZ(cell, conditionalStyleZzW)) {
                conditionalStyleZzW.zzZYh().zzY(zzyef);
            }
            conditionalStyleZzW = zzW(conditionalStyleZzW);
        }
    }

    public static void zzY(TableStyle tableStyle, TableStyle tableStyle2) {
        zzY6G zzy6g = tableStyle.zzZsO;
        if (zzy6g != null) {
            tableStyle2.zzZsO = (zzY6G) zzy6g.zzbn();
        }
        zzY6G zzy6g2 = tableStyle.zzZsN;
        if (zzy6g2 != null) {
            tableStyle2.zzZsN = (zzY6G) zzy6g2.zzbn();
        }
        zzWP zzwp = tableStyle.zzZAg;
        if (zzwp != null) {
            tableStyle2.zzZAg = (zzWP) zzwp.zzbn();
        }
        if (tableStyle.zzX4M != null) {
            tableStyle2.zzX4M = new ConditionalStyleCollection(tableStyle2);
            Iterator<ConditionalStyle> it = tableStyle.zzX4M.zzZY9().iterator();
            while (it.hasNext()) {
                tableStyle2.getConditionalStyles().zzY(it.next().zzZYl());
            }
        }
    }

    public final void zzZ(zzY6G zzy6g) {
        this.zzZsO = zzy6g;
    }

    public final void zzZ(zzWP zzwp) {
        this.zzZAg = zzwp;
    }

    public final Object zzZ(int i, Cell cell) {
        return zzZ(i, cell, 2);
    }

    private Object zzZ(int i, Cell cell, int i2) {
        Object obj;
        TableStyle tableStyle = this;
        do {
            if (tableStyle.zzXWR()) {
                obj = null;
                for (ConditionalStyle conditionalStyleZzV = tableStyle.zzV((ConditionalStyle) null); conditionalStyleZzV != null; conditionalStyleZzV = tableStyle.zzV(conditionalStyleZzV)) {
                    WordAttrCollection wordAttrCollectionZzMN = conditionalStyleZzV.zzMN(i2);
                    if (wordAttrCollectionZzMN != null && tableStyle.zzZ(cell, conditionalStyleZzV) && (obj = wordAttrCollectionZzMN.get(zzY(conditionalStyleZzV.zzZYk(), cell, i))) != null) {
                        return obj;
                    }
                }
            } else {
                obj = null;
            }
            WordAttrCollection wordAttrCollectionZzMN2 = tableStyle.zzMN(i2);
            if (wordAttrCollectionZzMN2 != null) {
                obj = wordAttrCollectionZzMN2.get(i);
            }
            if (obj != null) {
                return obj;
            }
            tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(tableStyle.zzY3j(), TableStyle.class);
        } while (tableStyle != null);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzZ(Cell cell, ConditionalStyle conditionalStyle) {
        boolean zZzZP;
        boolean zZzZP2;
        Row parentRow = cell.getParentRow();
        if (parentRow == null || parentRow.zzZYf() == null) {
            return false;
        }
        boolean z = parentRow.isFirstRow() || parentRow.zzYki();
        boolean zIsLastRow = parentRow.isLastRow();
        boolean zIsFirstCell = cell.isFirstCell();
        boolean zIsLastCell = cell.isLastCell();
        boolean zZzYki = parentRow.getParentTable().getFirstRow().zzYki();
        int styleOptions = parentRow.zzZYf().getStyleOptions();
        boolean z2 = (styleOptions & 32) != 0;
        boolean z3 = (styleOptions & 64) != 0;
        boolean z4 = (styleOptions & 128) != 0;
        boolean z5 = (styleOptions & 256) != 0;
        boolean z6 = (styleOptions & 512) != 0;
        boolean z7 = (styleOptions & 1024) != 0;
        int iZzXXt = this.zzZsO.zzXXt() > 0 ? this.zzZsO.zzXXt() : 1;
        int iZzXXs = this.zzZsO.zzXXs() > 0 ? this.zzZsO.zzXXs() : 1;
        int i = ((z2 || zZzYki) && getConditionalStyles().zzMM(1)) ? 1 : 0;
        int i2 = (z4 && getConditionalStyles().zzMM(2)) ? 1 : 0;
        int iZzZYk = conditionalStyle.zzZYk();
        int i3 = i2;
        if (iZzZYk == 5) {
            zZzZP = com.aspose.words.internal.zzAN.zzZP((parentRow.getRowIndex() + (i ^ 1)) / iZzXXt);
            zZzZP2 = false;
        } else if (iZzZYk == 6) {
            zZzZP2 = com.aspose.words.internal.zzAN.zzZP((cell.getColumnIndex() + (i3 ^ 1)) / iZzXXs);
            zZzZP = false;
        } else if (iZzZYk != 7) {
            if (iZzZYk != 8) {
                zZzZP = false;
                zZzZP2 = false;
            }
        }
        switch (iZzZYk) {
            case 1:
                return z2 && z;
            case 2:
                return z4 && zIsFirstCell;
            case 3:
                return z3 && zIsLastRow;
            case 4:
                return z5 && zIsLastCell;
            case 5:
                return z6 && zZzZP && !(zIsLastRow && z3);
            case 6:
                return z7 && zZzZP2;
            case 7:
                return (!z6 || zZzZP || (zIsLastRow && z3)) ? false : true;
            case 8:
                return z7 && !zZzZP2;
            case 9:
                return z2 && z4 && z && zIsFirstCell;
            case 10:
                return z2 && z5 && z && zIsLastCell;
            case 11:
                return z3 && z4 && zIsLastRow && zIsFirstCell;
            case 12:
                return z3 && z5 && zIsLastRow && zIsLastCell;
            default:
                throw new IllegalStateException("Unexpected TableStyleOverrideType value.");
        }
    }
}
