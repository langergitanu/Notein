package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ConditionalStyle implements zzZ9C, zzZ9G, zzZ9Q, zzZD6, Cloneable {
    private zzWP zzZAg;
    private BorderCollection zzZsJ;
    private Font zzZsK;
    private ParagraphFormat zzZsL;
    private TableStyle zzZsM;
    private zzY6G zzZsN;
    private zzY6G zzZsO;
    private zzYEF zzZsP;
    private zzYMX zzZsQ;
    private int zzZsR;

    public ConditionalStyle(int i) {
        this(i, null);
    }

    private Object fetchInheritedCellAttr(int i) {
        Object objZzYg = zzYg(2, i);
        return objZzYg != null ? objZzYg : this.zzZsM.fetchCellAttr(i);
    }

    private Object zzMO(int i) {
        Object obj;
        zzWP zzwp = this.zzZAg;
        return (zzwp == null || (obj = zzwp.get(i)) == null) ? fetchInheritedCellAttr(i) : obj;
    }

    private Object zzYg(int i, int i2) {
        WordAttrCollection wordAttrCollectionZzMN;
        Object obj;
        TableStyle tableStyle = this.zzZsM;
        while (true) {
            tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(tableStyle.zzY3j(), TableStyle.class);
            if (tableStyle == null) {
                return null;
            }
            if (tableStyle.getConditionalStyles().zzMM(this.zzZsR) && (wordAttrCollectionZzMN = tableStyle.getConditionalStyles().zzMJ(this.zzZsR).zzMN(i)) != null && (obj = wordAttrCollectionZzMN.get(i2)) != null) {
                return obj;
            }
        }
    }

    public final void clearFormatting() {
        zzYMX zzymx = this.zzZsQ;
        if (zzymx != null) {
            zzymx.clear();
        }
        zzYEF zzyef = this.zzZsP;
        if (zzyef != null) {
            zzyef.clear();
        }
        zzY6G zzy6g = this.zzZsO;
        if (zzy6g != null) {
            zzy6g.clear();
        }
        zzY6G zzy6g2 = this.zzZsN;
        if (zzy6g2 != null) {
            zzy6g2.clear();
        }
        zzWP zzwp = this.zzZAg;
        if (zzwp != null) {
            zzwp.clear();
        }
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public final void clearParaAttrs() {
        zzYMX zzymx = this.zzZsQ;
        if (zzymx != null) {
            zzymx.clear();
        }
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public final void clearRunAttrs() {
        zzYEF zzyef = this.zzZsP;
        if (zzyef != null) {
            zzyef.clear();
        }
    }

    public final boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (ConditionalStyle.class != obj.getClass()) {
            return false;
        }
        return zzZ((ConditionalStyle) obj);
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public final Object fetchInheritedBorderAttr(int i) {
        Object objZzYg = zzYg(2, i);
        return objZzYg != null ? objZzYg : zzWP.zzOt(i);
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public final Object fetchInheritedParaAttr(int i) {
        Object objZzYg = zzYg(1, i);
        if (objZzYg != null) {
            return objZzYg;
        }
        Object objZzVv = this.zzZsM.zzVv(i, 0);
        return objZzVv != null ? objZzVv : this.zzZsM.getStyles().zzY36().zzPj(i);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public final Object fetchInheritedRunAttr(int i) {
        Object objZzYg = zzYg(0, i);
        return objZzYg != null ? objZzYg : this.zzZsM.zzZa(i, true);
    }

    @Override // com.aspose.words.zzZ9C
    @ReservedForInternalUse
    @Deprecated
    public final Object fetchInheritedShadingAttr(int i) {
        return fetchInheritedCellAttr(i);
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public final Object fetchParaAttr(int i) {
        zzYMX zzymx = this.zzZsQ;
        Object obj = zzymx != null ? zzymx.get(i) : null;
        return obj != null ? obj : fetchInheritedParaAttr(i);
    }

    public final BorderCollection getBorders() {
        if (this.zzZsJ == null) {
            this.zzZsJ = new BorderCollection(this);
        }
        return this.zzZsJ;
    }

    public final double getBottomPadding() {
        return ((double) ((Integer) zzMO(3080)).intValue()) / 20.0d;
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public final Object getDirectBorderAttr(int i) {
        zzWP zzwp = this.zzZAg;
        if (zzwp != null) {
            return zzwp.get(i);
        }
        return null;
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public final Object getDirectParaAttr(int i) {
        zzYMX zzymx = this.zzZsQ;
        if (zzymx != null) {
            return zzymx.zzPk(i);
        }
        return null;
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public final Object getDirectRunAttr(int i) {
        return getDirectRunAttr(i, 0);
    }

    public final Font getFont() {
        if (this.zzZsK == null) {
            this.zzZsK = new Font(this, this.zzZsM.getDocument());
        }
        return this.zzZsK;
    }

    public final double getLeftPadding() {
        return ((double) ((Integer) zzMO(3090)).intValue()) / 20.0d;
    }

    public final ParagraphFormat getParagraphFormat() {
        if (this.zzZsL == null) {
            this.zzZsL = new ParagraphFormat(this, this.zzZsM.getStyles());
        }
        return this.zzZsL;
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public final com.aspose.words.internal.zzZQH<Integer, Integer> getPossibleBorderKeys() {
        return zzWP.zzZzU;
    }

    public final double getRightPadding() {
        return ((double) ((Integer) zzMO(3100)).intValue()) / 20.0d;
    }

    public final Shading getShading() {
        Shading shading = (Shading) zz6G().get(3170);
        if (shading != null) {
            return shading;
        }
        Shading shading2 = new Shading(this, 3170);
        zz6G().zzQ(3170, shading2);
        return shading2;
    }

    public final double getTopPadding() {
        return ((double) ((Integer) zzMO(3070)).intValue()) / 20.0d;
    }

    public final int getType() {
        switch (this.zzZsR) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            default:
                return 0;
        }
    }

    public final int hashCode() {
        return (((((((((this.zzZsR * 397) ^ (zzZYg() ? this.zzZsP.hashCode(Style.zzXa8) : 0)) * 397) ^ (zzZYi() ? this.zzZsQ.hashCode(Style.zzXa8) : 0)) * 397) ^ (zzZYb() ? this.zzZAg.hashCode(Style.zzXa8) : 0)) * 397) ^ (zzZYc() ? this.zzZsN.hashCode(Style.zzXa8) : 0)) * 397) ^ (zzZYe() ? this.zzZsO.hashCode(Style.zzXa8) : 0);
    }

    public final Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public final void removeParaAttr(int i) {
        zzYMX zzymx = this.zzZsQ;
        if (zzymx != null) {
            zzymx.remove(i);
        }
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public final void removeRunAttr(int i) {
        zzYEF zzyef = this.zzZsP;
        if (zzyef != null) {
            zzyef.remove(i);
        }
    }

    @Override // com.aspose.words.zzZD6
    @ReservedForInternalUse
    @Deprecated
    public final void setBorderAttr(int i, Object obj) {
        zz6G().zzQ(i, obj);
    }

    public final void setBottomPadding(double d) {
        zz6G().zzQ(3080, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public final void setLeftPadding(double d) {
        zz6G().zzQ(3090, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public final void setParaAttr(int i, Object obj) {
        zzZYj().zzQ(i, obj);
    }

    public final void setRightPadding(double d) {
        zz6G().zzQ(3100, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public final void setRunAttr(int i, Object obj) {
        zzZYh().zzQ(i, obj);
    }

    public final void setTopPadding(double d) {
        zz6G().zzQ(3070, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public final zzWP zz6G() {
        if (this.zzZAg == null) {
            this.zzZAg = new zzWP();
        }
        return this.zzZAg;
    }

    public final WordAttrCollection zzMN(int i) {
        if (i == 0) {
            return this.zzZsP;
        }
        if (i == 1) {
            return this.zzZsQ;
        }
        if (i == 2) {
            return this.zzZAg;
        }
        throw new IllegalStateException("Unexpected AttrCollectionType value.");
    }

    public final void zzY(zzY6G zzy6g) {
        this.zzZsN = zzy6g;
    }

    public final void zzZ(TableStyle tableStyle) {
        this.zzZsM = tableStyle;
    }

    public final boolean zzZYa() {
        return zzZYe() || zzZYc() || zzZYb() || zzZYi() || zzZYg();
    }

    public final boolean zzZYb() {
        zzWP zzwp = this.zzZAg;
        return zzwp != null && zzwp.getCount() > 0;
    }

    public final boolean zzZYc() {
        zzY6G zzy6g = this.zzZsN;
        return zzy6g != null && zzy6g.getCount() > 0;
    }

    public final zzY6G zzZYd() {
        if (this.zzZsN == null) {
            this.zzZsN = new zzY6G();
        }
        return this.zzZsN;
    }

    public final boolean zzZYe() {
        zzY6G zzy6g = this.zzZsO;
        return zzy6g != null && zzy6g.getCount() > 0;
    }

    public final zzY6G zzZYf() {
        if (this.zzZsO == null) {
            this.zzZsO = new zzY6G();
        }
        return this.zzZsO;
    }

    public final boolean zzZYg() {
        zzYEF zzyef = this.zzZsP;
        return zzyef != null && zzyef.getCount() > 0;
    }

    public final zzYEF zzZYh() {
        if (this.zzZsP == null) {
            this.zzZsP = new zzYEF();
        }
        return this.zzZsP;
    }

    public final boolean zzZYi() {
        zzYMX zzymx = this.zzZsQ;
        return zzymx != null && zzymx.getCount() > 0;
    }

    public final zzYMX zzZYj() {
        if (this.zzZsQ == null) {
            this.zzZsQ = new zzYMX();
        }
        return this.zzZsQ;
    }

    public final int zzZYk() {
        return this.zzZsR;
    }

    public final ConditionalStyle zzZYl() {
        ConditionalStyle conditionalStyle = (ConditionalStyle) memberwiseClone();
        zzYMX zzymx = this.zzZsQ;
        if (zzymx != null) {
            conditionalStyle.zzZsQ = (zzYMX) zzymx.zzbn();
        }
        zzYEF zzyef = this.zzZsP;
        if (zzyef != null) {
            conditionalStyle.zzZsP = (zzYEF) zzyef.zzbn();
        }
        zzY6G zzy6g = this.zzZsO;
        if (zzy6g != null) {
            conditionalStyle.zzZsO = (zzY6G) zzy6g.zzbn();
        }
        zzY6G zzy6g2 = this.zzZsN;
        if (zzy6g2 != null) {
            conditionalStyle.zzZsN = (zzY6G) zzy6g2.zzbn();
        }
        zzWP zzwp = this.zzZAg;
        if (zzwp != null) {
            conditionalStyle.zzZAg = (zzWP) zzwp.zzbn();
        }
        return conditionalStyle;
    }

    public ConditionalStyle(int i, TableStyle tableStyle) {
        this.zzZsR = i;
        this.zzZsM = tableStyle;
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public final Object getDirectParaAttr(int i, int i2) {
        zzYMX zzymx = this.zzZsQ;
        if (zzymx != null) {
            return zzymx.zzVQ(i, i2);
        }
        return null;
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public final Object getDirectRunAttr(int i, int i2) {
        zzYEF zzyef = this.zzZsP;
        if (zzyef != null) {
            return zzyef.zzVQ(i, i2);
        }
        return null;
    }

    public final void zzZ(zzYMX zzymx) {
        this.zzZsQ = zzymx;
    }

    public final void zzZ(zzYEF zzyef) {
        this.zzZsP = zzyef;
    }

    public final void zzZ(zzY6G zzy6g) {
        this.zzZsO = zzy6g;
    }

    public final void zzZ(zzWP zzwp) {
        this.zzZAg = zzwp;
    }

    public final boolean zzZ(ConditionalStyle conditionalStyle) {
        return conditionalStyle != null && this.zzZsR == conditionalStyle.zzZsR && zzZYh().zzW(conditionalStyle.zzZYh(), Style.zzXa8) && zzZYj().zzW(conditionalStyle.zzZYj(), Style.zzXa8) && zz6G().zzW(conditionalStyle.zz6G(), Style.zzXa8) && zzZYd().zzW(conditionalStyle.zzZYd(), Style.zzXa8) && zzZYf().zzW(conditionalStyle.zzZYf(), Style.zzXa8);
    }
}
