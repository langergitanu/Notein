package com.aspose.words;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
final class zzMQ implements Comparator<String> {
    private static String[] zzZpa = {"size", "width", "height", "margin", "margin-top", "margin-right", "margin-left", "margin-bottom", "text-indent", "text-align", "page-break-before", "page-break-inside", "page-break-after", "line-height", "widows", "orphans", "writing-mode", "border", "border-style", "border-width", "border-color", "border-top", "border-top-style", "border-top-width", "border-top-color", "border-right", "border-right-style", "border-right-width", "border-right-color", "border-left", "border-left-style", "border-left-width", "border-left-color", "border-bottom", "border-bottom-style", "border-bottom-width", "border-bottom-color", "padding", "padding-top", "padding-right", "padding-left", "padding-bottom", "font", "font-family", "font-size", "font-weight", "font-style", "font-variant", "text-decoration", "text-transform", "letter-spacing", "vertical-align", "color", "background", "background-color", "display", "list-style", "list-style-type", "list-style-image", "list-style-position", "src"};
    private static com.aspose.words.internal.zzZQH<String, Integer> zzZpb = new com.aspose.words.internal.zzZQH<>();

    static {
        int i = 0;
        for (String str : zzZpa) {
            i++;
            zzZpb.zzB(str, Integer.valueOf(i));
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
        return compare2(str, str2);
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    private static int compare2(String str, String str2) {
        int iIntValue = ((Integer) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZQH<String, int>) zzZpb, str, Integer.MAX_VALUE)).intValue();
        int iIntValue2 = ((Integer) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZQH<String, int>) zzZpb, str2, Integer.MAX_VALUE)).intValue();
        if (iIntValue != Integer.MAX_VALUE || iIntValue2 != Integer.MAX_VALUE) {
            return com.aspose.words.internal.zzZKR.zzZ7(iIntValue, iIntValue2);
        }
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        boolean zZzS = com.aspose.words.internal.zzZKN.zzS(str, "-aw-", i);
        return zZzS == com.aspose.words.internal.zzZKN.zzS(str2, "-aw-", i) ? com.aspose.words.internal.zzZKN.zzU(str, str2, com.aspose.words.internal.zzZOF.INVARIANT_CULTURE$4894b8c8) : zZzS ? -1 : 1;
    }
}
