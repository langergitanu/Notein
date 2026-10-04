package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPZ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("protected", "condition", "display", "name", "protection-key", "protection-key-digest-algorithm", "id");

    private static void zzV(zzYQ7 zzyq7, zzYCZ zzycz) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            if (!zzyq7.zzV(zzyq9ZzYuT)) {
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 0:
                        if (TelemetryEventStrings.Value.TRUE.equals(zzyq9ZzYuT.getValue())) {
                            zzyq7.zzYuC();
                            zzycz.zzRE(false);
                        }
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zzyq7.zzZ(256, false, "text:section");
                        break;
                    default:
                        zzyq7.zzYi("text:section", zzyq9ZzYuT.getLocalName());
                        break;
                }
            }
        }
        zzyq9ZzYuT.zzj();
    }

    public static Section zzY(zzYR0 zzyr0) {
        Body body = zzyr0.zzYBx().getBody();
        if (body == null) {
            Section sectionDeepClone = zzyr0.zzYBx().deepClone();
            sectionDeepClone.appendChild(new Body(zzyr0.zzYBx().getDocument()));
            return sectionDeepClone;
        }
        body.remove();
        Section sectionDeepClone2 = zzyr0.zzYBx().deepClone();
        sectionDeepClone2.appendChild(body);
        return sectionDeepClone2;
    }

    public static void zzZ(zzYQ7 zzyq7, zzYR0 zzyr0, CompositeNode compositeNode, String str) throws Exception {
        if (zzZ(compositeNode, str)) {
            zzYP5.zzZ(zzyq7, "section", compositeNode);
            return;
        }
        Section sectionZzY = zzY(zzyr0);
        zzYCZ zzyczZzYvR = sectionZzY.zzYvR();
        boolean z = false;
        zzyczZzYvR.setSectionStart(0);
        zzV(zzyq7, zzyczZzYvR);
        zzYPY zzypy = (zzYPY) zzyq7.zzYuS().zzK(zzyq7.zzYuP(), "section", zzyq7.zzYuO());
        CompatibilityOptions compatibilityOptions = zzyq7.getDocument().getCompatibilityOptions();
        if (zzypy != null && zzypy.zzYuh()) {
            z = true;
        }
        compatibilityOptions.setNoColumnBalance(z);
        if (zzypy != null && zzypy.zzYvR() != null) {
            zzypy.zzYvR().zzY(zzyczZzYvR);
        }
        zzyq7.zzYuL().push(sectionZzY);
        zzyq7.zzSd(true);
        zzYP5.zzZ(zzyq7, "section", sectionZzY.getBody());
        zzyq7.zzSc(true);
        zzyq7.zzYuL().pop();
    }

    private static boolean zzZ(CompositeNode compositeNode, String str) {
        return "table-cell".equals(str) || (compositeNode instanceof Cell);
    }
}
