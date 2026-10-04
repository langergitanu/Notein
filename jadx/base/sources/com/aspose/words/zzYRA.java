package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRA {
    private ArrayList<Paragraph> zzZm = new ArrayList<>();

    public final void clear() {
        this.zzZm.clear();
    }

    public final Paragraph get(int i) {
        return this.zzZm.get(i);
    }

    public final int getCount() {
        return this.zzZm.size();
    }

    public final void zzZE(Paragraph paragraph) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, paragraph);
    }
}
