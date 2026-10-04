package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class FormField extends SpecialChar implements zzZ9G {
    private Field zzYwk;
    private zzZMM zzYwl;
    static String zzYwj = com.aspose.words.internal.zzZKN.zzS(ControlChar.DEFAULT_TEXT_INPUT_CHAR, 5);
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("uppercase", "lowercase", "first capital", "title case");

    public FormField(DocumentBase documentBase, zzZMM zzzmm, zzYEF zzyef) {
        super(documentBase, (char) 1, zzyef);
        this.zzYwl = zzzmm;
    }

    private static int zzLm(String str) {
        int iZzTP = zzUR.zzTP(str.toLowerCase());
        if (iZzTP == 0) {
            return 1;
        }
        if (iZzTP == 1) {
            return 2;
        }
        if (iZzTP != 2) {
            return iZzTP != 3 ? 0 : 3;
        }
        return 4;
    }

    private static BookmarkStart zzM(FieldStart fieldStart) {
        if (fieldStart.getParentNode() != null && fieldStart.zz9I()) {
            return (BookmarkStart) com.aspose.words.internal.zzZKW.zzZ(fieldStart.getParentNode().getPreviousSibling(), BookmarkStart.class);
        }
        return null;
    }

    private void zzV(Inline inline) {
        if (inline != null) {
            zzZ((zzYEF) inline.zzZYh().zzbn());
            zzYWB zzywbZzZgF = getField() != null ? getField().zzZgF() : null;
            if (zzywbZzZgF != null) {
                Iterator<Node> it = zzywbZzZgF.iterator();
                while (it.hasNext()) {
                    Inline inline2 = (Inline) com.aspose.words.internal.zzZKW.zzZ(it.next(), Inline.class);
                    if (inline2 != null) {
                        inline2.zzZ((zzYEF) inline.zzZYh().zzbn());
                    }
                }
            }
        }
    }

    private Inline zzZ6P() {
        zzYWB zzywbZzZgF = getField() != null ? getField().zzZgF() : null;
        if (zzywbZzZgF != null) {
            Iterator<Node> it = zzywbZzZgF.iterator();
            while (it.hasNext()) {
                Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(it.next(), Inline.class);
                if (inline != null) {
                    return inline;
                }
            }
        }
        return null;
    }

    private FieldStart zzZce() {
        zzZYT zzzytZzq = zzZYT.zzq(this);
        int i = 0;
        while (true) {
            Node node = zzzytZzq.getNode();
            int nodeType = node.getNodeType();
            if (nodeType != 22) {
                if (nodeType == 24) {
                    i++;
                }
            } else {
                if (i == 0) {
                    return (FieldStart) node;
                }
                i--;
            }
            int i2 = i;
            if (!zzzytZzq.zzZ(null, false, true, true, false, false)) {
                return null;
            }
            i = i2;
        }
    }

    private boolean zzZt(Object obj) throws Exception {
        if (obj != null) {
            return false;
        }
        int textInputType = getTextInputType();
        if (textInputType == 0 || textInputType == 1 || textInputType == 2) {
            setResult(null);
            return true;
        }
        if (textInputType == 3 || textInputType == 4 || textInputType == 5) {
            return false;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.aspose.words.SpecialChar, com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.visitFormField(this));
    }

    public final BookmarkStart getBookmarkStart() {
        if (getField() == null) {
            return null;
        }
        BookmarkStart bookmarkStart = (BookmarkStart) com.aspose.words.internal.zzZKW.zzZ(getField().getStart().getNextSibling(), BookmarkStart.class);
        if (bookmarkStart != null) {
            return bookmarkStart;
        }
        BookmarkStart bookmarkStart2 = (BookmarkStart) com.aspose.words.internal.zzZKW.zzZ(getField().getStart().getPreviousSibling(), BookmarkStart.class);
        return bookmarkStart2 != null ? bookmarkStart2 : zzM(getField().getStart());
    }

    public boolean getCalculateOnExit() {
        return this.zzYwl.zzZ6N();
    }

    public double getCheckBoxSize() {
        return ((double) this.zzYwl.zzZ6I()) / 2.0d;
    }

    public boolean getChecked() {
        return this.zzYwl.contains(21010) ? this.zzYwl.zzZ6G() : this.zzYwl.zzZ6H();
    }

    public boolean getDefault() {
        return this.zzYwl.zzZ6H();
    }

    public DropDownItemCollection getDropDownItems() {
        return this.zzYwl.getDropDownItems();
    }

    public int getDropDownSelectedIndex() {
        return this.zzYwl.contains(21070) ? this.zzYwl.zzZ6E() : this.zzYwl.zzZ6F();
    }

    public boolean getEnabled() {
        return this.zzYwl.getEnabled();
    }

    public String getEntryMacro() {
        return this.zzYwl.getEntryMacro();
    }

    public String getExitMacro() {
        return this.zzYwl.getExitMacro();
    }

    public final Field getField() {
        FieldStart fieldStartZzZce;
        if (this.zzYwk == null && (fieldStartZzZce = zzZce()) != null) {
            this.zzYwk = fieldStartZzZce.getField();
        }
        return this.zzYwk;
    }

    public String getHelpText() {
        return this.zzYwl.getHelpText();
    }

    public int getMaxLength() {
        return this.zzYwl.zzZ6K();
    }

    public String getName() {
        return this.zzYwl.getName();
    }

    @Override // com.aspose.words.SpecialChar, com.aspose.words.Node
    public int getNodeType() {
        return 25;
    }

    public boolean getOwnHelp() {
        return this.zzYwl.zzZ6M();
    }

    public boolean getOwnStatus() {
        return this.zzYwl.zzZ6L();
    }

    public String getResult() {
        int type = getType();
        if (type == 70) {
            if (getField() == null) {
                return "";
            }
            String strZzW3 = getField().zzW3(true);
            return com.aspose.words.internal.zzZKN.equals(strZzW3, zzYwj) ? "" : strZzW3;
        }
        if (type == 71) {
            return getChecked() ? "1" : "0";
        }
        if (type == 83) {
            return zzZ6Q();
        }
        throw new IllegalStateException("Unknown form field type.");
    }

    public String getStatusText() {
        return this.zzYwl.getStatusText();
    }

    public String getTextInputDefault() {
        return this.zzYwl.getTextInputDefault();
    }

    public String getTextInputFormat() {
        return this.zzYwl.getTextInputFormat();
    }

    public int getTextInputType() {
        return this.zzYwl.getTextInputType();
    }

    public int getType() {
        if (getField() != null) {
            return getField().getType();
        }
        return 0;
    }

    public boolean isCheckBoxExactSize() {
        return !this.zzYwl.zzZ6J();
    }

    public void removeField() throws Exception {
        if (getField() == null) {
            return;
        }
        BookmarkStart bookmarkStart = (BookmarkStart) com.aspose.words.internal.zzZKW.zzZ(getField().getStart().getNextSibling(), BookmarkStart.class);
        if (bookmarkStart != null) {
            bookmarkStart.remove();
            getField().getStart().zzYBd().insertBefore(bookmarkStart, getField().getStart());
        }
        getField().remove();
    }

    public void setCalculateOnExit(boolean z) {
        this.zzYwl.zzVE(z);
    }

    public void setCheckBoxSize(double d) {
        this.zzYwl.zzAX(com.aspose.words.internal.zzSA.zzt(d));
    }

    public void setChecked(boolean z) {
        this.zzYwl.zzVz(z);
    }

    public void setDefault(boolean z) {
        this.zzYwl.zzVA(z);
    }

    public void setDropDownSelectedIndex(int i) {
        this.zzYwl.zzAV(i);
    }

    public void setEnabled(boolean z) {
        this.zzYwl.setEnabled(z);
    }

    public void setEntryMacro(String str) {
        this.zzYwl.setEntryMacro(str);
    }

    public void setExitMacro(String str) {
        this.zzYwl.setExitMacro(str);
    }

    public void setHelpText(String str) {
        this.zzYwl.setHelpText(str);
    }

    public void setMaxLength(int i) {
        this.zzYwl.zzAY(i);
    }

    public void setName(String str) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.zzYwl.setName(str);
        BookmarkStart bookmarkStart = getBookmarkStart();
        if (bookmarkStart == null || zzY9.zzZ(bookmarkStart.zzYAW(), bookmarkStart.getName(), bookmarkStart) == null) {
            return;
        }
        bookmarkStart.getBookmark().setName(this.zzYwl.getName());
    }

    public void setOwnHelp(boolean z) {
        this.zzYwl.zzVD(z);
    }

    public void setOwnStatus(boolean z) {
        this.zzYwl.zzVC(z);
    }

    public void setResult(String str) throws Exception {
        int type = getType();
        if (type != 70) {
            if (type == 71) {
                com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
                setChecked(com.aspose.words.internal.zzJB.parseInt(str) != 0);
                return;
            } else {
                if (type != 83) {
                    throw new IllegalStateException("Unknown form field type.");
                }
                com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
                zzLl(str);
                return;
            }
        }
        Inline inlineZzZ6P = zzZ6P();
        Field field = getField();
        if (str == null) {
            str = getTextInputDefault();
        }
        field.setResult(str);
        if (inlineZzZ6P != null) {
            zzV(inlineZzZ6P);
        }
    }

    @Override // com.aspose.words.Inline, com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void setRunAttr(int i, Object obj) {
        zzZYh().zzQ(i, obj);
        zzYWB zzywbZzZgF = getField() != null ? getField().zzZgF() : null;
        if (zzywbZzZgF != null) {
            Iterator<Node> it = zzywbZzZgF.iterator();
            while (it.hasNext()) {
                zzZ9G zzz9g = (zzZ9G) com.aspose.words.internal.zzZKW.zzZ(it.next(), zzZ9G.class);
                if (zzz9g != null) {
                    zzz9g.setRunAttr(i, obj);
                }
            }
        }
    }

    public void setStatusText(String str) {
        this.zzYwl.setStatusText(str);
    }

    public void setTextInputDefault(String str) throws Exception {
        this.zzYwl.setTextInputDefault(str);
        if (getTextInputType() == 5) {
            zzYW0.zzZ(getField().getStart().zztD(21), false, this, false);
            DocumentBuilder documentBuilder = new DocumentBuilder(zzYBb());
            documentBuilder.moveTo(this);
            documentBuilder.insertField(str, "");
            getField().update();
        }
    }

    public void setTextInputFormat(String str) {
        this.zzYwl.setTextInputFormat(str);
    }

    public void setTextInputType(int i) {
        this.zzYwl.setTextInputType(i);
    }

    public void setTextInputValue(Object obj) throws Exception {
        if (getType() != 70) {
            throw new IllegalStateException("The form field is not a text form field.");
        }
        if (zzZt(obj)) {
            return;
        }
        int textInputType = getTextInputType();
        if (textInputType == 0) {
            setResult(com.aspose.words.internal.zzZYD.zzD((String) obj, zzLm(getTextInputFormat())));
            return;
        }
        if (textInputType == 1) {
            setResult(com.aspose.words.internal.zzJB.zzZ(com.aspose.words.internal.zzZQB.zz3(obj), getTextInputFormat(), zzYBb().getFieldOptions().zzZcL() | 3));
        } else if (textInputType == 2) {
            setResult(zzY0C.zzX((com.aspose.words.internal.zzZQ9) obj, getTextInputFormat()));
        } else {
            if (textInputType != 3 && textInputType != 4 && textInputType != 5) {
                throw new IllegalStateException("Unknown form field type.");
            }
            throw new IllegalStateException("Cannot set the form field value because it is calculated.");
        }
    }

    public final void zzLl(String str) {
        for (int i = 0; i < getDropDownItems().getCount(); i++) {
            if (com.aspose.words.internal.zzZYD.zzi(getDropDownItems().get(i), str)) {
                setDropDownSelectedIndex(i);
                return;
            }
        }
    }

    @Override // com.aspose.words.Inline, com.aspose.words.Node
    public final Node zzZ(boolean z, zzZA5 zzza5) {
        FormField formField = (FormField) super.zzZ(z, zzza5);
        formField.zzYwl = (zzZMM) this.zzYwl.zzbn();
        formField.zzYwk = null;
        return formField;
    }

    public final zzZMM zzZ6O() {
        return this.zzYwl;
    }

    public final String zzZ6Q() {
        int dropDownSelectedIndex = getDropDownSelectedIndex();
        return (dropDownSelectedIndex < 0 || dropDownSelectedIndex >= getDropDownItems().getCount()) ? "" : getDropDownItems().get(dropDownSelectedIndex);
    }

    public final int zzZ6R() {
        int type = getType();
        if (type == 70) {
            return 0;
        }
        if (type == 71) {
            return 1;
        }
        if (type == 83) {
            return 2;
        }
        throw new IllegalStateException("Unknown form field type.");
    }

    public void isCheckBoxExactSize(boolean z) {
        this.zzYwl.zzVB(!z);
    }
}
