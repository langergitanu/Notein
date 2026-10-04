package com.aspose.words;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZSM {
    private LinkedList<zzZBJ> zzYJ7 = new LinkedList<>();

    public final int getCount() {
        return this.zzYJ7.size();
    }

    public final void zzY(zzZBJ zzzbj) {
        this.zzYJ7.addLast(zzzbj);
    }

    public final zzZBJ zzZi1() {
        return this.zzYJ7.removeFirst();
    }
}
