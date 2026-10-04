package com.aspose.words.internal;

import com.aspose.words.internal.zzZOY;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzST<T extends zzZOY> implements zzZOY {
    private ArrayList<T> zzZm;

    public zzST(Iterable<T> iterable) {
        this.zzZm = zzZQG.zzT(iterable);
    }

    @Override // com.aspose.words.internal.zzZOY
    public final void dispose() throws Exception {
        for (T t : this.zzZm) {
            if (t != null) {
                t.dispose();
            }
        }
    }
}
