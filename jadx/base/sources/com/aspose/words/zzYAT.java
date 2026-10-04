package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYAT extends zzYA3 {
    private zzYAT zzXcT;
    private Node zzXcU;

    public zzYAT(Node node) {
        super(0);
        this.zzXcU = node;
    }

    private BookmarkEnd zzY6e() {
        Node node = this.zzXcU;
        if (node instanceof BookmarkEnd) {
            return (BookmarkEnd) node;
        }
        return null;
    }

    private BookmarkStart zzY6f() {
        Node node = this.zzXcU;
        if (node instanceof BookmarkStart) {
            return (BookmarkStart) node;
        }
        return null;
    }

    public final String getName() {
        return zzY6f() != null ? zzY6f().getName() : zzY6e().getName();
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY71() throws Exception {
        zzYAT zzyat = new zzYAT(this.zzXcU);
        zzZB(zzyat);
        return zzyat;
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY7o() {
        return this.zzXcT;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzYol() {
        return true;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZ1s() {
        return zzY6f() != null ? 2 : 3;
    }

    @Override // com.aspose.words.zzYAU
    public final void zzZC(zzYAU zzyau) {
        this.zzXcT = (zzYAT) zzyau;
    }

    public final Node zzZcG() {
        return this.zzXcU;
    }
}
