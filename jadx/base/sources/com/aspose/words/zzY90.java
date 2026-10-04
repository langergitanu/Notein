package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY90 extends zzY8Z {
    private com.aspose.words.internal.zzDB zzXad = new com.aspose.words.internal.zzDB();

    public final void add(int i) {
        this.zzXad.add(i);
    }

    public final int get(int i) {
        return this.zzXad.get(i);
    }

    @Override // com.aspose.words.zzY8Z
    public final void zzH(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        for (int i = 0; i < this.zzXad.getCount(); i++) {
            zzY8Z.zzW("", zzzow);
            zzzow.zzK((short) 256);
            zzzow.zzl(this.zzXad.get(i));
            zzzow.zzl(-1);
        }
    }

    @Override // com.aspose.words.zzY8Z
    public final int zzY3A() {
        return this.zzXad.getCount();
    }

    @Override // com.aspose.words.zzY8Z
    public final int zzY3z() {
        return 10;
    }

    @Override // com.aspose.words.zzY8Z
    public final void zzZ(String str, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzzox.zzX9();
        this.zzXad.add(zzzox.zzXc());
        zzzox.zzXc();
    }
}
