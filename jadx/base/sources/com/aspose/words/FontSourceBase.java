package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class FontSourceBase implements com.aspose.words.internal.zzGP {
    private int zzA5;
    private IWarningCallback zzZG0;

    public FontSourceBase() {
        this(0);
    }

    public ArrayList<PhysicalFontInfo> getAvailableFonts() {
        ArrayList<PhysicalFontInfo> arrayList = new ArrayList<>();
        for (com.aspose.words.internal.zzJU zzju : new com.aspose.words.internal.zzKJ(new com.aspose.words.internal.zzGP[]{this}).zzIj()) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, new PhysicalFontInfo(zzju.getFontFamilyName(), zzju.zzHF(), zzju.getVersion(), zzju.zzHL().getFilePath()));
        }
        return arrayList;
    }

    @Override // com.aspose.words.internal.zzGP
    @ReservedForInternalUse
    @Deprecated
    public Iterable<com.aspose.words.internal.zzGR> getFontDataInternal() {
        return null;
    }

    public int getPriority() {
        return this.zzA5;
    }

    @Override // com.aspose.words.internal.zzGP
    @ReservedForInternalUse
    @Deprecated
    public int getPriorityInternal() {
        return this.zzA5;
    }

    public abstract int getType();

    public IWarningCallback getWarningCallback() {
        return this.zzZG0;
    }

    public void setWarningCallback(IWarningCallback iWarningCallback) {
        this.zzZG0 = iWarningCallback;
    }

    public FontSourceBase(int i) {
        this.zzA5 = i;
    }
}
