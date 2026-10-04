package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class EndnoteOptions implements zzZAU {
    private zzZ9E zzYKZ;

    public EndnoteOptions(zzZ9E zzz9e) {
        this.zzYKZ = zzz9e;
    }

    private Object zzPj(int i) {
        return this.zzYKZ.fetchSectionAttr(i);
    }

    private void zzQ(int i, Object obj) {
        this.zzYKZ.setSectionAttr(i, obj);
    }

    @Override // com.aspose.words.zzZAU
    @ReservedForInternalUse
    @Deprecated
    public final int getLocation() {
        return getPosition();
    }

    @Override // com.aspose.words.zzZAU
    public final int getNumberStyle() {
        return ((Integer) zzPj(2630)).intValue();
    }

    public final int getPosition() {
        return ((Integer) zzPj(2600)).intValue();
    }

    @Override // com.aspose.words.zzZAU
    public final int getRestartRule() {
        return ((Integer) zzPj(2610)).intValue();
    }

    @Override // com.aspose.words.zzZAU
    public final int getStartNumber() {
        return ((Integer) zzPj(2620)).intValue();
    }

    @Override // com.aspose.words.zzZAU
    @ReservedForInternalUse
    @Deprecated
    public final void setLocation(int i) {
        setPosition(i);
    }

    @Override // com.aspose.words.zzZAU
    public final void setNumberStyle(int i) {
        zzQ(2630, Integer.valueOf(i));
    }

    public final void setPosition(int i) {
        zzQ(2600, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZAU
    public final void setRestartRule(int i) {
        zzQ(2610, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZAU
    public final void setStartNumber(int i) {
        zzQ(2620, Integer.valueOf(i));
    }
}
