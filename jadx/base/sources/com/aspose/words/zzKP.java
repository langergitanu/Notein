package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzKP {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("itemID", "schemaRefs", "schemaRef", "uri");

    private static void zzY(zzYU4 zzyu4, CustomXmlPart customXmlPart) {
        while (zzyu4.zzi()) {
            if (zzUR.zzTP(zzyu4.getLocalName()) == 3) {
                customXmlPart.getSchemas().add(zzyu4.getValue());
            }
        }
    }

    public static void zzZ(com.aspose.words.internal.zzZOP zzzop, CustomXmlPart customXmlPart, IWarningCallback iWarningCallback) throws Exception {
        if (zzzop.getLength() == 0) {
            return;
        }
        try {
            zzYU4 zzyu4 = new zzYU4(zzzop);
            while (zzyu4.zzi()) {
                if (zzUR.zzTP(zzyu4.getLocalName()) == 0) {
                    customXmlPart.setId(zzyu4.getValue());
                }
            }
            zzyu4.zzj();
            while (zzyu4.zzQ("datastoreItem")) {
                if (zzUR.zzTP(zzyu4.getLocalName()) != 1) {
                    zzyu4.zzk();
                } else {
                    zzZ(zzyu4, customXmlPart);
                }
            }
        } catch (Exception unused) {
            zzY1Z.zzZ(iWarningCallback, 0, "Error is occurred while parsing Custom XML data.", new Object[0]);
        }
    }

    private static void zzZ(zzYU4 zzyu4, CustomXmlPart customXmlPart) {
        while (zzyu4.zzQ("schemaRefs")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 2) {
                zzyu4.zzk();
            } else {
                zzY(zzyu4, customXmlPart);
            }
        }
    }
}
