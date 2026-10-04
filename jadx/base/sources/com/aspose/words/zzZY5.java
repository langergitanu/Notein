package com.aspose.words;

import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zzZY5 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(NoteMeta.PROPERTY_TITLE, "subject", "creator", "keywords", "description", "lastModifiedBy", "revision", "lastPrinted", "created", "modified", "category", "contentStatus", "contentType", "language", "version", "value");
    static String zzYPa = "pkTG3BQAzllhnvwiWHycsXlXTAuIB6XuSp3QDVQBI6o=";

    public static void zzZ(zzZWX zzzwx) throws Exception {
        zzZW1 zzzw1ZzML = zzzwx.zzML(zzzwx.zzZmp().zzme());
        if (zzzw1ZzML == null) {
            return;
        }
        BuiltInDocumentProperties builtInDocumentProperties = zzzwx.getDocument().getBuiltInDocumentProperties();
        while (zzzw1ZzML.zzQ("coreProperties")) {
            switch (zzUR.zzTP(zzzw1ZzML.getLocalName())) {
                case 0:
                    builtInDocumentProperties.setTitle(zzzw1ZzML.zzS(false));
                    break;
                case 1:
                    String string = zzzw1ZzML.readString();
                    if ("mUH(kgm**\\5=X_cv".equals(string)) {
                        string = zzYPa;
                    }
                    builtInDocumentProperties.setSubject(string);
                    break;
                case 2:
                    builtInDocumentProperties.setAuthor(zzzw1ZzML.readString());
                    break;
                case 3:
                    zzZ(builtInDocumentProperties, zzzw1ZzML);
                    break;
                case 4:
                    builtInDocumentProperties.setComments(zzzw1ZzML.zzS(false));
                    break;
                case 5:
                    builtInDocumentProperties.setLastSavedBy(zzzw1ZzML.readString());
                    break;
                case 6:
                    builtInDocumentProperties.setRevisionNumber(zzzw1ZzML.zzh());
                    break;
                case 7:
                    builtInDocumentProperties.zzA(com.aspose.words.internal.zzJB.zzZy(zzzw1ZzML.readString()));
                    break;
                case 8:
                    builtInDocumentProperties.zzB(com.aspose.words.internal.zzJB.zzZy(zzzw1ZzML.readString()));
                    break;
                case 9:
                    builtInDocumentProperties.zzz(com.aspose.words.internal.zzJB.zzZy(zzzw1ZzML.readString()));
                    break;
                case 10:
                    builtInDocumentProperties.setCategory(zzzw1ZzML.readString());
                    break;
                case 11:
                    builtInDocumentProperties.setContentStatus(zzzw1ZzML.readString());
                    break;
                case 12:
                    builtInDocumentProperties.setContentType(zzzw1ZzML.readString());
                    break;
                case 13:
                    builtInDocumentProperties.get("Language").setValue(zzzw1ZzML.readString());
                    break;
                case 14:
                    builtInDocumentProperties.get("DocumentVersion").setValue(zzzw1ZzML.readString());
                    break;
                default:
                    zzzw1ZzML.zzk();
                    break;
            }
        }
    }

    private static void zzZ(BuiltInDocumentProperties builtInDocumentProperties, zzZW1 zzzw1) {
        String strSubstring;
        StringBuilder sb = new StringBuilder();
        while (zzzw1.zzY("keywords", 3)) {
            if (zzUR.zzTP(zzzw1.getLocalName()) != 15) {
                builtInDocumentProperties.setKeywords(zzzw1.getValue());
            } else {
                zzzw1.zzZqn().zzYrc();
                com.aspose.words.internal.zzZNH.zzU(sb, zzzw1.readString());
                com.aspose.words.internal.zzZNH.zzU(sb, ", ");
            }
        }
        if (sb.length() != 0) {
            if (builtInDocumentProperties.getKeywords().length() > 0) {
                strSubstring = sb.toString() + builtInDocumentProperties.getKeywords();
            } else {
                strSubstring = sb.substring(0, sb.length() - 2);
            }
            builtInDocumentProperties.setKeywords(strSubstring);
        }
    }
}
