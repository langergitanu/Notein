package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQ1 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("dont-balance-text-columns", "background-color", "margin-left", "margin-right", "editable", "protect", "writing-mode", "columns", "background-image", "notes-configuration");

    private static void zzW(zzYQ7 zzyq7, zzYCZ zzycz) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("section-properties")) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 7) {
                zzYQI.zzZ(zzyq7, zzycz);
            } else if (iZzTP == 8) {
                zzyq7.zzZ(1, true, "style:section-properties");
            } else if (iZzTP != 9) {
                zzyq9ZzYuT.zzk();
            } else {
                zzyq7.zzZ(256, true, "style:section-properties");
            }
        }
    }

    private static void zzY(zzYQ7 zzyq7, zzYPY zzypy) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 0:
                    if (TelemetryEventStrings.Value.FALSE.equals(zzyq9ZzYuT.getValue())) {
                        zzypy.zzS5(false);
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zzyq7.zzZ(256, false, "style:section-properties");
                    break;
                default:
                    zzyq7.zzYi("style:section-properties", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
    }

    public static void zzZ(zzYQ7 zzyq7, zzYPY zzypy) {
        zzYCZ zzycz = new zzYCZ();
        zzY(zzyq7, zzypy);
        zzW(zzyq7, zzycz);
        if (zzycz.getCount() > 0) {
            zzypy.zzY(zzycz);
        }
    }
}
