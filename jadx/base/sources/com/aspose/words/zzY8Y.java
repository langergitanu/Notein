package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8Y extends zzY8Z {
    private com.aspose.words.internal.zzDB zzXad = new com.aspose.words.internal.zzDB();

    public final void add(int i) {
        this.zzXad.add(i);
    }

    public final int get(int i) {
        return this.zzXad.get(i);
    }

    public final int getCount() {
        return this.zzXad.getCount();
    }

    @Override // com.aspose.words.zzY8Z
    public final void zzH(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        for (int i = 0; i < this.zzXad.getCount(); i++) {
            zzzow.zzK((short) 0);
            zzzow.zzJ((short) this.zzXad.get(i));
            zzzow.zzK((short) 1);
            zzzow.zzK((short) 0);
            zzzow.zzK((short) 0);
        }
    }

    @Override // com.aspose.words.zzY8Z
    public final int zzY3A() {
        return this.zzXad.getCount();
    }

    @Override // com.aspose.words.zzY8Z
    public final int zzY3z() {
        return 8;
    }

    public final void zzZ(com.aspose.words.internal.zzZOX zzzox, zzZRG zzzrg) throws Exception {
        if (zzzrg.zzYHJ == 0) {
            return;
        }
        zzzox.zzq().zzH(zzzrg.zzYHK);
        zz7(zzzox);
    }

    @Override // com.aspose.words.zzY8Z
    public final void zzZ(String str, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzXad.add(zzzox.zzX9() & 65535);
        zzzox.zzX9();
        zzzox.zzXc();
    }
}
