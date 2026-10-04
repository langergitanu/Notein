package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzOF {
    public static void zzZ(zzPS zzps, ParagraphFormat paragraphFormat, boolean z) {
        zzPT zzptZzSx = zzps.zzSx("line-height");
        if (zzptZzSx != null && zzptZzSx.zzZWj().getCount() == 1) {
            zzQ4 zzq4 = (zzQ4) com.aspose.words.internal.zzZKW.zzZ(zzptZzSx, zzQ4.class);
            if (zzq4 != null && zzq4.zzZWp().zzZVx().getValueType() == 5) {
                zzL4 zzl4ZzZVx = zzq4.zzZWp().zzZVx();
                paragraphFormat.setLineSpacingRule(2);
                double doubleValue = ((zzMU) zzl4ZzZVx).getDoubleValue() / 100.0d;
                if (z) {
                    paragraphFormat.setLineSpacing(((double) ((int) ((doubleValue * 12.0d) * 20.0d))) / 20.0d);
                    return;
                } else {
                    paragraphFormat.setLineSpacing(doubleValue * 12.0d);
                    return;
                }
            }
            zzL4 zzl4ZzZVx2 = zzptZzSx.zzZWj().zzZVx();
            int valueType = zzl4ZzZVx2.getValueType();
            if (valueType != 3) {
                if (valueType != 5) {
                    double dZzL = zzL5.zzL(zzl4ZzZVx2);
                    if (com.aspose.words.internal.zzAN.zzL(dZzL, -1.7976931348623157E308d)) {
                        return;
                    }
                    paragraphFormat.setLineSpacingRule(0);
                    paragraphFormat.setLineSpacing(dZzL);
                    return;
                }
                return;
            }
            double doubleValue2 = ((zzNH) zzl4ZzZVx2).getDoubleValue();
            if (doubleValue2 > 0.0d) {
                zzPT zzptZzSx2 = zzps.zzSx("font-size");
                double dZzW = zzptZzSx2 != null ? zzL5.zzW(zzptZzSx2.zzZWj()) : 12.0d;
                if (com.aspose.words.internal.zzAN.zzL(dZzW, -1.7976931348623157E308d)) {
                    return;
                }
                paragraphFormat.setLineSpacingRule(0);
                paragraphFormat.setLineSpacing(dZzW * doubleValue2);
            }
        }
    }
}
