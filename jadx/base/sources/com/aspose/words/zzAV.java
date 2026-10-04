package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzAV extends zz53 implements zzZCL {
    private boolean zzZ7t;
    private zz8S zzZ7u;
    private zzAT zzZ7v;
    private zzAM zzZ7w;
    private zz9L zzZ7x;

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final String getAlternativeText() {
        return zzZyb().isTopLevel() ? super.getAlternativeText() : "";
    }

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final boolean getAspectRatioLocked() {
        return zzZyb().isTopLevel() && super.getAspectRatioLocked();
    }

    @Override // com.aspose.words.zzZCL
    public final zz7X getFill() {
        return this.zzZ7w.zzZEo().getFill();
    }

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final boolean getHidden() {
        return zzZyb().isTopLevel() && super.getHidden();
    }

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final String getName() {
        return zzZyb().isTopLevel() ? super.getName() : "";
    }

    @Override // com.aspose.words.zzZCL
    public final zz4G getOutline() {
        return this.zzZ7w.zzZEp().getOutline();
    }

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final String getTitle() {
        return zzZyb().isTopLevel() ? super.getTitle() : "";
    }

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final void setAlternativeText(String str) {
        if (zzZyb().isTopLevel()) {
            super.setAlternativeText(str);
        }
    }

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final void setAspectRatioLocked(boolean z) {
        if (zzZyb().isTopLevel()) {
            super.setAspectRatioLocked(z);
        }
    }

    @Override // com.aspose.words.zzZCL
    public final void setFill(zz7X zz7x) {
        this.zzZ7w.zzZEo().setFill(zz7x);
    }

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final void setName(String str) {
        if (zzZyb().isTopLevel()) {
            super.setName(str);
        }
    }

    @Override // com.aspose.words.zzZCL
    public final void setOutline(zz4G zz4g) {
        this.zzZ7w.zzZEp().setOutline(zz4g);
    }

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final void setTitle(String str) {
        if (zzZyb().isTopLevel()) {
            super.setTitle(str);
        }
    }

    public final void zzW(zz50 zz50Var) throws Exception {
        new zz91(this).zzW(zz50Var);
    }

    @Override // com.aspose.words.zzZCL
    public final void zzZ(zz1K zz1k) {
    }

    public final boolean zzZEO() {
        return this.zzZ7t;
    }

    public final zzAT zzZEP() {
        return this.zzZ7v;
    }

    public final zz8S zzZEQ() {
        return this.zzZ7u;
    }

    public final zzAM zzZER() {
        return this.zzZ7w;
    }

    public final zz9L zzZES() {
        return this.zzZ7x;
    }

    @Override // com.aspose.words.zz53
    public final int zzZHY() {
        return 7;
    }

    @Override // com.aspose.words.zzZCL
    public final zz1K zzZTj() {
        return null;
    }

    public final void zzZ(zz9L zz9l) {
        this.zzZ7x = zz9l;
    }

    public final void zzZ(zzAM zzam) {
        this.zzZ7w = zzam;
    }

    public final void zzZ(zz8S zz8s) {
        this.zzZ7u = zz8s;
    }

    public final void zzZ(zzAT zzat) {
        this.zzZ7v = zzat;
    }
}
