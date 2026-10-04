package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class FootnoteOptions implements zzZAU {
    private zzZ9E zzYKZ;

    public FootnoteOptions(zzZ9E zzz9e) {
        this.zzYKZ = zzz9e;
    }

    private Object zzPj(int i) {
        return this.zzYKZ.fetchSectionAttr(i);
    }

    private void zzQ(int i, Object obj) {
        this.zzYKZ.setSectionAttr(i, obj);
    }

    public final int getColumns() {
        return ((Integer) zzPj(2540)).intValue();
    }

    @Override // com.aspose.words.zzZAU
    @ReservedForInternalUse
    @Deprecated
    public final int getLocation() {
        return getPosition();
    }

    @Override // com.aspose.words.zzZAU
    public final int getNumberStyle() {
        return ((Integer) zzPj(2530)).intValue();
    }

    public final int getPosition() {
        return ((Integer) zzPj(2500)).intValue();
    }

    @Override // com.aspose.words.zzZAU
    public final int getRestartRule() {
        return ((Integer) zzPj(2510)).intValue();
    }

    @Override // com.aspose.words.zzZAU
    public final int getStartNumber() {
        return ((Integer) zzPj(2520)).intValue();
    }

    public final void setColumns(int i) {
        zzQ(2540, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZAU
    @ReservedForInternalUse
    @Deprecated
    public final void setLocation(int i) {
        setPosition(i);
    }

    @Override // com.aspose.words.zzZAU
    public final void setNumberStyle(int i) {
        zzQ(2530, Integer.valueOf(i));
    }

    public final void setPosition(int i) {
        zzQ(2500, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZAU
    public final void setRestartRule(int i) {
        zzQ(2510, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZAU
    public final void setStartNumber(int i) {
        zzQ(2520, Integer.valueOf(i));
    }
}
