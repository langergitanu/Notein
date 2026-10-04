package com.aspose.words;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOV {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("name", "string-value", "value-type", "boolean-value", FirebaseAnalytics.Param.CURRENCY, "date-value", "time-value", "value", "formula");

    private static void zzZN(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String value = "";
        String value2 = "";
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 0:
                    value = zzyq9ZzYuT.getValue();
                    break;
                case 1:
                    value2 = zzyq9ZzYuT.getValue();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    zzyq7.zzZ(1, false, "text:user-field-decl");
                    break;
                default:
                    zzyq7.zzYi("user-field-decl", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
        if (com.aspose.words.internal.zzZKN.zzU3(value)) {
            return;
        }
        zzyq7.getDocument().getVariables().add(value, value2);
    }

    public static void zzZO(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String localName = zzyq9ZzYuT.getLocalName();
        while (zzyq9ZzYuT.zzQ(localName)) {
            if ("user-field-decl".equals(zzyq7.zzYuT().getLocalName())) {
                zzZN(zzyq7);
            } else {
                zzyq7.zzYuT().zzk();
            }
        }
    }
}
