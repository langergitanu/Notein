package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRK {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("min-height", "height", "dynamic-spacing", "background-color", "border", "border-bottom", "border-left", "border-right", "border-top", "padding", "padding-bottom", "padding-left", "padding-right", "padding-top", "border-line-width", "border-line-width-bottom", "border-line-width-left", "border-line-width-right", "border-line-width-top", "shadow");

    private static void zzY(zzYQ7 zzyq7, zzYRI zzyri) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            if (!zzYQ7.zzZ(zzyq9ZzYuT, zzyri.zzYvQ())) {
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 0:
                        zzyri.setMinHeight(zzYSF.zzFX(zzyq9ZzYuT.getValue()));
                        break;
                    case 1:
                        zzyri.setHeight(zzYSF.zzFX(zzyq9ZzYuT.getValue()));
                        break;
                    case 2:
                        zzyri.zzSp(TelemetryEventStrings.Value.TRUE.equals(zzyq9ZzYuT.getValue()));
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        zzyq7.zzZ(256, false, "style:header-footer-properties");
                        break;
                    default:
                        zzyq7.zzYi("style:header-footer-properties", zzyq9ZzYuT.getLocalName());
                        break;
                }
            }
        }
    }

    public static void zzZ(zzYQ7 zzyq7, zzYRI zzyri) {
        zzYCZ zzycz = new zzYCZ();
        zzY(zzyq7, zzyri);
        zzs(zzyq7);
        if (zzycz.getCount() > 0) {
            zzyri.zzY(zzycz);
        }
    }

    private static void zzs(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("header-footer-properties")) {
            if ("background-image".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(1, true, "style:header-footer-properties");
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }
}
