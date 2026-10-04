package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8V extends zzY8Z {
    private zzYLV zzXac = new zzYLV();

    @Override // com.aspose.words.zzY8Z
    public final void zzH(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        for (int i = 0; i < this.zzXac.getCount(); i++) {
            zzZZQ.zzZ(this.zzXac.get(i), Integer.MAX_VALUE, zzzow, true, false);
            zzzow.zzK((short) 0);
        }
    }

    @Override // com.aspose.words.zzY8Z
    public final int zzY3A() {
        return this.zzXac.getCount();
    }

    public final zzYLV zzY3y() {
        return this.zzXac;
    }

    @Override // com.aspose.words.zzY8Z
    public final int zzY3z() {
        return 2;
    }

    public final void zzZ(com.aspose.words.internal.zzZOX zzzox, zzZRG zzzrg) throws Exception {
        zzT(zzzox, zzzrg.zzYHK, zzzrg.zzYHJ);
    }

    @Override // com.aspose.words.zzY8Z
    public final void zzZ(String str, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzXac.add(str);
        zzzox.zzX9();
    }
}
