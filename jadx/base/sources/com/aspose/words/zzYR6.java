package com.aspose.words;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzYR6 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("outline-level-style", "list-level-style-number", "list-level-style-bullet", "list-level-style-image", "list-level-properties", "text-properties", FirebaseAnalytics.Param.LEVEL, "num-format", "display-levels", "style-name", "start-value", "num-suffix", "num-prefix", "num-letter-sync", "bullet-char", "bullet-relative-size", "binary-data");

    private static boolean zzEv(String str) {
        return "outline-level-style".equals(str) || "list-level-style-number".equals(str) || "list-level-style-bullet".equals(str) || "list-level-style-image".equals(str);
    }

    private static void zzV(zzYQ7 zzyq7, ListLevel listLevel) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        listLevel.setNumberStyle(23);
        Shape shape = new Shape(zzyq7.getDocument(), 75);
        shape.setShapeAttr(EditingLanguage.ARABIC_LIBYA, 0);
        zzYTL.zzZ(zzyq7, shape, "list-level-style-image");
        listLevel.setNumberFormat(com.aspose.words.internal.zzZKN.zzS((char) 61623, 1));
        listLevel.zzzp(zzyq7.getDocument().getLists().zzo(shape));
        while (zzyq9ZzYuT.zzQ("list-level-style-image")) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 4) {
                zzYR9.zzZ(zzyq7, listLevel);
            } else if (iZzTP != 16) {
                zzyq9ZzYuT.zzk();
            } else {
                zzyq7.zzZ(256, true, "text:list-level-style-image");
            }
        }
    }

    private static void zzX(zzYQ7 zzyq7, zzYR7 zzyr7) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        int iZzZv = com.aspose.words.internal.zzJB.zzZv(zzyq9ZzYuT.zzV(FirebaseAnalytics.Param.LEVEL, "1")) - 1;
        zzyq9ZzYuT.zzj();
        if (ListLevel.zzx7(iZzZv)) {
            ListLevel listLevel = zzyr7.getList().getListLevels().get(iZzZv);
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 0) {
                zzY(zzyq7, zzyr7, listLevel, "outline-level-style");
                zzZ(zzyq7, zzyr7, listLevel, "outline-level-style");
            } else if (iZzTP == 1) {
                zzY(zzyq7, zzyr7, listLevel, "list-level-style-number");
                zzZ(zzyq7, zzyr7, listLevel, "list-level-style-number");
            } else if (iZzTP == 2) {
                zzZ(zzyq7, zzyr7, listLevel);
                zzZ(zzyq7, zzyr7, listLevel, "list-level-style-bullet");
            } else {
                if (iZzTP != 3) {
                    throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unknown list level style: '{0}'", zzyq9ZzYuT.getLocalName()));
                }
                zzV(zzyq7, listLevel);
            }
            if (zzyr7.zzZYh() != null) {
                zzyr7.zzZYh().zzY(listLevel.zzZYh());
            }
        }
    }

    private static void zzY(zzYQ7 zzyq7, zzYR7 zzyr7) {
        zzYEF zzyefZzZYh;
        for (int i = 0; i < 9; i++) {
            zzYPP zzyppZzK = zzyq7.zzYuS().zzK(zzyr7.zzYvK().get(i), null, zzyq7.zzYuO());
            if ((zzyppZzK instanceof zzYOY) && (zzyefZzZYh = ((zzYOY) com.aspose.words.internal.zzZKW.zzZ(zzyppZzK, zzYOY.class)).zzZYh()) != null && zzyefZzZYh.getCount() > 0) {
                zzyefZzZYh.zzY(zzyr7.getList().getListLevels().get(i).zzZYh());
            }
        }
    }

    public static zzYPP zzZ(zzYQ7 zzyq7, String str, boolean z) throws Exception {
        zzYR7 zzyr7 = new zzYR7();
        zzyr7.setList(zzyq7.getDocument().getLists().zzxt(1));
        zzZ(zzyq7, str, zzyr7);
        zzY(zzyq7, str, zzyr7);
        zzY(zzyq7, zzyr7);
        zzyq7.zzYuS().zzZ(zzyr7, zzyq7.zzYuO(), z);
        return zzyr7;
    }

    private static void zzY(zzYQ7 zzyq7, String str, zzYR7 zzyr7) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq9ZzYuT.zzj();
        zzyr7.getList().getListLevels().get(0).setStartAt(1);
        int i = 0;
        while (zzyq9ZzYuT.zzQ(str)) {
            if (zzEv(zzyq9ZzYuT.getLocalName())) {
                zzX(zzyq7, zzyr7);
                i++;
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
        if (i == 1) {
            zzyr7.getList().zzYPa().zzxj(0);
        }
    }

    private static void zzZ(zzYQ7 zzyq7, String str, zzYR7 zzyr7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq9ZzYuT.zzj();
        while (zzyq9ZzYuT.zzi()) {
            if (!zzYQ7.zzZ(zzyq9ZzYuT, zzyr7) && "consecutive-numbering".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(256, false, com.aspose.words.internal.zzZKN.format("text:{0}", str));
            }
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzyr7.getName()) || !"outline-style".equals(str)) {
            return;
        }
        zzyr7.setName("Outline");
    }

    private static void zzY(zzYQ7 zzyq7, zzYR7 zzyr7, ListLevel listLevel, String str) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        listLevel.setNumberStyle(255);
        String str2 = "";
        int iZzb = 1;
        int iZzb2 = 1;
        String str3 = "";
        while (zzyq9ZzYuT.zzi()) {
            String value = zzyq9ZzYuT.getValue();
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 6:
                    break;
                case 7:
                    listLevel.setNumberStyle(zzYQU.zzEo(value));
                    break;
                case 8:
                    iZzb2 = zzyq9ZzYuT.zzb();
                    break;
                case 9:
                    zzyr7.zzYvK().set(listLevel.zzYOa(), zzYOU.zzDr(value));
                    break;
                case 10:
                    iZzb = zzyq9ZzYuT.zzb();
                    break;
                case 11:
                    str3 = value;
                    break;
                case 12:
                    str2 = value;
                    break;
                case 13:
                    zzyq7.zzZ(256, false, str);
                    break;
                default:
                    zzyq7.zzYi(str, zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
        listLevel.setStartAt(iZzb);
        listLevel.setNumberFormat(zzZ(str2, str3, listLevel.zzYOa(), iZzb2, zzyq7));
    }

    private static void zzZ(zzYQ7 zzyq7, zzYR7 zzyr7, ListLevel listLevel, String str) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ(str)) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 4) {
                zzYR9.zzZ(zzyq7, listLevel);
            } else if (iZzTP != 5) {
                zzyq9ZzYuT.zzk();
            } else {
                zzYEF zzyefZzX = zzYP0.zzX(zzyq7, zzyr7);
                if (zzyefZzX.getCount() > 0) {
                    zzyefZzX.zzY(listLevel.zzZYh());
                }
            }
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzYR7 zzyr7, ListLevel listLevel) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        listLevel.setNumberStyle(23);
        String value = "";
        while (zzyq9ZzYuT.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP != 6) {
                if (iZzTP != 9) {
                    if (iZzTP != 11 && iZzTP != 12) {
                        if (iZzTP == 14) {
                            value = zzyq9ZzYuT.getValue();
                        } else if (iZzTP != 15) {
                            zzyq7.zzYi("list-level-style-bullet", zzyq9ZzYuT.getLocalName());
                        }
                    }
                    zzyq7.zzZ(256, false, "text:list-level-style-bullet");
                } else {
                    zzyr7.zzYvK().set(listLevel.zzYOa(), zzYOU.zzDr(zzyq9ZzYuT.getValue()));
                }
            }
        }
        listLevel.setNumberFormat(value);
    }

    private static String zzZ(String str, String str2, int i, int i2, zzYQ7 zzyq7) {
        String strZzZI = com.aspose.words.internal.zzZKN.zzZI("", str);
        for (int i3 = (i + 1) - i2; i3 <= i; i3++) {
            strZzZI = com.aspose.words.internal.zzZKN.zzQ(strZzZI, (char) i3);
            if (i3 != i) {
                strZzZI = com.aspose.words.internal.zzZKN.zzQ(strZzZI, FilenameUtils.EXTENSION_SEPARATOR);
            }
        }
        String strZzZI2 = com.aspose.words.internal.zzZKN.zzZI(strZzZI, str2);
        if (strZzZI2.length() <= 31) {
            return strZzZI2;
        }
        zzyq7.zzT(65536, "Aspose.Word model only support 30 symbols or less in NumberFormat. Excessive symbols will be truncated.");
        return com.aspose.words.internal.zzZKN.zzn(strZzZI2, 31);
    }
}
