package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPL {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("text-properties", "paragraph-properties", "section-properties", "table-properties", "table-column-properties", "table-row-properties", "table-cell-properties", "graphic-properties", "chart-properties", "ruby-properties", "drawing-page-properties", "map", "text", "paragraph", "section", "table", "table-column", "table-row", "table-cell", "graphic", "chart", "ruby", "presentation", "drawing-page", "family", "master-page-name", "default-outline-level", "parent-style-name", "data-style-name", "auto-update", "class", "list-level", "list-style-name", "next-style-name", "percentage-data-style-name");

    private static zzYPQ zzP(zzYQ7 zzyq7, String str) {
        switch (zzUR.zzTP(str)) {
            case 12:
                return new zzYOY();
            case 13:
                return new zzYQB();
            case 14:
                return new zzYPY();
            case 15:
                return new zzYP9();
            case 16:
                return new zzYPE();
            case 17:
                return new zzYPA();
            case 18:
                return new zzYPG();
            case 19:
                return new zzYRL();
            case 20:
                return new zzYSR();
            case 21:
                return new zzYQ3();
            case 22:
            case 23:
                zzyq7.zzT(1, com.aspose.words.internal.zzZKN.format("'style:style' and 'style:default-style' elements are not imported when their 'style:family' attribute is equal to: '{0}'.", str));
                return null;
            default:
                throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unknown style family '{0}'.", str));
        }
    }

    public static void zzV(zzYQ7 zzyq7, boolean z) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String localName = zzyq9ZzYuT.getLocalName();
        zzYPQ zzypqZzP = zzP(zzyq7, zzyq9ZzYuT.zzV("family", null));
        if (zzypqZzP == null) {
            return;
        }
        zzY(zzyq7, localName, zzypqZzP);
        zzZ(zzyq7, localName, zzypqZzP);
        zzyq7.zzYuS().zzZ(zzypqZzP, zzyq7.zzYuO(), z);
    }

    private static void zzY(zzYQ7 zzyq7, String str, zzYPQ zzypq) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq9ZzYuT.zzj();
        while (zzyq9ZzYuT.zzi()) {
            if (!zzYQ7.zzZ(zzyq9ZzYuT, zzypq)) {
                String value = zzyq9ZzYuT.getValue();
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 24:
                        zzypq.zzDU(value);
                        break;
                    case 25:
                        zzypq.zzDT(zzYOU.zzDr(value));
                        break;
                    case 26:
                        if ((zzypq instanceof zzYQB) && com.aspose.words.internal.zzZYD.zzXk(value)) {
                            ((zzYQB) zzypq).zzrO(zzyq9ZzYuT.zzb() - 1);
                        }
                        break;
                    case 27:
                        zzypq.zzDS(zzYOU.zzDr(value));
                        break;
                    case 28:
                        zzypq.zzDR(zzYOU.zzDr(value));
                        break;
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                        zzyq7.zzZ(256, false, str);
                        break;
                    default:
                        zzyq7.zzYi(str, zzyq9ZzYuT.getLocalName());
                        break;
                }
            }
        }
    }

    private static void zzZ(zzYQ7 zzyq7, String str, zzYPQ zzypq) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ(str)) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 0:
                    zzYP0.zzY(zzyq7, (zzYOY) com.aspose.words.internal.zzZKW.zzZ(zzypq, zzYOY.class));
                    break;
                case 1:
                    zzYQB zzyqb = (zzYQB) com.aspose.words.internal.zzZKW.zzZ(zzypq, zzYQB.class);
                    if (zzyqb != null) {
                        zzYQE.zzZ(zzyq7, zzyqb);
                    }
                    break;
                case 2:
                    zzYPY zzypy = (zzYPY) com.aspose.words.internal.zzZKW.zzZ(zzypq, zzYPY.class);
                    if (zzypy != null) {
                        zzYQ1.zzZ(zzyq7, zzypy);
                    }
                    break;
                case 3:
                    zzYP9 zzyp9 = (zzYP9) com.aspose.words.internal.zzZKW.zzZ(zzypq, zzYP9.class);
                    if (zzyp9 != null) {
                        zzYPD.zzZ(zzyq7, zzyp9);
                    }
                    break;
                case 4:
                    zzYPE zzype = (zzYPE) com.aspose.words.internal.zzZKW.zzZ(zzypq, zzYPE.class);
                    if (zzype != null) {
                        zzYPD.zzZ(zzyq7, zzype);
                    }
                    break;
                case 5:
                    zzYPA zzypa = (zzYPA) com.aspose.words.internal.zzZKW.zzZ(zzypq, zzYPA.class);
                    if (zzypa != null) {
                        zzYPD.zzZ(zzyq7, zzypa);
                    }
                    break;
                case 6:
                    zzYPG zzypg = (zzYPG) com.aspose.words.internal.zzZKW.zzZ(zzypq, zzYPG.class);
                    if (zzypg != null) {
                        zzYPD.zzZ(zzyq7, zzypg);
                    }
                    break;
                case 7:
                    if (zzypq instanceof zzYRL) {
                        zzYRN.zzZ(zzyq7, (zzYRL) zzypq);
                    } else if (zzypq instanceof zzYQB) {
                        zzYQE.zzY(zzyq7, (zzYQB) zzypq);
                    }
                    break;
                case 8:
                    zzYSR zzysr = (zzYSR) com.aspose.words.internal.zzZKW.zzZ(zzypq, zzYSR.class);
                    if (zzysr != null) {
                        zzYST.zzZ(zzyq7, zzysr);
                    }
                    break;
                case 9:
                    zzYQ3 zzyq3 = (zzYQ3) com.aspose.words.internal.zzZKW.zzZ(zzypq, zzYQ3.class);
                    if (zzyq3 != null) {
                        zzyq3.zzrJ(zzYS3.zzFp(zzyq7.zzYuT().zzV("ruby-align", null)));
                        zzyq3.zzE2(zzyq7.zzYuT().zzV("ruby-position", null));
                    }
                    zzyq7.zzZ(256, false, "style:ruby-properties", "style:ruby-position");
                    break;
                case 10:
                case 11:
                    zzyq7.zzZ(256, true, str);
                    break;
                default:
                    zzyq9ZzYuT.zzk();
                    break;
            }
        }
    }
}
