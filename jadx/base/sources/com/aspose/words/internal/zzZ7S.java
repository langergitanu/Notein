package com.aspose.words.internal;

import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7S {
    private Hashtable zzWqc = new Hashtable();
    private Vector zzWqa = new Vector();

    public final boolean isEmpty() {
        return this.zzWqa.isEmpty();
    }

    public final zzZ7T zzXHW() {
        zzZ7U[] zzz7uArr = new zzZ7U[this.zzWqa.size()];
        for (int i = 0; i != this.zzWqa.size(); i++) {
            zzz7uArr[i] = (zzZ7U) this.zzWqc.get(this.zzWqa.elementAt(i));
        }
        return new zzZ7T(zzz7uArr);
    }
}
