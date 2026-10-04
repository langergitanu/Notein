package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQW {
    private static char[] zzXOe = {'H', 'M', 'S'};
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("generator", "template", "description", "subject", "keyword", "initial-creator", "creator", NoteMeta.PROPERTY_TITLE, "creation-date", "date", "print-date", "editing-cycles", "editing-duration", "document-statistic", "user-defined", "language", "auto-reload", "hyperlink-behaviour", "printed-by", "boolean", "time", "float", "href", "actuate", C18437z2.f56754h, "page-count", "paragraph-count", "row-count", "word-count", "character-count", "non-whitespace-character-count", "cell-count", "draw-count", "frame-count", "image-count", "object-count", "ole-object-count", "sentence-count", "syllable-count", "table-count");

    private static ArrayList<String> zzE(String[] strArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (com.aspose.words.internal.zzZYD.zzXk(str)) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, str);
            }
        }
        return arrayList;
    }

    private static int zzEp(String str) {
        String upperCase = str.toUpperCase();
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        int iZzT = com.aspose.words.internal.zzZKN.zzT(upperCase, "PT", i);
        if (iZzT == -1) {
            return 0;
        }
        String strSubstring = upperCase.substring(iZzT + 2);
        String[] strArrZzU = com.aspose.words.internal.zzZKN.zzU(strSubstring, zzXOe);
        ArrayList<String> arrayListZzE = zzE(strArrZzU);
        int iZzT2 = com.aspose.words.internal.zzZKN.zzT(strSubstring, "H", i);
        int iZzT3 = com.aspose.words.internal.zzZKN.zzT(strSubstring, "M", i);
        int iZzT4 = com.aspose.words.internal.zzZKN.zzT(strSubstring, "S", i);
        double dZzZ = zzZ(strArrZzU, arrayListZzE, 0);
        double dZzZ2 = zzZ(strArrZzU, arrayListZzE, 1);
        double dZzZ3 = zzZ(strArrZzU, arrayListZzE, 2);
        int size = arrayListZzE.size();
        if (size == 1) {
            if (iZzT4 != -1) {
                return (int) (dZzZ / 60.0d);
            }
            if (iZzT3 != -1) {
                return (int) dZzZ;
            }
            if (iZzT2 != -1) {
                return (int) (dZzZ * 60.0d);
            }
            return 0;
        }
        if (size != 2) {
            if (size != 3) {
                return 0;
            }
            return (int) ((dZzZ3 / 60.0d) + (dZzZ * 60.0d) + dZzZ2);
        }
        if (iZzT4 != -1 && iZzT3 != -1) {
            return (int) ((dZzZ2 / 60.0d) + dZzZ);
        }
        if (iZzT4 != -1 && iZzT2 != -1) {
            return (int) ((dZzZ2 / 60.0d) + (dZzZ * 60.0d));
        }
        if (iZzT3 == -1 || iZzT2 == -1) {
            return 0;
        }
        return (int) ((dZzZ * 60.0d) + dZzZ2);
    }

    public static void zzJ(zzYQ7 zzyq7) throws Exception {
        zzYQO zzyqoZzEn = zzyq7.zzYuU().zzEn("/meta.xml");
        if (zzyqoZzEn == null) {
            return;
        }
        zzYQ9 zzyq9 = new zzYQ9(zzyqoZzEn.zzYvo());
        zzyq7.zzT(zzyq9);
        zzYQ7.zzQ(zzyq7, "document-meta");
        while (zzyq9.zzQ("document-meta")) {
            if ("meta".equals(zzyq9.getLocalName())) {
                zzm(zzyq7);
            } else {
                zzyq9.zzk();
            }
        }
    }

    private static void zzZ(BuiltInDocumentProperties builtInDocumentProperties, String str, boolean z) {
        if (!z) {
            builtInDocumentProperties.setKeywords(com.aspose.words.internal.zzZKN.format("{0},", builtInDocumentProperties.getKeywords()));
        }
        builtInDocumentProperties.setKeywords(com.aspose.words.internal.zzZKN.format("{0}{1}", builtInDocumentProperties.getKeywords(), str));
    }

    private static void zzj(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        BuiltInDocumentProperties builtInDocumentProperties = zzyq7.getDocument().getBuiltInDocumentProperties();
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 25:
                    builtInDocumentProperties.setPages(zzyq9ZzYuT.zzb());
                    break;
                case 26:
                    builtInDocumentProperties.setParagraphs(zzyq9ZzYuT.zzb());
                    break;
                case 27:
                    builtInDocumentProperties.setLines(zzyq9ZzYuT.zzb());
                    break;
                case 28:
                    builtInDocumentProperties.setWords(zzyq9ZzYuT.zzb());
                    break;
                case 29:
                    builtInDocumentProperties.setCharactersWithSpaces(zzyq9ZzYuT.zzb());
                    break;
                case 30:
                    builtInDocumentProperties.setCharacters(zzyq9ZzYuT.zzb());
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                    zzyq7.zzZ(1, false, "meta:document-statistic");
                    break;
                default:
                    zzyq7.zzYi("document-statistic", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
    }

    private static void zzk(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        BuiltInDocumentProperties builtInDocumentProperties = zzyq7.getDocument().getBuiltInDocumentProperties();
        while (zzyq9ZzYuT.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP != 7 && iZzTP != 9) {
                switch (iZzTP) {
                    case 22:
                        builtInDocumentProperties.setTemplate(zzyq9ZzYuT.getValue());
                        continue;
                    case 23:
                    case 24:
                        break;
                    default:
                        zzyq7.zzYi("template", zzyq9ZzYuT.getLocalName());
                        continue;
                }
            }
            zzyq7.zzZ(1, false, "meta:template");
        }
    }

    private static void zzl(zzYQ7 zzyq7) {
        CustomDocumentProperties customDocumentProperties = zzyq7.getDocument().getCustomDocumentProperties();
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq9ZzYuT.zzj();
        String value = "";
        String value2 = "";
        while (zzyq9ZzYuT.zzi()) {
            if ("name".equals(zzyq9ZzYuT.getLocalName())) {
                value = zzyq9ZzYuT.getValue();
                if (customDocumentProperties.contains(value)) {
                    return;
                }
            } else if ("value-type".equals(zzyq9ZzYuT.getLocalName())) {
                value2 = zzyq9ZzYuT.getValue();
            }
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(value)) {
            zzyq7.zzT(1, "Empty user-defined property name, ignored.");
            return;
        }
        String string = zzyq9ZzYuT.readString();
        int iZzTP = zzUR.zzTP(value2);
        if (iZzTP != 9) {
            switch (iZzTP) {
                case 19:
                    customDocumentProperties.zzT(value, Boolean.valueOf(com.aspose.words.internal.zzJB.zzZb(string)));
                    break;
                case 20:
                    break;
                case 21:
                    customDocumentProperties.zzT(value, Double.valueOf(com.aspose.words.internal.zzJB.parseDouble(string)));
                    break;
                default:
                    customDocumentProperties.zzT(value, string);
                    break;
            }
            return;
        }
        customDocumentProperties.zzT(value, com.aspose.words.internal.zzJB.zzZy(string));
    }

    private static void zzm(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        BuiltInDocumentProperties builtInDocumentProperties = zzyq7.getDocument().getBuiltInDocumentProperties();
        boolean z = true;
        while (zzyq7.zzYuT().zzQ("meta")) {
            switch (zzUR.zzTP(zzyq7.zzYuT().getLocalName())) {
                case 0:
                    builtInDocumentProperties.setNameOfApplication(zzyq9ZzYuT.readString());
                    break;
                case 1:
                    zzk(zzyq7);
                    break;
                case 2:
                    builtInDocumentProperties.setComments(zzyq9ZzYuT.readString());
                    break;
                case 3:
                    builtInDocumentProperties.setSubject(zzyq9ZzYuT.readString());
                    break;
                case 4:
                    zzZ(builtInDocumentProperties, zzyq9ZzYuT.readString(), z);
                    z = false;
                    break;
                case 5:
                    builtInDocumentProperties.setAuthor(zzyq9ZzYuT.readString());
                    break;
                case 6:
                    builtInDocumentProperties.setLastSavedBy(zzyq9ZzYuT.readString());
                    break;
                case 7:
                    builtInDocumentProperties.setTitle(zzyq9ZzYuT.readString());
                    break;
                case 8:
                    builtInDocumentProperties.zzB(com.aspose.words.internal.zzJB.zzZy(zzyq9ZzYuT.readString()));
                    break;
                case 9:
                    builtInDocumentProperties.zzz(com.aspose.words.internal.zzJB.zzZy(zzyq9ZzYuT.readString()));
                    break;
                case 10:
                    builtInDocumentProperties.zzA(com.aspose.words.internal.zzJB.zzZy(zzyq9ZzYuT.readString()));
                    break;
                case 11:
                    builtInDocumentProperties.setRevisionNumber(zzyq9ZzYuT.zzh());
                    break;
                case 12:
                    builtInDocumentProperties.zzOJ(zzEp(zzyq9ZzYuT.readString()));
                    break;
                case 13:
                    zzj(zzyq7);
                    break;
                case 14:
                    zzl(zzyq7);
                    break;
                case 15:
                case 16:
                case 17:
                case 18:
                    zzyq7.zzZ(1, true, "office:meta");
                    break;
                default:
                    zzyq7.zzYuT().zzk();
                    break;
            }
        }
    }

    private static double zzZ(String[] strArr, ArrayList<String> arrayList, int i) {
        if (arrayList.size() > i) {
            return com.aspose.words.internal.zzJB.parseDouble(strArr[i]);
        }
        return Double.NaN;
    }
}
