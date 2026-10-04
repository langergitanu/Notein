package com.aspose.words.internal;

import com.aspose.words.net.System.Data.IDataReader;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
class zzKX implements Iterable, Iterator {
    private IDataReader zzCB;

    public zzKX(IDataReader iDataReader) {
        this.zzCB = iDataReader;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.zzCB.read();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.zzCB;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
