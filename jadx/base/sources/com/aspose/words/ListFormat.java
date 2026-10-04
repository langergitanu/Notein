package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ListFormat {
    private ListCollection zzYSl;
    private ListLevel zzYcr;
    private ListLevel zzYcs;
    private zzZ9G zzYct;
    private zzZ9Q zzYcu;

    public ListFormat(zzZ9Q zzz9q, zzZ9G zzz9g, ListCollection listCollection) {
        this.zzYcu = zzz9q;
        this.zzYct = zzz9g;
        this.zzYSl = listCollection;
    }

    private int zzYOI() {
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(this.zzYcu, Paragraph.class);
        return paragraph != null ? ((Integer) paragraph.zzWm(EditingLanguage.KASHMIRI_ARABIC, 1)).intValue() : getListId();
    }

    private ListLevel zzYOK() {
        try {
            if (this.zzYcs == null) {
                List list = getList();
                ListLevel listLevelZzxw = list != null ? list.zzxw(zzYON()) : null;
                this.zzYcs = listLevelZzxw != null ? new ListLevel(listLevelZzxw, this.zzYct) : null;
            }
            return this.zzYcs;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void zzxC(int i) {
        int iZzYM7;
        Object directParaAttr = this.zzYcu.getDirectParaAttr(1160);
        int i2 = 0;
        int iIntValue = directParaAttr != null ? ((Integer) directParaAttr).intValue() : 0;
        if (iIntValue != 0 && i != 0 && getListLevel() != null && iIntValue >= (iZzYM7 = getListLevel().zzZYj().zzYM7() + getListLevel().zzZYj().zzYMa())) {
            i2 = iZzYM7;
        }
        this.zzYcu.setParaAttr(EditingLanguage.KASHMIRI_ARABIC, Integer.valueOf(i));
        this.zzYcs = null;
        if (i == 0 || directParaAttr == null || getListLevel() == null) {
            return;
        }
        if (iIntValue == 0) {
            this.zzYcu.removeParaAttr(1160);
        } else {
            this.zzYcu.setParaAttr(1160, Integer.valueOf((iIntValue - i2) + getListLevel().zzZYj().zzYM7() + getListLevel().zzZYj().zzYMa()));
        }
    }

    public void applyBulletDefault() {
        if (this.zzYSl.getCount() > 2046) {
            zzY1Z.zzY(this.zzYSl.getDocument().getWarningCallback(), 17, "List count exceed maximum allowed, document can have problem while opened in MS Word.", new Object[0]);
        }
        zzxC(this.zzYSl.add(0).getListId());
        setListLevelNumber(0);
        this.zzYcs = null;
    }

    public void applyNumberDefault() {
        if (this.zzYSl.getCount() > 2046) {
            zzY1Z.zzY(this.zzYSl.getDocument().getWarningCallback(), 17, "List count exceed maximum allowed, document can have problem while opened in MS Word.", new Object[0]);
        }
        zzxC(this.zzYSl.add(6).getListId());
        setListLevelNumber(0);
        this.zzYcs = null;
    }

    public List getList() {
        int listId = getListId();
        if (listId != 0) {
            return this.zzYSl.zzxv(listId);
        }
        return null;
    }

    public final int getListId() {
        return ((Integer) this.zzYcu.fetchParaAttr(EditingLanguage.KASHMIRI_ARABIC)).intValue();
    }

    public ListLevel getListLevel() {
        try {
            Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(this.zzYSl.getDocument(), Document.class);
            return (document == null || document.getRevisionsView() != 1) ? zzYOK() : zzYOJ();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getListLevelNumber() {
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(this.zzYSl.getDocument(), Document.class);
        return (document == null || document.getRevisionsView() != 1) ? zzYON() : zzYOM();
    }

    public boolean isListItem() {
        return getListId() != 0;
    }

    public void listIndent() throws Exception {
        if (zzYON() < 8) {
            setListLevelNumber(zzYON() + 1);
            this.zzYcs = null;
        }
    }

    public void listOutdent() throws Exception {
        if (zzYON() > 0) {
            setListLevelNumber(zzYON() - 1);
            this.zzYcs = null;
        }
    }

    public void removeNumbers() {
        setList(null);
        this.zzYcs = null;
    }

    public void setList(List list) {
        if (list == null) {
            zzxC(0);
            setListLevelNumber(0);
        } else {
            if (list.getDocument() != this.zzYSl.getDocument()) {
                throw new IllegalArgumentException("The list belongs to a different document.");
            }
            if (list.isListStyleDefinition()) {
                throw new IllegalArgumentException("The list is a definition of a list style.");
            }
            zzxC(list.getListId());
        }
        this.zzYcs = null;
    }

    public void setListLevelNumber(int i) {
        this.zzYcu.setParaAttr(EditingLanguage.GALICIAN, Integer.valueOf(i));
        this.zzYcs = null;
    }

    public final ListLevel zzYOJ() {
        if (this.zzYcr == null) {
            List listZzYOL = zzYOL();
            ListLevel listLevelZzxw = listZzYOL != null ? listZzYOL.zzxw(zzYOM()) : null;
            this.zzYcr = listLevelZzxw != null ? new ListLevel(listLevelZzxw, this.zzYct) : null;
        }
        return this.zzYcr;
    }

    public final List zzYOL() {
        int iZzYOI = zzYOI();
        if (iZzYOI != 0) {
            return this.zzYSl.zzxv(iZzYOI);
        }
        return null;
    }

    public final int zzYOM() {
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(this.zzYcu, Paragraph.class);
        return paragraph != null ? ((Integer) paragraph.zzWm(EditingLanguage.GALICIAN, 1)).intValue() : zzYON();
    }

    public final int zzYON() {
        return ((Integer) this.zzYcu.fetchParaAttr(EditingLanguage.GALICIAN)).intValue();
    }
}
