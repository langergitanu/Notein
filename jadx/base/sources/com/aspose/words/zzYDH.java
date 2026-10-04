package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYDH {
    private static void zzt(StructuredDocumentTag structuredDocumentTag) {
        if (((zzYDF) structuredDocumentTag.zzY3H()).zzYcP()) {
            String strZzVn = com.aspose.words.internal.zzBM.zzVn(structuredDocumentTag.getDateDisplayLocale());
            boolean zZzXk = com.aspose.words.internal.zzZYD.zzXk(strZzVn);
            if (zZzXk) {
                try {
                    com.aspose.words.internal.zzZXR.zzpX();
                    com.aspose.words.internal.zzZXR.zzWX(strZzVn);
                } catch (Throwable th) {
                    if (zZzXk) {
                        com.aspose.words.internal.zzZXR.zzpW();
                    }
                    throw th;
                }
            }
            if (com.aspose.words.internal.zzZQ9.zzZ(structuredDocumentTag.zzY3R(), com.aspose.words.internal.zzZQ9.zz35)) {
                zzYDI.zzF(structuredDocumentTag);
            } else {
                zzYDI.zzY(structuredDocumentTag, zzY0C.zzZ(structuredDocumentTag.zzY3R(), structuredDocumentTag.getDateDisplayFormat(), structuredDocumentTag.getDateDisplayLocale()));
            }
            if (zZzXk) {
                com.aspose.words.internal.zzZXR.zzpW();
            }
        }
    }

    private static void zzu(StructuredDocumentTag structuredDocumentTag) {
        SdtListItemCollection listItems = structuredDocumentTag.getListItems();
        if (listItems.getSelectedValue() != null) {
            structuredDocumentTag.isShowingPlaceholderText(false);
            zzYDI.zzZ(structuredDocumentTag, (Node) new Run(structuredDocumentTag.zzYBb(), listItems.getSelectedValue().getDisplayText()), true);
        }
    }

    public static void zzv(StructuredDocumentTag structuredDocumentTag) {
        if (!structuredDocumentTag.getXmlMapping().isEmpty() || structuredDocumentTag.getDocument().getNodeType() == 31) {
            return;
        }
        int sdtType = structuredDocumentTag.getSdtType();
        if (sdtType == 4 || sdtType == 5) {
            zzu(structuredDocumentTag);
        } else if (sdtType == 6) {
            zzt(structuredDocumentTag);
        } else {
            if (sdtType != 13) {
                return;
            }
            zzYDI.zzE(structuredDocumentTag);
        }
    }
}
