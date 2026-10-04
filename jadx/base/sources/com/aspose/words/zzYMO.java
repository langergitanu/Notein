package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYMO extends zzYMP {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("h1", "h2", "h3", "h4", "h5", "h6");
    private boolean zzZo9;

    public zzYMO(boolean z) {
        this.zzZo9 = z;
    }

    private static double zzW(zzPS zzps, String str) {
        double dZzSH = zzps.zzSH(str);
        if (com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
            return 0.0d;
        }
        return dZzSH;
    }

    private static void zzX(ParagraphFormat paragraphFormat, zzLS zzls) {
        int iZzTP = zzUR.zzTP(zzls.zzZUw().zzZTQ());
        if (iZzTP == 0) {
            paragraphFormat.setOutlineLevel(0);
            return;
        }
        if (iZzTP == 1) {
            paragraphFormat.setOutlineLevel(1);
            return;
        }
        if (iZzTP == 2) {
            paragraphFormat.setOutlineLevel(2);
            return;
        }
        if (iZzTP == 3) {
            paragraphFormat.setOutlineLevel(3);
        } else if (iZzTP == 4) {
            paragraphFormat.setOutlineLevel(4);
        } else {
            if (iZzTP != 5) {
                return;
            }
            paragraphFormat.setOutlineLevel(5);
        }
    }

    private static void zzZ(zzO0 zzo0, ParagraphFormat paragraphFormat, int i) {
        zzO0 zzo0Zzk = zzo0.zzk(i, paragraphFormat.getBidi());
        if (!paragraphFormat.isListItem() && (zzo0Zzk.zzZW5() || !com.aspose.words.internal.zzAN.zzZD(zzo0Zzk.getLeft()))) {
            paragraphFormat.setLeftIndent(zzo0Zzk.getLeft());
        }
        if (zzo0Zzk.zzZW7() || !com.aspose.words.internal.zzAN.zzZD(zzo0Zzk.getRight())) {
            paragraphFormat.setRightIndent(zzo0Zzk.getRight());
        }
        if (zzo0Zzk.zzZW8() || !com.aspose.words.internal.zzAN.zzZD(zzo0Zzk.getTop())) {
            paragraphFormat.setSpaceBefore(com.aspose.words.internal.zzAN.zzR(zzo0Zzk.getTop(), 0.0d, 1584.0d));
        }
        if (zzo0Zzk.zzZW6() || !com.aspose.words.internal.zzAN.zzZD(zzo0Zzk.getBottom())) {
            paragraphFormat.setSpaceAfter(com.aspose.words.internal.zzAN.zzR(zzo0Zzk.getBottom(), 0.0d, 1584.0d));
        }
    }

    @Override // com.aspose.words.zzYMP
    public final void zzY(ParagraphFormat paragraphFormat, zzLS zzls) {
        zzO0 zzo0ZzZWO;
        zzOF.zzZ(zzls.zzZUC(), paragraphFormat, false);
        if (this.zzZo9) {
            double dZzW = zzW(zzls.zzZUC(), "margin-left");
            double dZzW2 = zzW(zzls.zzZUC(), "margin-right");
            double dZzW3 = zzW(zzls.zzZUC(), "margin-top");
            double dZzW4 = zzW(zzls.zzZUC(), "margin-bottom");
            zzo0ZzZWO = new zzO0();
            if (!com.aspose.words.internal.zzAN.zzZD(dZzW)) {
                zzo0ZzZWO.setLeft(dZzW);
            }
            if (!com.aspose.words.internal.zzAN.zzZD(dZzW2)) {
                zzo0ZzZWO.zzYY(dZzW2);
            }
            if (!com.aspose.words.internal.zzAN.zzZD(dZzW3)) {
                zzo0ZzZWO.setTop(dZzW3);
            }
            if (!com.aspose.words.internal.zzAN.zzZD(dZzW4)) {
                zzo0ZzZWO.zzYX(dZzW4);
            }
        } else {
            zzo0ZzZWO = zzls.zzZUx().zzZWO();
        }
        zzZ(zzo0ZzZWO, paragraphFormat, zzls.zzZUR());
        zzX(paragraphFormat, zzls);
    }

    @Override // com.aspose.words.zzYMP
    public final void zzY(ParagraphFormat paragraphFormat, zzPS zzps) {
        zzOF.zzZ(zzps, paragraphFormat, false);
    }
}
