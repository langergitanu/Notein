package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1M {
    private static com.aspose.words.internal.zzZNR zzWVd = new com.aspose.words.internal.zzZNR("((_x[a-f0-9]{4}_)|([\\w\\-\\._]+?))", 66);
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("Title", "Subject", "Author", "Keywords", "Description", "LastAuthor", "Revision", "AppName", "TotalTime", "LastPrinted", "Created", "LastSaved", "Pages", "Words", "Characters", "Category", "PresentationFormat", "Manager", "Company", "Guid", "HyperlinkBase", "Bytes", "Lines", "Paragraphs", "CharactersWithSpaces", "Version", "dt", "link", "string", "float", "boolean", "dateTime", "dateTime.tz");

    public static void zzX(zzY12 zzy12) {
        boolean zZzGX;
        CustomDocumentProperties customDocumentProperties = ((Document) zzy12.getDocument()).getCustomDocumentProperties();
        zzYU4 zzyu4ZzZsD = zzy12.zzZsD();
        while (zzyu4ZzZsD.zzQ("CustomDocumentProperties")) {
            String strZzyT = zzyT(zzyu4ZzZsD.getLocalName());
            DocumentProperty documentPropertyZzT = null;
            String value = null;
            String value2 = null;
            while (zzyu4ZzZsD.zzi()) {
                int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
                if (iZzTP == 26) {
                    value = zzyu4ZzZsD.getValue();
                } else if (iZzTP == 27) {
                    value2 = zzyu4ZzZsD.getValue();
                }
            }
            String string = zzyu4ZzZsD.readString();
            switch (zzUR.zzTP(value)) {
                case 28:
                    documentPropertyZzT = customDocumentProperties.zzT(strZzyT, string);
                    break;
                case 29:
                    double d = com.aspose.words.internal.zzJB.parseDouble(string);
                    int i = (int) d;
                    documentPropertyZzT = i != d ? customDocumentProperties.zzT(strZzyT, Double.valueOf(d)) : customDocumentProperties.zzT(strZzyT, Integer.valueOf(i));
                    break;
                case 30:
                    try {
                        zZzGX = zzYU4.zzGX(string);
                    } catch (IllegalStateException e) {
                        zzyu4ZzZsD.zzZ(65536, 13, e.getMessage());
                        zZzGX = false;
                    }
                    customDocumentProperties.zzT(strZzyT, Boolean.valueOf(zZzGX));
                    break;
                case 31:
                case 32:
                    customDocumentProperties.zzT(strZzyT, com.aspose.words.internal.zzJB.zzZy(string));
                    break;
            }
            if (com.aspose.words.internal.zzZYD.zzXk(value2) && documentPropertyZzT != null) {
                documentPropertyZzT.zzO2(value2);
            }
        }
    }

    public static void zzY(zzY12 zzy12) {
        BuiltInDocumentProperties builtInDocumentProperties = ((Document) zzy12.getDocument()).getBuiltInDocumentProperties();
        zzYU4 zzyu4ZzZsD = zzy12.zzZsD();
        while (zzyu4ZzZsD.zzQ("DocumentProperties")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 0:
                    builtInDocumentProperties.setTitle(zzyu4ZzZsD.readString());
                    break;
                case 1:
                    builtInDocumentProperties.setSubject(zzyu4ZzZsD.readString());
                    break;
                case 2:
                    builtInDocumentProperties.setAuthor(zzyu4ZzZsD.readString());
                    break;
                case 3:
                    builtInDocumentProperties.setKeywords(zzyu4ZzZsD.readString());
                    break;
                case 4:
                    builtInDocumentProperties.setComments(zzyu4ZzZsD.readString());
                    break;
                case 5:
                    builtInDocumentProperties.setLastSavedBy(zzyu4ZzZsD.readString());
                    break;
                case 6:
                    builtInDocumentProperties.setRevisionNumber(zzyu4ZzZsD.zzh());
                    break;
                case 7:
                    builtInDocumentProperties.setNameOfApplication(zzyu4ZzZsD.readString());
                    break;
                case 8:
                    builtInDocumentProperties.zzOJ(zzyu4ZzZsD.zzh());
                    break;
                case 9:
                    builtInDocumentProperties.zzA(com.aspose.words.internal.zzJB.zzZy(zzyu4ZzZsD.readString()));
                    break;
                case 10:
                    builtInDocumentProperties.zzB(com.aspose.words.internal.zzJB.zzZy(zzyu4ZzZsD.readString()));
                    break;
                case 11:
                    builtInDocumentProperties.zzz(com.aspose.words.internal.zzJB.zzZy(zzyu4ZzZsD.readString()));
                    break;
                case 12:
                    builtInDocumentProperties.setPages(zzyu4ZzZsD.zzh());
                    break;
                case 13:
                    builtInDocumentProperties.setWords(zzyu4ZzZsD.zzh());
                    break;
                case 14:
                    builtInDocumentProperties.setCharacters(zzyu4ZzZsD.zzh());
                    break;
                case 15:
                    builtInDocumentProperties.setCategory(zzyu4ZzZsD.readString());
                    break;
                case 16:
                case 19:
                    break;
                case 17:
                    builtInDocumentProperties.setManager(zzyu4ZzZsD.readString());
                    break;
                case 18:
                    builtInDocumentProperties.setCompany(zzyu4ZzZsD.readString());
                    break;
                case 20:
                    builtInDocumentProperties.setHyperlinkBase(zzyu4ZzZsD.readString());
                    break;
                case 21:
                    builtInDocumentProperties.setBytes(zzyu4ZzZsD.zzh());
                    break;
                case 22:
                    builtInDocumentProperties.setLines(zzyu4ZzZsD.zzh());
                    break;
                case 23:
                    builtInDocumentProperties.setParagraphs(zzyu4ZzZsD.zzh());
                    break;
                case 24:
                    builtInDocumentProperties.setCharactersWithSpaces(zzyu4ZzZsD.zzh());
                    break;
                case 25:
                    builtInDocumentProperties.setVersion(zzYU3.zzGO(zzyu4ZzZsD.readString()));
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }

    private static char zzyS(String str) {
        return (char) com.aspose.words.internal.zzJB.zzZe(com.aspose.words.internal.zzZKN.zzV(str, '_', 'x'));
    }

    private static String zzyT(String str) {
        StringBuilder sb = new StringBuilder();
        for (com.aspose.words.internal.zzZNT zzznt : zzWVd.zzUW(str)) {
            String strOooO00o = OooO0O0.OooO00o(zzznt, 3);
            if (com.aspose.words.internal.zzZYD.zzXk(strOooO00o)) {
                com.aspose.words.internal.zzZNH.zzU(sb, strOooO00o);
            } else {
                sb.append(zzyS(OooO0O0.OooO00o(zzznt, 2)));
            }
        }
        return sb.toString();
    }
}
