package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXO {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("Template", "TotalTime", "Pages", "Words", "Characters", "Application", "DocSecurity", "Lines", "Paragraphs", "ScaleCrop", "HeadingPairs", "TitlesOfParts", "Manager", "Company", "LinksUpToDate", "CharactersWithSpaces", "SharedDoc", "HLinks", "HyperlinksChanged", "HyperlinkBase", "AppVersion", "DigSig", "vector", "size", "baseType", "variant", "lpstr", "i4");

    private static Object zzV(zzZW1 zzzw1) {
        while (zzzw1.zzQ("variant")) {
            int iZzTP = zzUR.zzTP(zzzw1.getLocalName());
            if (iZzTP == 26) {
                return zzzw1.readString();
            }
            if (iZzTP == 27) {
                return Integer.valueOf(zzzw1.zzh());
            }
        }
        return null;
    }

    private static Object[] zzW(zzZW1 zzzw1) {
        int i = 0;
        int iZzb = 0;
        while (zzzw1.zzi()) {
            if (zzUR.zzTP(zzzw1.getLocalName()) == 23) {
                iZzb = zzzw1.zzb();
            }
        }
        Object[] objArr = new Object[iZzb];
        while (zzzw1.zzY("vector", 3)) {
            int iZzTP = zzUR.zzTP(zzzw1.getLocalName());
            if (iZzTP == 25) {
                objArr[i] = zzV(zzzw1);
            } else if (iZzTP == 26) {
                objArr[i] = zzzw1.readString();
            }
            i++;
        }
        return objArr;
    }

    private static String[] zzX(zzZW1 zzzw1) {
        while (zzzw1.zzQ("TitlesOfParts")) {
            if (zzUR.zzTP(zzzw1.getLocalName()) == 22) {
                Object[] objArrZzW = zzW(zzzw1);
                String[] strArr = new String[objArrZzW.length];
                System.arraycopy(objArrZzW, 0, strArr, 0, objArrZzW.length);
                return strArr;
            }
        }
        return new String[0];
    }

    private static Object[] zzY(zzZW1 zzzw1) {
        while (zzzw1.zzQ("HeadingPairs")) {
            if (zzUR.zzTP(zzzw1.getLocalName()) == 22) {
                return zzW(zzzw1);
            }
        }
        return new Object[0];
    }

    public static void zzZ(zzZWX zzzwx) throws Exception {
        zzZW1 zzzw1ZzML = zzzwx.zzML(zzzwx.zzZmp().zzZkW());
        if (zzzw1ZzML == null) {
            return;
        }
        BuiltInDocumentProperties builtInDocumentProperties = zzzwx.getDocument().getBuiltInDocumentProperties();
        while (zzzw1ZzML.zzQ("Properties")) {
            switch (zzUR.zzTP(zzzw1ZzML.getLocalName())) {
                case 0:
                    builtInDocumentProperties.setTemplate(zzzw1ZzML.readString());
                    break;
                case 1:
                    builtInDocumentProperties.zzOJ(zzzw1ZzML.zzh());
                    break;
                case 2:
                    builtInDocumentProperties.setPages(zzzw1ZzML.zzh());
                    break;
                case 3:
                    builtInDocumentProperties.setWords(zzzw1ZzML.zzh());
                    break;
                case 4:
                    builtInDocumentProperties.setCharacters(zzzw1ZzML.zzh());
                    break;
                case 5:
                    builtInDocumentProperties.setNameOfApplication(zzzw1ZzML.readString());
                    break;
                case 6:
                    builtInDocumentProperties.setSecurity(zzzw1ZzML.zzh());
                    break;
                case 7:
                    builtInDocumentProperties.setLines(zzzw1ZzML.zzh());
                    break;
                case 8:
                    builtInDocumentProperties.setParagraphs(zzzw1ZzML.zzh());
                    break;
                case 9:
                case 14:
                case 16:
                case 17:
                case 18:
                case 21:
                    break;
                case 10:
                    builtInDocumentProperties.setHeadingPairs(zzY(zzzw1ZzML));
                    break;
                case 11:
                    builtInDocumentProperties.setTitlesOfParts(zzX(zzzw1ZzML));
                    break;
                case 12:
                    builtInDocumentProperties.setManager(zzzw1ZzML.readString());
                    break;
                case 13:
                    builtInDocumentProperties.setCompany(zzzw1ZzML.readString());
                    break;
                case 15:
                    builtInDocumentProperties.setCharactersWithSpaces(zzzw1ZzML.zzh());
                    break;
                case 19:
                    builtInDocumentProperties.setHyperlinkBase(zzzw1ZzML.readString());
                    break;
                case 20:
                    builtInDocumentProperties.setVersion(zzYU3.zzGO(zzzw1ZzML.readString()));
                    break;
                default:
                    zzzw1ZzML.zzk();
                    break;
            }
        }
    }
}
