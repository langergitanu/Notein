package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYR9 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("space-before", "min-label-width", "min-label-distance", "text-align", "width", "height", "list-level-position-and-space-mode", "font-name", "vertical-pos", "vertical-rel", "y", "list-tab-stop-position", "text-indent", "margin-left", "label-followed-by");

    private static void zzW(zzYQ7 zzyq7, ListLevel listLevel) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            String value = zzyq9ZzYuT.getValue();
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 11:
                    listLevel.setTabPosition(zzYSF.zzFV(value));
                    break;
                case 12:
                    if (com.aspose.words.internal.zzZKN.zzW(value, "%", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                        zzyq7.zzv("style:list-level-label-alignment", "fo:text-indent", "percent");
                    }
                    listLevel.zzZYj().zzwb(zzYSF.zzFX(value));
                    break;
                case 13:
                    listLevel.zzZYj().zzwa(zzYSF.zzFX(value));
                    break;
                case 14:
                    listLevel.setTrailingCharacter(zzYS3.zzFo(value));
                    break;
                default:
                    zzyq7.zzYi("style:list-level-label-alignment", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
    }

    private static void zzX(zzYQ7 zzyq7, ListLevel listLevel) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("list-level-properties")) {
            if ("list-level-label-alignment".equals(zzyq9ZzYuT.getLocalName())) {
                zzW(zzyq7, listLevel);
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }

    private static boolean zzY(zzYQ7 zzyq7, ListLevel listLevel) {
        listLevel.setTrailingCharacter(1);
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        int iZzFX = 0;
        int iZzFX2 = 0;
        int iZzFX3 = 0;
        boolean z = false;
        while (zzyq9ZzYuT.zzi()) {
            String value = zzyq9ZzYuT.getValue();
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 0:
                    iZzFX3 = zzYSF.zzFX(value);
                    break;
                case 1:
                    iZzFX = zzYSF.zzFX(value);
                    break;
                case 2:
                    iZzFX2 = zzYSF.zzFX(value);
                    break;
                case 3:
                    if ("start".equals(value)) {
                        zzyq7.zzv("style:list-level-properties", "fo:text-align", value);
                    }
                    listLevel.setAlignment(zzYS3.zzEZ(value));
                    break;
                case 4:
                    if (listLevel.zzYOb()) {
                        listLevel.zzZ0P().zzYvW().zzQ(4131, Double.valueOf(zzYSF.zzFV(value)));
                    }
                    break;
                case 5:
                    if (listLevel.zzYOb()) {
                        listLevel.zzZ0P().zzYvW().zzQ(4132, Double.valueOf(zzYSF.zzFV(value)));
                    }
                    break;
                case 6:
                    z = true;
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                    zzyq7.zzZ(256, false, "style:list-level-properties");
                    break;
                default:
                    zzyq7.zzYi("style:list-level-properties", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
        zzZ(listLevel, iZzFX, iZzFX2, iZzFX3);
        return z;
    }

    public static void zzZ(zzYQ7 zzyq7, ListLevel listLevel) {
        if (zzY(zzyq7, listLevel)) {
            zzX(zzyq7, listLevel);
        }
    }

    private static void zzZ(ListLevel listLevel, int i, int i2, int i3) {
        if (listLevel.getAlignment() == 2) {
            if (i != 0) {
                listLevel.zzZYj().zzwa(i);
            }
            listLevel.zzZYj().zzwb((i - i2) - listLevel.zzZYj().zzYM7());
        } else {
            int i4 = i + i3;
            if (i4 != 0) {
                listLevel.zzZYj().zzwa(i4);
            }
            listLevel.zzZYj().zzwb(i3 - listLevel.zzZYj().zzYM7());
        }
    }
}
