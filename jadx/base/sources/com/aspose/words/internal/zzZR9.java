package com.aspose.words.internal;

import com.aspose.words.internal.zzZR9.zzZ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZR9<T extends zzZ> {
    protected final List<zzZ<T>> zz3T = new ArrayList();

    public static class zzZ<T extends zzZ> {
        protected zzZ<T> zz3R;
        protected Throwable zz3S;

        public final zzZ<T> zzZ(zzZ<T> zzz) {
            this.zz3R = zzz;
            return zzz;
        }
    }

    private static <T extends zzZ> zzZ<T> zzZ(List<zzZ<T>> list) {
        zzZ<T> next;
        Iterator<zzZ<T>> it = list.iterator();
        zzZ<T> zzz = null;
        while (true) {
            zzZ<T> zzz2 = zzz;
            while (it.hasNext()) {
                next = it.next();
                if (next != null) {
                    if (zzz == null) {
                        break;
                    }
                    zzz2.zzZ(next);
                    zzz2 = next;
                }
            }
            return zzz;
            zzz = next;
        }
    }

    public final zzZ<T> zzlH() {
        if (this.zz3T.isEmpty()) {
            throw new IllegalArgumentException("There are no items to create chain");
        }
        zzZ<T> zzZ2 = zzZ(this.zz3T);
        this.zz3T.clear();
        return zzZ2;
    }
}
