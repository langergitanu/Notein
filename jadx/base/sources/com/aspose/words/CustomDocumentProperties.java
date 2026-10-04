package com.aspose.words;

import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class CustomDocumentProperties extends DocumentPropertyCollection {
    private Document zzZEY;

    public CustomDocumentProperties(Document document) {
        this.zzZEY = document;
    }

    private static String zzZ(Document document, String str) throws Exception {
        Bookmark bookmark = document.getRange().getBookmarks().get(str);
        if (bookmark != null) {
            return bookmark.zzYP(true);
        }
        return null;
    }

    public DocumentProperty add(String str, String str2) {
        return zzS(str, str2);
    }

    public DocumentProperty addLinkToContent(String str, String str2) throws Exception {
        String strZzZ = zzZ(this.zzZEY, str2);
        if (strZzZ == null) {
            return null;
        }
        DocumentProperty documentPropertyZzS = zzS(str, strZzZ);
        documentPropertyZzS.zzO2(str2);
        return documentPropertyZzS;
    }

    public final void setDocument(Document document) {
        this.zzZEY = document;
    }

    @Override // com.aspose.words.DocumentPropertyCollection
    public final DocumentPropertyCollection zz7d() {
        return new CustomDocumentProperties(this.zzZEY);
    }

    public DocumentProperty add(String str, int i) {
        return zzS(str, Integer.valueOf(i));
    }

    public CustomDocumentProperties() {
    }

    public DocumentProperty add(String str, Date date) {
        return zzS(str, com.aspose.words.internal.zzZQ9.zzZ(date));
    }

    public DocumentProperty add(String str, boolean z) {
        return zzS(str, Boolean.valueOf(z));
    }

    public DocumentProperty add(String str, double d) {
        return zzS(str, Double.valueOf(d));
    }
}
