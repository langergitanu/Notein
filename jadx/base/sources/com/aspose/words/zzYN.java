package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYN extends zzZZG<zzY08> {
    private int zzZD8;

    public zzYN(int i) {
        super(zzZRA.zzDL(i) ? 2 : 4);
        this.zzZD8 = i;
    }

    public final int zzP0(int i) {
        return getItem(i).getValue() * 512;
    }

    @Override // com.aspose.words.zzZZH
    public final zzZ8R zzU(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        return new zzY08(zzZRA.zzDL(this.zzZD8) ? zzzox.zzXa() : zzzox.zzXc());
    }
}
