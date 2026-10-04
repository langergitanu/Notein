package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ListLabel implements zzZ9G {
    private zzZ47 zzYcj;
    private zzZ47 zzYck;
    private String[] zzYcl;
    private String[] zzYcm;
    private String[] zzYcn;
    private String[] zzYco;
    private ListFormat zzYoh;
    private Paragraph zzYor;
    private Font zzZEt;

    public ListLabel(Paragraph paragraph) {
        this.zzYor = paragraph;
        this.zzYoh = paragraph.getListFormat();
    }

    private Object zzI(Object obj, int i) {
        return obj instanceof zzZU ? ((zzZU) obj).zzZ(this.zzYor.zzqy(0).getFont(), i) : obj;
    }

    private static void zzYOr() {
        throw new IllegalStateException("Cannot change direct attributes on a list label. Paragraph doesn't belong to a list.");
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void clearRunAttrs() {
        ListLevel listLevel = this.zzYoh.getListLevel();
        if (listLevel != null) {
            listLevel.zzZYh().clear();
        } else {
            zzYOr();
        }
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedRunAttr(int i) {
        ListLevel listLevel;
        Object obj;
        if (i != 140 && i != 80 && i != 300 && (((i != 60 && i != 70) || (listLevel = this.zzYoh.getListLevel()) == null || listLevel.getNumberStyle() != 23) && (obj = this.zzYor.zzYp5().get(i)) != null)) {
            return zzI(obj, i);
        }
        if (this.zzYor.zzqy(0).getFont() != null && i != 140) {
            return this.zzYor.zzqy(0).getFont().zzPj(i);
        }
        Style style = this.zzYor.getDocument().getStyles().get(this.zzYor.zzqy(0).getBaseStyleName());
        return (style == null || style.getFont() == null) ? this.zzYor.getDocument().getStyles().getByStyleIdentifier(0).getFont().zzPj(i) : style.getFont().zzPj(i);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i) {
        return getDirectRunAttr(i, 0);
    }

    public Font getFont() {
        if (this.zzZEt == null) {
            this.zzZEt = new Font(this, this.zzYor.getDocument());
        }
        return this.zzZEt;
    }

    public String getLabelString() {
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(this.zzYor.getDocument(), Document.class);
        return (document == null || document.getRevisionsView() != 1) ? com.aspose.words.internal.zzZ1.zzY(this.zzYco) : com.aspose.words.internal.zzZ1.zzY(this.zzYcn);
    }

    public int getLabelValue() {
        zzZ47 zzz47 = this.zzYck;
        if (zzz47 == null) {
            return 0;
        }
        return zzz47.zzYO1();
    }

    public final ListLevel getListLevel() {
        return this.zzYoh.getListLevel();
    }

    public final int getTrailingCharacter() {
        zzZ47 zzz47 = this.zzYck;
        if (zzz47 == null) {
            return 2;
        }
        return zzz47.getListLevel().getTrailingCharacter();
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void removeRunAttr(int i) {
        ListLevel listLevel = this.zzYoh.getListLevel();
        if (listLevel != null) {
            listLevel.zzZYh().remove(i);
        } else {
            zzYOr();
        }
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void setRunAttr(int i, Object obj) {
        ListLevel listLevel = this.zzYoh.getListLevel();
        if (listLevel != null) {
            listLevel.zzZYh().zzQ(i, obj);
        } else {
            zzYOr();
        }
    }

    public final boolean zzR2() {
        return com.aspose.words.internal.zzZ1.zzZ(this.zzYco);
    }

    public final zzYEF zzU(boolean z, int i) {
        Style styleZzZ7;
        zzYEF zzyefZzqv = this.zzYor.zzqv(i);
        zzyefZzqv.remove(140);
        zzyefZzqv.remove(130);
        zzyefZzqv.remove(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6);
        if (!z) {
            zzyefZzqv.remove(80);
            zzyefZzqv.remove(300);
        }
        ListLevel listLevelZzRB = this.zzYor.zzRB((i & 8) != 0);
        if (listLevelZzRB != null) {
            if (listLevelZzRB.getNumberStyle() == 23) {
                zzyefZzqv.remove(70);
                zzyefZzqv.remove(60);
            }
            if (listLevelZzRB.zzZYh().contains(50) && (styleZzZ7 = this.zzYor.getDocument().getStyles().zzZ7(0, false)) != null) {
                styleZzZ7.zzZYh().zzX(zzyefZzqv, 190);
            }
            if (z) {
                listLevelZzRB.zzZYh().zzY(zzyefZzqv);
            }
        }
        return zzyefZzqv;
    }

    public final String[] zzYOA() {
        return this.zzYco;
    }

    public final boolean zzYOB() {
        return com.aspose.words.internal.zzZ1.zzZ(this.zzYcn);
    }

    public final zzZ47 zzYOC() {
        return this.zzYcj;
    }

    public final zzZ47 zzYOD() {
        return this.zzYck;
    }

    public final ListLevel zzYOJ() {
        return this.zzYoh.zzYOJ();
    }

    public final int zzYOs() {
        zzZ47 zzz47 = this.zzYcj;
        if (zzz47 == null) {
            return 2;
        }
        return zzz47.getListLevel().getTrailingCharacter();
    }

    public final String zzYOt() {
        return com.aspose.words.internal.zzZ1.zzY(this.zzYcn);
    }

    public final String zzYOu() {
        return com.aspose.words.internal.zzZ1.zzY(this.zzYco);
    }

    public final int zzYOv() {
        zzZ47 zzz47 = this.zzYcj;
        if (zzz47 == null) {
            return 0;
        }
        return zzz47.zzYO1();
    }

    public final String[] zzYOw() {
        return this.zzYcl;
    }

    public final String[] zzYOx() {
        return this.zzYcm;
    }

    public final String[] zzYOy() {
        return this.zzYcn;
    }

    public final String[] zzYOz() {
        return this.zzYco;
    }

    public final void zzZ(String[] strArr, String[] strArr2, zzZ47 zzz47, int i) {
        if (i == 0) {
            this.zzYco = strArr;
            this.zzYcm = strArr2;
            this.zzYck = zzz47;
        } else {
            this.zzYcn = strArr;
            this.zzYcl = strArr2;
            this.zzYcj = zzz47;
        }
    }

    public final String[] zzZ0Q() {
        return this.zzYcm;
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i, int i2) {
        ListLevel listLevel = this.zzYoh.getListLevel();
        if (listLevel != null) {
            return listLevel.zzZYh().get(i);
        }
        return null;
    }
}
