package com.aspose.words;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class Merger {
    private Merger() {
    }

    public static void merge(String str, String[] strArr) throws Exception {
        merge(str, strArr, SaveOptions.createSaveOptions(str), 1);
    }

    private static Document zzZ(Document[] documentArr, int i) throws Exception {
        if (documentArr == null || documentArr.length == 0) {
            return null;
        }
        Document documentDeepClone = documentArr[0].deepClone();
        for (int i2 = 1; i2 < documentArr.length; i2++) {
            if (i == 2) {
                zzZYU.zzZ(documentDeepClone, documentArr[i2]);
            } else {
                documentDeepClone.appendDocument(documentArr[i2], zzud(i));
            }
        }
        return documentDeepClone;
    }

    private static int zzud(int i) {
        return i != 0 ? 1 : 0;
    }

    public static void merge(String str, String[] strArr, int i, int i2) throws Exception {
        merge(str, strArr, SaveOptions.createSaveOptions(i), i2);
    }

    public static void merge(String str, String[] strArr, SaveOptions saveOptions, int i) throws Exception {
        Document documentMerge = merge(strArr, i);
        if (documentMerge.getOriginalLoadFormat() == 64 && !saveOptions.zzZ9f()) {
            documentMerge.updatePageLayout();
        }
        documentMerge.save(str, saveOptions);
    }

    public static Document merge(String[] strArr, int i) throws Exception {
        Document document = null;
        for (String str : strArr) {
            if (document == null) {
                document = new Document(str);
            } else if (i == 2) {
                zzZYU.zzZ(document, new Document(str));
            } else {
                document.appendDocument(new Document(str), zzud(i));
            }
        }
        return document;
    }

    private static void zzZ(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP[] zzzopArr, int i) throws Exception {
        zzZ(zzzop, zzzopArr, SaveOptions.createSaveOptions(i), 1);
    }

    private static void zzZ(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP[] zzzopArr, SaveOptions saveOptions, int i) throws Exception {
        Document documentZzZ = zzZ(zzzopArr, i);
        if (documentZzZ.getOriginalLoadFormat() == 64 && !saveOptions.zzZ9f()) {
            documentZzZ.updatePageLayout();
        }
        documentZzZ.zzS(zzzop, saveOptions.getSaveFormat());
    }

    public static Document merge(Document[] documentArr, int i) throws Exception {
        return zzZ(documentArr, i);
    }

    private static Document zzZ(com.aspose.words.internal.zzZOP[] zzzopArr, int i) throws Exception {
        Document document = null;
        for (com.aspose.words.internal.zzZOP zzzop : zzzopArr) {
            if (document == null) {
                document = new Document(zzzop);
            } else if (i == 2) {
                zzZYU.zzZ(document, new Document(zzzop));
            } else {
                document.appendDocument(new Document(zzzop), zzud(i));
            }
        }
        return document;
    }

    public static void merge(OutputStream outputStream, InputStream[] inputStreamArr, int i) throws Exception {
        zzZ(com.aspose.words.internal.zzZOP.zzY(outputStream), com.aspose.words.internal.zzZOP.zzZ(inputStreamArr), i);
    }

    public static void merge(OutputStream outputStream, InputStream[] inputStreamArr, SaveOptions saveOptions, int i) throws Exception {
        zzZ(com.aspose.words.internal.zzZOP.zzY(outputStream), com.aspose.words.internal.zzZOP.zzZ(inputStreamArr), saveOptions, i);
    }

    public static Document merge(InputStream[] inputStreamArr, int i) throws Exception {
        return zzZ(com.aspose.words.internal.zzZOP.zzZ(inputStreamArr), i);
    }
}
