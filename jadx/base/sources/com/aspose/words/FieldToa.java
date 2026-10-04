package com.aspose.words;

import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class FieldToa extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\f", "\\p", "\\h", "\\b", "\\c", "\\d", "\\e", "\\g", "\\l", "\\s");

    private Bookmark zzLH(String str) {
        Bookmark bookmark;
        if (com.aspose.words.internal.zzZKN.equals(str, "") || (bookmark = getStart().zzYBb().getRange().getBookmarks().get(str)) == null || bookmark.getBookmarkStart().getAncestor(3) == null) {
            return null;
        }
        return bookmark;
    }

    private void zzZ(int i, DocumentBuilder documentBuilder) {
        if (getUseHeading()) {
            String str = getStart().zzYBb().getFieldOptions().zzZcI().get(i);
            zzZQ3.zzZ(this, documentBuilder, 46);
            zzZQ3.zzZ(documentBuilder, (Paragraph) null);
            documentBuilder.write(str);
        }
    }

    private boolean zzZbW() {
        return zzZgq().zzMj("\\b");
    }

    private static String zzZc(String str, String str2) {
        return str == null ? str2 : com.aspose.words.internal.zzZYD.zzF(str, 15);
    }

    public String getBookmarkName() {
        return zzZgq().zzt("\\b", false);
    }

    public String getEntryCategory() {
        return zzZgq().zzt("\\c", false);
    }

    public String getEntrySeparator() {
        return zzZgq().zzt("\\e", false);
    }

    public String getPageNumberListSeparator() {
        return zzZgq().zzt("\\l", false);
    }

    public String getPageRangeSeparator() {
        return zzZgq().zzt("\\g", false);
    }

    public boolean getRemoveEntryFormatting() {
        return zzZgq().zzMj("\\f");
    }

    public String getSequenceName() {
        return zzZgq().zzt("\\s", false);
    }

    public String getSequenceSeparator() {
        return zzZgq().zzt("\\d", false);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
            case 1:
            case 2:
                return 1;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return 2;
            default:
                return 0;
        }
    }

    public boolean getUseHeading() {
        return zzZgq().zzMj("\\h");
    }

    public boolean getUsePassim() {
        return zzZgq().zzMj("\\p");
    }

    public void setBookmarkName(String str) throws Exception {
        zzZgq().zzZf("\\b", str);
    }

    public void setEntryCategory(String str) throws Exception {
        zzZgq().zzZe("\\c", str);
    }

    public void setEntrySeparator(String str) throws Exception {
        zzZgq().zzZf("\\e", str);
    }

    public void setPageNumberListSeparator(String str) throws Exception {
        zzZgq().zzZf("\\l", str);
    }

    public void setPageRangeSeparator(String str) throws Exception {
        zzZgq().zzZf("\\g", str);
    }

    public void setRemoveEntryFormatting(boolean z) throws Exception {
        zzZgq().zzs("\\f", z);
    }

    public void setSequenceName(String str) throws Exception {
        zzZgq().zzZf("\\s", str);
    }

    public void setSequenceSeparator(String str) throws Exception {
        zzZgq().zzZf("\\d", str);
    }

    public void setUseHeading(boolean z) throws Exception {
        zzZgq().zzs("\\h", z);
    }

    public void setUsePassim(boolean z) throws Exception {
        zzZgq().zzs("\\p", z);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        Bookmark bookmarkZzLH;
        if (zzZbW()) {
            String bookmarkName = getBookmarkName();
            if (bookmarkName == null) {
                return new zzZP2(this, "Error! No bookmark name given.");
            }
            bookmarkZzLH = zzLH(bookmarkName);
            if (bookmarkZzLH == null) {
                return new zzZP2(this, "Error! Bookmark not defined.");
            }
        } else {
            bookmarkZzLH = null;
        }
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(getEntryCategory());
        if (iZzZo <= 0) {
            return new zzZP2(this, "Error! Category number not found.");
        }
        String sequenceName = getSequenceName();
        ArrayList<zzY5B> arrayListZzZ = zzY59.zzZ(getStart().zzYBb(), getEntryCategory(), bookmarkZzLH, sequenceName, sequenceName != null ? (zzZPF) zzZgo().zzZav().zzY(new zzZPF(zzZgo())) : null);
        if (arrayListZzZ.size() == 0) {
            return new zzZP2(this, "No table of authorities entries found.");
        }
        com.aspose.words.internal.zzZOY zzzoyZzZbn = zzZgn().zzZbn();
        try {
            DocumentBuilder documentBuilderZzN = zzZQ3.zzN(this);
            zzZ(iZzZo, documentBuilderZzN);
            zzZ(arrayListZzZ, documentBuilderZzN);
            zzzoyZzZbn.dispose();
            return new zzZP4(this);
        } catch (Throwable th) {
            zzzoyZzZbn.dispose();
            throw th;
        }
    }

    private void zzZ(Iterable<zzY5B> iterable, DocumentBuilder documentBuilder) throws Exception {
        boolean usePassim = getUsePassim();
        String strZzZc = zzZc(getEntrySeparator(), ControlChar.TAB);
        String strZzZc2 = zzZc(getPageNumberListSeparator(), ", ");
        String strZzZc3 = zzZc(getSequenceSeparator(), CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
        String strZzZc4 = zzZc(getPageRangeSeparator(), "–");
        zzY5A zzy5a = new zzY5A(getStart().getDocument().getStyles(), getRemoveEntryFormatting());
        Iterator<zzY5B> it = iterable.iterator();
        while (it.hasNext()) {
            zzZ(documentBuilder, it.next(), zzy5a, usePassim, strZzZc, strZzZc2, strZzZc3, strZzZc4);
        }
    }

    private void zzZ(DocumentBuilder documentBuilder, zzY5B zzy5b, zzZA2 zzza2, boolean z, String str, String str2, String str3, String str4) throws Exception {
        zzZQ3.zzZ(this, documentBuilder, 44);
        zzZQ3.zzZ(documentBuilder, (Paragraph) null);
        zzTU zztu = new zzTU(new zzZA2[0]);
        DocumentBase document = zzy5b.zzZga().getDocument();
        if (document != getStart().getDocument()) {
            zztu.zzZ(new zzZSB(document, getStart().getDocument(), 0));
        }
        zztu.zzZ(new zzZP9(zzy5b.zzZga(), 7));
        zztu.zzZ(zzza2);
        Node nodeZzW = zzZQ3.zzW(documentBuilder);
        zzYWJ.zzX(zzy5b.zzZga(), nodeZzW, zztu);
        documentBuilder.write(str);
        Iterator<Run> it = zzy5b.zzZ(documentBuilder.getDocument(), z, str2, str3, str4).iterator();
        while (it.hasNext()) {
            documentBuilder.insertNode(it.next());
        }
        nodeZzW.remove();
    }
}
