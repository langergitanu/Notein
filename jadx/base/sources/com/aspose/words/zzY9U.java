package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzY9U extends zzYAU {
    private int zzZGG = 0;

    public static zzY9U zzx(Inline inline) {
        AbsolutePositionTab absolutePositionTab = (AbsolutePositionTab) com.aspose.words.internal.zzZKW.zzZ(inline, AbsolutePositionTab.class);
        return absolutePositionTab == null ? new zzY9U() : zzY9T.zzY(absolutePositionTab);
    }

    @Override // com.aspose.words.zzYAU
    public final int getLeader() {
        return this.zzZGG;
    }

    @Override // com.aspose.words.zzYAU
    public final int getLength() {
        return 1;
    }

    @Override // com.aspose.words.zzYAU
    public final String getText() throws Exception {
        return zzY7b() ? "\uf021" : "\uf022";
    }

    public boolean isAbsolute() {
        return false;
    }

    @Override // com.aspose.words.zzYAU
    public final void setLeader(int i) {
        this.zzZGG = i;
    }

    @Override // com.aspose.words.zzYAU
    public final int zz0R() {
        return 1;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY6x() {
        return (zzaa() == null || zza7().getBalanceSingleByteDoubleByteWidth()) ? false : true;
    }

    @Override // com.aspose.words.zzYAU
    public zzYAU zzY71() throws Exception {
        zzY9U zzy9u = new zzY9U();
        zzy9u.setLeader(this.zzZGG);
        zzZB(zzy9u);
        return zzy9u;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzY7f() throws Exception {
        return (zzYPO() * (zzY6x() ? 2 : 1)) + zzY6N().getSpacing();
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzYRO() throws Exception {
        return zzY7r() == 5121;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZo6() {
        return 12803;
    }
}
