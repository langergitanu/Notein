package com.aspose.words;

import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
final class zzP2 {
    public static void zzZ(zzPS zzps, ParagraphFormat paragraphFormat) {
        String strZzSF = zzps.zzSF("-aw-element-wrap");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzSF)) {
            paragraphFormat.setWrapType(zzZDY.zzJP(strZzSF));
        }
        String strZzSF2 = zzps.zzSF("-aw-element-anchor-vertical");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzSF2)) {
            RefInt refInt = new RefInt(0);
            boolean zZzS = zzZDY.zzS(strZzSF2, refInt);
            int i = refInt.get();
            if (zZzS) {
                paragraphFormat.setRelativeVerticalPosition(i);
            }
        }
        String strZzSF3 = zzps.zzSF("-aw-element-anchor-horizontal");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzSF3)) {
            paragraphFormat.setRelativeHorizontalPosition(zzZDY.zzJO(strZzSF3));
        }
        String strZzSF4 = zzps.zzSF("-aw-height-rule");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzSF4)) {
            paragraphFormat.zzqs(zzZDY.zzJN(strZzSF4));
        }
        if ("locked".equals(com.aspose.words.internal.zzZKN.zzU2(zzps.zzSF("-aw-element-anchor-lock")))) {
            paragraphFormat.zzYov();
        }
        double dZzSH = zzps.zzSH("-aw-element-top");
        if (com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
            String strZzSF5 = zzps.zzSF("-aw-element-top");
            if (com.aspose.words.internal.zzZYD.zzXk(strZzSF5)) {
                paragraphFormat.setVerticalAlignment(zzZDY.zzJL(strZzSF5));
            }
        } else {
            paragraphFormat.zzWr(dZzSH);
        }
        double dZzSH2 = zzps.zzSH("-aw-element-left");
        if (com.aspose.words.internal.zzAN.zzZC(dZzSH2)) {
            String strZzSF6 = zzps.zzSF("-aw-element-left");
            if (com.aspose.words.internal.zzZYD.zzXk(strZzSF6)) {
                paragraphFormat.setHorizontalAlignment(zzZDY.zzJM(strZzSF6));
            }
        } else {
            paragraphFormat.zzWs(dZzSH2);
        }
        double dZzSH3 = zzps.zzSH("-aw-frame-width");
        if (!com.aspose.words.internal.zzAN.zzZC(dZzSH3)) {
            paragraphFormat.zzXd(Math.max(0.0d, dZzSH3));
        }
        double dZzSH4 = zzps.zzSH("-aw-frame-height");
        if (!com.aspose.words.internal.zzAN.zzZC(dZzSH4)) {
            paragraphFormat.zzXc(Math.max(0.0d, dZzSH4));
        }
        double dZzSH5 = zzps.zzSH("-aw-element-frame-hspace");
        if (!com.aspose.words.internal.zzAN.zzZC(dZzSH5)) {
            paragraphFormat.zzWq(Math.max(0.0d, dZzSH5));
        }
        double dZzSH6 = zzps.zzSH("-aw-element-frame-vspace");
        if (com.aspose.words.internal.zzAN.zzZC(dZzSH6)) {
            return;
        }
        paragraphFormat.zzWp(Math.max(0.0d, dZzSH6));
    }
}
