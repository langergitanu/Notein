package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYLF extends zzZZG<zzZX> {
    public zzYLF() {
        super(30);
    }

    public final int zzI(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        for (int i = 0; i < getItemCount(); i++) {
            get(i).zzX(zzzow);
        }
        return ((int) zzzow.zzq().getPosition()) - position;
    }

    @Override // com.aspose.words.zzZZH
    public final zzZ8R zzU(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        return new zzZX(zzzox);
    }

    public final void zzV(com.aspose.words.internal.zzZOX zzzox, int i, int i2) throws Exception {
        zzzox.zzq().zzH(i);
        int i3 = i2 / 18;
        for (int i4 = 0; i4 < i3; i4++) {
            get(i4).zzV(zzzox);
        }
    }
}
