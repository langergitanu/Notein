package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNP implements zzZ8R {
    private int zzYyb;
    private int zzYyc;

    public zzZNP(int i, int i2) {
        this.zzYyc = i;
        this.zzYyb = i2;
    }

    public final int getType() {
        return zzZOO.zzCI(this.zzYyb);
    }

    public final boolean isDirty() {
        return (this.zzYyb & 4) != 0;
    }

    public final boolean isLocked() {
        return (this.zzYyb & 16) != 0;
    }

    public final boolean isPrivate() {
        return (this.zzYyb & 32) != 0;
    }

    public final void zzVK(boolean z) {
        this.zzYyb = ((byte) com.aspose.words.internal.zzXU.zzZ(this.zzYyb, 128, z)) & 255;
    }

    @Override // com.aspose.words.zzZ8R
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.writeByte((byte) this.zzYyc);
        zzzow.writeByte((byte) this.zzYyb);
    }

    public final void zzZ9b() {
        this.zzYyb = ((byte) com.aspose.words.internal.zzXU.zzZ(this.zzYyb, 8, true)) & 255;
    }

    public final void isDirty(boolean z) {
        this.zzYyb = ((byte) com.aspose.words.internal.zzXU.zzZ(this.zzYyb, 4, z)) & 255;
    }

    public final void isLocked(boolean z) {
        this.zzYyb = ((byte) com.aspose.words.internal.zzXU.zzZ(this.zzYyb, 16, z)) & 255;
    }

    public zzZNP(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYyc = zzzox.readByte() & 255;
        this.zzYyb = zzzox.readByte() & 255;
    }
}
