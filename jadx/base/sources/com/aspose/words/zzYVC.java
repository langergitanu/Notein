package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYVC {
    private static String zzHF(String str) {
        StringBuilder sb = new StringBuilder("o:");
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_' || cCharAt == '-') {
                sb.append(cCharAt);
            } else {
                com.aspose.words.internal.zzZNH.zzU(sb, "_x");
                com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzJB.zzWu(cCharAt));
                sb.append('_');
            }
        }
        return sb.toString();
    }

    public static void zzZ(Document document, com.aspose.words.internal.zzHW zzhw, boolean z) throws Exception {
        zzZ(document.getBuiltInDocumentProperties(), zzhw, z);
        zzZ(document.getCustomDocumentProperties(), zzhw, z);
    }

    private static String zzg(String str, boolean z) {
        return z ? str.replace("--", "- ") : str;
    }

    private static boolean zztk(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
    }

    private static void zzZ(BuiltInDocumentProperties builtInDocumentProperties, com.aspose.words.internal.zzHW zzhw, boolean z) throws Exception {
        zzhw.zzY("o:DocumentProperties");
        zzZ(zzhw, "o:Title", builtInDocumentProperties.getTitle(), z);
        zzZ(zzhw, "o:Subject", builtInDocumentProperties.getSubject(), z);
        zzZ(zzhw, "o:Author", builtInDocumentProperties.getAuthor(), z);
        zzZ(zzhw, "o:Keywords", builtInDocumentProperties.getKeywords(), z);
        zzZ(zzhw, "o:Description", builtInDocumentProperties.getComments(), z);
        zzZ(zzhw, "o:LastAuthor", builtInDocumentProperties.getLastSavedBy(), z);
        zzhw.zzZ("o:Revision", builtInDocumentProperties.getRevisionNumber());
        zzhw.zzZ("o:TotalTime", builtInDocumentProperties.getTotalEditingTime());
        zzhw.zzZ("o:LastPrinted", builtInDocumentProperties.zz7g());
        zzhw.zzZ("o:Created", builtInDocumentProperties.zz7h());
        zzhw.zzZ("o:LastSaved", builtInDocumentProperties.zz7f());
        zzhw.zzZ("o:Pages", builtInDocumentProperties.getPages());
        zzhw.zzZ("o:Words", builtInDocumentProperties.getWords());
        zzhw.zzZ("o:Characters", builtInDocumentProperties.getCharacters());
        zzZ(zzhw, "o:Category", builtInDocumentProperties.getCategory(), z);
        zzZ(zzhw, "o:Manager", builtInDocumentProperties.getManager(), z);
        zzZ(zzhw, "o:Company", builtInDocumentProperties.getCompany(), z);
        zzZ(zzhw, "o:HyperlinkBase", builtInDocumentProperties.getHyperlinkBase(), z);
        DocumentProperty documentProperty = builtInDocumentProperties.get("Bytes");
        if (documentProperty.zzZom() == null && documentProperty.toInt() > 0) {
            zzhw.zzZ("o:Bytes", builtInDocumentProperties.getBytes());
        }
        zzhw.zzZ("o:Lines", builtInDocumentProperties.getLines());
        zzhw.zzZ("o:Paragraphs", builtInDocumentProperties.getParagraphs());
        zzhw.zzZ("o:CharactersWithSpaces", builtInDocumentProperties.getCharactersWithSpaces());
        zzhw.zzZ("o:Version", zzYU3.zzsU(builtInDocumentProperties.getVersion()));
        zzhw.zzp();
    }

    private static void zzZ(com.aspose.words.internal.zzHW zzhw, String str, String str2, boolean z) {
        zzhw.zzY(str, zzg(str2, z));
    }

    private static void zzZ(CustomDocumentProperties customDocumentProperties, com.aspose.words.internal.zzHW zzhw, boolean z) throws Exception {
        if (zzZ(customDocumentProperties)) {
            zzhw.zzY("o:CustomDocumentProperties");
            for (DocumentProperty documentProperty : customDocumentProperties) {
                if (zzZ(documentProperty)) {
                    zzZ(documentProperty, zzhw, z);
                }
            }
            zzhw.zzp();
        }
    }

    private static void zzZ(DocumentProperty documentProperty, com.aspose.words.internal.zzHW zzhw, boolean z) throws Exception {
        zzhw.zzY(zzHF(documentProperty.getName()));
        int type = documentProperty.getType();
        if (type == 0) {
            zzhw.zzX("dt:dt", "boolean");
            zzhw.writeString(documentProperty.toBool() ? "1" : "0");
        } else if (type == 1) {
            zzhw.zzX("dt:dt", "dateTime.tz");
            zzhw.writeString(com.aspose.words.internal.zzJB.zzR(documentProperty.zzZoj()));
        } else if (type == 2) {
            zzhw.zzX("dt:dt", "float");
            if (com.aspose.words.internal.zzZYD.zzXk(documentProperty.zzZok())) {
                zzhw.zzX("link", documentProperty.zzZok());
            }
            zzhw.writeString(com.aspose.words.internal.zzJB.zzZZ(documentProperty.toDouble()));
        } else if (type == 3) {
            zzhw.zzX("dt:dt", "float");
            if (com.aspose.words.internal.zzZYD.zzXk(documentProperty.zzZok())) {
                zzhw.zzX("link", documentProperty.zzZok());
            }
            zzhw.writeString(documentProperty.toString());
        } else if (type == 4) {
            zzhw.zzX("dt:dt", "string");
            if (com.aspose.words.internal.zzZYD.zzXk(documentProperty.zzZok())) {
                zzhw.zzX("link", documentProperty.zzZok());
            }
            zzhw.writeString(zzg(documentProperty.toString(), z));
        } else {
            throw new IllegalStateException("Unexpected property type.");
        }
        zzhw.zzp();
    }

    public static boolean zzZ(CustomDocumentProperties customDocumentProperties) {
        Iterator<DocumentProperty> it = customDocumentProperties.iterator();
        while (it.hasNext()) {
            if (zzZ(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzZ(DocumentProperty documentProperty) {
        if (com.aspose.words.internal.zzZKN.zzS(documentProperty.getName(), "_PID_", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            return false;
        }
        return zztk(documentProperty.getType());
    }

    public static void zzZ(zzZZF zzzzf, zzYU6 zzyu6, String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(zzzzf.zzYVJ)) {
            zzyu6.zzX("w:noLineBreaksAfter", "w:lang", str, "w:val", zzzzf.zzYVJ);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzzzf.zzYVI)) {
            zzyu6.zzX("w:noLineBreaksBefore", "w:lang", str, "w:val", zzzzf.zzYVI);
        }
    }
}
