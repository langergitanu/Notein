package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZF5 {
    private static Style zzYlR = Style.zzl6(2);
    private HashMap<zzZF4, Style> zzYlQ = new HashMap<>();

    public static boolean zzT(Style style) {
        return style == zzYlR;
    }

    public final Style zzZ(zzMD zzmd, int i) {
        return (Style) com.aspose.words.internal.zzQW.zzZ(this.zzYlQ, new zzZF4(zzmd, i));
    }

    public final void zzZ(zzMD zzmd, int i, Style style) {
        zzZF4 zzzf4 = new zzZF4(zzmd, i);
        if (style == null) {
            style = zzYlR;
        }
        com.aspose.words.internal.zzZQF.zzY(this.zzYlQ, zzzf4, style);
    }
}
