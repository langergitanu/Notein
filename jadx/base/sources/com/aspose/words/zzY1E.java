package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1E {
    public static void zzZ(Document document, zzY1S zzy1s) {
        zzy1s.zzY("w:fonts");
        zzy1s.zzY("w:defaultFonts");
        zzYEF zzyefZzY37 = document.getStyles().zzY37();
        Theme themeZzZqI = document.zzZqI();
        zzy1s.zzX("w:ascii", zzU1.zzZ(zzyefZzY37.zzYdS(), themeZzZqI));
        zzy1s.zzX("w:fareast", zzU1.zzZ(zzyefZzY37.zzYdR(), themeZzZqI));
        zzy1s.zzX("w:h-ansi", zzU1.zzZ(zzyefZzY37.zzYdQ(), themeZzZqI));
        zzy1s.zzX("w:cs", zzU1.zzZ(zzyefZzY37.zzYdP(), themeZzZqI));
        zzy1s.zzp();
        for (FontInfo fontInfo : document.getFontInfos()) {
            zzy1s.zzY("w:font");
            zzy1s.zzX("w:name", fontInfo.getName());
            zzYV6.zzZ(fontInfo, zzy1s);
            if (fontInfo.getPanose() != null) {
                zzy1s.zzYz("w:panose-1", com.aspose.words.internal.zzZYD.zzZ8(fontInfo.getPanose()));
            }
            zzy1s.zzYz("w:charset", com.aspose.words.internal.zzJB.zzWw(fontInfo.getCharset()));
            zzy1s.zzYz("w:family", zzY1K.zzhZ(fontInfo.getFamily()));
            if (!fontInfo.isTrueType()) {
                zzy1s.zzZ("w:notTrueType", (String) null);
            }
            zzy1s.zzYz("w:pitch", zzY8T.zzkS(fontInfo.getPitch()));
            if (fontInfo.zzZ74() != null) {
                zzy1s.zzY("w:sig");
                zzy1s.zzX("w:usb-0", zzYU3.zzn(fontInfo.zzZ74(), 0));
                zzy1s.zzX("w:usb-1", zzYU3.zzn(fontInfo.zzZ74(), 4));
                zzy1s.zzX("w:usb-2", zzYU3.zzn(fontInfo.zzZ74(), 8));
                zzy1s.zzX("w:usb-3", zzYU3.zzn(fontInfo.zzZ74(), 12));
                zzy1s.zzX("w:csb-0", zzYU3.zzn(fontInfo.zzZ74(), 16));
                zzy1s.zzX("w:csb-1", zzYU3.zzn(fontInfo.zzZ74(), 20));
                zzy1s.zzp();
            }
            zzy1s.zzp();
        }
        zzy1s.zzp();
        if (document.zzZpV().zzYWy) {
            zzY1Z.zzZ(document.getWarningCallback(), 262144, 13, "Fonts are not embedded, as it is not supported for {0} file format.", "WML");
        }
    }
}
