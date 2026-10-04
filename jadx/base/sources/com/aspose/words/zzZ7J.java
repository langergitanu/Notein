package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7J {
    private boolean zzYhz;
    private IWarningCallback zzZG0;
    private int zzjZ;

    public zzZ7J(SaveOptions saveOptions, IWarningCallback iWarningCallback, zzYO3 zzyo3) {
        OoxmlSaveOptions ooxmlSaveOptions = (OoxmlSaveOptions) com.aspose.words.internal.zzZKW.zzZ(saveOptions, OoxmlSaveOptions.class);
        this.zzjZ = zzYO3.zzZ(zzyo3, ooxmlSaveOptions);
        this.zzYhz = ooxmlSaveOptions != null && ooxmlSaveOptions.zzYqW();
        this.zzZG0 = iWarningCallback;
    }

    private void zz2(String str) {
        IWarningCallback iWarningCallback = this.zzZG0;
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, 65536, 9, str);
        }
    }

    private void zzC(Border border) {
        if (border.zz8T()) {
            border.setLineStyle(zzy8(border.getLineStyle()));
        }
    }

    private static String zzW(boolean z, int i) {
        return z ? "1" : (i == 12 || i == 14 || i == 0) ? "0" : "1";
    }

    private boolean zzYUL() {
        return this.zzjZ != 0;
    }

    private static void zzZ(CompatibilityOptions compatibilityOptions, String str, String str2, String str3, boolean z) {
        zzKR zzkrZzRZ = compatibilityOptions.zzZYT().zzRZ(str);
        if (zzkrZzRZ == null) {
            compatibilityOptions.zzZYT().zzZ(new zzKR(str, str2, str3));
        } else if (z) {
            zzkrZzRZ.setValue(str3);
        }
    }

    private int zzy8(int i) {
        int iZzqQ = zzYUL() ? zzYNC.zzqQ(i) : i >= 228 ? i != 228 ? i != 235 ? zzYNC.zzqR(i) : 214 : 121 : i;
        if (iZzqQ != i) {
            zz2("Replaced PageBorderArt value with ISO29500-compliant.");
        }
        return iZzqQ;
    }

    public final void zzP(Section section) {
        zzC(section.zzYvR().zz5A());
        zzC(section.zzYvR().zz5z());
        zzC(section.zzYvR().zz5y());
        zzC(section.zzYvR().zz5x());
    }

    public final void zzS(CompatibilityOptions compatibilityOptions) {
        boolean z = this.zzYhz && compatibilityOptions.getMswVersion() < 15 && this.zzjZ == 2;
        if (z) {
            compatibilityOptions.setMswVersion(15);
        }
        if (compatibilityOptions.getMswVersion() >= 11) {
            zzZ(compatibilityOptions, "compatibilityMode", "http://schemas.microsoft.com/office/word", com.aspose.words.internal.zzJB.zzWD(compatibilityOptions.getMswVersion()), z);
        }
        if (zzYUL() || compatibilityOptions.getMswVersion() >= 15) {
            zzZ(compatibilityOptions, "overrideTableStyleFontSizeAndJustification", "http://schemas.microsoft.com/office/word", zzW(z, compatibilityOptions.getMswVersion()), z);
            zzZ(compatibilityOptions, "enableOpenTypeFeatures", "http://schemas.microsoft.com/office/word", "1", z);
            zzZ(compatibilityOptions, "doNotFlipMirrorIndents", "http://schemas.microsoft.com/office/word", "1", z);
            zzZ(compatibilityOptions, "differentiateMultirowTableHeaders", "http://schemas.microsoft.com/office/word", "1", z);
        }
    }
}
