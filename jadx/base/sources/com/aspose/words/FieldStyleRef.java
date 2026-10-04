package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldStyleRef extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\l", "\\n", "\\s", "\\p", "\\r", "\\t", "\\w");

    private static String zzY(zzY8J zzy8j) {
        String strZzTX;
        zzYVX zzyvx = new zzYVX();
        zzyvx.zzSD(true);
        int length = 0;
        zzyvx.zzSC(false);
        if (zzy8j.zzY2h()) {
            int iMin = Math.min(zzy8j.getStartIndex(), zzy8j.getEndIndex());
            int iMax = Math.max(zzy8j.getStartIndex(), zzy8j.getEndIndex());
            NodeCollection nodeCollectionZzYf = zzY8S.zzYf(zzy8j.getParagraph());
            strZzTX = com.aspose.words.internal.zzZKN.zzTX(zzYVY.zzZ(nodeCollectionZzYf.get(iMin), true, nodeCollectionZzYf.get(iMax), true, zzyvx));
            if (strZzTX.length() > 256) {
                strZzTX = strZzTX.substring(0, 256);
            }
            length = strZzTX.length();
        } else {
            strZzTX = "";
        }
        return (length >= 256 || !zzy8j.zzY2i()) ? strZzTX : com.aspose.words.internal.zzZKN.zzZI(strZzTX, ControlChar.PARAGRAPH_BREAK);
    }

    private String zzZ(zzY8J zzy8j) throws Exception {
        if (getInsertParagraphNumber()) {
            return zzZPO.zzZ(this, null, zzy8j.getParagraph(), getSuppressNonDelimiters(), getInsertRelativePosition());
        }
        if (zzZcd()) {
            return zzZPO.zzZ(this, zzy8j.getParagraph(), getInsertRelativePosition());
        }
        if (getInsertParagraphNumberInRelativeContext()) {
            return zzZPO.zzZ(this, null, zzy8j.getParagraph(), getStart().getParentParagraph(), getSuppressNonDelimiters(), null, getInsertRelativePosition());
        }
        if (getInsertParagraphNumberInFullContext()) {
            return zzZPO.zzZ(this, (Bookmark) null, zzy8j.getParagraph(), getSuppressNonDelimiters(), (String) null, getInsertRelativePosition());
        }
        if (getInsertRelativePosition()) {
            String strZzY = zzZPO.zzY(this, !zzy8j.zzY2j());
            if (!com.aspose.words.internal.zzZKN.zzU3(strZzY)) {
                return strZzY;
            }
        }
        return null;
    }

    private boolean zzZcd() {
        return zzZgq().zzMj("\\s");
    }

    public boolean getInsertParagraphNumber() {
        return zzZgq().zzMj("\\n");
    }

    public boolean getInsertParagraphNumberInFullContext() {
        return zzZgq().zzMj("\\w");
    }

    public boolean getInsertParagraphNumberInRelativeContext() {
        return zzZgq().zzMj("\\r");
    }

    public boolean getInsertRelativePosition() {
        return zzZgq().zzMj("\\p");
    }

    public boolean getSearchFromBottom() {
        return zzZgq().zzMj("\\l");
    }

    public String getStyleName() {
        return zzZgq().zzDG(0);
    }

    public boolean getSuppressNonDelimiters() {
        return zzZgq().zzMj("\\t");
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return 1;
            default:
                return 0;
        }
    }

    public void setInsertParagraphNumber(boolean z) throws Exception {
        zzZgq().zzs("\\n", z);
    }

    public void setInsertParagraphNumberInFullContext(boolean z) throws Exception {
        zzZgq().zzs("\\w", z);
    }

    public void setInsertParagraphNumberInRelativeContext(boolean z) throws Exception {
        zzZgq().zzs("\\r", z);
    }

    public void setInsertRelativePosition(boolean z) throws Exception {
        zzZgq().zzs("\\p", z);
    }

    public void setSearchFromBottom(boolean z) throws Exception {
        zzZgq().zzs("\\l", z);
    }

    public void setStyleName(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setSuppressNonDelimiters(boolean z) throws Exception {
        zzZgq().zzs("\\t", z);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        String styleName = getStyleName();
        if (!com.aspose.words.internal.zzZYD.zzXk(styleName)) {
            return new zzZP2(this, "Error! No style name given.");
        }
        zzZgo().zzZ(new zzZSC(getStart().zzYBb()), 2);
        zzY8J zzy8jZzZ = zzY8S.zzZ(this, styleName);
        if (zzy8jZzZ == null) {
            return new zzZP2(this, "Error! No text of specified style in document.");
        }
        String strZzZ = zzZ(zzy8jZzZ);
        return strZzZ != null ? new zzZP5(this, strZzZ) : new zzZP5(this, zzY(zzy8jZzZ), (byte) 0);
    }

    @Override // com.aspose.words.Field
    public final int zzZgN() {
        return 2;
    }
}
