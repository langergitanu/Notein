package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8W extends zzY8Z {
    private ArrayList<String> zzZm = new ArrayList<>();

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
        return 1;
    }

    @Override // com.aspose.words.zzY8Z
    public final void zzZ(String str, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        int i = zzzox.readByte() & 255;
        for (int i2 = 0; i2 < i; i2++) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZm, str);
        }
    }

    public final String zzl8(int i) {
        return i < this.zzZm.size() ? this.zzZm.get(i) : "";
    }
}
