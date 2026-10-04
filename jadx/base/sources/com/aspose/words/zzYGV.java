package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGV {
    private static void zzX(zzYHZ zzyhz, Document document) throws Exception {
        if (zzYVC.zzZ(document.getCustomDocumentProperties())) {
            zzyhz.zzCC("\\*\\userprops");
            for (DocumentProperty documentProperty : document.getCustomDocumentProperties()) {
                if (zzYVC.zzZ(documentProperty)) {
                    zzyhz.zzY6("\\propname", documentProperty.getName());
                    zzyhz.zzY7("\\proptype", zzYGD.zzoE(documentProperty.getType()));
                    if (com.aspose.words.internal.zzZYD.zzXk(documentProperty.zzZok())) {
                        zzyhz.zzY6("\\linkval", documentProperty.zzZok());
                    }
                    zzyhz.zzY6("\\staticval", zzY(documentProperty));
                }
            }
            zzyhz.zzYj3();
        }
    }

    private static void zzY(zzYHZ zzyhz, Document document) throws Exception {
        int iZzZo9 = document.zzZpV().zzYW6.zzZo9();
        if (iZzZo9 != 0) {
            zzyhz.zzCC("\\*\\password");
            zzyhz.zzp5(iZzZo9);
            zzyhz.zzYj3();
        }
    }

    public static void zzZ(zzYEM zzyem) throws Exception {
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        zzZ(zzyhzZzYfW, zzyem.zzZqS().zzYfy);
        zzX(zzyhzZzYfW, zzyem.zzZqS().zzYfy);
    }

    private static void zzZ(zzYHZ zzyhz, Document document) throws Exception {
        zzyhz.zzFg();
        zzyhz.zzCC("\\info");
        zzyhz.zzY5("\\title", document.getBuiltInDocumentProperties().getTitle());
        zzyhz.zzY5("\\subject", document.getBuiltInDocumentProperties().getSubject());
        zzyhz.zzY5("\\author", document.getBuiltInDocumentProperties().getAuthor());
        zzyhz.zzY5("\\manager", document.getBuiltInDocumentProperties().getManager());
        zzyhz.zzY5("\\company", document.getBuiltInDocumentProperties().getCompany());
        zzyhz.zzY6("\\hlinkbase", document.getBuiltInDocumentProperties().getHyperlinkBase());
        zzyhz.zzY5("\\operator", document.getBuiltInDocumentProperties().getLastSavedBy());
        zzyhz.zzY6("\\category", document.getBuiltInDocumentProperties().getCategory());
        zzyhz.zzY6("\\keywords", document.getBuiltInDocumentProperties().getKeywords());
        zzyhz.zzY6("\\doccomm", document.getBuiltInDocumentProperties().getComments());
        zzyhz.zzZ5("\\version", document.getBuiltInDocumentProperties().getRevisionNumber());
        zzyhz.zzZ5("\\edmins", document.getBuiltInDocumentProperties().getTotalEditingTime());
        zzyhz.zzZ5("\\nofpages", document.getBuiltInDocumentProperties().getPages());
        zzyhz.zzZ5("\\nofwords", document.getBuiltInDocumentProperties().getWords());
        zzyhz.zzZ5("\\nofchars", document.getBuiltInDocumentProperties().getCharacters());
        zzyhz.zzZ5("\\nofcharsws", document.getBuiltInDocumentProperties().getCharactersWithSpaces());
        zzZ(zzyhz, "\\creatim", document.getBuiltInDocumentProperties().zz7h());
        zzZ(zzyhz, "\\printim", document.getBuiltInDocumentProperties().zz7g());
        zzZ(zzyhz, "\\revtim", document.getBuiltInDocumentProperties().zz7f());
        zzY(zzyhz, document);
        zzZYR zzzyr = document.zzZpV().zzYW6;
        zzzyr.zzZof();
        zzYG1.zzZ(zzyhz, "\\*\\passwordhash", zzzyr.zzZo8());
        zzyhz.zzYj3();
        zzyhz.zzFg();
    }

    private static String zzY(DocumentProperty documentProperty) {
        if (documentProperty.getType() == 0) {
            return documentProperty.toBool() ? "1" : "0";
        }
        return documentProperty.toString();
    }

    private static void zzZ(zzYHZ zzyhz, String str, com.aspose.words.internal.zzZQ9 zzzq9) throws Exception {
        if (com.aspose.words.internal.zzZQ9.zzZ(zzzq9, com.aspose.words.internal.zzZQ9.zz35)) {
            return;
        }
        zzyhz.zzCC(str);
        zzyhz.zzZ5("\\yr", zzzq9.getYear());
        zzyhz.zzZ5("\\mo", zzzq9.getMonth());
        zzyhz.zzZ5("\\dy", zzzq9.getDay());
        zzyhz.zzZ5("\\hr", zzzq9.getHour());
        zzyhz.zzZ5("\\min", zzzq9.getMinute());
        zzyhz.zzZ5("\\sec", zzzq9.getSecond());
        zzyhz.zzYj3();
    }
}
