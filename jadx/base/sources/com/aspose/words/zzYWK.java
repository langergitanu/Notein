package com.aspose.words;

import com.aspose.words.Node;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYWK<T extends Node> implements Iterator<T> {
    private zzZA4 zzXVF;
    private T zzXVH;
    private T zzXVT;
    private T zzXVU;

    public zzYWK(zzZA4 zzza4) {
        this.zzXVF = zzza4;
        reset();
    }

    private void reset() {
        this.zzXVH = this.zzXVF.getContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zzYAK, reason: merged with bridge method [inline-methods] */
    public T next() {
        T t;
        hasNext();
        T t2 = this.zzXVU;
        this.zzXVH = t2;
        if (t2 == this.zzXVF.getContainer() || (t = this.zzXVH) == null) {
            throw new IllegalStateException("Invalid position of the enumerator.");
        }
        return t;
    }

    public static <T extends Node> int zzZ(zzZA4 zzza4) {
        zzYWK zzywk = new zzYWK(zzza4);
        int i = 0;
        while (zzywk.hasNext()) {
            zzywk.zzXVH = zzywk.zzXVU;
            i++;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        T t = this.zzXVH;
        if (t == null) {
            return false;
        }
        this.zzXVU = t;
        if (t != this.zzXVF.getContainer() && this.zzXVH.getParentNode() == null) {
            this.zzXVU = this.zzXVT;
        }
        if (this.zzXVU != this.zzXVF.getContainer() && this.zzXVU.getParentNode() == null) {
            throw new IllegalStateException("Document structure was changed.");
        }
        try {
            this.zzXVT = (T) this.zzXVF.getNextMatchingNode(this.zzXVU);
            T t2 = (T) this.zzXVF.getCurrentNode();
            this.zzXVU = t2;
            return t2 != null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
