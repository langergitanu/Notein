package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzY9Y extends zzYAL {
    private StructuredDocumentTag zzXbx;
    private zzY9Y zzXby;
    private int zzXbz;
    private int zzZch;

    public zzY9Y(StructuredDocumentTag structuredDocumentTag) {
        this.zzXbx = structuredDocumentTag;
    }

    private static int zzlC(int i) {
        if (i == 4 || i == 5) {
            return 2;
        }
        switch (i) {
            case 11:
            case 12:
                return 0;
            case 13:
                return 1;
            default:
                return 255;
        }
    }

    @Override // com.aspose.words.zzYAL
    public final boolean isChecked() throws Exception {
        return zzYRH() == 1 && this.zzXbx.zzY3S();
    }

    public final boolean isEmpty() {
        int i = this.zzZch;
        return i != 2 ? i == 3 && ((zzYAU) zzYo0()) == this.zzXby : ((zzYAU) zzYo1()) == this.zzXby;
    }

    public final boolean zzY59() {
        int i = this.zzZch;
        boolean z = (i == 3 && this.zzXbz >= this.zzXby.zzXbz) || (i == 2 && this.zzXbz > this.zzXby.zzXbz);
        if (!z) {
            this.zzXbz++;
            return z;
        }
        this.zzXby.zzXbz++;
        return z;
    }

    public final boolean zzY5a() throws Exception {
        return zzYRH() != 255;
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY71() throws Exception {
        zzY9Y zzy9y = new zzY9Y(this.zzXbx);
        zzy9y.zzZch = this.zzZch;
        zzZB(zzy9y);
        return zzy9y;
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY7o() {
        return this.zzXby;
    }

    @Override // com.aspose.words.zzYAL
    public final int zzYRH() {
        return zzlC(this.zzXbx.getSdtType());
    }

    public final StructuredDocumentTag zzYRv() {
        return this.zzXbx;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzYol() {
        return true;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZ1s() {
        return this.zzZch;
    }

    @Override // com.aspose.words.zzYAU
    public final void zzZC(zzYAU zzyau) {
        this.zzXby = (zzY9Y) zzyau;
    }

    public final void zzlD(int i) {
        this.zzZch = i;
    }
}
