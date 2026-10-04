package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes6.dex */
final class zzYMN extends zzYMP {
    private static void zzK(ParagraphFormat paragraphFormat, zzPS zzps) {
        double dZzSH = zzps.zzSH("margin-left");
        if (com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
            return;
        }
        paragraphFormat.setLeftIndent(dZzSH);
    }

    private static void zzL(ParagraphFormat paragraphFormat, zzPS zzps) {
        double dZzSH = zzps.zzSH("margin-bottom");
        if (com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
            return;
        }
        zzY(paragraphFormat, dZzSH);
    }

    private static void zzM(ParagraphFormat paragraphFormat, zzPS zzps) {
        double dZzSH = zzps.zzSH("margin-right");
        if (com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
            return;
        }
        paragraphFormat.setRightIndent(dZzSH);
    }

    private static void zzN(ParagraphFormat paragraphFormat, zzPS zzps) {
        double dZzSH = zzps.zzSH("margin-top");
        if (com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
            return;
        }
        zzZ(paragraphFormat, dZzSH);
    }

    private static void zzW(ParagraphFormat paragraphFormat, zzLS zzls) {
        double dZzSH = zzls.zzZUC().zzSH("margin-left");
        double dZzSH2 = zzls.zzZUC().zzSH("margin-right");
        double dZzSH3 = zzls.zzZUC().zzSH("margin-top");
        double dZzSH4 = zzls.zzZUC().zzSH("margin-bottom");
        zzO0 zzo0 = new zzO0();
        if (!com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
            zzo0.setLeft(dZzSH);
        }
        if (!com.aspose.words.internal.zzAN.zzZC(dZzSH2)) {
            zzo0.zzYY(dZzSH2);
        }
        if (!com.aspose.words.internal.zzAN.zzZC(dZzSH3)) {
            zzo0.setTop(dZzSH3);
        }
        if (!com.aspose.words.internal.zzAN.zzZC(dZzSH4)) {
            zzo0.zzYX(dZzSH4);
        }
        zzO0 zzo0Zzk = zzo0.zzk(0, paragraphFormat.getBidi());
        if (zzo0Zzk.zzZW5()) {
            if (paragraphFormat.isListItem()) {
                paragraphFormat.setLeftIndent(paragraphFormat.getLeftIndent() + zzo0Zzk.getLeft());
            } else {
                paragraphFormat.setLeftIndent(zzo0Zzk.getLeft());
            }
        }
        if (zzo0Zzk.zzZW7()) {
            paragraphFormat.setRightIndent(zzo0Zzk.getRight());
        }
        if (zzo0Zzk.zzZW8()) {
            zzZ(paragraphFormat, Math.max(zzo0Zzk.getTop(), 0.0d));
        }
        if (zzo0Zzk.zzZW6()) {
            zzY(paragraphFormat, Math.max(zzo0Zzk.getBottom(), 0.0d));
        }
    }

    private static void zzZ(ParagraphFormat paragraphFormat, double d) {
        if (d > 1584.0d) {
            paragraphFormat.setSpaceBeforeAuto(true);
        } else {
            paragraphFormat.setSpaceBefore(d);
            paragraphFormat.setSpaceBeforeAuto(false);
        }
    }

    @Override // com.aspose.words.zzYMP
    public final void zzY(ParagraphFormat paragraphFormat, zzLS zzls) {
        zzZAS zzzasZzZUw = zzls.zzZUw();
        if ("li".equals(zzzasZzZUw.zzZTQ())) {
            paragraphFormat.setSpaceBefore(5.0d);
            paragraphFormat.setSpaceBeforeAuto(true);
            paragraphFormat.setSpaceAfter(5.0d);
            paragraphFormat.setSpaceAfterAuto(true);
            paragraphFormat.setLineSpacingRule(2);
            paragraphFormat.setLineSpacing(12.0d);
        }
        if (ContextChain.TAG_PRODUCT.equals(zzzasZzZUw.zzZTQ())) {
            String[] strArrZzZ2K = zzzasZzZUw.zzZ2K();
            if (strArrZzZ2K.length > 0 && com.aspose.words.internal.zzZKN.zzX(strArrZzZ2K[0], "msonormal", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
                paragraphFormat.setSpaceBefore(5.0d);
                paragraphFormat.setSpaceBeforeAuto(true);
                paragraphFormat.setSpaceAfter(5.0d);
                paragraphFormat.setSpaceAfterAuto(true);
            }
        }
        zzW(paragraphFormat, zzls);
        zzOF.zzZ(zzls.zzZUC(), paragraphFormat, true);
    }

    @Override // com.aspose.words.zzYMP
    public final void zzY(ParagraphFormat paragraphFormat, zzPS zzps) {
        zzOF.zzZ(zzps, paragraphFormat, true);
        zzN(paragraphFormat, zzps);
        zzM(paragraphFormat, zzps);
        zzL(paragraphFormat, zzps);
        zzK(paragraphFormat, zzps);
    }

    private static void zzY(ParagraphFormat paragraphFormat, double d) {
        if (d <= 1584.0d) {
            paragraphFormat.setSpaceAfter(d);
            paragraphFormat.setSpaceAfterAuto(false);
        } else {
            paragraphFormat.setSpaceAfterAuto(true);
        }
    }
}
