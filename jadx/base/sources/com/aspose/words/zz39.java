package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("sp", "wsp", "cxnSp", "lockedCanvas", "wpc", "grpSp", "wgp", "spTree", "chart", "relIds", "pic", "graphicFrame");

    public static void zzI(zzYU4 zzyu4) {
        zzyu4.zzZ(16777216, 2, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzyu4.getLocalName()));
    }

    private static void zzJ(zzYU4 zzyu4) {
        zzyu4.zzZ(1, 2, com.aspose.words.internal.zzZKN.format("Tag with name '{0}' is not supported.", zzyu4.getLocalName()));
    }

    public static void zzK(zzYU4 zzyu4) {
        zzI(zzyu4);
        zzyu4.zzk();
    }

    public static void zzL(zzYU4 zzyu4) {
        zzJ(zzyu4);
        zzyu4.zzk();
    }

    public static int zzOo(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
                return 0;
            case 1:
                return 8;
            case 2:
                return 1;
            case 3:
                return 5;
            case 4:
                return 10;
            case 5:
                return 3;
            case 6:
                return 9;
            case 7:
                return 4;
            case 8:
                return 6;
            case 9:
                return 7;
            case 10:
                return 2;
            case 11:
                return 12;
            default:
                throw new IllegalArgumentException("Unexpected tag name");
        }
    }

    public static void zzZ(zzYU4 zzyu4, String str) {
        zzyu4.zzZ(16777216, 2, com.aspose.words.internal.zzZKN.format("Shape is ignored due to: {0}", str));
    }
}
