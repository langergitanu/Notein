package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZP {
    private static int zzPb(int i) {
        switch (i) {
            case 26:
            case 27:
            case 28:
            case 29:
                return 1;
            default:
                return 3;
        }
    }

    public static int zzU(Node node) {
        Footnote footnote = (Footnote) com.aspose.words.internal.zzZKW.zzZ(node, Footnote.class);
        if (footnote != null) {
            return zzPb(zzZ(footnote));
        }
        return 3;
    }

    public static void zzY(zzZ39 zzz39, int i) {
        if (zzz39 == null) {
            return;
        }
        int wrapType = zzz39.getWrapType();
        if (wrapType == 0) {
            zzz39.setWrapType(2);
        } else if (wrapType == 3 && i != 8) {
            zzz39.setWrapType(1);
        }
    }

    private static int zzZ(Footnote footnote) {
        Section section = (Section) com.aspose.words.internal.zzZKW.zzZ(footnote.getAncestor(2), Section.class);
        if (section == null) {
            return 255;
        }
        zzYCZ zzyczZzYvR = section.zzYvR();
        int footnoteType = footnote.getFootnoteType();
        if (footnoteType == 0) {
            return zzyczZzYvR.zzYci();
        }
        if (footnoteType != 1) {
            return 255;
        }
        return zzyczZzYvR.zzYcf();
    }
}
