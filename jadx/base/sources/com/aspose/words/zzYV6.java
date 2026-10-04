package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYV6 {
    public static void zzZ(FontInfo fontInfo, zzYU6 zzyu6) {
        if (com.aspose.words.internal.zzZYD.zzXk(fontInfo.getAltName())) {
            String altName = fontInfo.getAltName();
            if (altName.contains("\u0000")) {
                altName = altName.substring(0, com.aspose.words.internal.zzZKN.zzT(altName, "\u0000", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8));
            }
            zzyu6.zzYz("w:altName", altName);
        }
    }
}
