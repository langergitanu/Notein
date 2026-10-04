package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class Style implements zzZ9G, zzZ9Q, Cloneable {
    private String mName;
    private boolean zzHc;
    private int zzL4;
    private ListFormat zzX9U;
    private FrameFormat zzX9V;
    private int zzX9W;
    private boolean zzX9Y;
    private boolean zzX9Z;
    private boolean zzXa0;
    private boolean zzXa1;
    private boolean zzXa2;
    private boolean zzXa3;
    boolean zzXa9;
    boolean zzXaa;
    boolean zzXab;
    private StyleCollection zzYSm;
    private boolean zzYgR;
    private int zzYgS;
    private boolean zzYgT;
    private Font zzZsK;
    private ParagraphFormat zzZsL;
    private boolean zzZxy;
    static int[] zzXa8 = {30, 40, 50, 1000, EditingLanguage.KASHMIRI_ARABIC, 1580, 1610, 1620, 1630, 1640, 4005, 4400};
    private static zzYEF zzX9T = new zzYEF();
    private static zzYMX zzX9S = new zzYMX();
    private int zzXI9 = StyleIdentifier.NIL;
    private int zzXa7 = StyleIdentifier.NIL;
    private int zzXa6 = StyleIdentifier.NIL;
    private int zzXa5 = StyleIdentifier.NIL;
    private int zzXa4 = StyleIdentifier.NIL;
    private int zzX9X = StyleIdentifier.NIL;
    private zzYMX zzZsQ = new zzYMX();
    private zzYEF zzZsP = new zzYEF();

    public Style(int i) {
        this.zzL4 = i;
    }

    private static void zzR(zzYEF zzyef, int i) {
        Object objZzPk = zzyef.zzPk(i);
        if (objZzPk == null || ((Integer) objZzPk).intValue() != 3276) {
            return;
        }
        zzyef.remove(i);
    }

    private void zzU(IWarningCallback iWarningCallback) {
        if (this.zzXI9 == 0 && getStyleIdentifier() != 0) {
            zzX(iWarningCallback, com.aspose.words.internal.zzZKN.format("Style index reserved for built-in style '{0}' is used in style '{1}'.", "Normal", getName()));
        }
        if (this.zzXI9 != 10 || getStyleIdentifier() == 65) {
            return;
        }
        zzX(iWarningCallback, com.aspose.words.internal.zzZKN.format("Style index reserved for built-in style '{0}' is used in style '{1}'.", "DefaultParagraphFont", getName()));
    }

    private void zzV(IWarningCallback iWarningCallback) {
        if (this.zzX9X == 12287 || getStyles().zzZ8(this.zzX9X, false) != null) {
            return;
        }
        zzY1Z.zzZ(iWarningCallback, 0, "Style '{0}' refers to non-existent style, removed invalid reference.", getName());
        zzl3(StyleIdentifier.NIL);
    }

    private Object zzVu(int i, int i2) {
        Object objZzl0 = zzl0(i);
        if (objZzl0 != null) {
            return objZzl0;
        }
        Style styleZzY3j = zzY3j();
        if (styleZzY3j != null) {
            return styleZzY3j.zzVv(i, i2);
        }
        return null;
    }

    private void zzW(IWarningCallback iWarningCallback) {
        if (getType() == 1 && this.zzZsP.zzZ7j() == this.zzXI9) {
            zzY1Z.zzZ(iWarningCallback, 0, "Paragraph style '{0}' has incorrect Istd set.", getName());
            this.zzZsP.remove(50);
        }
    }

    private static void zzX(IWarningCallback iWarningCallback, String str) {
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, 16777216, 17, str);
        }
    }

    private boolean zzY(Style style, boolean z) {
        while (style != null) {
            if (style.zzL4 != this.zzL4) {
                if (z) {
                    throw new IllegalStateException("Cannot base a style on a style of different type.");
                }
                return false;
            }
            if (style.zzXI9 == this.zzXI9) {
                if (z) {
                    throw new IllegalStateException("This operation will create a circular reference between styles.");
                }
                return false;
            }
            style = style.zzY3j();
        }
        return true;
    }

    private void zzY3a() {
        if (isHeading()) {
            int styleIdentifier = getStyleIdentifier() - 1;
            if (this.zzZsQ.get(1280) == null || ((Integer) this.zzZsQ.get(1280)).intValue() != styleIdentifier) {
                this.zzZsQ.setOutlineLevel(styleIdentifier);
            }
        }
    }

    private void zzY3b() {
        if (getStyleIdentifier() == 105) {
            this.zzZsP.clear();
            this.zzZsQ.clear();
        }
    }

    private void zzY3c() {
        zzR(this.zzZsP, 190);
        zzR(this.zzZsP, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4);
    }

    private void zzY3d() {
        this.zzZsQ.remove(EditingLanguage.DIVEHI);
    }

    private boolean zzY3e() {
        TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(this, TableStyle.class);
        if (tableStyle == null || tableStyle.zzZsQ.getCount() > 0 || tableStyle.zzZsP.getCount() > 0) {
            return true;
        }
        for (ConditionalStyle conditionalStyle : tableStyle.getConditionalStyles().zzZY9()) {
            if (conditionalStyle.zzZYj().getCount() > 0 || conditionalStyle.zzZYh().getCount() > 0) {
                return true;
            }
        }
        return false;
    }

    private void zzY3h() {
        int i = this.zzXa5;
        int i2 = this.zzXI9;
        if (i == i2) {
            this.zzXa5 = StyleIdentifier.NIL;
        }
        if (this.zzX9X == i2) {
            this.zzX9X = StyleIdentifier.NIL;
        }
    }

    private Object zzl0(int i) {
        if (i != 1120 && i != 1110 && (this.zzZsQ.contains(EditingLanguage.KASHMIRI_ARABIC) || this.zzZsQ.contains(EditingLanguage.GALICIAN))) {
            int iIntValue = ((Integer) fetchParaAttr(EditingLanguage.KASHMIRI_ARABIC)).intValue();
            if (iIntValue != 0) {
                return getDocument().getLists().zzxu(iIntValue).zzxw(((Integer) fetchParaAttr(EditingLanguage.GALICIAN)).intValue()).zzZYj().zzPk(i);
            }
            if (this.zzZsQ.zzYpL() && zzYMX.zzqC(i)) {
                return 0;
            }
        }
        return null;
    }

    public static Style zzl6(int i) {
        if (i != 1 && i != 2) {
            if (i == 3) {
                return new TableStyle();
            }
            if (i != 4) {
                throw new IllegalStateException("Unknown style type.");
            }
        }
        return new Style(i);
    }

    private boolean zzt(Style style) {
        int type = getType();
        if (type == 1) {
            return this.zzZsP.zzW(style.zzZsP, zzXa8) && this.zzZsQ.zzW(style.zzZsQ, zzXa8);
        }
        if (type == 2) {
            return this.zzZsP.zzW(style.zzZsP, zzXa8);
        }
        if (type != 3) {
            if (type == 4) {
                return true;
            }
            throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected style type '{0}'.", Integer.valueOf(getType())));
        }
        TableStyle tableStyle = (TableStyle) this;
        TableStyle tableStyle2 = (TableStyle) style;
        ConditionalStyleCollection conditionalStyles = tableStyle.getConditionalStyles();
        ConditionalStyleCollection conditionalStyles2 = tableStyle2.getConditionalStyles();
        for (int i : ConditionalStyleType.getValues()) {
            if ((conditionalStyles.zzML(i) || conditionalStyles2.zzML(i)) && !conditionalStyles.getByConditionalStyleType(i).zzZ(conditionalStyles2.getByConditionalStyleType(i))) {
                return false;
            }
        }
        return tableStyle.zzZsP.zzW(tableStyle2.zzZsP, zzXa8) && tableStyle.zzZsQ.zzW(tableStyle2.zzZsQ, zzXa8) && tableStyle.zz6G().zzW(tableStyle2.zz6G(), zzXa8) && tableStyle.zzZYd().zzW(tableStyle2.zzZYd(), zzXa8) && tableStyle.zzZYf().zzW(tableStyle2.zzZYf(), zzXa8);
    }

    private boolean zzu(Style style) {
        return getType() == style.getType() && isHeading() == style.isHeading() && isQuickStyle() == style.isQuickStyle() && getAutomaticallyUpdate() == style.getAutomaticallyUpdate() && getLocked() == style.getLocked() && getUnhideWhenUsed() == style.getUnhideWhenUsed() && this.zzXa1 == style.zzXa1 && this.zzXa0 == style.zzXa0 && this.zzX9Z == style.zzX9Z && this.zzX9Y == style.zzX9Y && zzY3n() == style.zzY3n() && hasRevisions() == style.hasRevisions();
    }

    private boolean zzv(Style style) {
        if (getBuiltIn() && style.getBuiltIn()) {
            return !(zzY8O.zzkG(this.zzXI9) || zzY8O.zzkG(style.zzXI9)) || this.zzXI9 == style.zzXI9;
        }
        return true;
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public void clearParaAttrs() {
        this.zzZsQ.clear();
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void clearRunAttrs() {
        this.zzZsP.clear();
    }

    public boolean equals(Style style) {
        return zzZ(style, new com.aspose.words.internal.zzIM<>());
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedParaAttr(int i) {
        Object objZzVu = zzVu(i, 0);
        return objZzVu != null ? objZzVu : getStyles().zzY36().zzPj(i);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedRunAttr(int i) {
        return zzZ9(i, true);
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public Object fetchParaAttr(int i) {
        Object obj = this.zzZsQ.get(i);
        return obj != null ? obj : fetchInheritedParaAttr(i);
    }

    public String[] getAliases() {
        return zzY3w();
    }

    public boolean getAutomaticallyUpdate() {
        return this.zzXa3;
    }

    public String getBaseStyleName() {
        Style styleZzY3j = zzY3j();
        return styleZzY3j != null ? styleZzY3j.getName() : "";
    }

    public boolean getBuiltIn() {
        return this.zzXa7 != 4094;
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectParaAttr(int i) {
        return this.zzZsQ.zzPk(i);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i) {
        return this.zzZsP.zzPk(i);
    }

    public DocumentBase getDocument() {
        StyleCollection styleCollection = this.zzYSm;
        if (styleCollection != null) {
            return styleCollection.getDocument();
        }
        return null;
    }

    public Font getFont() {
        if (this.zzL4 == 4) {
            return null;
        }
        if (this.zzZsK == null) {
            this.zzZsK = new Font(this, this.zzYSm.getDocument());
        }
        return this.zzZsK;
    }

    public final boolean getHidden() {
        return this.zzZxy;
    }

    public final Style getLinkedStyle() {
        zzY3h();
        int i = this.zzX9X;
        if (i != 12287) {
            return this.zzYSm.zzVp(i, StyleIdentifier.NIL);
        }
        return null;
    }

    public String getLinkedStyleName() {
        Style styleZzZ8;
        return (this.zzX9X == 12287 || (styleZzZ8 = getDocument().getStyles().zzZ8(this.zzX9X, false)) == null) ? "" : styleZzZ8.getName();
    }

    public List getList() {
        if (this.zzL4 == 4 && getDocument() != null) {
            return getDocument().getLists().zzxv(this.zzZsQ.getListId());
        }
        return null;
    }

    public ListFormat getListFormat() {
        if (this.zzL4 != 1 || getDocument() == null) {
            return null;
        }
        if (this.zzX9U == null) {
            this.zzX9U = new ListFormat(this, this, getDocument().getLists());
        }
        return this.zzX9U;
    }

    public boolean getLocked() {
        return this.zzHc;
    }

    public String getName() {
        return this.mName;
    }

    public String getNextParagraphStyleName() {
        Style styleZzY3i = zzY3i();
        return styleZzY3i != null ? styleZzY3i.getName() : "";
    }

    public ParagraphFormat getParagraphFormat() {
        int i = this.zzL4;
        if (i == 2 || i == 4) {
            return null;
        }
        if (this.zzZsL == null) {
            this.zzZsL = new ParagraphFormat(this, getStyles());
        }
        return this.zzZsL;
    }

    public int getPriority() {
        return this.zzYgS;
    }

    public boolean getSemiHidden() {
        return this.zzYgT;
    }

    public int getStyleIdentifier() {
        return this.zzXa7;
    }

    public StyleCollection getStyles() {
        return this.zzYSm;
    }

    public int getType() {
        return this.zzL4;
    }

    public boolean getUnhideWhenUsed() {
        return this.zzYgR;
    }

    public final boolean hasRevisions() {
        return this.zzZsP.zz6D() || this.zzZsQ.zz6D();
    }

    public boolean isHeading() {
        return getStyleIdentifier() > 0 && getStyleIdentifier() <= 9;
    }

    public boolean isQuickStyle() {
        return this.zzXa2;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void remove() {
        getStyles().remove(getName());
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public void removeParaAttr(int i) {
        this.zzZsQ.remove(i);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void removeRunAttr(int i) {
        this.zzZsP.remove(i);
    }

    public void setAutomaticallyUpdate(boolean z) {
        this.zzXa3 = z;
    }

    public void setBaseStyleName(String str) {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        int i = this.zzL4;
        if (i != 2 && i != 1 && i != 3) {
            throw new IllegalStateException("This property is only allowed for character, paragraph and table styles.");
        }
        int i2 = this.zzXa7;
        if (i2 == 0 || i2 == 65) {
            throw new IllegalStateException("The built-in styles Normal and Default Paragraph Font cannot be based on any style.");
        }
        if ("".equals(str)) {
            this.zzXa5 = StyleIdentifier.NIL;
            return;
        }
        Style styleZzAY = this.zzYSm.zzAY(str);
        zzY(styleZzAY, true);
        this.zzXa5 = styleZzAY.zzXI9;
    }

    public final void setHidden(boolean z) {
        this.zzZxy = z;
    }

    public void setLocked(boolean z) {
        this.zzHc = z;
    }

    public void setName(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            throw new IllegalArgumentException("Style name can not be empty.");
        }
        if (com.aspose.words.internal.zzZKN.equals(str, this.mName)) {
            return;
        }
        getStyles();
        Style styleZz0 = this.zzYSm.zz0(str, false);
        int iZzAE = zzY8O.zzAE(str);
        if (iZzAE != 4094) {
            zzY8O.zzZ(this, iZzAE, styleZz0, true);
        } else if (getBuiltIn()) {
            zzY8O.zzW(this, styleZz0);
        } else if (styleZz0 != null) {
            if (getType() != 2 && this.zzZsQ.getListId() > 0) {
                for (ListLevel listLevel : getDocument().getLists().zzxv(this.zzZsQ.getListId()).getListLevels()) {
                    if (listLevel.zzYOc() == this.zzXI9) {
                        listLevel.zzx2(styleZz0.zzXI9);
                    }
                }
            }
            zzZc(styleZz0.zzXI9, true);
        }
        zz1(str, true);
    }

    public void setNextParagraphStyleName(String str) {
        if (this.zzL4 != 1) {
            throw new IllegalStateException("This property is allowed only for paragraph styles.");
        }
        com.aspose.words.internal.zzZ4.zzU(str, "value");
        this.zzXa4 = this.zzYSm.zzAY(str).zzXI9;
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public void setParaAttr(int i, Object obj) {
        this.zzZsQ.zzQ(i, obj);
    }

    public void setPriority(int i) {
        this.zzYgS = i;
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void setRunAttr(int i, Object obj) {
        this.zzZsP.zzQ(i, obj);
    }

    public void setSemiHidden(boolean z) {
        this.zzYgT = z;
    }

    public final void setStyleIdentifier(int i) {
        zzZb(StyleIdentifier.USER, false);
    }

    public void setUnhideWhenUsed(boolean z) {
        this.zzYgR = z;
    }

    public final void zz1(String str, boolean z) {
        if (z) {
            this.zzYSm.zzZ(this, this.mName, str);
        }
        this.mName = str;
    }

    public final void zzB0(String str) {
        zz1(str, false);
    }

    public final void zzBl(int i) {
        zzZc(i, false);
    }

    public final void zzQf(boolean z) {
        this.zzX9Y = z;
    }

    public final void zzQg(boolean z) {
        this.zzX9Z = z;
    }

    public final void zzQh(boolean z) {
        this.zzXa0 = z;
    }

    public final void zzQi(boolean z) {
        this.zzXa1 = z;
    }

    public final void zzS(StyleCollection styleCollection) {
        this.zzYSm = styleCollection;
    }

    public final void zzT(zzYEF zzyef, int i) {
        Style styleZzY3j = zzY3j();
        if (styleZzY3j == null || !zzY3e()) {
            zzS(zzyef, i);
        } else {
            styleZzY3j.zzT(zzyef, i & (-129));
        }
        if (getStyleIdentifier() == 65) {
            this.zzZsP.zzX(zzyef, 50);
            return;
        }
        zzYEF zzyefZzn9 = this.zzZsP.zzn9(i);
        if (zzyefZzn9.contains(400)) {
            zzyefZzn9 = (zzYEF) zzyefZzn9.zzbn();
            zzyefZzn9.remove(400);
        }
        zzyefZzn9.zzI(zzyef);
        if (this.zzXa7 == 0 && (i & 2) != 0) {
            zzyefZzn9 = (zzYEF) zzyefZzn9.zzbn();
            if (zzyefZzn9.getSize() == 24 && zzyef.getSize() != 20) {
                zzyefZzn9.remove(190);
            }
            if (zzyefZzn9.zzYL6() == 24 && zzyef.zzYL6() != 20) {
                zzyefZzn9.remove(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4);
            }
        }
        if ((i & 128) == 0) {
            zzyefZzn9.zzY(zzyef);
        }
    }

    public final Object zzVv(int i, int i2) {
        Object objZzVQ = this.zzZsQ.zzVQ(i, i2);
        return objZzVQ != null ? objZzVQ : zzVu(i, i2);
    }

    public final List zzY39() {
        int iIntValue;
        if (this.zzZsQ.get(EditingLanguage.KASHMIRI_ARABIC) == null || (iIntValue = ((Integer) this.zzZsQ.get(EditingLanguage.KASHMIRI_ARABIC)).intValue()) == 0 || getDocument() == null) {
            return null;
        }
        return getDocument().getLists().getListByListId(iIntValue);
    }

    public final void zzY3f() {
        if (zzY(zzY3j(), false)) {
            return;
        }
        this.zzXa5 = StyleIdentifier.NIL;
    }

    public final void zzY3g() {
        int i = this.zzXa5;
        boolean z = i < 14;
        if (i == 12287 || this.zzYSm.zzZ8(i, z) != null) {
            return;
        }
        this.zzXa5 = StyleIdentifier.NIL;
    }

    public final Style zzY3i() {
        int i = this.zzXa4;
        if (i != 12287) {
            return this.zzYSm.zzVp(i, this.zzXI9);
        }
        return null;
    }

    public final Style zzY3j() {
        int i;
        zzY3h();
        if (this.zzXI9 == 10 || (i = this.zzXa5) == 12287) {
            return null;
        }
        return this.zzYSm.zzVp(i, StyleIdentifier.NIL);
    }

    public final void zzY3k() {
        this.zzZsK = null;
        this.zzZsL = null;
        this.zzX9V = null;
        this.zzX9U = null;
    }

    public Style zzY3l() {
        Style style = (Style) memberwiseClone();
        style.zzZsQ = (zzYMX) this.zzZsQ.zzbn();
        style.zzZsP = (zzYEF) this.zzZsP.zzbn();
        style.zzYSm = null;
        style.zzY3k();
        style.zzXa6 = this.zzXa7;
        return style;
    }

    public final boolean zzY3m() {
        return this.zzZsP.zzY3m() || this.zzZsQ.zzY3m();
    }

    public final boolean zzY3n() {
        return getType() == 1 && zzY3v() == 12287;
    }

    public final boolean zzY3o() {
        return this.zzX9Y;
    }

    public final boolean zzY3p() {
        return this.zzX9Z;
    }

    public final boolean zzY3q() {
        return this.zzXa0;
    }

    public final boolean zzY3r() {
        return this.zzXa1;
    }

    public final int zzY3s() {
        return this.zzX9W;
    }

    public final int zzY3t() {
        return this.zzX9X;
    }

    public final int zzY3u() {
        return this.zzXa4;
    }

    public final int zzY3v() {
        return this.zzXI9 == 10 ? StyleIdentifier.NIL : this.zzXa5;
    }

    public final String[] zzY3w() {
        return com.aspose.words.internal.zzZKN.zzY(getStyles().zzW(this, false), new char[]{','}, com.aspose.words.internal.zzZOE.REMOVE_EMPTY_ENTRIES$77a9e2fd);
    }

    public final String zzY3x() {
        String strZzW = getStyles().zzW(this, false);
        return !com.aspose.words.internal.zzZYD.zzXk(strZzW) ? getName() : com.aspose.words.internal.zzZKN.format("{0},{1}", getName(), strZzW);
    }

    public final void zzZ(zzYMX zzymx) {
        this.zzZsQ = zzymx;
    }

    public final int zzZ7j() {
        return this.zzXI9;
    }

    public final Object zzZ9(int i, boolean z) {
        Style styleZzY3j = zzY3j();
        if (styleZzY3j != null) {
            return styleZzY3j.zzZa(i, z);
        }
        if (z) {
            return this.zzYSm.zzY37().zzPj(i);
        }
        return null;
    }

    public boolean zzZYa() {
        return this.zzZsQ.getCount() > 0 || this.zzZsP.getCount() > 0;
    }

    public final zzYEF zzZYh() {
        return this.zzZsP;
    }

    public final zzYMX zzZYj() {
        return this.zzZsQ;
    }

    public final Object zzZa(int i, boolean z) {
        Object objZzPk;
        return (this.zzXa7 == 65 || (objZzPk = this.zzZsP.zzPk(i)) == null) ? zzZ9(i, z) : objZzPk instanceof zzZU ? ((zzZU) objZzPk).zzZ(this, i) : objZzPk;
    }

    public final void zzZb(int i, boolean z) {
        if (z) {
            this.zzYSm.zzY(this, getStyleIdentifier(), i);
        }
        this.zzXa7 = i;
    }

    public final void zzZc(int i, boolean z) {
        if (z) {
            this.zzYSm.zzX(this, this.zzXI9, i);
        }
        this.zzXI9 = i;
        zzY3h();
        int i2 = this.zzL4;
        if (i2 != 1) {
            if (i2 == 2) {
                this.zzZsP.zzBl(i);
                return;
            } else if (i2 != 4) {
                return;
            }
        }
        this.zzZsQ.zzBl(i);
    }

    public final zzYEF zzl1(int i) {
        zzYEF zzyef = new zzYEF();
        zzT(zzyef, i);
        return zzyef;
    }

    public final void zzl2(int i) {
        this.zzX9W = i;
    }

    public final void zzl3(int i) {
        this.zzX9X = i;
        zzY3h();
    }

    public final void zzl4(int i) {
        this.zzXa4 = i;
    }

    public final void zzl5(int i) {
        this.zzXa5 = i;
        zzY3h();
    }

    public final zzYMX zzqw(int i) {
        zzYMX zzymx = new zzYMX();
        zzY(zzymx, i);
        return zzymx;
    }

    public final void zzw(Style style) {
        isQuickStyle(style.isQuickStyle());
        setAutomaticallyUpdate(style.getAutomaticallyUpdate());
        setLocked(style.getLocked());
        setUnhideWhenUsed(style.getUnhideWhenUsed());
        this.zzXa1 = style.zzXa1;
        this.zzXa0 = style.zzXa0;
        this.zzX9Z = style.zzX9Z;
        this.zzX9Y = style.zzX9Y;
    }

    private void zzS(zzYEF zzyef, int i) {
        ((i & 1) != 0 ? getStyles().zzY37() : zzX9T).zzZ(zzyef, (i & 32) != 0);
    }

    @Override // com.aspose.words.zzZ9Q
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectParaAttr(int i, int i2) {
        return this.zzZsQ.zzVQ(i, i2);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i, int i2) {
        return this.zzZsP.zzVQ(i, i2);
    }

    public void isQuickStyle(boolean z) {
        this.zzXa2 = z;
    }

    public final void zzZ(zzYEF zzyef) {
        this.zzZsP = zzyef;
    }

    public final boolean zzZ(Style style, com.aspose.words.internal.zzIM<com.aspose.words.internal.zz6R> zzim) {
        if (style == null) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, style) || zzim.contains(new com.aspose.words.internal.zz6R(this, style))) {
            return true;
        }
        return zzY(style, zzim) && zzZ(zzY3j(), style.zzY3j(), zzim) && zzZ(getLinkedStyle(), style.getLinkedStyle(), zzim) && zzZ(zzY3i(), style.zzY3i(), zzim);
    }

    public static Style zzX(int i, int i2, int i3, String str) {
        Style styleZzl6 = zzl6(i);
        styleZzl6.zzXI9 = i2;
        styleZzl6.zzXa7 = i3;
        styleZzl6.mName = str;
        styleZzl6.zzXa4 = i2;
        return styleZzl6;
    }

    public final void zzY(zzYMX zzymx, int i) {
        Style styleZzY3j = zzY3j();
        if (styleZzY3j != null && zzY3e()) {
            styleZzY3j.zzY(zzymx, i & (-129));
        } else {
            zzX(zzymx, i);
        }
        zzYMX zzymxZzqD = this.zzZsQ.zzqD(i);
        if ((i & 128) == 0) {
            Object objZzPk = zzymxZzqD.zzPk(EditingLanguage.KASHMIRI_ARABIC);
            Object objZzPk2 = zzymxZzqD.zzPk(EditingLanguage.GALICIAN);
            zzymx.zzP(EditingLanguage.KASHMIRI_ARABIC, objZzPk);
            zzymx.zzP(EditingLanguage.GALICIAN, objZzPk2);
            if (objZzPk != null || objZzPk2 != null) {
                getDocument().getLists().zzZ(zzymx, zzymx);
            }
            zzymxZzqD.zzY(zzymx);
        }
        zzymxZzqD.zzN(zzymx);
        if ((i & 2) != 0) {
            zzymx.zzYpj();
        }
    }

    public static boolean zzZ(Style style, Style style2, com.aspose.words.internal.zzIM<com.aspose.words.internal.zz6R> zzim) {
        if (com.aspose.words.internal.zzZ4.zzZ(style, style2)) {
            return false;
        }
        if (com.aspose.words.internal.zzZ4.zzX(style, style2)) {
            return true;
        }
        return style.zzZ(style2, zzim);
    }

    public final void zzX(zzYMX zzymx, zzYEF zzyef) {
        if (zzymx != null) {
            for (int i = 0; i < zzymx.getCount(); i++) {
                int iZzT3 = zzymx.zzT3(i);
                Object objZzVY = zzymx.zzVY(i);
                if (objZzVY.equals(fetchInheritedParaAttr(iZzT3))) {
                    this.zzZsQ.remove(iZzT3);
                } else {
                    this.zzZsQ.zzQ(iZzT3, objZzVY);
                }
            }
        }
        if (zzyef != null) {
            for (int i2 = 0; i2 < zzyef.getCount(); i2++) {
                int iZzT32 = zzyef.zzT3(i2);
                Object objZzVY2 = zzyef.zzVY(i2);
                if (objZzVY2.equals(zzZ9(iZzT32, true))) {
                    this.zzZsP.remove(iZzT32);
                } else {
                    this.zzZsP.zzQ(iZzT32, objZzVY2);
                }
            }
        }
    }

    public final void zzY(IWarningCallback iWarningCallback) {
        zzW(iWarningCallback);
        zzV(iWarningCallback);
        zzY3d();
        zzY3c();
        zzU(iWarningCallback);
        zzY3b();
        zzY3a();
        zzX(iWarningCallback);
    }

    private void zzX(zzYMX zzymx, int i) {
        ((i & 1) != 0 ? getStyles().zzY36() : zzX9S).zzZ(zzymx, (i & 64) != 0);
    }

    private void zzX(IWarningCallback iWarningCallback) {
        int outlineLevel = this.zzZsQ.getOutlineLevel();
        if (outlineLevel < 0 || 9 < outlineLevel) {
            this.zzZsQ.remove(1280);
            zzY1Z.zzZ(iWarningCallback, 0, "Style '{0}' has incorrect OutlineLevel, removed.", getName());
        }
    }

    private boolean zzY(Style style, com.aspose.words.internal.zzIM<com.aspose.words.internal.zz6R> zzim) {
        if (style == null) {
            return false;
        }
        zzim.add(new com.aspose.words.internal.zz6R(this, style));
        if (zzY8O.zzd(style) && getStyleIdentifier() == style.getStyleIdentifier()) {
            return true;
        }
        if (!zzv(style) || !zzu(style) || !zzt(style)) {
            return false;
        }
        List listZzY39 = zzY39();
        List listZzY392 = style.zzY39();
        if (com.aspose.words.internal.zzZ4.zzZ(listZzY39, listZzY392)) {
            return false;
        }
        return com.aspose.words.internal.zzZ4.zzX(listZzY39, listZzY392) || listZzY39.zzZ(listZzY392, zzim);
    }
}
