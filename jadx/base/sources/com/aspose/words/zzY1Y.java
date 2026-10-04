package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1Y {
    private static void zzW(IWarningCallback iWarningCallback, String str) {
        zzY1Z.zzZ(iWarningCallback, 255, 17, str);
    }

    public static void zzZ(DocumentBase documentBase, zzYDZ zzydz, IWarningCallback iWarningCallback) {
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(documentBase, Document.class);
        if (document == null || document.getWebExtensionTaskPanes().getCount() == 0 || zzydz.zzYda()) {
            return;
        }
        zzW(iWarningCallback, "Taskpane add-ins can only be saved to the Office Open XML file formats and will be skipped when saving to other formats.");
    }
}
