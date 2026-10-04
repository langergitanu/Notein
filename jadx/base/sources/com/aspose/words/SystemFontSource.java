package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class SystemFontSource extends FontSourceBase implements com.aspose.words.internal.zzGP {
    public SystemFontSource() {
    }

    public static String[] getSystemFontFolders() throws Exception {
        return com.aspose.words.internal.zzZXS.zzqa();
    }

    @Override // com.aspose.words.FontSourceBase, com.aspose.words.internal.zzGP
    @ReservedForInternalUse
    @Deprecated
    public Iterable<com.aspose.words.internal.zzGR> getFontDataInternal() {
        return com.aspose.words.internal.zzZXS.zzY(new zzY21(getWarningCallback()));
    }

    @Override // com.aspose.words.FontSourceBase
    public int getType() {
        return 3;
    }

    public SystemFontSource(int i) {
        super(i);
    }
}
