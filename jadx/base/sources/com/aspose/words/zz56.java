package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz56 {
    private static com.aspose.words.internal.zzD3<String> zzZ1c;
    private static com.aspose.words.internal.zzD3<String> zzZ1d = new com.aspose.words.internal.zzD3<>();

    static {
        zzZyq();
        zzZ1c = new com.aspose.words.internal.zzD3<>();
        zzZyp();
    }

    public static String zz9(int i, boolean z) {
        if (i != 2 && i != 13) {
            switch (i) {
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected DrawingML type.");
            }
        }
        return z ? zzZ1c.get(i) : zzZ1d.get(i);
    }

    public static String zzZl(String str, String str2) {
        return !"w14".equals(str) ? str2 : com.aspose.words.internal.zzZKN.format("{0}:{1}", str, str2);
    }

    private static void zzZyp() {
        zzZ1c.set(6, "http://purl.oclc.org/ooxml/drawingml/chart");
        zzZ1c.set(13, "http://schemas.microsoft.com/office/drawing/2014/chartex");
        zzZ1c.set(7, "http://purl.oclc.org/ooxml/drawingml/diagram");
        zzZ1c.set(5, "http://purl.oclc.org/ooxml/drawingml/lockedCanvas");
        zzZ1c.set(2, "http://purl.oclc.org/ooxml/drawingml/picture");
        zzZ1c.set(10, "http://schemas.microsoft.com/office/word/2010/wordprocessingCanvas");
        zzZ1c.set(9, "http://schemas.microsoft.com/office/word/2010/wordprocessingGroup");
        zzZ1c.set(8, "http://schemas.microsoft.com/office/word/2010/wordprocessingShape");
        zzZ1c.set(11, "http://schemas.microsoft.com/office/word/2010/wordprocessingInk");
    }

    private static void zzZyq() {
        zzZ1d.set(6, "http://schemas.openxmlformats.org/drawingml/2006/chart");
        zzZ1d.set(13, "http://schemas.microsoft.com/office/drawing/2014/chartex");
        zzZ1d.set(7, "http://schemas.openxmlformats.org/drawingml/2006/diagram");
        zzZ1d.set(5, "http://schemas.openxmlformats.org/drawingml/2006/lockedCanvas");
        zzZ1d.set(2, "http://schemas.openxmlformats.org/drawingml/2006/picture");
        zzZ1d.set(10, "http://schemas.microsoft.com/office/word/2010/wordprocessingCanvas");
        zzZ1d.set(9, "http://schemas.microsoft.com/office/word/2010/wordprocessingGroup");
        zzZ1d.set(8, "http://schemas.microsoft.com/office/word/2010/wordprocessingShape");
        zzZ1d.set(11, "http://schemas.microsoft.com/office/word/2010/wordprocessingInk");
    }
}
