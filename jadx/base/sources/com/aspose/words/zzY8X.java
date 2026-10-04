package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8X extends zzY8Z {
    private ArrayList<String> zzZm = new ArrayList<>();

    public final int getCount() {
        return this.zzZm.size();
    }

    @Override // com.aspose.words.zzY8Z
    public final void zzH(com.aspose.words.internal.zzZOW zzzow) {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.zzY8Z
    public final int zzY3A() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.zzY8Z
    public final int zzY3z() {
        return 4;
    }

    @Override // com.aspose.words.zzY8Z
    public final void zzZ(String str, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, str);
        zzzox.zzn(4);
    }

    public final String zzl8(int i) {
        return this.zzZm.get(i);
    }
}
