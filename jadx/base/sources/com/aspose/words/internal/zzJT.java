package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzJT {
    private Collection<zzJU> zzAh;
    private zzJS zzAi;
    private Iterable<zzJV> zzAj;

    public zzJT(Iterable<zzGP> iterable) {
        if (iterable == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: fontSources");
        }
        this.zzAj = zzV(iterable);
    }

    private void zzHz() {
        if (this.zzAh != null) {
            return;
        }
        zzJS zzjs = this.zzAi;
        if (zzjs == null) {
            this.zzAh = zzJS.zzU(this.zzAj);
            return;
        }
        zzjs.zzol();
        this.zzAh = this.zzAi.zzIj();
        this.zzAi = null;
    }

    private static Iterable<zzJV> zzV(Iterable<zzGP> iterable) {
        ArrayList arrayList = new ArrayList();
        for (zzGP zzgp : iterable) {
            Iterator<zzGR> it = zzgp.getFontDataInternal().iterator();
            while (it.hasNext()) {
                zzZQG.zzZ((ArrayList<zzJV>) arrayList, new zzJV(it.next(), zzgp.getPriorityInternal()));
            }
        }
        return arrayList;
    }

    public static zzJT zzY(Iterable<zzGP> iterable, zzZOP zzzop) throws Exception {
        Iterable<zzJV> iterableZzV = zzV(iterable);
        return new zzJT(iterableZzV, zzJR.zzY(zzzop, iterableZzV));
    }

    public final void zzH(zzZOP zzzop) throws Exception {
        zzJR.zzZ(zzzop, zzHA());
    }

    public final Collection<zzJU> zzHA() {
        zzHz();
        return this.zzAh;
    }

    public final void zzIi() {
        if (this.zzAh == null && this.zzAi == null) {
            zzJS zzjs = new zzJS(this.zzAj);
            this.zzAi = zzjs;
            zzjs.start();
        }
    }

    private zzJT(Iterable<zzJV> iterable, Collection<zzJU> collection) {
        this.zzAj = iterable;
        this.zzAh = collection;
    }
}
