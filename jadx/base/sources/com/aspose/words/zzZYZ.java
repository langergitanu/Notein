package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYZ implements com.aspose.words.internal.zzH3, Cloneable {
    private Document zzZEY;
    private com.aspose.words.internal.zzIM<String> zzYRU = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzZYI zzYRT = new com.aspose.words.internal.zzZYI();

    public zzZYZ(Document document) {
        this.zzZEY = document;
    }

    private void zzK(String str, String str2, String str3) {
        if (this.zzZEY.getWarningCallback() == null) {
            return;
        }
        zzY0(com.aspose.words.internal.zzZKN.format("Font '{0}' has not been found. Using '{1}' font instead. Reason: {2}.", str, str2, str3));
    }

    private void zzY0(String str) {
        if (this.zzYRU.contains(str)) {
            return;
        }
        OooO00o.OooO0O0(this.zzZEY.getWarningCallback(), 131072, 1, str);
        this.zzYRU.add(str);
    }

    @Override // com.aspose.words.internal.zzGQ
    public final com.aspose.words.internal.zzZXH zzN(String str, int i) {
        com.aspose.words.internal.zzZXH zzzxhZzO = zzO(str, i);
        if (zzzxhZzO != null) {
            return zzzxhZzO;
        }
        FontInfo fontInfoZzO5 = zzO5(str);
        com.aspose.words.internal.zzZXH zzzxhZzV = this.zzZEY.zzZqz().zzV(str, i, fontInfoZzO5);
        if (zzzxhZzV != null) {
            zzK(str, zzzxhZzV.zzPh(), "font name substitution");
            return zzzxhZzV;
        }
        com.aspose.words.internal.zzZXH zzzxhZzW = this.zzZEY.zzZqz().zzW(str, i, fontInfoZzO5);
        if (zzzxhZzW != null) {
            zzK(str, zzzxhZzW.zzPh(), "fontconfig substitution");
            return zzzxhZzW;
        }
        com.aspose.words.internal.zzZXH zzzxhZzZ = this.zzZEY.zzZqz().zzZ(str, i, fontInfoZzO5);
        if (zzzxhZzZ != null) {
            zzK(str, zzzxhZzZ.zzPh(), "table substitution");
            return zzzxhZzZ;
        }
        com.aspose.words.internal.zzZXH zzzxhZzY = this.zzZEY.zzZqz().zzY(str, i, fontInfoZzO5);
        if (zzzxhZzY != null) {
            zzK(str, zzzxhZzY.zzPh(), "font info substitution");
            return zzzxhZzY;
        }
        com.aspose.words.internal.zzZXH zzzxhZzX = this.zzZEY.zzZqz().zzX(str, i, fontInfoZzO5);
        if (zzzxhZzX != null) {
            zzK(str, zzzxhZzX.zzPh(), "default font substitution");
            return zzzxhZzX;
        }
        com.aspose.words.internal.zzZXH zzzxhZzIk = this.zzZEY.zzZqz().zzIk();
        if (zzzxhZzIk == null) {
            throw new IllegalStateException("Cannot find any fonts in specified font sources.");
        }
        zzK(str, zzzxhZzIk.zzPh(), "first available font");
        return zzzxhZzIk;
    }

    @Override // com.aspose.words.internal.zzGQ
    public final com.aspose.words.internal.zzZXH zzO(String str, int i) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return null;
        }
        FontInfo fontInfoZzO5 = zzO5(str);
        com.aspose.words.internal.zzZXH zzzxhZzV = this.zzZEY.zzZqz().zzV(str, i);
        if (zzzxhZzV != null) {
            return zzzxhZzV;
        }
        com.aspose.words.internal.zzZXH zzzxhZzZ = zzZ(fontInfoZzO5, i);
        if (zzzxhZzZ != null) {
            return zzzxhZzZ;
        }
        String altName = fontInfoZzO5 == null ? "" : fontInfoZzO5.getAltName();
        com.aspose.words.internal.zzZXH zzzxhZzV2 = this.zzZEY.zzZqz().zzV(altName, i);
        if (zzzxhZzV2 == null) {
            return null;
        }
        zzK(str, altName, "alternative name from document");
        return zzzxhZzV2;
    }

    public final String zzO4(String str) {
        com.aspose.words.internal.zzZXH zzzxhZzO = zzO(str, 0);
        if (zzzxhZzO != null) {
            return zzzxhZzO.zzPh();
        }
        if (this.zzZEY.getFontSettings() != null) {
            FontInfo fontInfoZzO5 = zzO5(str);
            com.aspose.words.internal.zzZXH zzzxhZzW = this.zzZEY.getFontSettings().zzW(str, 0, fontInfoZzO5);
            if (zzzxhZzW == null) {
                zzzxhZzW = this.zzZEY.getFontSettings().zzZ(str, 0, fontInfoZzO5);
            }
            zzzxhZzO = zzzxhZzW == null ? this.zzZEY.getFontSettings().zzY(str, 0, fontInfoZzO5) : zzzxhZzW;
        }
        if (zzzxhZzO != null) {
            return str;
        }
        return null;
    }

    public final FontInfo zzO5(String str) {
        for (FontInfo fontInfo : this.zzZEY.getFontInfos()) {
            if (com.aspose.words.internal.zzZYD.zzh(fontInfo.getName(), str)) {
                return fontInfo;
            }
        }
        return null;
    }

    public final void zzU(com.aspose.words.internal.zzZYI zzzyi) {
        this.zzYRT = zzzyi;
    }

    @Override // com.aspose.words.internal.zzH3
    public final com.aspose.words.internal.zzPM zzY(String str, float f, int i) {
        return zzZ(str, f, i, i, false);
    }

    public final com.aspose.words.internal.zzPM zzZ(String str, float f, int i, int i2, boolean z) {
        return zzZ(str, f, i, i2, false, true, z, false, false, false);
    }

    public final com.aspose.words.internal.zzZYI zzZpj() {
        return this.zzYRT;
    }

    public final com.aspose.words.internal.zzPM zzZ(String str, float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return zzZ(str, f, i, i2, z, true, z2, z3, z4, z5);
    }

    public final com.aspose.words.internal.zzPM zzZ(String str, float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        return new com.aspose.words.internal.zzPM(f, i, zzN(str, i2), z, z2, z3, z4, z5, z6);
    }

    private static com.aspose.words.internal.zzZXH zzZ(FontInfo fontInfo, int i) {
        if (fontInfo == null) {
            return null;
        }
        com.aspose.words.internal.zzZXH zzzxhZzBd = fontInfo.zzBd(i);
        if (zzzxhZzBd != null) {
            return zzzxhZzBd;
        }
        com.aspose.words.internal.zzZXH zzzxhZzBd2 = fontInfo.zzBd(i & (-3));
        if (zzzxhZzBd2 != null) {
            return zzzxhZzBd2;
        }
        com.aspose.words.internal.zzZXH zzzxhZzBd3 = fontInfo.zzBd(i & (-2));
        if (zzzxhZzBd3 != null) {
            return zzzxhZzBd3;
        }
        com.aspose.words.internal.zzZXH zzzxhZzBd4 = fontInfo.zzBd(0);
        return zzzxhZzBd4 != null ? zzzxhZzBd4 : fontInfo.zzZ7a();
    }

    @Override // com.aspose.words.internal.zzGQ
    public final com.aspose.words.internal.zzZXH zzZ(com.aspose.words.internal.zzZXH zzzxh, int i, boolean z) {
        return this.zzZEY.zzZqz().getFallbackSettings().zzHv().zzZ(zzzxh, i, z, this);
    }
}
