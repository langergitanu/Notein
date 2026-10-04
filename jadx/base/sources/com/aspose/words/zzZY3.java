package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZY3 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("property", "fmtid", "pid", "name", "linkTarget", "bool", "i4", "r8", "lpwstr", "filetime");

    public static void zzZ(zzZWX zzzwx) throws Exception {
        zzZW1 zzzw1ZzML = zzzwx.zzML(zzzwx.zzZmp().zzZkV());
        if (zzzw1ZzML == null) {
            return;
        }
        CustomDocumentProperties customDocumentProperties = zzzwx.getDocument().getCustomDocumentProperties();
        while (zzzw1ZzML.zzQ("Properties")) {
            if (zzUR.zzTP(zzzw1ZzML.getLocalName()) != 0) {
                zzzw1ZzML.zzk();
            } else {
                zzZ(customDocumentProperties, zzzw1ZzML);
            }
        }
    }

    private static void zzZ(CustomDocumentProperties customDocumentProperties, zzZW1 zzzw1) {
        DocumentProperty documentPropertyZzT;
        String value = null;
        String value2 = null;
        while (zzzw1.zzi()) {
            int iZzTP = zzUR.zzTP(zzzw1.getLocalName());
            if (iZzTP == 3) {
                value = zzzw1.getValue();
            } else if (iZzTP == 4) {
                value2 = zzzw1.getValue();
            }
        }
        if (com.aspose.words.internal.zzZYD.zzXk(value)) {
            while (zzzw1.zzQ("property")) {
                switch (zzUR.zzTP(zzzw1.getLocalName())) {
                    case 5:
                        customDocumentProperties.zzT(value, Boolean.valueOf(zzzw1.zzSv(false)));
                        documentPropertyZzT = null;
                        break;
                    case 6:
                        documentPropertyZzT = customDocumentProperties.zzT(value, Integer.valueOf(zzzw1.zzh()));
                        break;
                    case 7:
                        documentPropertyZzT = customDocumentProperties.zzT(value, Double.valueOf(com.aspose.words.internal.zzJB.parseDouble(zzzw1.readString())));
                        break;
                    case 8:
                        documentPropertyZzT = customDocumentProperties.zzT(value, zzzw1.zzS(true));
                        break;
                    case 9:
                        customDocumentProperties.zzT(value, com.aspose.words.internal.zzJB.zzZy(zzzw1.readString()));
                        documentPropertyZzT = null;
                        break;
                    default:
                        zzzw1.zzk();
                        documentPropertyZzT = null;
                        break;
                }
                if (com.aspose.words.internal.zzZYD.zzXk(value2) && documentPropertyZzT != null) {
                    documentPropertyZzT.zzO2(value2);
                }
            }
        }
    }
}
